package com.sportradar.mbs.sdk.internal.connection;

import com.sportradar.mbs.sdk.exceptions.WebSocketConnectionException;
import com.sportradar.mbs.sdk.internal.config.ImmutableConfig;
import com.sportradar.mbs.sdk.internal.config.WebSocketConnectionConfig;
import com.sportradar.mbs.sdk.internal.connection.msg.*;
import com.sportradar.mbs.sdk.internal.connection.msg.base.WsInputMessage;
import com.sportradar.mbs.sdk.internal.connection.msg.base.WsOutputMessage;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.framing.Framedata;
import org.java_websocket.framing.TextFrame;
import org.java_websocket.handshake.ServerHandshake;

import java.net.URI;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicReference;

import static com.sportradar.mbs.sdk.internal.utils.Delayer.delay;
import static com.sportradar.mbs.sdk.internal.utils.ExcSuppress.threadJoin;
import static java.util.concurrent.TimeUnit.MILLISECONDS;

public class WebSocketConnection implements AutoCloseable {

    private final WebSocketConnectionConfig config;
    private final TokenProvider tokenProvider;
    private final BlockingQueue<WsInputMessage> sendQueue;
    private final BlockingQueue<WsOutputMessage> receiveQueue;
    private final AtomicReference<WebSocket> webSocket;

    private volatile boolean connected = false;

    private Thread senderThread;

    public WebSocketConnection(
            final ImmutableConfig config,
            final TokenProvider tokenProvider,
            final BlockingQueue<WsInputMessage> sendQueue,
            final BlockingQueue<WsOutputMessage> receiveQueue) {
        this.config = config;
        this.tokenProvider = tokenProvider;
        this.sendQueue = sendQueue;
        this.receiveQueue = receiveQueue;
        this.webSocket = new AtomicReference<>(null);
    }

    public void connect() {
        reconnectWebSocket(null);
        final Thread thread = new Thread(this::sendLoop);
        thread.setDaemon(true);
        this.senderThread = thread;
        this.connected = true;
        thread.start();
    }

    @Override
    public void close() {
        this.connected = false;
        final Thread thread = this.senderThread;
        this.senderThread = null;
        threadJoin(thread);
        final WebSocket ws = this.webSocket.getAndSet(null);
        if (ws != null) {
            ws.close();
        }
    }

    private void sendLoop() {
        while (this.connected) {
            WsInputMessage msg = null;
            try {
                msg = this.sendQueue.poll(config.getWsFetchMessageTimeout().toMillis(), MILLISECONDS);
                if (msg == null) {
                    continue;
                }
                if (!(msg instanceof SendWsInputMessage)) {
                    this.receiveQueue.add(new NotProcessedWsOutputMessage(msg));
                    continue;
                }

                final List<ByteBuffer> msgs = ((SendWsInputMessage) msg).getContent();
                final WebSocket ws = this.webSocket.get();
                try {
                    sendMsg(ws, msgs);
                } catch (final Exception e) {
                    this.receiveQueue.add(new ExcWsOutputMessage(msg, new WebSocketConnectionException(e)));
                    reconnectWebSocket(ws);
                    sendMsg(this.webSocket.get(), msgs);
                }
                this.receiveQueue.add(new SentWsOutputMessage(msg));

            } catch (final InterruptedException ignored) {
            } catch (final Exception exception) {
                this.receiveQueue.add(new ExcWsOutputMessage(msg, new WebSocketConnectionException(exception)));
            }
        }
    }

    private void sendMsg(final WebSocket ws, final List<ByteBuffer> msgs) {
        final List<Framedata> frames = new ArrayList<>();
        for (int i = 0; i < msgs.size(); i++) {
            final TextFrame frame = new TextFrame();
            frame.setPayload(msgs.get(i));
            frame.setFin(i == msgs.size() - 1);
            frames.add(frame);
        }
        ws.sendFrame(frames);
    }

    private void reconnectWebSocket(final WebSocket ws) {
        if (this.webSocket.get() != ws) {
            return;
        }
        final WebSocket newWs = new WebSocket(this, config.getWsServer(), tokenProvider.getToken());
        try {
            if (!newWs.connectBlocking(config.getWsReconnectTimeout().toMillis(), MILLISECONDS)) {
                this.receiveQueue.add(new ExcWsOutputMessage(null, new WebSocketConnectionException(
                        "Socket connect failed.")));
                return;
            }
        } catch (final Exception exception) {
            this.receiveQueue.add(new ExcWsOutputMessage(null, new WebSocketConnectionException(exception)));
            return;
        }
        if (this.webSocket.compareAndSet(ws, newWs)) {
            if (ws != null) {
                delay(ws::close, config.getWsConsumerGraceTimeout().toMillis(), MILLISECONDS);
            }
            delay(() -> reconnectWebSocket(newWs), config.getWsRefreshConnectionTimeout().toMillis(), MILLISECONDS);
        } else {
            newWs.close();
        }
    }

    private void onOpen(final WebSocket ws, final ServerHandshake serverHandshake) {
    }

    private void onMessage(final WebSocket ws, final String msg) {
        this.receiveQueue.add(new ReceivedContentWsOutputMessage(msg));
    }

    private void onClose(final WebSocket ws, final int code, final String msg, final boolean remote) {
        this.receiveQueue.add(new ExcWsOutputMessage(null, new WebSocketConnectionException(
                "Socket closed by " + (remote ? "server" : "client") + ", code: " + code + ", reason: " + msg + ".")));
        reconnectWebSocket(ws);
    }

    private void onError(final WebSocket ws, final Exception exception) {
        this.receiveQueue.add(new ExcWsOutputMessage(null, new WebSocketConnectionException(exception)));
        reconnectWebSocket(ws);
    }

    public static class WebSocket extends WebSocketClient {

        private final WebSocketConnection parentConnection;

        public WebSocket(final WebSocketConnection parentConnection, final URI serverUri, final String token) {
            super(serverUri, headers(token));
            this.parentConnection = parentConnection;
        }

        private static Map<String, String> headers(final String token) {
            final Map<String, String> headers = new HashMap<>();
            headers.put("Authorization", "Bearer " + token);
            return headers;
        }

        @Override
        public void onOpen(final ServerHandshake serverHandshake) {
            this.parentConnection.onOpen(this, serverHandshake);
        }

        @Override
        public void onMessage(final String msg) {
            this.parentConnection.onMessage(this, msg);
        }

        @Override
        public void onClose(final int code, final String msg, final boolean remote) {
            this.parentConnection.onClose(this, code, msg, remote);
        }

        @Override
        public void onError(final Exception exception) {
            this.parentConnection.onError(this, exception);
        }
    }
}
