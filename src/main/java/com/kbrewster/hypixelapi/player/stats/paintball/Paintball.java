package com.kbrewster.hypixelapi.player.stats.paintball;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

public class Paintball {

    @SerializedName("coins")
    @Expose @Getter
    private long coins;
    @SerializedName("deaths")
    @Expose @Getter
    private long deaths;
    @SerializedName("fortune")
    @Expose @Getter
    private long fortune;
    @SerializedName("hat")
    @Expose @Getter
    private String hat;
    @SerializedName("kills")
    @Expose @Getter
    private long kills;
    @SerializedName("killstreaks")
    @Expose @Getter
    private long killstreaks;
    @SerializedName("packages")
    @Expose @Getter
    private List<String> packages = null;
    @SerializedName("shots_fired")
    @Expose @Getter
    private long shotsFired;
    @SerializedName("superluck")
    @Expose @Getter
    private long superluck;
    @SerializedName("wins")
    @Expose @Getter
    private long wins;
    @SerializedName("godfather")
    @Expose @Getter
    private long godfather;
    @SerializedName("endurance")
    @Expose @Getter
    private long endurance;
    @SerializedName("adrenaline")
    @Expose @Getter
    private long adrenaline;
    @SerializedName("transfusion")
    @Expose @Getter
    private long transfusion;
    @SerializedName("headstart")
    @Expose @Getter
    private long headstart;
    @SerializedName("weekly_kills_a")
    @Expose @Getter
    private long weeklyKillsA;
    @SerializedName("monthly_kills_a")
    @Expose @Getter
    private long monthlyKillsA;
    @SerializedName("monthly_kills_b")
    @Expose @Getter
    private long monthlyKillsB;
    @SerializedName("weekly_kills_b")
    @Expose @Getter
    private long weeklyKillsB;
    @SerializedName("votes_Octagon")
    @Expose @Getter
    private long votesOctagon;
    @SerializedName("forcefieldTime")
    @Expose @Getter
    private long forcefieldTime;
    @SerializedName("votes_Mansion")
    @Expose @Getter
    private long votesMansion;

}
