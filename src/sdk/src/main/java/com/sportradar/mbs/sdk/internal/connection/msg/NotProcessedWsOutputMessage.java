package com.sportradar.mbs.sdk.internal.connection.msg;

import com.sportradar.mbs.sdk.internal.connection.msg.base.WsInputMessage;
import com.sportradar.mbs.sdk.internal.connection.msg.base.WsOutputMessage;

public class NotProcessedWsOutputMessage extends WsOutputMessage {

    private final WsInputMessage message;

    public NotProcessedWsOutputMessage(final WsInputMessage message) {
        super(message == null ? null : message.getCorrelationId());
        this.message = message;
    }

    public WsInputMessage getMessage() {
        return message;
    }
}
