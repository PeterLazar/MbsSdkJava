package com.sportradar.mbs.sdk.entities.selection;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SystemSelection extends Selection {

    @JsonProperty("selections")
    private Selection[] selections;
    @JsonProperty("size")
    private int[] size;

    public static Builder newBuilder() {
        return new Builder();
    }

    public Selection[] getSelections() {
        return this.selections;
    }

    public void setSelections(Selection[] value) {
        this.selections = value;
    }

    public int[] getSize() {
        return this.size;
    }

    public void setSize(int[] value) {
        this.size = value;
    }

    public static class Builder {

        private final SystemSelection instance = new SystemSelection();

        private Builder() {
        }

        public SystemSelection build() {
            return this.instance;
        }

        public Builder setSelections(Selection... value) {
            this.instance.setSelections(value);
            return this;
        }

        public Builder setSize(int... value) {
            this.instance.setSize(value);
            return this;
        }
    }
}