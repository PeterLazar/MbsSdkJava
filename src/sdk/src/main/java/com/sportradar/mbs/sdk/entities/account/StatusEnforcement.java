package com.sportradar.mbs.sdk.entities.account;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.HashMap;
import java.util.Map;

public enum StatusEnforcement {
    PLAYER("player"),
    OPERATOR("operator"),
    REGULATOR("regulator");

    private static final Map<String, StatusEnforcement> VALUES = new HashMap<>();

    static {
        for (final StatusEnforcement lt : values()) {
            VALUES.put(lt.value, lt);
        }
    }

    private final String value;

    StatusEnforcement(final String value) {
        this.value = value;
    }

    @JsonCreator
    public static StatusEnforcement fromValue(final String value) {
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
