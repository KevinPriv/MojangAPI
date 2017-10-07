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

    public long getCoins() {
        return coins;
    }

    public void setCoins(long coins) {
        this.coins = coins;
    }

    public boolean isHints() {
        return hints;
    }

    public void setHints(boolean hints) {
        this.hints = hints;
    }

    public long getSwKills() {
        return swKills;
    }

    public void setSwKills(long swKills) {
        this.swKills = swKills;
    }

    public long getSwShotsFired() {
        return swShotsFired;
    }

    public void setSwShotsFired(long swShotsFired) {
        this.swShotsFired = swShotsFired;
    }

    public long getSwWeeklyKillsB() {
        return swWeeklyKillsB;
    }

    public void setSwWeeklyKillsB(long swWeeklyKillsB) {
        this.swWeeklyKillsB = swWeeklyKillsB;
    }

    public long getSwRebelKills() {
        return swRebelKills;
    }

    public void setSwRebelKills(long swRebelKills) {
        this.swRebelKills = swRebelKills;
    }

    public long getSwDeaths() {
        return swDeaths;
    }

    public void setSwDeaths(long swDeaths) {
        this.swDeaths = swDeaths;
    }

    public long getSwMonthlyKillsA() {
        return swMonthlyKillsA;
    }

    public void setSwMonthlyKillsA(long swMonthlyKillsA) {
        this.swMonthlyKillsA = swMonthlyKillsA;
    }

    public long getStampLevel() {
        return stampLevel;
    }

    public void setStampLevel(long stampLevel) {
        this.stampLevel = stampLevel;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public long getSwWeeklyKillsA() {
        return swWeeklyKillsA;
    }

    public void setSwWeeklyKillsA(long swWeeklyKillsA) {
        this.swWeeklyKillsA = swWeeklyKillsA;
    }

    public long getSwEmpireKills() {
        return swEmpireKills;
    }

    public void setSwEmpireKills(long swEmpireKills) {
        this.swEmpireKills = swEmpireKills;
    }

    public boolean isMusic() {
        return music;
    }

    public void setMusic(boolean music) {
        this.music = music;
    }

    public long getWinsBuildbattle() {
        return winsBuildbattle;
    }

    public void setWinsBuildbattle(long winsBuildbattle) {
        this.winsBuildbattle = winsBuildbattle;
    }

    public long getMaxWave() {
        return maxWave;
    }

    public void setMaxWave(long maxWave) {
        this.maxWave = maxWave;
    }

    public long getSwMonthlyKillsB() {
        return swMonthlyKillsB;
    }

    public void setSwMonthlyKillsB(long swMonthlyKillsB) {
        this.swMonthlyKillsB = swMonthlyKillsB;
    }

    public long getPoopCollected() {
        return poopCollected;
    }

    public void setPoopCollected(long poopCollected) {
        this.poopCollected = poopCollected;
    }

    public long getWinsOneinthequiver() {
        return winsOneinthequiver;
    }

    public void setWinsOneinthequiver(long winsOneinthequiver) {
        this.winsOneinthequiver = winsOneinthequiver;
    }

    public long getDeathsOneinthequiver() {
        return deathsOneinthequiver;
    }

    public void setDeathsOneinthequiver(long deathsOneinthequiver) {
        this.deathsOneinthequiver = deathsOneinthequiver;
    }

    public long getBountyKillsOneinthequiver() {
        return bountyKillsOneinthequiver;
    }

    public void setBountyKillsOneinthequiver(long bountyKillsOneinthequiver) {
        this.bountyKillsOneinthequiver = bountyKillsOneinthequiver;
    }

    public long getKillsOneinthequiver() {
        return killsOneinthequiver;
    }

    public void setKillsOneinthequiver(long killsOneinthequiver) {
        this.killsOneinthequiver = killsOneinthequiver;
    }

    public long getKillsDayone() {
        return killsDayone;
    }

    public void setKillsDayone(long killsDayone) {
        this.killsDayone = killsDayone;
    }

    public long getHeadshotsDayone() {
        return headshotsDayone;
    }

    public void setHeadshotsDayone(long headshotsDayone) {
        this.headshotsDayone = headshotsDayone;
    }

    public long getHitwRecordQ() {
        return hitwRecordQ;
    }

    public void setHitwRecordQ(long hitwRecordQ) {
        this.hitwRecordQ = hitwRecordQ;
    }

    public long getRoundsHoleInTheWall() {
        return roundsHoleInTheWall;
    }

    public void setRoundsHoleInTheWall(long roundsHoleInTheWall) {
        this.roundsHoleInTheWall = roundsHoleInTheWall;
    }

    public long getMonthlyCoinsB() {
        return monthlyCoinsB;
    }

    public void setMonthlyCoinsB(long monthlyCoinsB) {
        this.monthlyCoinsB = monthlyCoinsB;
    }

    public long getWeeklyCoinsB() {
        return weeklyCoinsB;
    }

    public void setWeeklyCoinsB(long weeklyCoinsB) {
        this.weeklyCoinsB = weeklyCoinsB;
    }

    public long getWeeklyCoinsA() {
        return weeklyCoinsA;
    }

    public void setWeeklyCoinsA(long weeklyCoinsA) {
        this.weeklyCoinsA = weeklyCoinsA;
    }

    public long getMonthlyCoinsA() {
        return monthlyCoinsA;
    }

    public void setMonthlyCoinsA(long monthlyCoinsA) {
        this.monthlyCoinsA = monthlyCoinsA;
    }

    public long getRoundsSimonSays() {
        return roundsSimonSays;
    }

    public void setRoundsSimonSays(long roundsSimonSays) {
        this.roundsSimonSays = roundsSimonSays;
    }

    public long getWinsSimonSays() {
        return winsSimonSays;
    }

    public void setWinsSimonSays(long winsSimonSays) {
        this.winsSimonSays = winsSimonSays;
    }

    public List<String> getBuildbattleLoadout() {
        return buildbattleLoadout;
    }

    public void setBuildbattleLoadout(List<String> buildbattleLoadout) {
        this.buildbattleLoadout = buildbattleLoadout;
    }

    public long getKillsThrowOut() {
        return killsThrowOut;
    }

    public void setKillsThrowOut(long killsThrowOut) {
        this.killsThrowOut = killsThrowOut;
    }

    public long getDeathsThrowOut() {
        return deathsThrowOut;
    }

    public void setDeathsThrowOut(long deathsThrowOut) {
        this.deathsThrowOut = deathsThrowOut;
    }

    public long getKillsDragonwars2() {
        return killsDragonwars2;
    }

    public void setKillsDragonwars2(long killsDragonwars2) {
        this.killsDragonwars2 = killsDragonwars2;
    }

    public long getWinsDragonwars2() {
        return winsDragonwars2;
    }

    public void setWinsDragonwars2(long winsDragonwars2) {
        this.winsDragonwars2 = winsDragonwars2;
    }

    public String getMeleeWeapon() {
        return meleeWeapon;
    }

    public void setMeleeWeapon(String meleeWeapon) {
        this.meleeWeapon = meleeWeapon;
    }

    public List<String> getPackages() {
        return packages;
    }

    public void setPackages(List<String> packages) {
        this.packages = packages;
    }

    public String getBountyHead() {
        return bountyHead;
    }

    public void setBountyHead(String bountyHead) {
        this.bountyHead = bountyHead;
    }

    public long getWinsSoccer() {
        return winsSoccer;
    }

    public void setWinsSoccer(long winsSoccer) {
        this.winsSoccer = winsSoccer;
    }

    public long getPowerkicksSoccer() {
        return powerkicksSoccer;
    }

    public void setPowerkicksSoccer(long powerkicksSoccer) {
        this.powerkicksSoccer = powerkicksSoccer;
    }

    public long getGoalsSoccer() {
        return goalsSoccer;
    }

    public void setGoalsSoccer(long goalsSoccer) {
        this.goalsSoccer = goalsSoccer;
    }

    public long getArrowsHitMiniWalls() {
        return arrowsHitMiniWalls;
    }

    public void setArrowsHitMiniWalls(long arrowsHitMiniWalls) {
        this.arrowsHitMiniWalls = arrowsHitMiniWalls;
    }

    public long getFinalKillsMiniWalls() {
        return finalKillsMiniWalls;
    }

    public void setFinalKillsMiniWalls(long finalKillsMiniWalls) {
        this.finalKillsMiniWalls = finalKillsMiniWalls;
    }

    public long getKillsMiniWalls() {
        return killsMiniWalls;
    }

    public void setKillsMiniWalls(long killsMiniWalls) {
        this.killsMiniWalls = killsMiniWalls;
    }

    public long getWinsMiniWalls() {
        return winsMiniWalls;
    }

    public void setWinsMiniWalls(long winsMiniWalls) {
        this.winsMiniWalls = winsMiniWalls;
    }

    public long getDeathsMiniWalls() {
        return deathsMiniWalls;
    }

    public void setDeathsMiniWalls(long deathsMiniWalls) {
        this.deathsMiniWalls = deathsMiniWalls;
    }

    public long getArrowsShotMiniWalls() {
        return arrowsShotMiniWalls;
    }

    public void setArrowsShotMiniWalls(long arrowsShotMiniWalls) {
        this.arrowsShotMiniWalls = arrowsShotMiniWalls;
    }

    public String getMiniwallsActiveKit() {
        return miniwallsActiveKit;
    }

    public void setMiniwallsActiveKit(String miniwallsActiveKit) {
        this.miniwallsActiveKit = miniwallsActiveKit;
    }

    public long getWitherDamageMiniWalls() {
        return witherDamageMiniWalls;
    }

    public void setWitherDamageMiniWalls(long witherDamageMiniWalls) {
        this.witherDamageMiniWalls = witherDamageMiniWalls;
    }

    public long getWitherKillsMiniWalls() {
        return witherKillsMiniWalls;
    }

    public void setWitherKillsMiniWalls(long witherKillsMiniWalls) {
        this.witherKillsMiniWalls = witherKillsMiniWalls;
    }

    public long getWinsFarmHunt() {
        return winsFarmHunt;
    }

    public void setWinsFarmHunt(long winsFarmHunt) {
        this.winsFarmHunt = winsFarmHunt;
    }

    public long getWinsParty3() {
        return winsParty3;
    }

    public void setWinsParty3(long winsParty3) {
        this.winsParty3 = winsParty3;
    }

    public long getWinsParty() {
        return winsParty;
    }

    public void setWinsParty(long winsParty) {
        this.winsParty = winsParty;
    }

    public boolean isDec2016Achievements2() {
        return dec2016Achievements2;
    }

    public void setDec2016Achievements2(boolean dec2016Achievements2) {
        this.dec2016Achievements2 = dec2016Achievements2;
    }

    public boolean isDec2016Achievements() {
        return dec2016Achievements;
    }

    public void setDec2016Achievements(boolean dec2016Achievements) {
        this.dec2016Achievements = dec2016Achievements;
    }

    public long getWinsDayone() {
        return winsDayone;
    }

    public void setWinsDayone(long winsDayone) {
        this.winsDayone = winsDayone;
    }

}
