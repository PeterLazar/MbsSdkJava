package com.sportradar.mbs.sdk.entities.account;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.HashMap;
import java.util.Map;

public enum StatusValue {
    ACTIVE("active"),
    DISABLED("disabled"),
    EXCLUDED("excluded");

    private static final Map<String, StatusValue> VALUES = new HashMap<>();

    static {
        for (final StatusValue lt : values()) {
            VALUES.put(lt.value, lt);
        }
    }

    private final String value;

    StatusValue(final String value) {
        this.value = value;
    }

    @JsonCreator
    public static StatusValue fromValue(final String value) {
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
