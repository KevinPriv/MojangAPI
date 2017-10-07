package com.kbrewster.hypixelapi.player.stats.vampz;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

public class VampireZ {

    @SerializedName("coins")
    @Expose @Getter
    private long coins;
    @SerializedName("human_deaths")
    @Expose @Getter
    private long humanDeaths;
    @SerializedName("vampire_deaths")
    @Expose @Getter
    private long vampireDeaths;
    @SerializedName("vampire_kills")
    @Expose @Getter
    private long vampireKills;
    @SerializedName("zombie_kills")
    @Expose @Getter
    private long zombieKills;
    @SerializedName("most_vampire_kills")
    @Expose @Getter
    private long mostVampireKills;
    @SerializedName("human_wins")
    @Expose @Getter
    private long humanWins;
    @SerializedName("gold_starter")
    @Expose @Getter
    private long goldStarter;
    @SerializedName("gold_booster")
    @Expose @Getter
    private long goldBooster;
    @SerializedName("zombie_doubler")
    @Expose @Getter
    private long zombieDoubler;
    @SerializedName("vampire_doubler")
    @Expose @Getter
    private long vampireDoubler;
    @SerializedName("baby_hater")
    @Expose @Getter
    private long babyHater;
    @SerializedName("constitution")
    @Expose @Getter
    private long constitution;
    @SerializedName("van_helsing")
    @Expose @Getter
    private long vanHelsing;
    @SerializedName("transfusion")
    @Expose @Getter
    private long transfusion;
    @SerializedName("fireproofing")
    @Expose @Getter
    private long fireproofing;
    @SerializedName("explosive_killer")
    @Expose @Getter
    private long explosiveKiller;
    @SerializedName("foresight")
    @Expose @Getter
    private long foresight;
    @SerializedName("theology")
    @Expose @Getter
    private long theology;
    @SerializedName("loot_drops")
    @Expose @Getter
    private long lootDrops;
    @SerializedName("basic_swag")
    @Expose @Getter
    private long basicSwag;
    @SerializedName("expert_swag")
    @Expose @Getter
    private long expertSwag;
    @SerializedName("advanced_swag")
    @Expose @Getter
    private long advancedSwag;
    @SerializedName("monthly_human_wins_b")
    @Expose @Getter
    private long monthlyHumanWinsB;
    @SerializedName("weekly_human_wins_a")
    @Expose @Getter
    private long weeklyHumanWinsA;
    @SerializedName("packages")
    @Expose @Getter
    private List<String> packages = null;
    @SerializedName("kill_booster")
    @Expose @Getter
    private long killBooster;
    @SerializedName("blood_booster")
    @Expose @Getter
    private long bloodBooster;
    @SerializedName("vampiric_minion")
    @Expose @Getter
    private long vampiricMinion;
    @SerializedName("wave_booster")
    @Expose @Getter
    private long waveBooster;
    @SerializedName("drain_punch")
    @Expose @Getter
    private long drainPunch;
    @SerializedName("blood_drinker")
    @Expose @Getter
    private long bloodDrinker;
    @SerializedName("final_breath")
    @Expose @Getter
    private long finalBreath;
    @SerializedName("hellborn")
    @Expose @Getter
    private long hellborn;
    @SerializedName("vampiric_scream")
    @Expose @Getter
    private long vampiricScream;
    @SerializedName("renfield")
    @Expose @Getter
    private long renfield;
    @SerializedName("terror_level")
    @Expose @Getter
    private long terrorLevel;
    @SerializedName("frankensteins_monster")
    @Expose @Getter
    private long frankensteinsMonster;
    @SerializedName("weekly_human_wins_b")
    @Expose @Getter
    private long weeklyHumanWinsB;
    @SerializedName("human_kills")
    @Expose @Getter
    private long humanKills;
    @SerializedName("votes_Pyramids")
    @Expose @Getter
    private long votesPyramids;
    @SerializedName("monthly_human_wins_a")
    @Expose @Getter
    private long monthlyHumanWinsA;
    @SerializedName("gold_bought")
    @Expose @Getter
    private long goldBought;
    @SerializedName("monthly_vampire_wins_b")
    @Expose @Getter
    private long monthlyVampireWinsB;
    @SerializedName("weekly_vampire_wins_b")
    @Expose @Getter
    private long weeklyVampireWinsB;
    @SerializedName("weekly_vampire_wins_a")
    @Expose @Getter
    private long weeklyVampireWinsA;
    @SerializedName("updated_stats")
    @Expose @Getter
    private boolean updatedStats;

}
