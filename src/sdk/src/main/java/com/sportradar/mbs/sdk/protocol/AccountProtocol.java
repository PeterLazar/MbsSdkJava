package com.sportradar.mbs.sdk.protocol;

import com.sportradar.mbs.sdk.entities.request.AccountActivityInformRequest;
import com.sportradar.mbs.sdk.entities.response.AccountActivityInformResponse;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public interface AccountProtocol {

    /**
     * Sends an account activity inform request synchronously and returns the corresponding response.
     *
     * @param request the account activity inform request to be sent
     * @return the account activity inform response received
     * @throws ExecutionException   if the execution of the request encounters an exception wrapping the cause exception
     * @throws InterruptedException if the execution of the request is interrupted
     */
    default AccountActivityInformResponse sendAccountActivityInform(AccountActivityInformRequest request)
            throws ExecutionException, InterruptedException {
        return this.sendAccountActivityInformAsync(request).get();
    }

    /**
     * Sends an account activity inform request asynchronously and returns a CompletableFuture representing the response.
     *
     * @param request the account activity inform request to be sent
     * @return a CompletableFuture representing the account activity inform response
     */
    CompletableFuture<AccountActivityInformResponse> sendAccountActivityInformAsync(AccountActivityInformRequest request);
}
