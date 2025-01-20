package com.sportradar.mbs.sdk.entities.account;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum LimitType {
    DEPOSIT("deposit"),
    STAKE("stake"),
    LOSS("loss"),
    SESSION("session");

    private static final Map<String, LimitType> VALUES = new HashMap<>();

    static {
        for (final LimitType lt : EnumSet.allOf(LimitType.class)) {
            VALUES.put(lt.jsonVal, lt);
        }
    }

    private final String jsonVal;

    LimitType(final String jsonVal) {
        this.jsonVal = jsonVal;
    }

    @JsonCreator
    public static LimitType fromValue(final String value) {
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