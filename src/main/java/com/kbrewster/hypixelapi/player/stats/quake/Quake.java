package com.kbrewster.hypixelapi.player.stats.quake;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

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

    public String getBarrel() {
        return barrel;
    }

    public void setBarrel(String barrel) {
        this.barrel = barrel;
    }

    public String getCase() {
        return _case;
    }

    public void setCase(String _case) {
        this._case = _case;
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

    public String getSight() {
        return sight;
    }

    public void setSight(String sight) {
        this.sight = sight;
    }

    public String getTrigger() {
        return trigger;
    }

    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }

    public long getWins() {
        return wins;
    }

    public void setWins(long wins) {
        this.wins = wins;
    }

    public String getMuzzle() {
        return muzzle;
    }

    public void setMuzzle(String muzzle) {
        this.muzzle = muzzle;
    }

    public long getKillsTeams() {
        return killsTeams;
    }

    public void setKillsTeams(long killsTeams) {
        this.killsTeams = killsTeams;
    }

    public long getKillstreaksTeams() {
        return killstreaksTeams;
    }

    public void setKillstreaksTeams(long killstreaksTeams) {
        this.killstreaksTeams = killstreaksTeams;
    }

    public long getDeathsTeams() {
        return deathsTeams;
    }

    public void setDeathsTeams(long deathsTeams) {
        this.deathsTeams = deathsTeams;
    }

    public long getWinsTeams() {
        return winsTeams;
    }

    public void setWinsTeams(long winsTeams) {
        this.winsTeams = winsTeams;
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

    public long getWeeklyKillsB() {
        return weeklyKillsB;
    }

    public void setWeeklyKillsB(long weeklyKillsB) {
        this.weeklyKillsB = weeklyKillsB;
    }

    public long getMonthlyKillsB() {
        return monthlyKillsB;
    }

    public void setMonthlyKillsB(long monthlyKillsB) {
        this.monthlyKillsB = monthlyKillsB;
    }

    public String getHat() {
        return hat;
    }

    public void setHat(String hat) {
        this.hat = hat;
    }

    public String getKillsound() {
        return killsound;
    }

    public void setKillsound(String killsound) {
        this.killsound = killsound;
    }

    public String getArmor() {
        return armor;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

    public String getNull() {
        return _null;
    }

    public void setNull(String _null) {
        this._null = _null;
    }

    public boolean isShowKillPrefix() {
        return showKillPrefix;
    }

    public void setShowKillPrefix(boolean showKillPrefix) {
        this.showKillPrefix = showKillPrefix;
    }

    public String getBoots() {
        return boots;
    }

    public void setBoots(String boots) {
        this.boots = boots;
    }

    public String getLeggings() {
        return leggings;
    }

    public void setLeggings(String leggings) {
        this.leggings = leggings;
    }

    public String getDashPower() {
        return dashPower;
    }

    public void setDashPower(String dashPower) {
        this.dashPower = dashPower;
    }

    public String getDashCooldown() {
        return dashCooldown;
    }

    public void setDashCooldown(String dashCooldown) {
        this.dashCooldown = dashCooldown;
    }

    public boolean isInstantRespawn() {
        return instantRespawn;
    }

    public void setInstantRespawn(boolean instantRespawn) {
        this.instantRespawn = instantRespawn;
    }

    public long getKillsDmTeams() {
        return killsDmTeams;
    }

    public void setKillsDmTeams(long killsDmTeams) {
        this.killsDmTeams = killsDmTeams;
    }

    public long getKillsTimeattack() {
        return killsTimeattack;
    }

    public void setKillsTimeattack(long killsTimeattack) {
        this.killsTimeattack = killsTimeattack;
    }

    public long getKillsDm() {
        return killsDm;
    }

    public void setKillsDm(long killsDm) {
        this.killsDm = killsDm;
    }

    public boolean isCompassSelected() {
        return compassSelected;
    }

    public void setCompassSelected(boolean compassSelected) {
        this.compassSelected = compassSelected;
    }

    public boolean isEnableSound() {
        return enableSound;
    }

    public void setEnableSound(boolean enableSound) {
        this.enableSound = enableSound;
    }

    public long getHighestKillstreak() {
        return highestKillstreak;
    }

    public void setHighestKillstreak(long highestKillstreak) {
        this.highestKillstreak = highestKillstreak;
    }

    public long getDistanceTravelledTeams() {
        return distanceTravelledTeams;
    }

    public void setDistanceTravelledTeams(long distanceTravelledTeams) {
        this.distanceTravelledTeams = distanceTravelledTeams;
    }

    public long getKillsSinceUpdateFeb2017Teams() {
        return killsSinceUpdateFeb2017Teams;
    }

    public void setKillsSinceUpdateFeb2017Teams(long killsSinceUpdateFeb2017Teams) {
        this.killsSinceUpdateFeb2017Teams = killsSinceUpdateFeb2017Teams;
    }

    public long getShotsFiredTeams() {
        return shotsFiredTeams;
    }

    public void setShotsFiredTeams(long shotsFiredTeams) {
        this.shotsFiredTeams = shotsFiredTeams;
    }

    public long getHeadshotsTeams() {
        return headshotsTeams;
    }

    public void setHeadshotsTeams(long headshotsTeams) {
        this.headshotsTeams = headshotsTeams;
    }

    public long getDistanceTravelled() {
        return distanceTravelled;
    }

    public void setDistanceTravelled(long distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }

    public long getHeadshots() {
        return headshots;
    }

    public void setHeadshots(long headshots) {
        this.headshots = headshots;
    }

    public long getShotsFired() {
        return shotsFired;
    }

    public void setShotsFired(long shotsFired) {
        this.shotsFired = shotsFired;
    }

    public long getKillsSinceUpdateFeb2017() {
        return killsSinceUpdateFeb2017;
    }

    public void setKillsSinceUpdateFeb2017(long killsSinceUpdateFeb2017) {
        this.killsSinceUpdateFeb2017 = killsSinceUpdateFeb2017;
    }

    public boolean isAlternativeGunCooldownIndicator() {
        return alternativeGunCooldownIndicator;
    }

    public void setAlternativeGunCooldownIndicator(boolean alternativeGunCooldownIndicator) {
        this.alternativeGunCooldownIndicator = alternativeGunCooldownIndicator;
    }

    public boolean isShowDashCooldown() {
        return showDashCooldown;
    }

    public void setShowDashCooldown(boolean showDashCooldown) {
        this.showDashCooldown = showDashCooldown;
    }

}
