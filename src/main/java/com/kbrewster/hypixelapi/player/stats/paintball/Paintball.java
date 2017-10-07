package com.kbrewster.hypixelapi.player.stats.paintball;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

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

    public long getCoins() {
        return coins;
    }

    public void setCoins(long coins) {
        this.coins = coins;
    }

    public long getDeaths() {
        return deaths;
    }

    public void setDeaths(long deaths) {
        this.deaths = deaths;
    }

    public long getFortune() {
        return fortune;
    }

    public void setFortune(long fortune) {
        this.fortune = fortune;
    }

    public String getHat() {
        return hat;
    }

    public void setHat(String hat) {
        this.hat = hat;
    }

    public long getKills() {
        return kills;
    }

    public void setKills(long kills) {
        this.kills = kills;
    }

    public long getKillstreaks() {
        return killstreaks;
    }

    public void setKillstreaks(long killstreaks) {
        this.killstreaks = killstreaks;
    }

    public List<String> getPackages() {
        return packages;
    }

    public void setPackages(List<String> packages) {
        this.packages = packages;
    }

    public long getShotsFired() {
        return shotsFired;
    }

    public void setShotsFired(long shotsFired) {
        this.shotsFired = shotsFired;
    }

    public long getSuperluck() {
        return superluck;
    }

    public void setSuperluck(long superluck) {
        this.superluck = superluck;
    }

    public long getWins() {
        return wins;
    }

    public void setWins(long wins) {
        this.wins = wins;
    }

    public long getGodfather() {
        return godfather;
    }

    public void setGodfather(long godfather) {
        this.godfather = godfather;
    }

    public long getEndurance() {
        return endurance;
    }

    public void setEndurance(long endurance) {
        this.endurance = endurance;
    }

    public long getAdrenaline() {
        return adrenaline;
    }

    public void setAdrenaline(long adrenaline) {
        this.adrenaline = adrenaline;
    }

    public long getTransfusion() {
        return transfusion;
    }

    public void setTransfusion(long transfusion) {
        this.transfusion = transfusion;
    }

    public long getHeadstart() {
        return headstart;
    }

    public void setHeadstart(long headstart) {
        this.headstart = headstart;
    }

    public long getWeeklyKillsA() {
        return weeklyKillsA;
    }

    public void setWeeklyKillsA(long weeklyKillsA) {
        this.weeklyKillsA = weeklyKillsA;
    }

    public long getMonthlyKillsA() {
        return monthlyKillsA;
    }

    public void setMonthlyKillsA(long monthlyKillsA) {
        this.monthlyKillsA = monthlyKillsA;
    }

    public long getMonthlyKillsB() {
        return monthlyKillsB;
    }

    public void setMonthlyKillsB(long monthlyKillsB) {
        this.monthlyKillsB = monthlyKillsB;
    }

    public long getWeeklyKillsB() {
        return weeklyKillsB;
    }

    public void setWeeklyKillsB(long weeklyKillsB) {
        this.weeklyKillsB = weeklyKillsB;
    }

    public long getVotesOctagon() {
        return votesOctagon;
    }

    public void setVotesOctagon(long votesOctagon) {
        this.votesOctagon = votesOctagon;
    }

    public long getForcefieldTime() {
        return forcefieldTime;
    }

    public void setForcefieldTime(long forcefieldTime) {
        this.forcefieldTime = forcefieldTime;
    }

    public long getVotesMansion() {
        return votesMansion;
    }

    public void setVotesMansion(long votesMansion) {
        this.votesMansion = votesMansion;
    }

}
