package com.sportradar.mbs.sdk.internal.protocol;

import com.sportradar.mbs.sdk.entities.request.AccountActivityInformRequest;
import com.sportradar.mbs.sdk.entities.response.AccountActivityInformResponse;
import com.sportradar.mbs.sdk.protocol.AccountProtocol;

import java.util.concurrent.CompletableFuture;

public class AccountProtocolImpl implements AccountProtocol {

    private final ProtocolEngine engine;

    public AccountProtocolImpl(final ProtocolEngine engine) {
        this.engine = engine;
    }

    @Override
    public CompletableFuture<AccountActivityInformResponse> sendAccountActivityInformAsync(final AccountActivityInformRequest request) {
        return engine.execute("account-activity-inform", request, AccountActivityInformResponse.class);
    }
}
