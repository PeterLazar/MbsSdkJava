package com.sportradar.mbs.sdk.entities.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.account.AccountActivityDetails;

/**
 * Represents a request to inform about an account activity.
 */
public class AccountActivityInformRequest extends ContentRequest {

    @JsonProperty("details")
    private AccountActivityDetails details;

    /**
     * Creates a new instance of the AccountActivityInformRequest.Builder class.
     *
     * @return A new instance of the AccountActivityInformRequest.Builder class.
     */
    public static AccountActivityInformRequest.Builder newBuilder() {
        return new AccountActivityInformRequest.Builder();
    }

    public AccountActivityDetails getDetails() {
        return details;
    }

    public void setDetails(AccountActivityDetails details) {
        this.details = details;
    }

    /**
     * Represents a builder for the AccountActivityInformRequest class.
     */
    public static class Builder {

        private final AccountActivityInformRequest instance = new AccountActivityInformRequest();

        private Builder() {
        }

        /**
         * Builds the AccountActivityInformRequest instance.
         *
         * @return The built AccountActivityInformRequest instance.
         */
        public AccountActivityInformRequest build() {
            return this.instance;
        }

        /**
         * Sets the account activity details.
         *
         * @param value The activity details.
         * @return The builder instance.
         */
        public AccountActivityInformRequest.Builder setDetails(AccountActivityDetails value) {
            this.instance.setDetails(value);
            return this;
        }
    }
}
