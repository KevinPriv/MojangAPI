package com.kbrewster.hypixelapi.player.misc;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class Links {

    @SerializedName("YOUTUBE")
    @Expose
    private String youtube;
    @SerializedName("TWITTER")
    @Expose
    private String twitter;
    @SerializedName("HYPIXEL")
    @Expose
    private String hypixel;
}
