package com.sportradar.mbs.sdk.entities.account;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.HashMap;
import java.util.Map;

public enum LimitNature {
    NEW("new"),
    CHANGE("change");

    private static final Map<String, LimitNature> VALUES = new HashMap<>();

    static {
        for (final LimitNature lt : values()) {
            VALUES.put(lt.value, lt);
        }
    }

    private final String value;

    LimitNature(final String value) {
        this.value = value;
    }

    @JsonCreator
    public static LimitNature fromValue(final String value) {
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
