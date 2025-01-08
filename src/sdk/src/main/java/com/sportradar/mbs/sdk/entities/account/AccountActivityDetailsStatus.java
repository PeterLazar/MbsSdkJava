package com.sportradar.mbs.sdk.entities.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.common.EndCustomer;

public class AccountActivityDetailsStatus extends AccountActivityDetails {

    @JsonProperty("status")
    private StatusValue statusValue;
    @JsonProperty("enforcement")
    private StatusEnforcement statusEnforcement;
    @JsonProperty("reason")
    private String reason;
    @JsonProperty("periodStartUtc")
    private long periodStartUtc;
    @JsonProperty("periodEndUtc")
    private Long periodEndUtc;

    /**
     * Creates a new instance of the AccountActivityDetailsStatus.Builder class.
     *
     * @return A new instance of the AccountActivityDetailsStatus.Builder class.
     */
    public static AccountActivityDetailsStatus.Builder newBuilder() {
        return new AccountActivityDetailsStatus.Builder();
    }

    /**
     * Gets the new status.
     *
     * @return The new status.
     */
    public StatusValue getStatusValue() {
        return statusValue;
    }

    /**
     * Sets the new status.
     *
     * @param value The new status.
     */
    public void setStatusValue(StatusValue value) {
        this.statusValue = value;
    }

    /**
     * Gets the status enforcement type.
     *
     * @return The status enforcement type.
     */
    public StatusEnforcement getStatusEnforcement() {
        return statusEnforcement;
    }

    /**
     * Sets the status enforcement type.
     *
     * @param value The status enforcement type.
     */
    public void setStatusEnforcement(StatusEnforcement value) {
        this.statusEnforcement = value;
    }

    /**
     * Gets the status change reason.
     *
     * @return The status change reason.
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the status change reason.
     *
     * @param value The status change reason.
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the status period start in UTC.
     *
     * @return The status period start in UTC.
     */
    public long getPeriodStartUtc() {
        return periodStartUtc;
    }

    /**
     * Sets the status period start in UTC.
     *
     * @param value The status period start in UTC.
     */
    public void setPeriodStartUtc(long value) {
        this.periodStartUtc = value;
    }

    /**
     * Gets the status period end in UTC.
     *
     * @return The status period end in UTC.
     */
    public Long getPeriodEndUtc() {
        return periodEndUtc;
    }

    /**
     * Sets the status period end in UTC.
     *
     * @param value The status period end in UTC.
     */
    public void setPeriodEndUtc(Long value) {
        this.periodEndUtc = value;
    }

    /**
     * Builder class for creating instances of the AccountActivityDetailsStatus class.
     */
    public static class Builder {

        private final AccountActivityDetailsStatus instance = new AccountActivityDetailsStatus();

        private Builder() {
        }

        /**
         * Builds and returns the AccountActivityDetailsStatus instance.
         *
         * @return The built AccountActivityDetailsStatus instance.
         */
        public AccountActivityDetailsStatus build() {
            return this.instance;
        }

        /**
         * Sets the end customer.
         *
         * @param value The end customer.
         * @return The builder instance.
         */
        public Builder setEndCustomer(EndCustomer value) {
            this.instance.setEndCustomer(value);
            return this;
        }

        /**
         * Sets the activity timestamp in UTC.
         *
         * @param value The activity timestamp in UTC.
         * @return The builder instance.
         */
        public Builder setTimestampUtc(long value) {
            this.instance.setTimestampUtc(value);
            return this;
        }

        /**
         * Sets the new status.
         *
         * @param value The new status.
         * @return The builder instance.
         */
        public Builder setStatusValue(StatusValue value) {
            this.instance.statusValue = value;
            return this;
        }

        /**
         * Sets the status enforcement type.
         *
         * @param value The status enforcement type.
         * @return The builder instance.
         */
        public Builder setStatusEnforcement(StatusEnforcement value) {
            this.instance.statusEnforcement = value;
            return this;
        }

        /**
         * Sets the status change reason.
         *
         * @param value The status change reason.
         * @return The builder instance.
         */
        public Builder setReason(String value) {
            this.instance.reason = value;
            return this;
        }

        /**
         * Sets the status period start in UTC.
         *
         * @param value The status period start in UTC.
         * @return The builder instance.
         */
        public Builder setPeriodStartUtc(long value) {
            this.instance.periodStartUtc = value;
            return this;
        }

        /**
         * Sets the status period end in UTC.
         *
         * @param value The status period end in UTC.
         * @return The builder instance.
         */
        public Builder setPeriodEndUtc(Long value) {
            this.instance.periodEndUtc = value;
            return this;
        }

    }
}
