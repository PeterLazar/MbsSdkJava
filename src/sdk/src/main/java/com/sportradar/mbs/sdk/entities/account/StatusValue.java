package com.sportradar.mbs.sdk.entities.account;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum StatusValue {
    ACTIVE("active"),
    DISABLED("disabled"),
    EXCLUDED("excluded");

    private static final Map<String, StatusValue> VALUES = new HashMap<>();

    static {
        for (final StatusValue lt : EnumSet.allOf(StatusValue.class)) {
            VALUES.put(lt.jsonVal, lt);
        }
    }

    private final String jsonVal;

    StatusValue(final String jsonVal) {
        this.jsonVal = jsonVal;
    }

    @JsonCreator
    public static StatusValue fromValue(final String value) {
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
