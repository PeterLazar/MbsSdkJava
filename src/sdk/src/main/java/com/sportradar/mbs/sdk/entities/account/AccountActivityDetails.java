package com.sportradar.mbs.sdk.entities.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.sportradar.mbs.sdk.entities.common.EndCustomer;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = AccountActivityDetailsLimit.class, name = "limit"),
        @JsonSubTypes.Type(value = AccountActivityDetailsStatus.class, name = "status")
})
public class AccountActivityDetails {

    @JsonProperty("endCustomer")
    private EndCustomer endCustomer;
    @JsonProperty("timestampUtc")
    private long timestampUtc;

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
     * Gets the activity timestamp in UTC.
     *
     * @return The activity timestamp in UTC.
     */
    public long getTimestampUtc() {
        return timestampUtc;
    }

    /**
     * Sets the activity timestamp in UTC.
     *
     * @param value The activity timestamp in UTC.
     */
    public void setTimestampUtc(long value) {
        this.timestampUtc = value;
    }

    public static AccountActivityDetailsLimit.Builder newAccountActivityDetailsLimitBuilder() {
        return AccountActivityDetailsLimit.newBuilder();
    }

    public static AccountActivityDetailsStatus.Builder newAccountActivityDetailsStatusBuilder() {
        return AccountActivityDetailsStatus.newBuilder();
    }
}
