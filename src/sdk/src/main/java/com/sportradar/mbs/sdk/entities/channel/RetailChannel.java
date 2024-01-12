package com.sportradar.mbs.sdk.entities.channel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RetailChannel extends Channel {

    @JsonProperty("shopId")
    private String shopId;
    @JsonProperty("lang")
    private String lang;
    @JsonProperty("deviceId")
    private String deviceId;

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String value) {
        shopId = value;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String value) {
        lang = value;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String value) {
        deviceId = value;
    }

}
