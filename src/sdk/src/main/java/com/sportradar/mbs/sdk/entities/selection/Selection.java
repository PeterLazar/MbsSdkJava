package com.sportradar.mbs.sdk.entities.selection;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = UfSelection.class, name = "uf"),
        @JsonSubTypes.Type(value = OddsBoostSelection.class, name = "odds-boost"),
        @JsonSubTypes.Type(value = ExtSelection.class, name = "external"),
        @JsonSubTypes.Type(value = SystemSelection.class, name = "system"),
        @JsonSubTypes.Type(value = WaysSelection.class, name = "ways"),
        @JsonSubTypes.Type(value = UfCustomBetSelection.class, name = "uf-custom-bet"),
        @JsonSubTypes.Type(value = AccumulatorSelection.class, name = "accumulator")
})
public class Selection {

    public static UfSelection.Builder newUfSelectionBuilder() {
        return UfSelection.newBuilder();
    }

    public static OddsBoostSelection.Builder newOddsBoostSelectionBuilder() {
        return OddsBoostSelection.newBuilder();
    }

    public static ExtSelection.Builder newExtSelectionBuilder() {
        return ExtSelection.newBuilder();
    }

    public static SystemSelection.Builder newSystemSelectionBuilder() {
        return SystemSelection.newBuilder();
    }

    public static WaysSelection.Builder newWaysSelectionBuilder() {
        return WaysSelection.newBuilder();
    }

    public static UfCustomBetSelection.Builder newUfCustomBetSelectionBuilder() {
        return UfCustomBetSelection.newBuilder();
    }

    public static AccumulatorSelection.Builder newAccumulatorSelectionBuilder() {
        return AccumulatorSelection.newBuilder();
    }

}