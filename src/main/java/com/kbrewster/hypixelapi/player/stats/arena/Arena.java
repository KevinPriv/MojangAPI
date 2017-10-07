package com.kbrewster.hypixelapi.player.stats.arena;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Arena {

    @SerializedName("coins")
    @Expose
    private long coins;
    @SerializedName("damage_2v2")
    @Expose
    private long damage2v2;
    @SerializedName("deaths_2v2")
    @Expose
    private long deaths2v2;
    @SerializedName("games_2v2")
    @Expose
    private long games2v2;
    @SerializedName("healed_2v2")
    @Expose
    private long healed2v2;
    @SerializedName("losses_2v2")
    @Expose
    private long losses2v2;
    @SerializedName("offensive")
    @Expose
    private String offensive;
    @SerializedName("packages")
    @Expose
    private List<String> packages = null;
    @SerializedName("rating")
    @Expose
    private double rating;
    @SerializedName("win_streaks_2v2")
    @Expose
    private long winStreaks2v2;
    @SerializedName("wins_2v2")
    @Expose
    private long wins2v2;
    @SerializedName("win_streaks_1v1")
    @Expose
    private long winStreaks1v1;
    @SerializedName("deaths_1v1")
    @Expose
    private long deaths1v1;
    @SerializedName("damage_1v1")
    @Expose
    private long damage1v1;
    @SerializedName("losses_1v1")
    @Expose
    private long losses1v1;
    @SerializedName("games_1v1")
    @Expose
    private long games1v1;
    @SerializedName("ultimate")
    @Expose
    private String ultimate;
    @SerializedName("support")
    @Expose
    private String support;
    @SerializedName("utility")
    @Expose
    private String utility;
    @SerializedName("active_rune")
    @Expose
    private String activeRune;
    @SerializedName("rune_level_slowing")
    @Expose
    private long runeLevelSlowing;
    @SerializedName("rune_level_damage")
    @Expose
    private long runeLevelDamage;
    @SerializedName("rune_level_energy")
    @Expose
    private long runeLevelEnergy;
    @SerializedName("rune_level_speed")
    @Expose
    private long runeLevelSpeed;
    @SerializedName("lvl_damage")
    @Expose
    private long lvlDamage;
    @SerializedName("lvl_health")
    @Expose
    private long lvlHealth;
    @SerializedName("lvl_energy")
    @Expose
    private long lvlEnergy;
    @SerializedName("lvl_cooldown")
    @Expose
    private long lvlCooldown;
    @SerializedName("keys")
    @Expose
    private long keys;
    @SerializedName("coins_spent")
    @Expose
    private long coinsSpent;
    @SerializedName("magical_chest")
    @Expose
    private long magicalChest;
    @SerializedName("selected_sword")
    @Expose
    private String selectedSword;
    @SerializedName("healed_1v1")
    @Expose
    private long healed1v1;
    @SerializedName("hat")
    @Expose
    private String hat;
    @SerializedName("win_streaks_4v4")
    @Expose
    private long winStreaks4v4;
    @SerializedName("losses_4v4")
    @Expose
    private long losses4v4;
    @SerializedName("healed_4v4")
    @Expose
    private long healed4v4;
    @SerializedName("damage_4v4")
    @Expose
    private long damage4v4;
    @SerializedName("deaths_4v4")
    @Expose
    private long deaths4v4;
    @SerializedName("games_4v4")
    @Expose
    private long games4v4;
    @SerializedName("wins_4v4")
    @Expose
    private long wins4v4;

    public long getCoins() {
        return coins;
    }

    public void setCoins(long coins) {
        this.coins = coins;
    }

    public long getDamage2v2() {
        return damage2v2;
    }

    public void setDamage2v2(long damage2v2) {
        this.damage2v2 = damage2v2;
    }

    public long getDeaths2v2() {
        return deaths2v2;
    }

    public void setDeaths2v2(long deaths2v2) {
        this.deaths2v2 = deaths2v2;
    }

    public long getGames2v2() {
        return games2v2;
    }

    public void setGames2v2(long games2v2) {
        this.games2v2 = games2v2;
    }

    public long getHealed2v2() {
        return healed2v2;
    }

    public void setHealed2v2(long healed2v2) {
        this.healed2v2 = healed2v2;
    }

    public long getLosses2v2() {
        return losses2v2;
    }

    public void setLosses2v2(long losses2v2) {
        this.losses2v2 = losses2v2;
    }

    public String getOffensive() {
        return offensive;
    }

    public void setOffensive(String offensive) {
        this.offensive = offensive;
    }

    public List<String> getPackages() {
        return packages;
    }

    public void setPackages(List<String> packages) {
        this.packages = packages;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public long getWinStreaks2v2() {
        return winStreaks2v2;
    }

    public void setWinStreaks2v2(long winStreaks2v2) {
        this.winStreaks2v2 = winStreaks2v2;
    }

    public long getWins2v2() {
        return wins2v2;
    }

    public void setWins2v2(long wins2v2) {
        this.wins2v2 = wins2v2;
    }

    public long getWinStreaks1v1() {
        return winStreaks1v1;
    }

    public void setWinStreaks1v1(long winStreaks1v1) {
        this.winStreaks1v1 = winStreaks1v1;
    }

    public long getDeaths1v1() {
        return deaths1v1;
    }

    public void setDeaths1v1(long deaths1v1) {
        this.deaths1v1 = deaths1v1;
    }

    public long getDamage1v1() {
        return damage1v1;
    }

    public void setDamage1v1(long damage1v1) {
        this.damage1v1 = damage1v1;
    }

    public long getLosses1v1() {
        return losses1v1;
    }

    public void setLosses1v1(long losses1v1) {
        this.losses1v1 = losses1v1;
    }

    public long getGames1v1() {
        return games1v1;
    }

    public void setGames1v1(long games1v1) {
        this.games1v1 = games1v1;
    }

    public String getUltimate() {
        return ultimate;
    }

    public void setUltimate(String ultimate) {
        this.ultimate = ultimate;
    }

    public String getSupport() {
        return support;
    }

    public void setSupport(String support) {
        this.support = support;
    }

    public String getUtility() {
        return utility;
    }

    public void setUtility(String utility) {
        this.utility = utility;
    }

    public String getActiveRune() {
        return activeRune;
    }

    public void setActiveRune(String activeRune) {
        this.activeRune = activeRune;
    }

    public long getRuneLevelSlowing() {
        return runeLevelSlowing;
    }

    public void setRuneLevelSlowing(long runeLevelSlowing) {
        this.runeLevelSlowing = runeLevelSlowing;
    }

    public long getRuneLevelDamage() {
        return runeLevelDamage;
    }

    public void setRuneLevelDamage(long runeLevelDamage) {
        this.runeLevelDamage = runeLevelDamage;
    }

    public long getRuneLevelEnergy() {
        return runeLevelEnergy;
    }

    public void setRuneLevelEnergy(long runeLevelEnergy) {
        this.runeLevelEnergy = runeLevelEnergy;
    }

    public long getRuneLevelSpeed() {
        return runeLevelSpeed;
    }

    public void setRuneLevelSpeed(long runeLevelSpeed) {
        this.runeLevelSpeed = runeLevelSpeed;
    }

    public long getLvlDamage() {
        return lvlDamage;
    }

    public void setLvlDamage(long lvlDamage) {
        this.lvlDamage = lvlDamage;
    }

    public long getLvlHealth() {
        return lvlHealth;
    }

    public void setLvlHealth(long lvlHealth) {
        this.lvlHealth = lvlHealth;
    }

    public long getLvlEnergy() {
        return lvlEnergy;
    }

    public void setLvlEnergy(long lvlEnergy) {
        this.lvlEnergy = lvlEnergy;
    }

    public long getLvlCooldown() {
        return lvlCooldown;
    }

    public void setLvlCooldown(long lvlCooldown) {
        this.lvlCooldown = lvlCooldown;
    }

    public long getKeys() {
        return keys;
    }

    public void setKeys(long keys) {
        this.keys = keys;
    }

    public long getCoinsSpent() {
        return coinsSpent;
    }

    public void setCoinsSpent(long coinsSpent) {
        this.coinsSpent = coinsSpent;
    }

    public long getMagicalChest() {
        return magicalChest;
    }

    public void setMagicalChest(long magicalChest) {
        this.magicalChest = magicalChest;
    }

    public String getSelectedSword() {
        return selectedSword;
    }

    public void setSelectedSword(String selectedSword) {
        this.selectedSword = selectedSword;
    }

    public long getHealed1v1() {
        return healed1v1;
    }

    public void setHealed1v1(long healed1v1) {
        this.healed1v1 = healed1v1;
    }

    public String getHat() {
        return hat;
    }

    public void setHat(String hat) {
        this.hat = hat;
    }

    public long getWinStreaks4v4() {
        return winStreaks4v4;
    }

    public void setWinStreaks4v4(long winStreaks4v4) {
        this.winStreaks4v4 = winStreaks4v4;
    }

    public long getLosses4v4() {
        return losses4v4;
    }

    public void setLosses4v4(long losses4v4) {
        this.losses4v4 = losses4v4;
    }

    public long getHealed4v4() {
        return healed4v4;
    }

    public void setHealed4v4(long healed4v4) {
        this.healed4v4 = healed4v4;
    }

    public long getDamage4v4() {
        return damage4v4;
    }

    public void setDamage4v4(long damage4v4) {
        this.damage4v4 = damage4v4;
    }

    public long getDeaths4v4() {
        return deaths4v4;
    }

    public void setDeaths4v4(long deaths4v4) {
        this.deaths4v4 = deaths4v4;
    }

    public long getGames4v4() {
        return games4v4;
    }

    public void setGames4v4(long games4v4) {
        this.games4v4 = games4v4;
    }

    public long getWins4v4() {
        return wins4v4;
    }

    public void setWins4v4(long wins4v4) {
        this.wins4v4 = wins4v4;
    }

}
