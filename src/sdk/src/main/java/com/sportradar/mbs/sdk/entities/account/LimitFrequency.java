package com.sportradar.mbs.sdk.entities.account;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum LimitFrequency {
    DAILY("daily"),
    WEEKLY("weekly"),
    MONTHLY("monthly");

    private static final Map<String, LimitFrequency> VALUES = new HashMap<>();

    static {
        for (final LimitFrequency lt : EnumSet.allOf(LimitFrequency.class)) {
            VALUES.put(lt.jsonVal, lt);
        }
    }

    private final String jsonVal;

    LimitFrequency(final String jsonVal) {
        this.jsonVal = jsonVal;
    }

    @JsonCreator
    public static LimitFrequency fromValue(final String value) {
        return value == null ? null : VALUES.get(value);
    }

    @JsonValue
    public String getJsonValue() {
        return this.jsonVal;
    }

    public String toString() {
        return this.jsonVal;
    }
}
