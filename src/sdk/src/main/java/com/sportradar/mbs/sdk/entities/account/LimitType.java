package com.sportradar.mbs.sdk.entities.account;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.HashMap;
import java.util.Map;

public enum LimitType {
    DEPOSIT("deposit"),
    STAKE("stake"),
    LOSS("loss");

    private static final Map<String, LimitType> VALUES = new HashMap<>();

    static {
        for (final LimitType lt : values()) {
            VALUES.put(lt.value, lt);
        }
    }

    private final String value;

    LimitType(final String value) {
        this.value = value;
    }

    @JsonCreator
    public static LimitType fromValue(final String value) {
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