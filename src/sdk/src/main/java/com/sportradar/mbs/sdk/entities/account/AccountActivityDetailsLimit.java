package com.sportradar.mbs.sdk.entities.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.common.Amount;
import com.sportradar.mbs.sdk.entities.common.EndCustomer;

public class AccountActivityDetailsLimit extends AccountActivityDetails {

    @JsonProperty("limitType")
    private LimitType limitType;
    @JsonProperty("nature")
    private LimitNature limitNature;
    @JsonProperty("frequency")
    private LimitFrequency limitFrequency;
    @JsonProperty("amount")
    private Amount amount;

    /**
     * Creates a new instance of the AccountActivityDetailsLimit.Builder class.
     *
     * @return A new instance of the AccountActivityDetailsLimit.Builder class.
     */
    public static AccountActivityDetailsLimit.Builder newBuilder() {
        return new AccountActivityDetailsLimit.Builder();
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

    public LimitFrequency getLimitFrequency() {
        return limitFrequency;
    }

    /**
     * Sets the limit frequency.
     *
     * @param value The limit frequency.
     */
    public void setLimitFrequency(LimitFrequency value) {
        this.limitFrequency = value;
    }

    public LimitNature getLimitNature() {
        return limitNature;
    }

    /**
     * Sets the limit nature.
     *
     * @param value The limit nature.
     */
    public void setLimitNature(LimitNature value) {
        this.limitNature = value;
    }

    /**
     * Builder class for creating instances of the AccountActivityDetailsLimit class.
     */
    public static class Builder {

        private final AccountActivityDetailsLimit instance = new AccountActivityDetailsLimit();

        private Builder() {
        }

        /**
         * Builds and returns the AccountActivityDetailsLimit instance.
         *
         * @return The built AccountActivityDetailsLimit instance.
         */
        public AccountActivityDetailsLimit build() {
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
         * Sets the limit amount.
         *
         * @param value The limit amount.
         * @return The builder instance.
         */
        public Builder setAmount(Amount value) {
            this.instance.amount = value;
            return this;
        }

        /**
         * Sets the limit type.
         *
         * @param value The limit type.
         * @return The builder instance.
         */
        public Builder setLimitType(LimitType value) {
            this.instance.limitType = value;
            return this;
        }

        /**
         * Sets the limit frequency.
         *
         * @param value The limit frequency.
         * @return The builder instance.
         */
        public Builder setLimitFrequency(LimitFrequency value) {
            this.instance.limitFrequency = value;
            return this;
        }

        /**
         * Sets the limit nature.
         *
         * @param value The limit nature.
         * @return The builder instance.
         */
        public Builder setLimitNature(LimitNature value) {
            this.instance.limitNature = value;
            return this;
        }
    }
}
