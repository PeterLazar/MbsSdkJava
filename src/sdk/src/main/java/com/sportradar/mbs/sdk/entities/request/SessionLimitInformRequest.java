package com.sportradar.mbs.sdk.entities.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.common.EndCustomer;

/**
 * Represents a request to inform about a session limit change.
 */
public class SessionLimitInformRequest extends ContentRequest {

    @JsonProperty("endCustomer")
    private EndCustomer endCustomer;
    @JsonProperty("timestampUtc")
    private long timestampUtc;
    @JsonProperty("duration")
    private int duration;

    /**
     * Creates a new instance of the SessionLimitInformRequest.Builder class.
     *
     * @return A new instance of the SessionLimitInformRequest.Builder class.
     */
    public static SessionLimitInformRequest.Builder newBuilder() {
        return new SessionLimitInformRequest.Builder();
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
     * Gets the limit change timestamp in UTC.
     *
     * @return The limit change timestamp in UTC.
     */
    public long getTimestampUtc() {
        return timestampUtc;
    }

    /**
     * Sets the limit change timestamp in UTC.
     *
     * @param value The limit change timestamp in UTC.
     */
    public void setTimestampUtc(long value) {
        this.timestampUtc = value;
    }

    /**
     * Gets the duration in minutes.
     *
     * @return The duration.
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Sets the duration in minutes.
     *
     * @param value The duration.
     */
    public void setDuration(int value) {
        this.duration = value;
    }

    /**
     * Represents a builder for the SessionLimitInformRequest class.
     */
    public static class Builder {

        private final SessionLimitInformRequest instance = new SessionLimitInformRequest();

        private Builder() {
        }

        /**
         * Builds the SessionLimitInformRequest instance.
         *
         * @return The built SessionLimitInformRequest instance.
         */
        public SessionLimitInformRequest build() {
            return this.instance;
        }

        /**
         * Sets the end customer.
         *
         * @param value The end customer.
         * @return The builder instance.
         */
        public SessionLimitInformRequest.Builder setEndCustomer(EndCustomer value) {
            this.instance.setEndCustomer(value);
            return this;
        }

        /**
         * Sets the limit change timestamp in UTC.
         *
         * @param value The limit change timestamp in UTC.
         * @return The builder instance.
         */
        public SessionLimitInformRequest.Builder setTimestampUtc(long value) {
            this.instance.setTimestampUtc(value);
            return this;
        }

        /**
         * Sets the duration.
         *
         * @param value The duration.
         * @return The builder instance.
         */
        public SessionLimitInformRequest.Builder setDuration(int value) {
            this.instance.setDuration(value);
            return this;
        }
    }
}
