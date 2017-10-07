package com.kbrewster.hypixelapi.player.stats.battlegrounds;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Spec {

    @SerializedName("spec")
    @Expose
    private long spec;
    @SerializedName("playerClass")
    @Expose
    private long playerClass;

    public long getSpec() {
        return spec;
    }

    public long getPlayerClass() {
        return playerClass;
    }

}
