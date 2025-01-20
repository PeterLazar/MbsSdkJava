package com.sportradar.mbs.sdk.entities.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.account.FinancialLimitType;
import com.sportradar.mbs.sdk.entities.account.LimitFrequency;
import com.sportradar.mbs.sdk.entities.common.Amount;
import com.sportradar.mbs.sdk.entities.common.EndCustomer;

/**
 * Represents a request to inform about a financial limit change.
 */
public class FinancialLimitInformRequest extends ContentRequest {

    @JsonProperty("endCustomer")
    private EndCustomer endCustomer;
    @JsonProperty("timestampUtc")
    private long timestampUtc;
    @JsonProperty("limitType")
    private FinancialLimitType limitType;
    @JsonProperty("frequency")
    private LimitFrequency frequency;
    @JsonProperty("amount")
    private Amount amount;

    /**
     * Creates a new instance of the FinancialLimitInformRequest.Builder class.
     *
     * @return A new instance of the FinancialLimitInformRequest.Builder class.
     */
    public static FinancialLimitInformRequest.Builder newBuilder() {
        return new FinancialLimitInformRequest.Builder();
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
     * Gets the limit type.
     *
     * @return The limit type.
     */
    public FinancialLimitType getLimitType() {
        return limitType;
    }

    /**
     * Sets the limit type.
     *
     * @param value The limit type.
     */
    public void setLimitType(FinancialLimitType value) {
        this.limitType = value;
    }

    /**
     * Gets the limit frequency.
     *
     * @return The limit frequency.
     */
    public LimitFrequency getFrequency() {
        return frequency;
    }

    /**
     * Sets the limit frequency.
     *
     * @param value The limit frequency.
     */
    public void setFrequency(LimitFrequency value) {
        this.frequency = value;
    }

    /**
     * Gets the limit amount.
     *
     * @return The limit amount.
     */
    public Amount getAmount() {
        return amount;
    }

    /**
     * Sets the limit amount.
     *
     * @param value The limit amount.
     */
    public void setAmount(Amount value) {
        this.amount = value;
    }

    /**
     * Represents a builder for the FinancialLimitInformRequest class.
     */
    public static class Builder {

        private final FinancialLimitInformRequest instance = new FinancialLimitInformRequest();

        private Builder() {
        }

        /**
         * Builds the FinancialLimitInformRequest instance.
         *
         * @return The built FinancialLimitInformRequest instance.
         */
        public FinancialLimitInformRequest build() {
            return this.instance;
        }

        /**
         * Sets the end customer.
         *
         * @param value The end customer.
         * @return The builder instance.
         */
        public FinancialLimitInformRequest.Builder setEndCustomer(EndCustomer value) {
            this.instance.setEndCustomer(value);
            return this;
        }

        /**
         * Sets the limit change timestamp in UTC.
         *
         * @param value The limit change timestamp in UTC.
         * @return The builder instance.
         */
        public FinancialLimitInformRequest.Builder setTimestampUtc(long value) {
            this.instance.setTimestampUtc(value);
            return this;
        }

        /**
         * Sets the limit type.
         *
         * @param value The limit type.
         * @return The builder instance.
         */
        public FinancialLimitInformRequest.Builder setLimitType(FinancialLimitType value) {
            this.instance.setLimitType(value);
            return this;
        }

        /**
         * Sets the limit frequency.
         *
         * @param value The limit frequency.
         * @return The builder instance.
         */
        public FinancialLimitInformRequest.Builder setLimitFrequency(LimitFrequency value) {
            this.instance.setFrequency(value);
            return this;
        }

        /**
         * Sets the limit amount.
         *
         * @param value The limit amount.
         * @return The builder instance.
         */
        public FinancialLimitInformRequest.Builder setAmount(Amount value) {
            this.instance.setAmount(value);
            return this;
        }
    }
}
