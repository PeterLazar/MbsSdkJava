package com.sportradar.mbs.sdk.entities.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a response object for an account status update.
 */
public class AccountStatusInformResponse extends ContentResponse {

    @JsonProperty("code")
    private int code;
    @JsonProperty("message")
    private String message;

    /**
     * Creates a new instance of the AccountStatusInformResponse class.
     * Use the newBuilder() method to create an instance of the Builder class.
     */
    public static Builder newBuilder() {
        return new Builder();
    }

    /**
     * Gets the code associated with the response.
     *
     * @return The code value.
     */
    public int getCode() {
        return this.code;
    }

    /**
     * Sets the code associated with the response.
     *
     * @param value The code value to set.
     */
    public void setCode(int value) {
        this.code = value;
    }

    /**
     * Gets the message associated with the response.
     *
     * @return The message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Sets the message associated with the response.
     *
     * @param value The message value to set.
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Builder class for creating instances of the AccountStatusInformResponse class.
     */
    public static class Builder {

        private final AccountStatusInformResponse instance = new AccountStatusInformResponse();

        private Builder() {
        }

        /**
         * Builds and returns the instance of the AccountStatusInformResponse class.
         *
         * @return The built instance.
         */
        public AccountStatusInformResponse build() {
            return this.instance;
        }

        /**
         * Sets the code associated with the response.
         *
         * @param value The code value to set.
         * @return The Builder instance.
         */
        public Builder setCode(int value) {
            this.instance.setCode(value);
            return this;
        }

        /**
         * Sets the message associated with the response.
         *
         * @param value The message value to set.
         * @return The Builder instance.
         */
        public Builder setMessage(String value) {
            this.instance.setMessage(value);
            return this;
        }
    }
}
