package com.sportradar.mbs.sdk.entities.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a response containing casino sessions.
 */
public class CasinoSessionsResponse extends ContentResponse {

    @JsonProperty("code")
    private int code;
    @JsonProperty("message")
    private String message;
    @JsonProperty("signature")
    private String signature;


    /**
     * Creates a new instance of the CasinoSessionsResponse.Builder class.
     *
     * @return A new instance of the CasinoSessionsResponse.Builder class.
     */
    public static Builder newBuilder() {
        return new Builder();
    }

    /**
     * Gets the response code.
     *
     * @return The response code.
     */
    public int getCode() {
        return this.code;
    }

    /**
     * Sets the response code.
     *
     * @param value The response code to set.
     */
    public void setCode(int value) {
        this.code = value;
    }

    /**
     * Gets the response message.
     *
     * @return The response message.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Sets the response message.
     *
     * @param value The response message to set.
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
     * Builder class for creating instances of the CasinoSessionsResponse class.
     */
    public static class Builder {

        private final CasinoSessionsResponse instance = new CasinoSessionsResponse();

        private Builder() {
        }

        /**
         * Builds the CasinoSessionsResponse instance.
         *
         * @return The built CasinoSessionsResponse instance.
         */
        public CasinoSessionsResponse build() {
            return this.instance;
        }

        /**
         * Sets the response code.
         *
         * @param value The response code to set.
         * @return The Builder instance.
         */
        public Builder setCode(int value) {
            this.instance.setCode(value);
            return this;
        }

        /**
         * Sets the response message.
         *
         * @param value The response message to set.
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
