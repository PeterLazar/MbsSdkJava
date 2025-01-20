package com.sportradar.mbs.sdk.protocol;

import com.sportradar.mbs.sdk.entities.request.AccountStatusInformRequest;
import com.sportradar.mbs.sdk.entities.request.FinancialLimitInformRequest;
import com.sportradar.mbs.sdk.entities.request.LimitReachedInformRequest;
import com.sportradar.mbs.sdk.entities.request.SessionLimitInformRequest;
import com.sportradar.mbs.sdk.entities.response.AccountStatusInformResponse;
import com.sportradar.mbs.sdk.entities.response.FinancialLimitInformResponse;
import com.sportradar.mbs.sdk.entities.response.LimitReachedInformResponse;
import com.sportradar.mbs.sdk.entities.response.SessionLimitInformResponse;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public interface AccountProtocol {

    /**
     * Sends an account status inform request synchronously and returns the corresponding response.
     *
     * @param request the account status inform request to be sent
     * @return the account status inform response received
     * @throws ExecutionException   if the execution of the request encounters an exception wrapping the cause exception
     * @throws InterruptedException if the execution of the request is interrupted
     */
    default AccountStatusInformResponse sendAccountStatusInform(AccountStatusInformRequest request)
            throws ExecutionException, InterruptedException {
        return this.sendAccountStatusInformAsync(request).get();
    }

    /**
     * Sends a financial limit inform request synchronously and returns the corresponding response.
     *
     * @param request the financial limit inform request to be sent
     * @return the financial limit inform response received
     * @throws ExecutionException   if the execution of the request encounters an exception wrapping the cause exception
     * @throws InterruptedException if the execution of the request is interrupted
     */
    default FinancialLimitInformResponse sendFinancialLimitInform(FinancialLimitInformRequest request)
            throws ExecutionException, InterruptedException {
        return this.sendFinancialLimitInformAsync(request).get();
    }

    /**
     * Sends a session limit inform request synchronously and returns the corresponding response.
     *
     * @param request the session limit inform request to be sent
     * @return the session limit inform response received
     * @throws ExecutionException   if the execution of the request encounters an exception wrapping the cause exception
     * @throws InterruptedException if the execution of the request is interrupted
     */
    default SessionLimitInformResponse sendSessionLimitInform(SessionLimitInformRequest request)
            throws ExecutionException, InterruptedException {
        return this.sendSessionLimitInformAsync(request).get();
    }

    /**
     * Sends a limit reached inform request synchronously and returns the corresponding response.
     *
     * @param request the limit reached inform request to be sent
     * @return the limit reached inform response received
     * @throws ExecutionException   if the execution of the request encounters an exception wrapping the cause exception
     * @throws InterruptedException if the execution of the request is interrupted
     */
    default LimitReachedInformResponse sendLimitReachedInform(LimitReachedInformRequest request)
            throws ExecutionException, InterruptedException {
        return this.sendLimitReachedInformAsync(request).get();
    }

    /**
     * Sends an account status inform request asynchronously and returns a CompletableFuture representing the response.
     *
     * @param request the account status inform request to be sent
     * @return a CompletableFuture representing the account status inform response
     */
    CompletableFuture<AccountStatusInformResponse> sendAccountStatusInformAsync(AccountStatusInformRequest request);

    /**
     * Sends an financial limit inform request asynchronously and returns a CompletableFuture representing the response.
     *
     * @param request the financial limit inform request to be sent
     * @return a CompletableFuture representing the financial limit inform response
     */
    CompletableFuture<FinancialLimitInformResponse> sendFinancialLimitInformAsync(FinancialLimitInformRequest request);

    /**
     * Sends an session limit inform request asynchronously and returns a CompletableFuture representing the response.
     *
     * @param request the session limit inform request to be sent
     * @return a CompletableFuture representing the session limit inform response
     */
    CompletableFuture<SessionLimitInformResponse> sendSessionLimitInformAsync(SessionLimitInformRequest request);

    /**
     * Sends an limit reached inform request asynchronously and returns a CompletableFuture representing the response.
     *
     * @param request the limit reached inform request to be sent
     * @return a CompletableFuture representing the limit reached inform response
     */
    CompletableFuture<LimitReachedInformResponse> sendLimitReachedInformAsync(LimitReachedInformRequest request);
}
