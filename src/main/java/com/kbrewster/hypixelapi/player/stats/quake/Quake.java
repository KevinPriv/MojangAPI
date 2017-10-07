package com.kbrewster.hypixelapi.player.stats.quake;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class Quake {

    @SerializedName("barrel")
    @Expose
    private String barrel;
    @SerializedName("case")
    @Expose
    private String _case;
    @SerializedName("coins")
    @Expose
    private long coins;
    @SerializedName("deaths")
    @Expose
    private long deaths;
    @SerializedName("kills")
    @Expose
    private long kills;
    @SerializedName("killstreaks")
    @Expose
    private long killstreaks;
    @SerializedName("packages")
    @Expose
    private List<String> packages = null;
    @SerializedName("sight")
    @Expose
    private String sight;
    @SerializedName("trigger")
    @Expose
    private String trigger;
    @SerializedName("wins")
    @Expose
    private long wins;
    @SerializedName("muzzle")
    @Expose
    private String muzzle;
    @SerializedName("kills_teams")
    @Expose
    private long killsTeams;
    @SerializedName("killstreaks_teams")
    @Expose
    private long killstreaksTeams;
    @SerializedName("deaths_teams")
    @Expose
    private long deathsTeams;
    @SerializedName("wins_teams")
    @Expose
    private long winsTeams;
    @SerializedName("monthly_kills_a")
    @Expose
    private long monthlyKillsA;
    @SerializedName("weekly_kills_a")
    @Expose
    private long weeklyKillsA;
    @SerializedName("weekly_kills_b")
    @Expose
    private long weeklyKillsB;
    @SerializedName("monthly_kills_b")
    @Expose
    private long monthlyKillsB;
    @SerializedName("hat")
    @Expose
    private String hat;
    @SerializedName("killsound")
    @Expose
    private String killsound;
    @SerializedName("armor")
    @Expose
    private String armor;
    @SerializedName("null")
    @Expose
    private String _null;
    @SerializedName("showKillPrefix")
    @Expose
    private boolean showKillPrefix;
    @SerializedName("boots")
    @Expose
    private String boots;
    @SerializedName("leggings")
    @Expose
    private String leggings;
    @SerializedName("dash_power")
    @Expose
    private String dashPower;
    @SerializedName("dash_cooldown")
    @Expose
    private String dashCooldown;
    @SerializedName("instantRespawn")
    @Expose
    private boolean instantRespawn;
    @SerializedName("kills_dm_teams")
    @Expose
    private long killsDmTeams;
    @SerializedName("kills_timeattack")
    @Expose
    private long killsTimeattack;
    @SerializedName("kills_dm")
    @Expose
    private long killsDm;
    @SerializedName("compass_selected")
    @Expose
    private boolean compassSelected;
    @SerializedName("enable_sound")
    @Expose
    private boolean enableSound;
    @SerializedName("highest_killstreak")
    @Expose
    private long highestKillstreak;
    @SerializedName("distance_travelled_teams")
    @Expose
    private long distanceTravelledTeams;
    @SerializedName("kills_since_update_feb_2017_teams")
    @Expose
    private long killsSinceUpdateFeb2017Teams;
    @SerializedName("shots_fired_teams")
    @Expose
    private long shotsFiredTeams;
    @SerializedName("headshots_teams")
    @Expose
    private long headshotsTeams;
    @SerializedName("distance_travelled")
    @Expose
    private long distanceTravelled;
    @SerializedName("headshots")
    @Expose
    private long headshots;
    @SerializedName("shots_fired")
    @Expose
    private long shotsFired;
    @SerializedName("kills_since_update_feb_2017")
    @Expose
    private long killsSinceUpdateFeb2017;
    @SerializedName("alternative_gun_cooldown_indicator")
    @Expose
    private boolean alternativeGunCooldownIndicator;
    @SerializedName("showDashCooldown")
    @Expose
    private boolean showDashCooldown;

}
