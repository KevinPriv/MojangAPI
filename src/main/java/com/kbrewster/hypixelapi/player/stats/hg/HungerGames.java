package com.kbrewster.hypixelapi.player.stats.hg;


import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

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

    public long getArcher() {
        return archer;
    }

    public void setArcher(long archer) {
        this.archer = archer;
    }

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

    public long getKills() {
        return kills;
    }

    public void setKills(long kills) {
        this.kills = kills;
    }

    public long getKnight() {
        return knight;
    }

    public void setKnight(long knight) {
        this.knight = knight;
    }

    public long getScout() {
        return scout;
    }

    public void setScout(long scout) {
        this.scout = scout;
    }

    public long getBaker() {
        return baker;
    }

    public void setBaker(long baker) {
        this.baker = baker;
    }

    public long getWinsTeams() {
        return winsTeams;
    }

    public void setWinsTeams(long winsTeams) {
        this.winsTeams = winsTeams;
    }

    public long getWins() {
        return wins;
    }

    public void setWins(long wins) {
        this.wins = wins;
    }

    public List<String> getPackages() {
        return packages;
    }

    public void setPackages(List<String> packages) {
        this.packages = packages;
    }

    public String getChosenTaunt() {
        return chosenTaunt;
    }

    public void setChosenTaunt(String chosenTaunt) {
        this.chosenTaunt = chosenTaunt;
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

    public long getMonthlyKillsA() {
        return monthlyKillsA;
    }

    public void setMonthlyKillsA(long monthlyKillsA) {
        this.monthlyKillsA = monthlyKillsA;
    }

    public long getWeeklyKillsA() {
        return weeklyKillsA;
    }

    public void setWeeklyKillsA(long weeklyKillsA) {
        this.weeklyKillsA = weeklyKillsA;
    }

    public long getVotesPixelville() {
        return votesPixelville;
    }

    public void setVotesPixelville(long votesPixelville) {
        this.votesPixelville = votesPixelville;
    }

    public String getChosenVictorydance() {
        return chosenVictorydance;
    }

    public void setChosenVictorydance(String chosenVictorydance) {
        this.chosenVictorydance = chosenVictorydance;
    }

    public long getArmorer() {
        return armorer;
    }

    public void setArmorer(long armorer) {
        this.armorer = armorer;
    }

    public long getFisherman() {
        return fisherman;
    }

    public void setFisherman(long fisherman) {
        this.fisherman = fisherman;
    }

    public long getHypeTrain() {
        return hypeTrain;
    }

    public void setHypeTrain(long hypeTrain) {
        this.hypeTrain = hypeTrain;
    }

    public long getHunter() {
        return hunter;
    }

    public void setHunter(long hunter) {
        this.hunter = hunter;
    }

    public long getWolftamer() {
        return wolftamer;
    }

    public void setWolftamer(long wolftamer) {
        this.wolftamer = wolftamer;
    }

    public long getAstronaut() {
        return astronaut;
    }

    public void setAstronaut(long astronaut) {
        this.astronaut = astronaut;
    }

    public boolean isAutoarmor() {
        return autoarmor;
    }

    public void setAutoarmor(boolean autoarmor) {
        this.autoarmor = autoarmor;
    }


    public String getDefaultkit() {
        return defaultkit;
    }

    public void setDefaultkit(String defaultkit) {
        this.defaultkit = defaultkit;
    }

    public String getChosenFinisher() {
        return chosenFinisher;
    }

    public void setChosenFinisher(String chosenFinisher) {
        this.chosenFinisher = chosenFinisher;
    }

    public boolean isCombatTracker() {
        return combatTracker;
    }

    public void setCombatTracker(boolean combatTracker) {
        this.combatTracker = combatTracker;
    }

}
