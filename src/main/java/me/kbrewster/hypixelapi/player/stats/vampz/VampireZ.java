package me.kbrewster.hypixelapi.player.stats.vampz;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.List;

@Getter
public class VampireZ {

    @SerializedName("coins")
    @Expose
    private long coins;
    @SerializedName("human_deaths")
    @Expose
    private long humanDeaths;
    @SerializedName("vampire_deaths")
    @Expose
    private long vampireDeaths;
    @SerializedName("vampire_kills")
    @Expose
    private long vampireKills;
    @SerializedName("zombie_kills")
    @Expose
    private long zombieKills;
    @SerializedName("most_vampire_kills")
    @Expose
    private long mostVampireKills;
    @SerializedName("human_wins")
    @Expose
    private long humanWins;
    @SerializedName("gold_starter")
    @Expose
    private long goldStarter;
    @SerializedName("gold_booster")
    @Expose
    private long goldBooster;
    @SerializedName("zombie_doubler")
    @Expose
    private long zombieDoubler;
    @SerializedName("vampire_doubler")
    @Expose
    private long vampireDoubler;
    @SerializedName("baby_hater")
    @Expose
    private long babyHater;
    @SerializedName("constitution")
    @Expose
    private long constitution;
    @SerializedName("van_helsing")
    @Expose
    private long vanHelsing;
    @SerializedName("transfusion")
    @Expose
    private long transfusion;
    @SerializedName("fireproofing")
    @Expose
    private long fireproofing;
    @SerializedName("explosive_killer")
    @Expose
    private long explosiveKiller;
    @SerializedName("foresight")
    @Expose
    private long foresight;
    @SerializedName("theology")
    @Expose
    private long theology;
    @SerializedName("loot_drops")
    @Expose
    private long lootDrops;
    @SerializedName("basic_swag")
    @Expose
    private long basicSwag;
    @SerializedName("expert_swag")
    @Expose
    private long expertSwag;
    @SerializedName("advanced_swag")
    @Expose
    private long advancedSwag;
    @SerializedName("monthly_human_wins_b")
    @Expose
    private long monthlyHumanWinsB;
    @SerializedName("weekly_human_wins_a")
    @Expose
    private long weeklyHumanWinsA;
    @SerializedName("packages")
    @Expose
    private List<String> packages = null;
    @SerializedName("kill_booster")
    @Expose
    private long killBooster;
    @SerializedName("blood_booster")
    @Expose
    private long bloodBooster;
    @SerializedName("vampiric_minion")
    @Expose
    private long vampiricMinion;
    @SerializedName("wave_booster")
    @Expose
    private long waveBooster;
    @SerializedName("drain_punch")
    @Expose
    private long drainPunch;
    @SerializedName("blood_drinker")
    @Expose
    private long bloodDrinker;
    @SerializedName("final_breath")
    @Expose
    private long finalBreath;
    @SerializedName("hellborn")
    @Expose
    private long hellborn;
    @SerializedName("vampiric_scream")
    @Expose
    private long vampiricScream;
    @SerializedName("renfield")
    @Expose
    private long renfield;
    @SerializedName("terror_level")
    @Expose
    private long terrorLevel;
    @SerializedName("frankensteins_monster")
    @Expose
    private long frankensteinsMonster;
    @SerializedName("weekly_human_wins_b")
    @Expose
    private long weeklyHumanWinsB;
    @SerializedName("human_kills")
    @Expose
    private long humanKills;
    @SerializedName("votes_Pyramids")
    @Expose
    private long votesPyramids;
    @SerializedName("monthly_human_wins_a")
    @Expose
    private long monthlyHumanWinsA;
    @SerializedName("gold_bought")
    @Expose
    private long goldBought;
    @SerializedName("monthly_vampire_wins_b")
    @Expose
    private long monthlyVampireWinsB;
    @SerializedName("weekly_vampire_wins_b")
    @Expose
    private long weeklyVampireWinsB;
    @SerializedName("weekly_vampire_wins_a")
    @Expose
    private long weeklyVampireWinsA;
    @SerializedName("updated_stats")
    @Expose
    private boolean updatedStats;

}
