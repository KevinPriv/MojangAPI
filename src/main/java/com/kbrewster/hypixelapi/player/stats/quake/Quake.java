package com.kbrewster.hypixelapi.player.stats.quake;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

public class Quake {

    @SerializedName("barrel")
    @Expose @Getter
    private String barrel;
    @SerializedName("case")
    @Expose @Getter
    private String _case;
    @SerializedName("coins")
    @Expose @Getter
    private long coins;
    @SerializedName("deaths")
    @Expose @Getter
    private long deaths;
    @SerializedName("kills")
    @Expose @Getter
    private long kills;
    @SerializedName("killstreaks")
    @Expose @Getter
    private long killstreaks;
    @SerializedName("packages")
    @Expose @Getter
    private List<String> packages = null;
    @SerializedName("sight")
    @Expose @Getter
    private String sight;
    @SerializedName("trigger")
    @Expose @Getter
    private String trigger;
    @SerializedName("wins")
    @Expose @Getter
    private long wins;
    @SerializedName("muzzle")
    @Expose @Getter
    private String muzzle;
    @SerializedName("kills_teams")
    @Expose @Getter
    private long killsTeams;
    @SerializedName("killstreaks_teams")
    @Expose @Getter
    private long killstreaksTeams;
    @SerializedName("deaths_teams")
    @Expose @Getter
    private long deathsTeams;
    @SerializedName("wins_teams")
    @Expose @Getter
    private long winsTeams;
    @SerializedName("monthly_kills_a")
    @Expose @Getter
    private long monthlyKillsA;
    @SerializedName("weekly_kills_a")
    @Expose @Getter
    private long weeklyKillsA;
    @SerializedName("weekly_kills_b")
    @Expose @Getter
    private long weeklyKillsB;
    @SerializedName("monthly_kills_b")
    @Expose @Getter
    private long monthlyKillsB;
    @SerializedName("hat")
    @Expose @Getter
    private String hat;
    @SerializedName("killsound")
    @Expose @Getter
    private String killsound;
    @SerializedName("armor")
    @Expose @Getter
    private String armor;
    @SerializedName("null")
    @Expose @Getter
    private String _null;
    @SerializedName("showKillPrefix")
    @Expose @Getter
    private boolean showKillPrefix;
    @SerializedName("boots")
    @Expose @Getter
    private String boots;
    @SerializedName("leggings")
    @Expose @Getter
    private String leggings;
    @SerializedName("dash_power")
    @Expose @Getter
    private String dashPower;
    @SerializedName("dash_cooldown")
    @Expose @Getter
    private String dashCooldown;
    @SerializedName("instantRespawn")
    @Expose @Getter
    private boolean instantRespawn;
    @SerializedName("kills_dm_teams")
    @Expose @Getter
    private long killsDmTeams;
    @SerializedName("kills_timeattack")
    @Expose @Getter
    private long killsTimeattack;
    @SerializedName("kills_dm")
    @Expose @Getter
    private long killsDm;
    @SerializedName("compass_selected")
    @Expose @Getter
    private boolean compassSelected;
    @SerializedName("enable_sound")
    @Expose @Getter
    private boolean enableSound;
    @SerializedName("highest_killstreak")
    @Expose @Getter
    private long highestKillstreak;
    @SerializedName("distance_travelled_teams")
    @Expose @Getter
    private long distanceTravelledTeams;
    @SerializedName("kills_since_update_feb_2017_teams")
    @Expose @Getter
    private long killsSinceUpdateFeb2017Teams;
    @SerializedName("shots_fired_teams")
    @Expose @Getter
    private long shotsFiredTeams;
    @SerializedName("headshots_teams")
    @Expose @Getter
    private long headshotsTeams;
    @SerializedName("distance_travelled")
    @Expose @Getter
    private long distanceTravelled;
    @SerializedName("headshots")
    @Expose @Getter
    private long headshots;
    @SerializedName("shots_fired")
    @Expose @Getter
    private long shotsFired;
    @SerializedName("kills_since_update_feb_2017")
    @Expose @Getter
    private long killsSinceUpdateFeb2017;
    @SerializedName("alternative_gun_cooldown_indicator")
    @Expose @Getter
    private boolean alternativeGunCooldownIndicator;
    @SerializedName("showDashCooldown")
    @Expose @Getter
    private boolean showDashCooldown;

}
