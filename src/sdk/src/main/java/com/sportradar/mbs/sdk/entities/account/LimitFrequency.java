package com.sportradar.mbs.sdk.entities.account;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.HashMap;
import java.util.Map;

public enum LimitFrequency {
    DAILY("daily"),
    WEEKLY("weekly"),
    MONTHLY("monthly");

    private static final Map<String, LimitFrequency> VALUES = new HashMap<>();

    static {
        for (final LimitFrequency lt : values()) {
            VALUES.put(lt.value, lt);
        }
    }

    private final String value;

    LimitFrequency(final String value) {
        this.value = value;
    }

    @JsonCreator
    public static LimitFrequency fromValue(final String value) {
        return value == null ? null : VALUES.get(value);
    }

    @Override
    public String toString() {
        return this.value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }
}
