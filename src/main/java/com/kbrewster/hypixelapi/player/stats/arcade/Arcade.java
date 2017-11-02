package com.kbrewster.hypixelapi.player.stats.arcade;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.List;

/**
 * JSON Class to parse Arcade Stats
 */
@Getter
public class Arcade {

    @SerializedName("coins")
    @Expose
    private long coins;
    @SerializedName("hints")
    @Expose
    private boolean hints;
    @SerializedName("sw_kills")
    @Expose
    private long swKills;
    @SerializedName("sw_shots_fired")
    @Expose
    private long swShotsFired;
    @SerializedName("sw_weekly_kills_b")
    @Expose
    private long swWeeklyKillsB;
    @SerializedName("sw_rebel_kills")
    @Expose
    private long swRebelKills;
    @SerializedName("sw_deaths")
    @Expose
    private long swDeaths;
    @SerializedName("sw_monthly_kills_a")
    @Expose
    private long swMonthlyKillsA;
    @SerializedName("stamp_level")
    @Expose
    private long stampLevel;
    @SerializedName("time_stamp")
    @Expose
    private long timeStamp;
    @SerializedName("sw_weekly_kills_a")
    @Expose
    private long swWeeklyKillsA;
    @SerializedName("sw_empire_kills")
    @Expose
    private long swEmpireKills;
    @SerializedName("music")
    @Expose
    private boolean music;
    @SerializedName("wins_buildbattle")
    @Expose
    private long winsBuildbattle;
    @SerializedName("max_wave")
    @Expose
    private long maxWave;
    @SerializedName("sw_monthly_kills_b")
    @Expose
    private long swMonthlyKillsB;
    @SerializedName("poop_collected")
    @Expose
    private long poopCollected;
    @SerializedName("wins_oneinthequiver")
    @Expose
    private long winsOneinthequiver;
    @SerializedName("deaths_oneinthequiver")
    @Expose
    private long deathsOneinthequiver;
    @SerializedName("bounty_kills_oneinthequiver")
    @Expose
    private long bountyKillsOneinthequiver;
    @SerializedName("kills_oneinthequiver")
    @Expose
    private long killsOneinthequiver;
    @SerializedName("kills_dayone")
    @Expose
    private long killsDayone;
    @SerializedName("headshots_dayone")
    @Expose
    private long headshotsDayone;
    @SerializedName("hitw_record_q")
    @Expose
    private long hitwRecordQ;
    @SerializedName("rounds_hole_in_the_wall")
    @Expose
    private long roundsHoleInTheWall;
    @SerializedName("monthly_coins_b")
    @Expose
    private long monthlyCoinsB;
    @SerializedName("weekly_coins_b")
    @Expose
    private long weeklyCoinsB;
    @SerializedName("weekly_coins_a")
    @Expose
    private long weeklyCoinsA;
    @SerializedName("monthly_coins_a")
    @Expose
    private long monthlyCoinsA;
    @SerializedName("rounds_simon_says")
    @Expose
    private long roundsSimonSays;
    @SerializedName("wins_simon_says")
    @Expose
    private long winsSimonSays;
    @SerializedName("buildbattle_loadout")
    @Expose
    private List<String> buildbattleLoadout = null;
    @SerializedName("kills_throw_out")
    @Expose
    private long killsThrowOut;
    @SerializedName("deaths_throw_out")
    @Expose
    private long deathsThrowOut;
    @SerializedName("kills_dragonwars2")
    @Expose
    private long killsDragonwars2;
    @SerializedName("wins_dragonwars2")
    @Expose
    private long winsDragonwars2;
    @SerializedName("melee_weapon")
    @Expose
    private String meleeWeapon;
    @SerializedName("packages")
    @Expose
    private List<String> packages = null;
    @SerializedName("bounty_head")
    @Expose
    private String bountyHead;
    @SerializedName("wins_soccer")
    @Expose
    private long winsSoccer;
    @SerializedName("powerkicks_soccer")
    @Expose
    private long powerkicksSoccer;
    @SerializedName("goals_soccer")
    @Expose
    private long goalsSoccer;
    @SerializedName("arrows_hit_mini_walls")
    @Expose
    private long arrowsHitMiniWalls;
    @SerializedName("final_kills_mini_walls")
    @Expose
    private long finalKillsMiniWalls;
    @SerializedName("kills_mini_walls")
    @Expose
    private long killsMiniWalls;
    @SerializedName("wins_mini_walls")
    @Expose
    private long winsMiniWalls;
    @SerializedName("deaths_mini_walls")
    @Expose
    private long deathsMiniWalls;
    @SerializedName("arrows_shot_mini_walls")
    @Expose
    private long arrowsShotMiniWalls;
    @SerializedName("miniwalls_activeKit")
    @Expose
    private String miniwallsActiveKit;
    @SerializedName("wither_damage_mini_walls")
    @Expose
    private long witherDamageMiniWalls;
    @SerializedName("wither_kills_mini_walls")
    @Expose
    private long witherKillsMiniWalls;
    @SerializedName("wins_farm_hunt")
    @Expose
    private long winsFarmHunt;
    @SerializedName("wins_party_3")
    @Expose
    private long winsParty3;
    @SerializedName("wins_party")
    @Expose
    private long winsParty;
    @SerializedName("dec2016_achievements2")
    @Expose
    private boolean dec2016Achievements2;
    @SerializedName("dec2016_achievements")
    @Expose
    private boolean dec2016Achievements;
    @SerializedName("wins_dayone")
    @Expose
    private long winsDayone;
}
