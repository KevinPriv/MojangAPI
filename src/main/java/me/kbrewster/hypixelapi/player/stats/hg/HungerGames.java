package me.kbrewster.hypixelapi.player.stats.hg;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.List;

@Getter
public class HungerGames {

    @SerializedName("archer")
    @Expose 
    private long archer;
    @SerializedName("coins")
    @Expose 
    private long coins;
    @SerializedName("deaths")
    @Expose 
    private long deaths;
    @SerializedName("kills")
    @Expose 
    private long kills;
    @SerializedName("knight")
    @Expose 
    private long knight;
    @SerializedName("scout")
    @Expose 
    private long scout;
    @SerializedName("baker")
    @Expose 
    private long baker;
    @SerializedName("wins_teams")
    @Expose 
    private long winsTeams;
    @SerializedName("wins")
    @Expose 
    private long wins;
    @SerializedName("packages")
    @Expose 
    private List<String> packages = null;
    @SerializedName("chosen_taunt")
    @Expose 
    private String chosenTaunt;
    @SerializedName("monthly_kills_b")
    @Expose 
    private long monthlyKillsB;
    @SerializedName("weekly_kills_b")
    @Expose 
    private long weeklyKillsB;
    @SerializedName("monthly_kills_a")
    @Expose 
    private long monthlyKillsA;
    @SerializedName("weekly_kills_a")
    @Expose 
    private long weeklyKillsA;
    @SerializedName("votes_Pixelville")
    @Expose 
    private long votesPixelville;
    @SerializedName("chosen_victorydance")
    @Expose 
    private String chosenVictorydance;
    @SerializedName("armorer")
    @Expose 
    private long armorer;
    @SerializedName("fisherman")
    @Expose 
    private long fisherman;
    @SerializedName("hype train")
    @Expose 
    private long hypeTrain;
    @SerializedName("hunter")
    @Expose 
    private long hunter;
    @SerializedName("wolftamer")
    @Expose 
    private long wolftamer;
    @SerializedName("astronaut")
    @Expose 
    private long astronaut;
    @SerializedName("autoarmor")
    @Expose 
    private boolean autoarmor;
    @SerializedName("defaultkit")
    @Expose 
    private String defaultkit;
    @SerializedName("chosen_finisher")
    @Expose 
    private String chosenFinisher;
    @SerializedName("combatTracker")
    @Expose 
    private boolean combatTracker;

}
