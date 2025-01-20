package com.sportradar.mbs.sdk.internal.protocol;

import com.sportradar.mbs.sdk.entities.request.AccountStatusInformRequest;
import com.sportradar.mbs.sdk.entities.request.FinancialLimitInformRequest;
import com.sportradar.mbs.sdk.entities.request.LimitReachedInformRequest;
import com.sportradar.mbs.sdk.entities.request.SessionLimitInformRequest;
import com.sportradar.mbs.sdk.entities.response.AccountStatusInformResponse;
import com.sportradar.mbs.sdk.entities.response.FinancialLimitInformResponse;
import com.sportradar.mbs.sdk.entities.response.LimitReachedInformResponse;
import com.sportradar.mbs.sdk.entities.response.SessionLimitInformResponse;
import com.sportradar.mbs.sdk.protocol.AccountProtocol;

import java.util.concurrent.CompletableFuture;

public class AccountProtocolImpl implements AccountProtocol {

    private final ProtocolEngine engine;

    public AccountProtocolImpl(final ProtocolEngine engine) {
        this.engine = engine;
    }

    @Override
    public CompletableFuture<AccountStatusInformResponse> sendAccountStatusInformAsync(AccountStatusInformRequest request) {
        return engine.execute("account-status-inform", request, AccountStatusInformResponse.class);
    }

    @Override
    public CompletableFuture<FinancialLimitInformResponse> sendFinancialLimitInformAsync(FinancialLimitInformRequest request) {
        return engine.execute("financial-limit-inform", request, FinancialLimitInformResponse.class);
    }

    @Override
    public CompletableFuture<SessionLimitInformResponse> sendSessionLimitInformAsync(SessionLimitInformRequest request) {
        return engine.execute("session-limit-inform", request, SessionLimitInformResponse.class);
    }

    @Override
    public CompletableFuture<LimitReachedInformResponse> sendLimitReachedInformAsync(LimitReachedInformRequest request) {
        return engine.execute("limit-reached-inform", request, LimitReachedInformResponse.class);
    }
}
