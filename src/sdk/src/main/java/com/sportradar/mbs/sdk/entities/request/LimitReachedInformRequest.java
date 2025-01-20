package com.sportradar.mbs.sdk.entities.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.account.LimitType;
import com.sportradar.mbs.sdk.entities.common.EndCustomer;

/**
 * Represents a request to inform about a limit reached event.
 */
public class LimitReachedInformRequest extends ContentRequest {

    @JsonProperty("endCustomer")
    private EndCustomer endCustomer;
    @JsonProperty("timestampUtc")
    private long timestampUtc;
    @JsonProperty("limitType")
    private LimitType limitType;

    /**
     * Creates a new instance of the LimitReachedInformRequest.Builder class.
     *
     * @return A new instance of the LimitReachedInformRequest.Builder class.
     */
    public static LimitReachedInformRequest.Builder newBuilder() {
        return new LimitReachedInformRequest.Builder();
    }

    /**
     * Gets the end customer.
     *
     * @return The end customer.
     */
    public EndCustomer getEndCustomer() {
        return endCustomer;
    }

    /**
     * Sets the end customer.
     *
     * @param value The end customer.
     */
    public void setEndCustomer(EndCustomer value) {
        this.endCustomer = value;
    }

    /**
     * Gets the limit reached timestamp in UTC.
     *
     * @return The limit reached timestamp in UTC.
     */
    public long getTimestampUtc() {
        return timestampUtc;
    }

    /**
     * Sets the limit reached timestamp in UTC.
     *
     * @param value The limit reached timestamp in UTC.
     */
    public void setTimestampUtc(long value) {
        this.timestampUtc = value;
    }

    /**
     * Gets the limit type.
     *
     * @return The limit type.
     */
    public LimitType getLimitType() {
        return limitType;
    }

    /**
     * Sets the limit type.
     *
     * @param value The limit type.
     */
    public void setLimitType(LimitType value) {
        this.limitType = value;
    }

    /**
     * Represents a builder for the LimitReachedInformRequest class.
     */
    public static class Builder {

        private final LimitReachedInformRequest instance = new LimitReachedInformRequest();

        private Builder() {
        }

        /**
         * Builds the LimitReachedInformRequest instance.
         *
         * @return The built LimitReachedInformRequest instance.
         */
        public LimitReachedInformRequest build() {
            return this.instance;
        }

        /**
         * Sets the end customer.
         *
         * @param value The end customer.
         * @return The builder instance.
         */
        public LimitReachedInformRequest.Builder setEndCustomer(EndCustomer value) {
            this.instance.setEndCustomer(value);
            return this;
        }

        /**
         * Sets the limit reached timestamp in UTC.
         *
         * @param value The limit reached timestamp in UTC.
         * @return The builder instance.
         */
        public LimitReachedInformRequest.Builder setTimestampUtc(long value) {
            this.instance.setTimestampUtc(value);
            return this;
        }

        /**
         * Sets the limit type.
         *
         * @param value The limit type.
         * @return The builder instance.
         */
        public LimitReachedInformRequest.Builder setLimitType(LimitType value) {
            this.instance.setLimitType(value);
            return this;
        }
    }
}
