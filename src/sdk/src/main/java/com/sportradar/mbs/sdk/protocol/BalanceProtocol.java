package com.sportradar.mbs.sdk.protocol;

import com.sportradar.mbs.sdk.entities.request.BalanceChangeInformRequest;
import com.sportradar.mbs.sdk.entities.request.DepositInformRequest;
import com.sportradar.mbs.sdk.entities.request.WithdrawalInformRequest;
import com.sportradar.mbs.sdk.entities.response.BalanceChangeInformResponse;
import com.sportradar.mbs.sdk.entities.response.DepositInformResponse;
import com.sportradar.mbs.sdk.entities.response.WithdrawalInformResponse;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public interface BalanceProtocol {

    default DepositInformResponse sendBalanceChangeInform(DepositInformRequest request)
            throws ExecutionException, InterruptedException {
        return this.sendDepositInformAsync(request).get();
    }
    default WithdrawalInformResponse sendBalanceChangeInform(WithdrawalInformRequest request)
            throws ExecutionException, InterruptedException {
        return this.sendWithdrawalInformAsync(request).get();
    }
    default BalanceChangeInformResponse sendBalanceChangeInform(BalanceChangeInformRequest request)
            throws ExecutionException, InterruptedException {
        return this.sendBalanceChangeInformAsync(request).get();
    }

    CompletableFuture<DepositInformResponse> sendDepositInformAsync(DepositInformRequest request);

    CompletableFuture<WithdrawalInformResponse> sendWithdrawalInformAsync(WithdrawalInformRequest request);

    CompletableFuture<BalanceChangeInformResponse> sendBalanceChangeInformAsync(BalanceChangeInformRequest request);
}
