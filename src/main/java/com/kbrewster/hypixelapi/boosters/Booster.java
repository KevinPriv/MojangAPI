package com.kbrewster.hypixelapi.boosters;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class Booster {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("purchaserUuid")
    @Expose
    private String purchaserUuid;
    @SerializedName("amount")
    @Expose
    private long amount;
    @SerializedName("originalLength")
    @Expose
    private long originalLength;
    @SerializedName("length")
    @Expose
    private long length;
    @SerializedName("gameType")
    @Expose
    private long gameType;
    @SerializedName("dateActivated")
    @Expose
    private long dateActivated;
}
