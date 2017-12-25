package me.kbrewster.hypixelapi.player.stats.paintball;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.List;

@Getter
public class Paintball {

    @SerializedName("coins")
    @Expose
    private long coins;
    @SerializedName("deaths")
    @Expose
    private long deaths;
    @SerializedName("fortune")
    @Expose
    private long fortune;
    @SerializedName("hat")
    @Expose
    private String hat;
    @SerializedName("kills")
    @Expose
    private long kills;
    @SerializedName("killstreaks")
    @Expose
    private long killstreaks;
    @SerializedName("packages")
    @Expose
    private List<String> packages = null;
    @SerializedName("shots_fired")
    @Expose
    private long shotsFired;
    @SerializedName("superluck")
    @Expose
    private long superluck;
    @SerializedName("wins")
    @Expose
    private long wins;
    @SerializedName("godfather")
    @Expose
    private long godfather;
    @SerializedName("endurance")
    @Expose
    private long endurance;
    @SerializedName("adrenaline")
    @Expose
    private long adrenaline;
    @SerializedName("transfusion")
    @Expose
    private long transfusion;
    @SerializedName("headstart")
    @Expose
    private long headstart;
    @SerializedName("weekly_kills_a")
    @Expose
    private long weeklyKillsA;
    @SerializedName("monthly_kills_a")
    @Expose
    private long monthlyKillsA;
    @SerializedName("monthly_kills_b")
    @Expose
    private long monthlyKillsB;
    @SerializedName("weekly_kills_b")
    @Expose
    private long weeklyKillsB;
    @SerializedName("votes_Octagon")
    @Expose
    private long votesOctagon;
    @SerializedName("forcefieldTime")
    @Expose
    private long forcefieldTime;
    @SerializedName("votes_Mansion")
    @Expose
    private long votesMansion;

}
