package com.sportradar.mbs.sdk.entities.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.account.Initiator;
import com.sportradar.mbs.sdk.entities.account.StatusValue;
import com.sportradar.mbs.sdk.entities.common.EndCustomer;

/**
 * Represents a request to inform about an account status update.
 */
public class AccountStatusInformRequest extends ContentRequest {

    @JsonProperty("endCustomer")
    private EndCustomer endCustomer;
    @JsonProperty("status")
    private StatusValue statusValue;
    @JsonProperty("initiator")
    private Initiator initiator;
    @JsonProperty("reason")
    private String reason;
    @JsonProperty("periodStartUtc")
    private long periodStartUtc;
    @JsonProperty("periodEndUtc")
    private Long periodEndUtc;

    /**
     * Creates a new instance of the AccountStatusInformRequest.Builder class.
     *
     * @return A new instance of the AccountStatusInformRequest.Builder class.
     */
    public static AccountStatusInformRequest.Builder newBuilder() {
        return new AccountStatusInformRequest.Builder();
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
     * Gets the initiator type.
     *
     * @return The initiator type.
     */
    public Initiator getInitiator() {
        return initiator;
    }

    /**
     * Sets the initiator type.
     *
     * @param value The initiator type.
     */
    public void setInitiator(Initiator value) {
        this.initiator = value;
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
     * Represents a builder for the AccountStatusInformRequest class.
     */
    public static class Builder {

        private final AccountStatusInformRequest instance = new AccountStatusInformRequest();

        private Builder() {
        }

        /**
         * Builds the AccountStatusInformRequest instance.
         *
         * @return The built AccountStatusInformRequest instance.
         */
        public AccountStatusInformRequest build() {
            return this.instance;
        }

        /**
         * Sets the end customer.
         *
         * @param value The end customer.
         * @return The builder instance.
         */
        public AccountStatusInformRequest.Builder setEndCustomer(EndCustomer value) {
            this.instance.setEndCustomer(value);
            return this;
        }

        /**
         * Sets the new status.
         *
         * @param value The new status.
         * @return The builder instance.
         */
        public AccountStatusInformRequest.Builder setStatusValue(StatusValue value) {
            this.instance.setStatusValue(value);
            return this;
        }

        /**
         * Sets the initiator type.
         *
         * @param value The initiator type.
         * @return The builder instance.
         */
        public AccountStatusInformRequest.Builder setInitiator(Initiator value) {
            this.instance.setInitiator(value);
            return this;
        }

        /**
         * Sets the status change reason.
         *
         * @param value The status change reason.
         * @return The builder instance.
         */
        public AccountStatusInformRequest.Builder setReason(String value) {
            this.instance.setReason(value);
            return this;
        }

        /**
         * Sets the status period start in UTC.
         *
         * @param value The status period start in UTC.
         * @return The builder instance.
         */
        public AccountStatusInformRequest.Builder setPeriodStartUtc(long value) {
            this.instance.setPeriodStartUtc(value);
            return this;
        }

        /**
         * Sets the status period end in UTC.
         *
         * @param value The status period end in UTC.
         * @return The builder instance.
         */
        public AccountStatusInformRequest.Builder setPeriodEndUtc(Long value) {
            this.instance.setPeriodEndUtc(value);
            return this;
        }
    }
}
