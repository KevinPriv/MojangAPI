package com.kbrewster.hypixelapi.player.misc;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class PlayerSettings {

    @SerializedName("VISIBILITY")
    @Expose
    private String visability;
    @SerializedName("BORDER")
    @Expose
    private String border;
    @SerializedName("customVisibility")
    @Expose
    private long customVisibility;
    @SerializedName("TIPS")
    @Expose
    private String tips;
    @SerializedName("YT_REPULSOR")
    @Expose
    private String ytRepulsor;
}
