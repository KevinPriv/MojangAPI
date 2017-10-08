package com.kbrewster.hypixelapi.player.misc;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class Settings {

    @SerializedName("allowFriendRequests")
    @Expose
    private boolean allowFriendRequests;
    @SerializedName("bloodVisibility")
    @Expose
    private boolean bloodVisibility;
    @SerializedName("chatVisibility")
    @Expose
    private boolean chatVisibility;
    @SerializedName("playerVisibility")
    @Expose
    private boolean playerVisibility;
    @SerializedName("autoSpawnPet")
    @Expose
    private boolean autoSpawnPet;
    @SerializedName("chatAlerts")
    @Expose
    private boolean chatAlerts;
    @SerializedName("lobbyProtection")
    @Expose
    private boolean lobbyProtection;

}
