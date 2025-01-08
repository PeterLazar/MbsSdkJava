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

    /**
     * Sends a deposit inform request synchronously and returns the corresponding response.
     *
     * @param request the deposit inform request to be sent
     * @return the deposit inform response received
     * @throws ExecutionException   if the execution of the request encounters an exception wrapping the cause exception
     * @throws InterruptedException if the execution of the request is interrupted
     */
    default DepositInformResponse sendDepositInform(DepositInformRequest request)
            throws ExecutionException, InterruptedException {
        return this.sendDepositInformAsync(request).get();
    }

    /**
     * Sends a withdrawal inform request synchronously and returns the corresponding response.
     *
     * @param request the withdrawal inform request to be sent
     * @return the withdrawal inform response received
     * @throws ExecutionException   if the execution of the request encounters an exception wrapping the cause exception
     * @throws InterruptedException if the execution of the request is interrupted
     */
    default WithdrawalInformResponse sendWithdrawalInform(WithdrawalInformRequest request)
            throws ExecutionException, InterruptedException {
        return this.sendWithdrawalInformAsync(request).get();
    }

    /**
     * Sends a deposit inform request asynchronously and returns a CompletableFuture representing the response.
     *
     * @param request the deposit inform request to be sent
     * @return a CompletableFuture representing the deposit inform response
     */
    CompletableFuture<DepositInformResponse> sendDepositInformAsync(DepositInformRequest request);

    /**
     * Sends a withdrawal inform request asynchronously and returns a CompletableFuture representing the response.
     *
     * @param request the withdrawal inform request to be sent
     * @return a CompletableFuture representing the withdrawal inform response
     */
    CompletableFuture<WithdrawalInformResponse> sendWithdrawalInformAsync(WithdrawalInformRequest request);
}
