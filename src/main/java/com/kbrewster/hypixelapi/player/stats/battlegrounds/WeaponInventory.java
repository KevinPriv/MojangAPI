package com.kbrewster.hypixelapi.player.stats.battlegrounds;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class WeaponInventory {

    @SerializedName("spec")
    @Expose
    private Spec spec;
    @SerializedName("ability")
    @Expose
    private long ability;
    @SerializedName("abilityBoost")
    @Expose
    private long abilityBoost;
    @SerializedName("damage")
    @Expose
    private long damage;
    @SerializedName("energy")
    @Expose
    private long energy;
    @SerializedName("chance")
    @Expose
    private long chance;
    @SerializedName("multiplier")
    @Expose
    private long multiplier;
    @SerializedName("health")
    @Expose
    private long health;
    @SerializedName("cooldown")
    @Expose
    private long cooldown;
    @SerializedName("movement")
    @Expose
    private long movement;
    @SerializedName("material")
    @Expose
    private String material;
    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("crafted")
    @Expose
    private boolean crafted;
    @SerializedName("upgradeMax")
    @Expose
    private long upgradeMax;
    @SerializedName("upgradeTimes")
    @Expose
    private long upgradeTimes;
    @SerializedName("unlocked")
    @Expose
    private boolean unlocked;
    @SerializedName("playStreak")
    @Expose
    private boolean playStreak;

    public Spec getSpec() {
        return spec;
    }

    public void setSpec(Spec spec) {
        this.spec = spec;
    }

    public long getAbility() {
        return ability;
    }

    public void setAbility(long ability) {
        this.ability = ability;
    }

    public long getAbilityBoost() {
        return abilityBoost;
    }

    public void setAbilityBoost(long abilityBoost) {
        this.abilityBoost = abilityBoost;
    }

    public long getDamage() {
        return damage;
    }

    public void setDamage(long damage) {
        this.damage = damage;
    }

    public long getEnergy() {
        return energy;
    }

    public void setEnergy(long energy) {
        this.energy = energy;
    }

    public long getChance() {
        return chance;
    }

    public void setChance(long chance) {
        this.chance = chance;
    }

    public long getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(long multiplier) {
        this.multiplier = multiplier;
    }

    public long getHealth() {
        return health;
    }

    public void setHealth(long health) {
        this.health = health;
    }

    public long getCooldown() {
        return cooldown;
    }

    public void setCooldown(long cooldown) {
        this.cooldown = cooldown;
    }

    public long getMovement() {
        return movement;
    }

    public void setMovement(long movement) {
        this.movement = movement;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isCrafted() {
        return crafted;
    }

    public void setCrafted(boolean crafted) {
        this.crafted = crafted;
    }

    public long getUpgradeMax() {
        return upgradeMax;
    }

    public void setUpgradeMax(long upgradeMax) {
        this.upgradeMax = upgradeMax;
    }

    public long getUpgradeTimes() {
        return upgradeTimes;
    }

    public void setUpgradeTimes(long upgradeTimes) {
        this.upgradeTimes = upgradeTimes;
    }

    public boolean isUnlocked() {
        return unlocked;
    }

    public void setUnlocked(boolean unlocked) {
        this.unlocked = unlocked;
    }

    public boolean isPlayStreak() {
        return playStreak;
    }

    public void setPlayStreak(boolean playStreak) {
        this.playStreak = playStreak;
    }

}
