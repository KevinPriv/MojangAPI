package com.kbrewster.hypixelapi.player.stats.hg;


import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

public class HungerGames {

    @SerializedName("archer")
    @Expose @Getter
    private long archer;
    @SerializedName("coins")
    @Expose @Getter
    private long coins;
    @SerializedName("deaths")
    @Expose @Getter
    private long deaths;
    @SerializedName("kills")
    @Expose @Getter
    private long kills;
    @SerializedName("knight")
    @Expose @Getter
    private long knight;
    @SerializedName("scout")
    @Expose @Getter
    private long scout;
    @SerializedName("baker")
    @Expose @Getter
    private long baker;
    @SerializedName("wins_teams")
    @Expose @Getter
    private long winsTeams;
    @SerializedName("wins")
    @Expose @Getter
    private long wins;
    @SerializedName("packages")
    @Expose @Getter
    private List<String> packages = null;
    @SerializedName("chosen_taunt")
    @Expose @Getter
    private String chosenTaunt;
    @SerializedName("monthly_kills_b")
    @Expose @Getter
    private long monthlyKillsB;
    @SerializedName("weekly_kills_b")
    @Expose @Getter
    private long weeklyKillsB;
    @SerializedName("monthly_kills_a")
    @Expose @Getter
    private long monthlyKillsA;
    @SerializedName("weekly_kills_a")
    @Expose @Getter
    private long weeklyKillsA;
    @SerializedName("votes_Pixelville")
    @Expose @Getter
    private long votesPixelville;
    @SerializedName("chosen_victorydance")
    @Expose @Getter
    private String chosenVictorydance;
    @SerializedName("armorer")
    @Expose @Getter
    private long armorer;
    @SerializedName("fisherman")
    @Expose @Getter
    private long fisherman;
    @SerializedName("hype train")
    @Expose @Getter
    private long hypeTrain;
    @SerializedName("hunter")
    @Expose @Getter
    private long hunter;
    @SerializedName("wolftamer")
    @Expose @Getter
    private long wolftamer;
    @SerializedName("astronaut")
    @Expose @Getter
    private long astronaut;
    @SerializedName("autoarmor")
    @Expose @Getter
    private boolean autoarmor;
    @SerializedName("defaultkit")
    @Expose @Getter
    private String defaultkit;
    @SerializedName("chosen_finisher")
    @Expose @Getter
    private String chosenFinisher;
    @SerializedName("combatTracker")
    @Expose @Getter
    private boolean combatTracker;

}
