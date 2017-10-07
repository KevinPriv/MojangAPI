package com.kbrewster.hypixelapi.player.stats.vampz;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

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

    public long getCoins() {
        return coins;
    }

    public void setCoins(long coins) {
        this.coins = coins;
    }

    public long getHumanDeaths() {
        return humanDeaths;
    }

    public void setHumanDeaths(long humanDeaths) {
        this.humanDeaths = humanDeaths;
    }

    public long getVampireDeaths() {
        return vampireDeaths;
    }

    public void setVampireDeaths(long vampireDeaths) {
        this.vampireDeaths = vampireDeaths;
    }

    public long getVampireKills() {
        return vampireKills;
    }

    public void setVampireKills(long vampireKills) {
        this.vampireKills = vampireKills;
    }

    public long getZombieKills() {
        return zombieKills;
    }

    public void setZombieKills(long zombieKills) {
        this.zombieKills = zombieKills;
    }

    public long getMostVampireKills() {
        return mostVampireKills;
    }

    public void setMostVampireKills(long mostVampireKills) {
        this.mostVampireKills = mostVampireKills;
    }

    public long getHumanWins() {
        return humanWins;
    }

    public void setHumanWins(long humanWins) {
        this.humanWins = humanWins;
    }

    public long getGoldStarter() {
        return goldStarter;
    }

    public void setGoldStarter(long goldStarter) {
        this.goldStarter = goldStarter;
    }

    public long getGoldBooster() {
        return goldBooster;
    }

    public void setGoldBooster(long goldBooster) {
        this.goldBooster = goldBooster;
    }

    public long getZombieDoubler() {
        return zombieDoubler;
    }

    public void setZombieDoubler(long zombieDoubler) {
        this.zombieDoubler = zombieDoubler;
    }

    public long getVampireDoubler() {
        return vampireDoubler;
    }

    public void setVampireDoubler(long vampireDoubler) {
        this.vampireDoubler = vampireDoubler;
    }

    public long getBabyHater() {
        return babyHater;
    }

    public void setBabyHater(long babyHater) {
        this.babyHater = babyHater;
    }

    public long getConstitution() {
        return constitution;
    }

    public void setConstitution(long constitution) {
        this.constitution = constitution;
    }

    public long getVanHelsing() {
        return vanHelsing;
    }

    public void setVanHelsing(long vanHelsing) {
        this.vanHelsing = vanHelsing;
    }

    public long getTransfusion() {
        return transfusion;
    }

    public void setTransfusion(long transfusion) {
        this.transfusion = transfusion;
    }

    public long getFireproofing() {
        return fireproofing;
    }

    public void setFireproofing(long fireproofing) {
        this.fireproofing = fireproofing;
    }

    public long getExplosiveKiller() {
        return explosiveKiller;
    }

    public void setExplosiveKiller(long explosiveKiller) {
        this.explosiveKiller = explosiveKiller;
    }

    public long getForesight() {
        return foresight;
    }

    public void setForesight(long foresight) {
        this.foresight = foresight;
    }

    public long getTheology() {
        return theology;
    }

    public void setTheology(long theology) {
        this.theology = theology;
    }

    public long getLootDrops() {
        return lootDrops;
    }

    public void setLootDrops(long lootDrops) {
        this.lootDrops = lootDrops;
    }

    public long getBasicSwag() {
        return basicSwag;
    }

    public void setBasicSwag(long basicSwag) {
        this.basicSwag = basicSwag;
    }

    public long getExpertSwag() {
        return expertSwag;
    }

    public void setExpertSwag(long expertSwag) {
        this.expertSwag = expertSwag;
    }

    public long getAdvancedSwag() {
        return advancedSwag;
    }

    public void setAdvancedSwag(long advancedSwag) {
        this.advancedSwag = advancedSwag;
    }

    public long getMonthlyHumanWinsB() {
        return monthlyHumanWinsB;
    }

    public void setMonthlyHumanWinsB(long monthlyHumanWinsB) {
        this.monthlyHumanWinsB = monthlyHumanWinsB;
    }

    public long getWeeklyHumanWinsA() {
        return weeklyHumanWinsA;
    }

    public void setWeeklyHumanWinsA(long weeklyHumanWinsA) {
        this.weeklyHumanWinsA = weeklyHumanWinsA;
    }

    public List<String> getPackages() {
        return packages;
    }

    public void setPackages(List<String> packages) {
        this.packages = packages;
    }

    public long getKillBooster() {
        return killBooster;
    }

    public void setKillBooster(long killBooster) {
        this.killBooster = killBooster;
    }

    public long getBloodBooster() {
        return bloodBooster;
    }

    public void setBloodBooster(long bloodBooster) {
        this.bloodBooster = bloodBooster;
    }

    public long getVampiricMinion() {
        return vampiricMinion;
    }

    public void setVampiricMinion(long vampiricMinion) {
        this.vampiricMinion = vampiricMinion;
    }

    public long getWaveBooster() {
        return waveBooster;
    }

    public void setWaveBooster(long waveBooster) {
        this.waveBooster = waveBooster;
    }

    public long getDrainPunch() {
        return drainPunch;
    }

    public void setDrainPunch(long drainPunch) {
        this.drainPunch = drainPunch;
    }

    public long getBloodDrinker() {
        return bloodDrinker;
    }

    public void setBloodDrinker(long bloodDrinker) {
        this.bloodDrinker = bloodDrinker;
    }

    public long getFinalBreath() {
        return finalBreath;
    }

    public void setFinalBreath(long finalBreath) {
        this.finalBreath = finalBreath;
    }

    public long getHellborn() {
        return hellborn;
    }

    public void setHellborn(long hellborn) {
        this.hellborn = hellborn;
    }

    public long getVampiricScream() {
        return vampiricScream;
    }

    public void setVampiricScream(long vampiricScream) {
        this.vampiricScream = vampiricScream;
    }

    public long getRenfield() {
        return renfield;
    }

    public void setRenfield(long renfield) {
        this.renfield = renfield;
    }

    public long getTerrorLevel() {
        return terrorLevel;
    }

    public void setTerrorLevel(long terrorLevel) {
        this.terrorLevel = terrorLevel;
    }

    public long getFrankensteinsMonster() {
        return frankensteinsMonster;
    }

    public void setFrankensteinsMonster(long frankensteinsMonster) {
        this.frankensteinsMonster = frankensteinsMonster;
    }

    public long getWeeklyHumanWinsB() {
        return weeklyHumanWinsB;
    }

    public void setWeeklyHumanWinsB(long weeklyHumanWinsB) {
        this.weeklyHumanWinsB = weeklyHumanWinsB;
    }

    public long getHumanKills() {
        return humanKills;
    }

    public void setHumanKills(long humanKills) {
        this.humanKills = humanKills;
    }

    public long getVotesPyramids() {
        return votesPyramids;
    }

    public void setVotesPyramids(long votesPyramids) {
        this.votesPyramids = votesPyramids;
    }

    public long getMonthlyHumanWinsA() {
        return monthlyHumanWinsA;
    }

    public void setMonthlyHumanWinsA(long monthlyHumanWinsA) {
        this.monthlyHumanWinsA = monthlyHumanWinsA;
    }

    public long getGoldBought() {
        return goldBought;
    }

    public void setGoldBought(long goldBought) {
        this.goldBought = goldBought;
    }

    public long getMonthlyVampireWinsB() {
        return monthlyVampireWinsB;
    }

    public void setMonthlyVampireWinsB(long monthlyVampireWinsB) {
        this.monthlyVampireWinsB = monthlyVampireWinsB;
    }

    public long getWeeklyVampireWinsB() {
        return weeklyVampireWinsB;
    }

    public void setWeeklyVampireWinsB(long weeklyVampireWinsB) {
        this.weeklyVampireWinsB = weeklyVampireWinsB;
    }

    public long getWeeklyVampireWinsA() {
        return weeklyVampireWinsA;
    }

    public void setWeeklyVampireWinsA(long weeklyVampireWinsA) {
        this.weeklyVampireWinsA = weeklyVampireWinsA;
    }

    public boolean isUpdatedStats() {
        return updatedStats;
    }

    public void setUpdatedStats(boolean updatedStats) {
        this.updatedStats = updatedStats;
    }

}
