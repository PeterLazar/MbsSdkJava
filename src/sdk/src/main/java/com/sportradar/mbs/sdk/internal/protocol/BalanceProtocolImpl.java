package com.sportradar.mbs.sdk.internal.protocol;

import com.sportradar.mbs.sdk.entities.request.BalanceChangeInformRequest;
import com.sportradar.mbs.sdk.entities.request.DepositInformRequest;
import com.sportradar.mbs.sdk.entities.request.WithdrawalInformRequest;
import com.sportradar.mbs.sdk.entities.response.BalanceChangeInformResponse;
import com.sportradar.mbs.sdk.entities.response.DepositInformResponse;
import com.sportradar.mbs.sdk.entities.response.WithdrawalInformResponse;
import com.sportradar.mbs.sdk.protocol.BalanceProtocol;

import java.util.concurrent.CompletableFuture;

public class BalanceProtocolImpl implements BalanceProtocol {

    private final ProtocolEngine engine;

    public BalanceProtocolImpl(final ProtocolEngine engine) {
        this.engine = engine;
    }

    @Override
    public CompletableFuture<DepositInformResponse> sendDepositInformAsync(final DepositInformRequest request) {
        return engine.execute("balance-deposit-inform", request, DepositInformResponse.class);
    }

    @Override
    public CompletableFuture<WithdrawalInformResponse> sendWithdrawalInformAsync(final WithdrawalInformRequest request) {
        return engine.execute("balance-withdrawal-inform", request, WithdrawalInformResponse.class);
    }
}
