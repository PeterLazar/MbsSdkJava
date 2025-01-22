package com.sportradar.mbs.sdk.entities.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a response object for a limit reached event.
 */
public class LimitReachedInformResponse extends ContentResponse {

    @JsonProperty("code")
    private int code;
    @JsonProperty("message")
    private String message;
    @JsonProperty("signature")
    private String signature;

    /**
     * Creates a new instance of the LimitReachedInformResponse class.
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
     * Gets the signature.
     *
     * @return The signature.
     */
    public String getSignature() {
        return this.signature;
    }

    /**
     * Sets the signature.
     *
     * @param value The signature to set.
     */
    public void setSignature(String value) {
        this.signature = value;
    }

    /**
     * Builder class for creating instances of the LimitReachedInformResponse class.
     */
    public static class Builder {

        private final LimitReachedInformResponse instance = new LimitReachedInformResponse();

        private Builder() {
        }

        /**
         * Builds and returns the instance of the LimitReachedInformResponse class.
         *
         * @return The built instance.
         */
        public LimitReachedInformResponse build() {
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

        /**
         * Sets the signature.
         *
         * @param value The signature to set.
         * @return The Builder instance.
         */
        public Builder setSignature(String value) {
            this.instance.setSignature(value);
            return this;
        }
    }
}
