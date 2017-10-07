package com.kbrewster.hypixelapi.player.stats.battlegrounds;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BattleGrounds {

    @SerializedName("afk_warned")
    @Expose
    private long afkWarned;
    @SerializedName("assists")
    @Expose
    private long assists;
    @SerializedName("berserker_plays")
    @Expose
    private long berserkerPlays;
    @SerializedName("broken_inventory")
    @Expose
    private long brokenInventory;
    @SerializedName("chosen_class")
    @Expose
    private String chosenClass;
    @SerializedName("coins")
    @Expose
    private long coins;
    @SerializedName("crusader_plays")
    @Expose
    private long crusaderPlays;
    @SerializedName("current_weapon")
    @Expose
    private long currentWeapon;
    @SerializedName("damage")
    @Expose
    private long damage;
    @SerializedName("damage_berserker")
    @Expose
    private long damageBerserker;
    @SerializedName("damage_crusader")
    @Expose
    private long damageCrusader;
    @SerializedName("damage_mage")
    @Expose
    private long damageMage;
    @SerializedName("damage_paladin")
    @Expose
    private long damagePaladin;
    @SerializedName("damage_prevented")
    @Expose
    private long damagePrevented;
    @SerializedName("damage_prevented_berserker")
    @Expose
    private long damagePreventedBerserker;
    @SerializedName("damage_prevented_crusader")
    @Expose
    private long damagePreventedCrusader;
    @SerializedName("damage_prevented_mage")
    @Expose
    private long damagePreventedMage;
    @SerializedName("damage_prevented_paladin")
    @Expose
    private long damagePreventedPaladin;
    @SerializedName("damage_prevented_protector")
    @Expose
    private long damagePreventedProtector;
    @SerializedName("damage_prevented_pyromancer")
    @Expose
    private long damagePreventedPyromancer;
    @SerializedName("damage_prevented_warrior")
    @Expose
    private long damagePreventedWarrior;
    @SerializedName("damage_protector")
    @Expose
    private long damageProtector;
    @SerializedName("damage_pyromancer")
    @Expose
    private long damagePyromancer;
    @SerializedName("damage_taken")
    @Expose
    private long damageTaken;
    @SerializedName("damage_warrior")
    @Expose
    private long damageWarrior;
    @SerializedName("deaths")
    @Expose
    private long deaths;
    @SerializedName("flag_conquer_self")
    @Expose
    private long flagConquerSelf;
    @SerializedName("flag_conquer_team")
    @Expose
    private long flagConquerTeam;
    @SerializedName("heal")
    @Expose
    private long heal;
    @SerializedName("heal_berserker")
    @Expose
    private long healBerserker;
    @SerializedName("heal_crusader")
    @Expose
    private long healCrusader;
    @SerializedName("heal_mage")
    @Expose
    private long healMage;
    @SerializedName("heal_paladin")
    @Expose
    private long healPaladin;
    @SerializedName("heal_protector")
    @Expose
    private long healProtector;
    @SerializedName("heal_pyromancer")
    @Expose
    private long healPyromancer;
    @SerializedName("heal_warrior")
    @Expose
    private long healWarrior;
    @SerializedName("kills")
    @Expose
    private long kills;
    @SerializedName("life_leeched")
    @Expose
    private long lifeLeeched;
    @SerializedName("life_leeched_berserker")
    @Expose
    private long lifeLeechedBerserker;
    @SerializedName("life_leeched_warrior")
    @Expose
    private long lifeLeechedWarrior;
    @SerializedName("losses")
    @Expose
    private long losses;
    @SerializedName("losses_berserker")
    @Expose
    private long lossesBerserker;
    @SerializedName("losses_mage")
    @Expose
    private long lossesMage;
    @SerializedName("losses_pyromancer")
    @Expose
    private long lossesPyromancer;
    @SerializedName("losses_warrior")
    @Expose
    private long lossesWarrior;
    @SerializedName("mage_plays")
    @Expose
    private long magePlays;
    @SerializedName("mage_skill1")
    @Expose
    private long mageSkill1;
    @SerializedName("mage_skill2")
    @Expose
    private long mageSkill2;
    @SerializedName("mage_skill3")
    @Expose
    private long mageSkill3;
    @SerializedName("mage_spec")
    @Expose
    private String mageSpec;
    @SerializedName("magic_dust")
    @Expose
    private long magicDust;
    @SerializedName("packages")
    @Expose
    private List<String> packages = null;
    @SerializedName("paladin_cooldown")
    @Expose
    private long paladinCooldown;
    @SerializedName("paladin_critchance")
    @Expose
    private long paladinCritchance;
    @SerializedName("paladin_critmultiplier")
    @Expose
    private long paladinCritmultiplier;
    @SerializedName("paladin_energy")
    @Expose
    private long paladinEnergy;
    @SerializedName("paladin_health")
    @Expose
    private long paladinHealth;
    @SerializedName("paladin_plays")
    @Expose
    private long paladinPlays;
    @SerializedName("paladin_skill1")
    @Expose
    private long paladinSkill1;
    @SerializedName("paladin_skill2")
    @Expose
    private long paladinSkill2;
    @SerializedName("paladin_skill3")
    @Expose
    private long paladinSkill3;
    @SerializedName("paladin_skill4")
    @Expose
    private long paladinSkill4;
    @SerializedName("paladin_skill5")
    @Expose
    private long paladinSkill5;
    @SerializedName("paladin_spec")
    @Expose
    private String paladinSpec;
    @SerializedName("penalty")
    @Expose
    private long penalty;
    @SerializedName("protector_plays")
    @Expose
    private long protectorPlays;
    @SerializedName("pyromancer_plays")
    @Expose
    private long pyromancerPlays;
    @SerializedName("repaired")
    @Expose
    private long repaired;
    @SerializedName("repaired_common")
    @Expose
    private long repairedCommon;
    @SerializedName("repaired_epic")
    @Expose
    private long repairedEpic;
    @SerializedName("repaired_rare")
    @Expose
    private long repairedRare;
    @SerializedName("salvaged_dust_reward")
    @Expose
    private long salvagedDustReward;
    @SerializedName("salvaged_shards_reward")
    @Expose
    private long salvagedShardsReward;
    @SerializedName("salvaged_weapons")
    @Expose
    private long salvagedWeapons;
    @SerializedName("salvaged_weapons_common")
    @Expose
    private long salvagedWeaponsCommon;
    @SerializedName("salvaged_weapons_rare")
    @Expose
    private long salvagedWeaponsRare;
    @SerializedName("selected_mount")
    @Expose
    private String selectedMount;
    @SerializedName("upgrade_random")
    @Expose
    private long upgradeRandom;
    @SerializedName("upgrade_random_epic")
    @Expose
    private long upgradeRandomEpic;
    @SerializedName("void_shards")
    @Expose
    private long voidShards;
    @SerializedName("warrior_cooldown")
    @Expose
    private long warriorCooldown;
    @SerializedName("warrior_critchance")
    @Expose
    private long warriorCritchance;
    @SerializedName("warrior_critmultiplier")
    @Expose
    private long warriorCritmultiplier;
    @SerializedName("warrior_energy")
    @Expose
    private long warriorEnergy;
    @SerializedName("warrior_health")
    @Expose
    private long warriorHealth;
    @SerializedName("warrior_plays")
    @Expose
    private long warriorPlays;
    @SerializedName("warrior_skill1")
    @Expose
    private long warriorSkill1;
    @SerializedName("warrior_skill2")
    @Expose
    private long warriorSkill2;
    @SerializedName("warrior_spec")
    @Expose
    private String warriorSpec;
    @SerializedName("weapon_inventory")
    @Expose
    private List<WeaponInventory> weaponInventory = null;
    @SerializedName("win_streak")
    @Expose
    private long winStreak;
    @SerializedName("wins")
    @Expose
    private long wins;
    @SerializedName("wins_berserker")
    @Expose
    private long winsBerserker;
    @SerializedName("wins_blu")
    @Expose
    private long winsBlu;
    @SerializedName("wins_capturetheflag")
    @Expose
    private long winsCapturetheflag;
    @SerializedName("wins_capturetheflag_blu")
    @Expose
    private long winsCapturetheflagBlu;
    @SerializedName("wins_capturetheflag_red")
    @Expose
    private long winsCapturetheflagRed;
    @SerializedName("wins_crusader")
    @Expose
    private long winsCrusader;
    @SerializedName("wins_domination")
    @Expose
    private long winsDomination;
    @SerializedName("wins_domination_blu")
    @Expose
    private long winsDominationBlu;
    @SerializedName("wins_domination_red")
    @Expose
    private long winsDominationRed;
    @SerializedName("wins_mage")
    @Expose
    private long winsMage;
    @SerializedName("wins_paladin")
    @Expose
    private long winsPaladin;
    @SerializedName("wins_pyromancer")
    @Expose
    private long winsPyromancer;
    @SerializedName("wins_red")
    @Expose
    private long winsRed;
    @SerializedName("wins_warrior")
    @Expose
    private long winsWarrior;
    @SerializedName("warrior_skill3")
    @Expose
    private long warriorSkill3;
    @SerializedName("warrior_skill4")
    @Expose
    private long warriorSkill4;
    @SerializedName("warrior_skill5")
    @Expose
    private long warriorSkill5;
    @SerializedName("losses_paladin")
    @Expose
    private long lossesPaladin;
    @SerializedName("losses_crusader")
    @Expose
    private long lossesCrusader;
    @SerializedName("wins_protector")
    @Expose
    private long winsProtector;
    @SerializedName("display_damage")
    @Expose
    private boolean displayDamage;
    @SerializedName("hints")
    @Expose
    private boolean hints;
    @SerializedName("reroll")
    @Expose
    private long reroll;
    @SerializedName("reroll_epic")
    @Expose
    private long rerollEpic;
    @SerializedName("mage_skill4")
    @Expose
    private long mageSkill4;
    @SerializedName("mage_skill5")
    @Expose
    private long mageSkill5;
    @SerializedName("shaman_spec")
    @Expose
    private String shamanSpec;
    @SerializedName("hotkeymode")
    @Expose
    private boolean hotkeymode;
    @SerializedName("play_streak")
    @Expose
    private long playStreak;
    @SerializedName("damage_avenger")
    @Expose
    private long damageAvenger;
    @SerializedName("avenger_plays")
    @Expose
    private long avengerPlays;
    @SerializedName("heal_avenger")
    @Expose
    private long healAvenger;
    @SerializedName("damage_prevented_avenger")
    @Expose
    private long damagePreventedAvenger;
    @SerializedName("shaman_skill1")
    @Expose
    private long shamanSkill1;
    @SerializedName("shaman_skill2")
    @Expose
    private long shamanSkill2;
    @SerializedName("shaman_skill3")
    @Expose
    private long shamanSkill3;
    @SerializedName("shaman_skill4")
    @Expose
    private long shamanSkill4;
    @SerializedName("shaman_skill5")
    @Expose
    private long shamanSkill5;
    @SerializedName("shaman_health")
    @Expose
    private long shamanHealth;
    @SerializedName("damage_prevented_thunderlord")
    @Expose
    private long damagePreventedThunderlord;
    @SerializedName("heal_shaman")
    @Expose
    private long healShaman;
    @SerializedName("wins_shaman")
    @Expose
    private long winsShaman;
    @SerializedName("heal_thunderlord")
    @Expose
    private long healThunderlord;
    @SerializedName("wins_thunderlord")
    @Expose
    private long winsThunderlord;
    @SerializedName("thunderlord_plays")
    @Expose
    private long thunderlordPlays;
    @SerializedName("damage_shaman")
    @Expose
    private long damageShaman;
    @SerializedName("damage_thunderlord")
    @Expose
    private long damageThunderlord;
    @SerializedName("damage_prevented_shaman")
    @Expose
    private long damagePreventedShaman;
    @SerializedName("shaman_plays")
    @Expose
    private long shamanPlays;
    @SerializedName("shaman_critmultiplier")
    @Expose
    private long shamanCritmultiplier;
    @SerializedName("shaman_critchance")
    @Expose
    private long shamanCritchance;
    @SerializedName("shaman_cooldown")
    @Expose
    private long shamanCooldown;
    @SerializedName("shaman_energy")
    @Expose
    private long shamanEnergy;
    @SerializedName("losses_thunderlord")
    @Expose
    private long lossesThunderlord;
    @SerializedName("losses_shaman")
    @Expose
    private long lossesShaman;
    @SerializedName("wins_capturetheflag_a")
    @Expose
    private long winsCapturetheflagA;
    @SerializedName("wins_teamdeathmatch_b")
    @Expose
    private long winsTeamdeathmatchB;
    @SerializedName("wins_teamdeathmatch")
    @Expose
    private long winsTeamdeathmatch;
    @SerializedName("wins_teamdeathmatch_red")
    @Expose
    private long winsTeamdeathmatchRed;
    @SerializedName("wins_domination_b")
    @Expose
    private long winsDominationB;
    @SerializedName("wins_teamdeathmatch_a")
    @Expose
    private long winsTeamdeathmatchA;
    @SerializedName("wins_domination_a")
    @Expose
    private long winsDominationA;
    @SerializedName("wins_capturetheflag_b")
    @Expose
    private long winsCapturetheflagB;
    @SerializedName("wins_teamdeathmatch_blu")
    @Expose
    private long winsTeamdeathmatchBlu;
    @SerializedName("mage_health")
    @Expose
    private long mageHealth;
    @SerializedName("mage_energy")
    @Expose
    private long mageEnergy;
    @SerializedName("mage_critchance")
    @Expose
    private long mageCritchance;
    @SerializedName("mage_critmultiplier")
    @Expose
    private long mageCritmultiplier;
    @SerializedName("mage_cooldown")
    @Expose
    private long mageCooldown;
    @SerializedName("repaired_legendary")
    @Expose
    private long repairedLegendary;
    @SerializedName("salvaged_weapons_epic")
    @Expose
    private long salvagedWeaponsEpic;
    @SerializedName("reroll_legendary")
    @Expose
    private long rerollLegendary;
    @SerializedName("wins_avenger")
    @Expose
    private long winsAvenger;
    @SerializedName("losses_avenger")
    @Expose
    private long lossesAvenger;
    @SerializedName("reward_inventory")
    @Expose
    private long rewardInventory;
    @SerializedName("losses_protector")
    @Expose
    private long lossesProtector;
    @SerializedName("crafted_epic")
    @Expose
    private long craftedEpic;
    @SerializedName("crafted")
    @Expose
    private long crafted;
    @SerializedName("unlock_playstreak")
    @Expose
    private long unlockPlaystreak;
    @SerializedName("unlock_playstreak_legendary")
    @Expose
    private long unlockPlaystreakLegendary;
    @SerializedName("warrior_helmet_selection")
    @Expose
    private long warriorHelmetSelection;
    @SerializedName("warrior_armor_selection")
    @Expose
    private long warriorArmorSelection;
    @SerializedName("salvaged_weapons_legendary")
    @Expose
    private long salvagedWeaponsLegendary;
    @SerializedName("damage_defender")
    @Expose
    private long damageDefender;
    @SerializedName("heal_defender")
    @Expose
    private long healDefender;
    @SerializedName("losses_defender")
    @Expose
    private long lossesDefender;
    @SerializedName("defender_plays")
    @Expose
    private long defenderPlays;
    @SerializedName("damage_prevented_defender")
    @Expose
    private long damagePreventedDefender;
    @SerializedName("earthwarden_plays")
    @Expose
    private long earthwardenPlays;
    @SerializedName("heal_earthwarden")
    @Expose
    private long healEarthwarden;
    @SerializedName("damage_prevented_earthwarden")
    @Expose
    private long damagePreventedEarthwarden;
    @SerializedName("wins_earthwarden")
    @Expose
    private long winsEarthwarden;
    @SerializedName("damage_earthwarden")
    @Expose
    private long damageEarthwarden;
    @SerializedName("heal_cryomancer")
    @Expose
    private long healCryomancer;
    @SerializedName("damage_cryomancer")
    @Expose
    private long damageCryomancer;
    @SerializedName("damage_prevented_cryomancer")
    @Expose
    private long damagePreventedCryomancer;
    @SerializedName("cryomancer_plays")
    @Expose
    private long cryomancerPlays;
    @SerializedName("upgrade_crafted")
    @Expose
    private long upgradeCrafted;
    @SerializedName("upgrade_crafted_legendary")
    @Expose
    private long upgradeCraftedLegendary;
    @SerializedName("damage_aquamancer")
    @Expose
    private long damageAquamancer;
    @SerializedName("heal_aquamancer")
    @Expose
    private long healAquamancer;
    @SerializedName("aquamancer_plays")
    @Expose
    private long aquamancerPlays;
    @SerializedName("damage_prevented_aquamancer")
    @Expose
    private long damagePreventedAquamancer;
    @SerializedName("wins_aquamancer")
    @Expose
    private long winsAquamancer;

    public long getAfkWarned() {
        return afkWarned;
    }

    public void setAfkWarned(long afkWarned) {
        this.afkWarned = afkWarned;
    }

    public long getAssists() {
        return assists;
    }

    public void setAssists(long assists) {
        this.assists = assists;
    }

    public long getBerserkerPlays() {
        return berserkerPlays;
    }

    public void setBerserkerPlays(long berserkerPlays) {
        this.berserkerPlays = berserkerPlays;
    }

    public long getBrokenInventory() {
        return brokenInventory;
    }

    public void setBrokenInventory(long brokenInventory) {
        this.brokenInventory = brokenInventory;
    }

    public String getChosenClass() {
        return chosenClass;
    }

    public void setChosenClass(String chosenClass) {
        this.chosenClass = chosenClass;
    }

    public long getCoins() {
        return coins;
    }

    public void setCoins(long coins) {
        this.coins = coins;
    }

    public long getCrusaderPlays() {
        return crusaderPlays;
    }

    public void setCrusaderPlays(long crusaderPlays) {
        this.crusaderPlays = crusaderPlays;
    }

    public long getCurrentWeapon() {
        return currentWeapon;
    }

    public void setCurrentWeapon(long currentWeapon) {
        this.currentWeapon = currentWeapon;
    }

    public long getDamage() {
        return damage;
    }

    public void setDamage(long damage) {
        this.damage = damage;
    }

    public long getDamageBerserker() {
        return damageBerserker;
    }

    public void setDamageBerserker(long damageBerserker) {
        this.damageBerserker = damageBerserker;
    }

    public long getDamageCrusader() {
        return damageCrusader;
    }

    public void setDamageCrusader(long damageCrusader) {
        this.damageCrusader = damageCrusader;
    }

    public long getDamageMage() {
        return damageMage;
    }

    public void setDamageMage(long damageMage) {
        this.damageMage = damageMage;
    }

    public long getDamagePaladin() {
        return damagePaladin;
    }

    public void setDamagePaladin(long damagePaladin) {
        this.damagePaladin = damagePaladin;
    }

    public long getDamagePrevented() {
        return damagePrevented;
    }

    public void setDamagePrevented(long damagePrevented) {
        this.damagePrevented = damagePrevented;
    }

    public long getDamagePreventedBerserker() {
        return damagePreventedBerserker;
    }

    public void setDamagePreventedBerserker(long damagePreventedBerserker) {
        this.damagePreventedBerserker = damagePreventedBerserker;
    }

    public long getDamagePreventedCrusader() {
        return damagePreventedCrusader;
    }

    public void setDamagePreventedCrusader(long damagePreventedCrusader) {
        this.damagePreventedCrusader = damagePreventedCrusader;
    }

    public long getDamagePreventedMage() {
        return damagePreventedMage;
    }

    public void setDamagePreventedMage(long damagePreventedMage) {
        this.damagePreventedMage = damagePreventedMage;
    }

    public long getDamagePreventedPaladin() {
        return damagePreventedPaladin;
    }

    public void setDamagePreventedPaladin(long damagePreventedPaladin) {
        this.damagePreventedPaladin = damagePreventedPaladin;
    }

    public long getDamagePreventedProtector() {
        return damagePreventedProtector;
    }

    public void setDamagePreventedProtector(long damagePreventedProtector) {
        this.damagePreventedProtector = damagePreventedProtector;
    }

    public long getDamagePreventedPyromancer() {
        return damagePreventedPyromancer;
    }

    public void setDamagePreventedPyromancer(long damagePreventedPyromancer) {
        this.damagePreventedPyromancer = damagePreventedPyromancer;
    }

    public long getDamagePreventedWarrior() {
        return damagePreventedWarrior;
    }

    public void setDamagePreventedWarrior(long damagePreventedWarrior) {
        this.damagePreventedWarrior = damagePreventedWarrior;
    }

    public long getDamageProtector() {
        return damageProtector;
    }

    public void setDamageProtector(long damageProtector) {
        this.damageProtector = damageProtector;
    }

    public long getDamagePyromancer() {
        return damagePyromancer;
    }

    public void setDamagePyromancer(long damagePyromancer) {
        this.damagePyromancer = damagePyromancer;
    }

    public long getDamageTaken() {
        return damageTaken;
    }

    public void setDamageTaken(long damageTaken) {
        this.damageTaken = damageTaken;
    }

    public long getDamageWarrior() {
        return damageWarrior;
    }

    public void setDamageWarrior(long damageWarrior) {
        this.damageWarrior = damageWarrior;
    }

    public long getDeaths() {
        return deaths;
    }

    public void setDeaths(long deaths) {
        this.deaths = deaths;
    }

    public long getFlagConquerSelf() {
        return flagConquerSelf;
    }

    public void setFlagConquerSelf(long flagConquerSelf) {
        this.flagConquerSelf = flagConquerSelf;
    }

    public long getFlagConquerTeam() {
        return flagConquerTeam;
    }

    public void setFlagConquerTeam(long flagConquerTeam) {
        this.flagConquerTeam = flagConquerTeam;
    }

    public long getHeal() {
        return heal;
    }

    public void setHeal(long heal) {
        this.heal = heal;
    }

    public long getHealBerserker() {
        return healBerserker;
    }

    public void setHealBerserker(long healBerserker) {
        this.healBerserker = healBerserker;
    }

    public long getHealCrusader() {
        return healCrusader;
    }

    public void setHealCrusader(long healCrusader) {
        this.healCrusader = healCrusader;
    }

    public long getHealMage() {
        return healMage;
    }

    public void setHealMage(long healMage) {
        this.healMage = healMage;
    }

    public long getHealPaladin() {
        return healPaladin;
    }

    public void setHealPaladin(long healPaladin) {
        this.healPaladin = healPaladin;
    }

    public long getHealProtector() {
        return healProtector;
    }

    public void setHealProtector(long healProtector) {
        this.healProtector = healProtector;
    }

    public long getHealPyromancer() {
        return healPyromancer;
    }

    public void setHealPyromancer(long healPyromancer) {
        this.healPyromancer = healPyromancer;
    }

    public long getHealWarrior() {
        return healWarrior;
    }

    public void setHealWarrior(long healWarrior) {
        this.healWarrior = healWarrior;
    }

    public long getKills() {
        return kills;
    }

    public void setKills(long kills) {
        this.kills = kills;
    }

    public long getLifeLeeched() {
        return lifeLeeched;
    }

    public void setLifeLeeched(long lifeLeeched) {
        this.lifeLeeched = lifeLeeched;
    }

    public long getLifeLeechedBerserker() {
        return lifeLeechedBerserker;
    }

    public void setLifeLeechedBerserker(long lifeLeechedBerserker) {
        this.lifeLeechedBerserker = lifeLeechedBerserker;
    }

    public long getLifeLeechedWarrior() {
        return lifeLeechedWarrior;
    }

    public void setLifeLeechedWarrior(long lifeLeechedWarrior) {
        this.lifeLeechedWarrior = lifeLeechedWarrior;
    }

    public long getLosses() {
        return losses;
    }

    public void setLosses(long losses) {
        this.losses = losses;
    }

    public long getLossesBerserker() {
        return lossesBerserker;
    }

    public void setLossesBerserker(long lossesBerserker) {
        this.lossesBerserker = lossesBerserker;
    }

    public long getLossesMage() {
        return lossesMage;
    }

    public void setLossesMage(long lossesMage) {
        this.lossesMage = lossesMage;
    }

    public long getLossesPyromancer() {
        return lossesPyromancer;
    }

    public void setLossesPyromancer(long lossesPyromancer) {
        this.lossesPyromancer = lossesPyromancer;
    }

    public long getLossesWarrior() {
        return lossesWarrior;
    }

    public void setLossesWarrior(long lossesWarrior) {
        this.lossesWarrior = lossesWarrior;
    }

    public long getMagePlays() {
        return magePlays;
    }

    public void setMagePlays(long magePlays) {
        this.magePlays = magePlays;
    }

    public long getMageSkill1() {
        return mageSkill1;
    }

    public void setMageSkill1(long mageSkill1) {
        this.mageSkill1 = mageSkill1;
    }

    public long getMageSkill2() {
        return mageSkill2;
    }

    public void setMageSkill2(long mageSkill2) {
        this.mageSkill2 = mageSkill2;
    }

    public long getMageSkill3() {
        return mageSkill3;
    }

    public void setMageSkill3(long mageSkill3) {
        this.mageSkill3 = mageSkill3;
    }

    public String getMageSpec() {
        return mageSpec;
    }

    public void setMageSpec(String mageSpec) {
        this.mageSpec = mageSpec;
    }

    public long getMagicDust() {
        return magicDust;
    }

    public void setMagicDust(long magicDust) {
        this.magicDust = magicDust;
    }

    public List<String> getPackages() {
        return packages;
    }

    public void setPackages(List<String> packages) {
        this.packages = packages;
    }

    public long getPaladinCooldown() {
        return paladinCooldown;
    }

    public void setPaladinCooldown(long paladinCooldown) {
        this.paladinCooldown = paladinCooldown;
    }

    public long getPaladinCritchance() {
        return paladinCritchance;
    }

    public void setPaladinCritchance(long paladinCritchance) {
        this.paladinCritchance = paladinCritchance;
    }

    public long getPaladinCritmultiplier() {
        return paladinCritmultiplier;
    }

    public void setPaladinCritmultiplier(long paladinCritmultiplier) {
        this.paladinCritmultiplier = paladinCritmultiplier;
    }

    public long getPaladinEnergy() {
        return paladinEnergy;
    }

    public void setPaladinEnergy(long paladinEnergy) {
        this.paladinEnergy = paladinEnergy;
    }

    public long getPaladinHealth() {
        return paladinHealth;
    }

    public void setPaladinHealth(long paladinHealth) {
        this.paladinHealth = paladinHealth;
    }

    public long getPaladinPlays() {
        return paladinPlays;
    }

    public void setPaladinPlays(long paladinPlays) {
        this.paladinPlays = paladinPlays;
    }

    public long getPaladinSkill1() {
        return paladinSkill1;
    }

    public void setPaladinSkill1(long paladinSkill1) {
        this.paladinSkill1 = paladinSkill1;
    }

    public long getPaladinSkill2() {
        return paladinSkill2;
    }

    public void setPaladinSkill2(long paladinSkill2) {
        this.paladinSkill2 = paladinSkill2;
    }

    public long getPaladinSkill3() {
        return paladinSkill3;
    }

    public void setPaladinSkill3(long paladinSkill3) {
        this.paladinSkill3 = paladinSkill3;
    }

    public long getPaladinSkill4() {
        return paladinSkill4;
    }

    public void setPaladinSkill4(long paladinSkill4) {
        this.paladinSkill4 = paladinSkill4;
    }

    public long getPaladinSkill5() {
        return paladinSkill5;
    }

    public void setPaladinSkill5(long paladinSkill5) {
        this.paladinSkill5 = paladinSkill5;
    }

    public String getPaladinSpec() {
        return paladinSpec;
    }

    public void setPaladinSpec(String paladinSpec) {
        this.paladinSpec = paladinSpec;
    }

    public long getPenalty() {
        return penalty;
    }

    public void setPenalty(long penalty) {
        this.penalty = penalty;
    }

    public long getProtectorPlays() {
        return protectorPlays;
    }

    public void setProtectorPlays(long protectorPlays) {
        this.protectorPlays = protectorPlays;
    }

    public long getPyromancerPlays() {
        return pyromancerPlays;
    }

    public void setPyromancerPlays(long pyromancerPlays) {
        this.pyromancerPlays = pyromancerPlays;
    }

    public long getRepaired() {
        return repaired;
    }

    public void setRepaired(long repaired) {
        this.repaired = repaired;
    }

    public long getRepairedCommon() {
        return repairedCommon;
    }

    public void setRepairedCommon(long repairedCommon) {
        this.repairedCommon = repairedCommon;
    }

    public long getRepairedEpic() {
        return repairedEpic;
    }

    public void setRepairedEpic(long repairedEpic) {
        this.repairedEpic = repairedEpic;
    }

    public long getRepairedRare() {
        return repairedRare;
    }

    public void setRepairedRare(long repairedRare) {
        this.repairedRare = repairedRare;
    }

    public long getSalvagedDustReward() {
        return salvagedDustReward;
    }

    public void setSalvagedDustReward(long salvagedDustReward) {
        this.salvagedDustReward = salvagedDustReward;
    }

    public long getSalvagedShardsReward() {
        return salvagedShardsReward;
    }

    public void setSalvagedShardsReward(long salvagedShardsReward) {
        this.salvagedShardsReward = salvagedShardsReward;
    }

    public long getSalvagedWeapons() {
        return salvagedWeapons;
    }

    public void setSalvagedWeapons(long salvagedWeapons) {
        this.salvagedWeapons = salvagedWeapons;
    }

    public long getSalvagedWeaponsCommon() {
        return salvagedWeaponsCommon;
    }

    public void setSalvagedWeaponsCommon(long salvagedWeaponsCommon) {
        this.salvagedWeaponsCommon = salvagedWeaponsCommon;
    }

    public long getSalvagedWeaponsRare() {
        return salvagedWeaponsRare;
    }

    public void setSalvagedWeaponsRare(long salvagedWeaponsRare) {
        this.salvagedWeaponsRare = salvagedWeaponsRare;
    }

    public String getSelectedMount() {
        return selectedMount;
    }

    public void setSelectedMount(String selectedMount) {
        this.selectedMount = selectedMount;
    }

    public long getUpgradeRandom() {
        return upgradeRandom;
    }

    public void setUpgradeRandom(long upgradeRandom) {
        this.upgradeRandom = upgradeRandom;
    }

    public long getUpgradeRandomEpic() {
        return upgradeRandomEpic;
    }

    public void setUpgradeRandomEpic(long upgradeRandomEpic) {
        this.upgradeRandomEpic = upgradeRandomEpic;
    }

    public long getVoidShards() {
        return voidShards;
    }

    public void setVoidShards(long voidShards) {
        this.voidShards = voidShards;
    }

    public long getWarriorCooldown() {
        return warriorCooldown;
    }

    public void setWarriorCooldown(long warriorCooldown) {
        this.warriorCooldown = warriorCooldown;
    }

    public long getWarriorCritchance() {
        return warriorCritchance;
    }

    public void setWarriorCritchance(long warriorCritchance) {
        this.warriorCritchance = warriorCritchance;
    }

    public long getWarriorCritmultiplier() {
        return warriorCritmultiplier;
    }

    public void setWarriorCritmultiplier(long warriorCritmultiplier) {
        this.warriorCritmultiplier = warriorCritmultiplier;
    }

    public long getWarriorEnergy() {
        return warriorEnergy;
    }

    public void setWarriorEnergy(long warriorEnergy) {
        this.warriorEnergy = warriorEnergy;
    }

    public long getWarriorHealth() {
        return warriorHealth;
    }

    public void setWarriorHealth(long warriorHealth) {
        this.warriorHealth = warriorHealth;
    }

    public long getWarriorPlays() {
        return warriorPlays;
    }

    public void setWarriorPlays(long warriorPlays) {
        this.warriorPlays = warriorPlays;
    }

    public long getWarriorSkill1() {
        return warriorSkill1;
    }

    public void setWarriorSkill1(long warriorSkill1) {
        this.warriorSkill1 = warriorSkill1;
    }

    public long getWarriorSkill2() {
        return warriorSkill2;
    }

    public void setWarriorSkill2(long warriorSkill2) {
        this.warriorSkill2 = warriorSkill2;
    }

    public String getWarriorSpec() {
        return warriorSpec;
    }

    public void setWarriorSpec(String warriorSpec) {
        this.warriorSpec = warriorSpec;
    }

    public List<WeaponInventory> getWeaponInventory() {
        return weaponInventory;
    }

    public void setWeaponInventory(List<WeaponInventory> weaponInventory) {
        this.weaponInventory = weaponInventory;
    }

    public long getWinStreak() {
        return winStreak;
    }

    public void setWinStreak(long winStreak) {
        this.winStreak = winStreak;
    }

    public long getWins() {
        return wins;
    }

    public void setWins(long wins) {
        this.wins = wins;
    }

    public long getWinsBerserker() {
        return winsBerserker;
    }

    public void setWinsBerserker(long winsBerserker) {
        this.winsBerserker = winsBerserker;
    }

    public long getWinsBlu() {
        return winsBlu;
    }

    public void setWinsBlu(long winsBlu) {
        this.winsBlu = winsBlu;
    }

    public long getWinsCapturetheflag() {
        return winsCapturetheflag;
    }

    public void setWinsCapturetheflag(long winsCapturetheflag) {
        this.winsCapturetheflag = winsCapturetheflag;
    }

    public long getWinsCapturetheflagBlu() {
        return winsCapturetheflagBlu;
    }

    public void setWinsCapturetheflagBlu(long winsCapturetheflagBlu) {
        this.winsCapturetheflagBlu = winsCapturetheflagBlu;
    }

    public long getWinsCapturetheflagRed() {
        return winsCapturetheflagRed;
    }

    public void setWinsCapturetheflagRed(long winsCapturetheflagRed) {
        this.winsCapturetheflagRed = winsCapturetheflagRed;
    }

    public long getWinsCrusader() {
        return winsCrusader;
    }

    public void setWinsCrusader(long winsCrusader) {
        this.winsCrusader = winsCrusader;
    }

    public long getWinsDomination() {
        return winsDomination;
    }

    public void setWinsDomination(long winsDomination) {
        this.winsDomination = winsDomination;
    }

    public long getWinsDominationBlu() {
        return winsDominationBlu;
    }

    public void setWinsDominationBlu(long winsDominationBlu) {
        this.winsDominationBlu = winsDominationBlu;
    }

    public long getWinsDominationRed() {
        return winsDominationRed;
    }

    public void setWinsDominationRed(long winsDominationRed) {
        this.winsDominationRed = winsDominationRed;
    }

    public long getWinsMage() {
        return winsMage;
    }

    public void setWinsMage(long winsMage) {
        this.winsMage = winsMage;
    }

    public long getWinsPaladin() {
        return winsPaladin;
    }

    public void setWinsPaladin(long winsPaladin) {
        this.winsPaladin = winsPaladin;
    }

    public long getWinsPyromancer() {
        return winsPyromancer;
    }

    public void setWinsPyromancer(long winsPyromancer) {
        this.winsPyromancer = winsPyromancer;
    }

    public long getWinsRed() {
        return winsRed;
    }

    public void setWinsRed(long winsRed) {
        this.winsRed = winsRed;
    }

    public long getWinsWarrior() {
        return winsWarrior;
    }

    public void setWinsWarrior(long winsWarrior) {
        this.winsWarrior = winsWarrior;
    }

    public long getWarriorSkill3() {
        return warriorSkill3;
    }

    public void setWarriorSkill3(long warriorSkill3) {
        this.warriorSkill3 = warriorSkill3;
    }

    public long getWarriorSkill4() {
        return warriorSkill4;
    }

    public void setWarriorSkill4(long warriorSkill4) {
        this.warriorSkill4 = warriorSkill4;
    }

    public long getWarriorSkill5() {
        return warriorSkill5;
    }

    public void setWarriorSkill5(long warriorSkill5) {
        this.warriorSkill5 = warriorSkill5;
    }

    public long getLossesPaladin() {
        return lossesPaladin;
    }

    public void setLossesPaladin(long lossesPaladin) {
        this.lossesPaladin = lossesPaladin;
    }

    public long getLossesCrusader() {
        return lossesCrusader;
    }

    public void setLossesCrusader(long lossesCrusader) {
        this.lossesCrusader = lossesCrusader;
    }

    public long getWinsProtector() {
        return winsProtector;
    }

    public void setWinsProtector(long winsProtector) {
        this.winsProtector = winsProtector;
    }

    public boolean isDisplayDamage() {
        return displayDamage;
    }

    public void setDisplayDamage(boolean displayDamage) {
        this.displayDamage = displayDamage;
    }

    public boolean isHints() {
        return hints;
    }

    public void setHints(boolean hints) {
        this.hints = hints;
    }

    public long getReroll() {
        return reroll;
    }

    public void setReroll(long reroll) {
        this.reroll = reroll;
    }

    public long getRerollEpic() {
        return rerollEpic;
    }

    public void setRerollEpic(long rerollEpic) {
        this.rerollEpic = rerollEpic;
    }

    public long getMageSkill4() {
        return mageSkill4;
    }

    public void setMageSkill4(long mageSkill4) {
        this.mageSkill4 = mageSkill4;
    }

    public long getMageSkill5() {
        return mageSkill5;
    }

    public void setMageSkill5(long mageSkill5) {
        this.mageSkill5 = mageSkill5;
    }

    public String getShamanSpec() {
        return shamanSpec;
    }

    public void setShamanSpec(String shamanSpec) {
        this.shamanSpec = shamanSpec;
    }

    public boolean isHotkeymode() {
        return hotkeymode;
    }

    public void setHotkeymode(boolean hotkeymode) {
        this.hotkeymode = hotkeymode;
    }

    public long getPlayStreak() {
        return playStreak;
    }

    public void setPlayStreak(long playStreak) {
        this.playStreak = playStreak;
    }

    public long getDamageAvenger() {
        return damageAvenger;
    }

    public void setDamageAvenger(long damageAvenger) {
        this.damageAvenger = damageAvenger;
    }

    public long getAvengerPlays() {
        return avengerPlays;
    }

    public void setAvengerPlays(long avengerPlays) {
        this.avengerPlays = avengerPlays;
    }

    public long getHealAvenger() {
        return healAvenger;
    }

    public void setHealAvenger(long healAvenger) {
        this.healAvenger = healAvenger;
    }

    public long getDamagePreventedAvenger() {
        return damagePreventedAvenger;
    }

    public void setDamagePreventedAvenger(long damagePreventedAvenger) {
        this.damagePreventedAvenger = damagePreventedAvenger;
    }

    public long getShamanSkill1() {
        return shamanSkill1;
    }

    public void setShamanSkill1(long shamanSkill1) {
        this.shamanSkill1 = shamanSkill1;
    }

    public long getShamanSkill2() {
        return shamanSkill2;
    }

    public void setShamanSkill2(long shamanSkill2) {
        this.shamanSkill2 = shamanSkill2;
    }

    public long getShamanSkill3() {
        return shamanSkill3;
    }

    public void setShamanSkill3(long shamanSkill3) {
        this.shamanSkill3 = shamanSkill3;
    }

    public long getShamanSkill4() {
        return shamanSkill4;
    }

    public void setShamanSkill4(long shamanSkill4) {
        this.shamanSkill4 = shamanSkill4;
    }

    public long getShamanSkill5() {
        return shamanSkill5;
    }

    public void setShamanSkill5(long shamanSkill5) {
        this.shamanSkill5 = shamanSkill5;
    }

    public long getShamanHealth() {
        return shamanHealth;
    }

    public void setShamanHealth(long shamanHealth) {
        this.shamanHealth = shamanHealth;
    }

    public long getDamagePreventedThunderlord() {
        return damagePreventedThunderlord;
    }

    public void setDamagePreventedThunderlord(long damagePreventedThunderlord) {
        this.damagePreventedThunderlord = damagePreventedThunderlord;
    }

    public long getHealShaman() {
        return healShaman;
    }

    public void setHealShaman(long healShaman) {
        this.healShaman = healShaman;
    }

    public long getWinsShaman() {
        return winsShaman;
    }

    public void setWinsShaman(long winsShaman) {
        this.winsShaman = winsShaman;
    }

    public long getHealThunderlord() {
        return healThunderlord;
    }

    public void setHealThunderlord(long healThunderlord) {
        this.healThunderlord = healThunderlord;
    }

    public long getWinsThunderlord() {
        return winsThunderlord;
    }

    public void setWinsThunderlord(long winsThunderlord) {
        this.winsThunderlord = winsThunderlord;
    }

    public long getThunderlordPlays() {
        return thunderlordPlays;
    }

    public void setThunderlordPlays(long thunderlordPlays) {
        this.thunderlordPlays = thunderlordPlays;
    }

    public long getDamageShaman() {
        return damageShaman;
    }

    public void setDamageShaman(long damageShaman) {
        this.damageShaman = damageShaman;
    }

    public long getDamageThunderlord() {
        return damageThunderlord;
    }

    public void setDamageThunderlord(long damageThunderlord) {
        this.damageThunderlord = damageThunderlord;
    }

    public long getDamagePreventedShaman() {
        return damagePreventedShaman;
    }

    public void setDamagePreventedShaman(long damagePreventedShaman) {
        this.damagePreventedShaman = damagePreventedShaman;
    }

    public long getShamanPlays() {
        return shamanPlays;
    }

    public void setShamanPlays(long shamanPlays) {
        this.shamanPlays = shamanPlays;
    }

    public long getShamanCritmultiplier() {
        return shamanCritmultiplier;
    }

    public void setShamanCritmultiplier(long shamanCritmultiplier) {
        this.shamanCritmultiplier = shamanCritmultiplier;
    }

    public long getShamanCritchance() {
        return shamanCritchance;
    }

    public void setShamanCritchance(long shamanCritchance) {
        this.shamanCritchance = shamanCritchance;
    }

    public long getShamanCooldown() {
        return shamanCooldown;
    }

    public void setShamanCooldown(long shamanCooldown) {
        this.shamanCooldown = shamanCooldown;
    }

    public long getShamanEnergy() {
        return shamanEnergy;
    }

    public void setShamanEnergy(long shamanEnergy) {
        this.shamanEnergy = shamanEnergy;
    }

    public long getLossesThunderlord() {
        return lossesThunderlord;
    }

    public void setLossesThunderlord(long lossesThunderlord) {
        this.lossesThunderlord = lossesThunderlord;
    }

    public long getLossesShaman() {
        return lossesShaman;
    }

    public void setLossesShaman(long lossesShaman) {
        this.lossesShaman = lossesShaman;
    }

    public long getWinsCapturetheflagA() {
        return winsCapturetheflagA;
    }

    public void setWinsCapturetheflagA(long winsCapturetheflagA) {
        this.winsCapturetheflagA = winsCapturetheflagA;
    }

    public long getWinsTeamdeathmatchB() {
        return winsTeamdeathmatchB;
    }

    public void setWinsTeamdeathmatchB(long winsTeamdeathmatchB) {
        this.winsTeamdeathmatchB = winsTeamdeathmatchB;
    }

    public long getWinsTeamdeathmatch() {
        return winsTeamdeathmatch;
    }

    public void setWinsTeamdeathmatch(long winsTeamdeathmatch) {
        this.winsTeamdeathmatch = winsTeamdeathmatch;
    }

    public long getWinsTeamdeathmatchRed() {
        return winsTeamdeathmatchRed;
    }

    public void setWinsTeamdeathmatchRed(long winsTeamdeathmatchRed) {
        this.winsTeamdeathmatchRed = winsTeamdeathmatchRed;
    }

    public long getWinsDominationB() {
        return winsDominationB;
    }

    public void setWinsDominationB(long winsDominationB) {
        this.winsDominationB = winsDominationB;
    }

    public long getWinsTeamdeathmatchA() {
        return winsTeamdeathmatchA;
    }

    public void setWinsTeamdeathmatchA(long winsTeamdeathmatchA) {
        this.winsTeamdeathmatchA = winsTeamdeathmatchA;
    }

    public long getWinsDominationA() {
        return winsDominationA;
    }

    public void setWinsDominationA(long winsDominationA) {
        this.winsDominationA = winsDominationA;
    }

    public long getWinsCapturetheflagB() {
        return winsCapturetheflagB;
    }

    public void setWinsCapturetheflagB(long winsCapturetheflagB) {
        this.winsCapturetheflagB = winsCapturetheflagB;
    }

    public long getWinsTeamdeathmatchBlu() {
        return winsTeamdeathmatchBlu;
    }

    public void setWinsTeamdeathmatchBlu(long winsTeamdeathmatchBlu) {
        this.winsTeamdeathmatchBlu = winsTeamdeathmatchBlu;
    }

    public long getMageHealth() {
        return mageHealth;
    }

    public void setMageHealth(long mageHealth) {
        this.mageHealth = mageHealth;
    }

    public long getMageEnergy() {
        return mageEnergy;
    }

    public void setMageEnergy(long mageEnergy) {
        this.mageEnergy = mageEnergy;
    }

    public long getMageCritchance() {
        return mageCritchance;
    }

    public void setMageCritchance(long mageCritchance) {
        this.mageCritchance = mageCritchance;
    }

    public long getMageCritmultiplier() {
        return mageCritmultiplier;
    }

    public void setMageCritmultiplier(long mageCritmultiplier) {
        this.mageCritmultiplier = mageCritmultiplier;
    }

    public long getMageCooldown() {
        return mageCooldown;
    }

    public void setMageCooldown(long mageCooldown) {
        this.mageCooldown = mageCooldown;
    }

    public long getRepairedLegendary() {
        return repairedLegendary;
    }

    public void setRepairedLegendary(long repairedLegendary) {
        this.repairedLegendary = repairedLegendary;
    }

    public long getSalvagedWeaponsEpic() {
        return salvagedWeaponsEpic;
    }

    public void setSalvagedWeaponsEpic(long salvagedWeaponsEpic) {
        this.salvagedWeaponsEpic = salvagedWeaponsEpic;
    }

    public long getRerollLegendary() {
        return rerollLegendary;
    }

    public void setRerollLegendary(long rerollLegendary) {
        this.rerollLegendary = rerollLegendary;
    }

    public long getWinsAvenger() {
        return winsAvenger;
    }

    public void setWinsAvenger(long winsAvenger) {
        this.winsAvenger = winsAvenger;
    }

    public long getLossesAvenger() {
        return lossesAvenger;
    }

    public void setLossesAvenger(long lossesAvenger) {
        this.lossesAvenger = lossesAvenger;
    }

    public long getRewardInventory() {
        return rewardInventory;
    }

    public void setRewardInventory(long rewardInventory) {
        this.rewardInventory = rewardInventory;
    }

    public long getLossesProtector() {
        return lossesProtector;
    }

    public void setLossesProtector(long lossesProtector) {
        this.lossesProtector = lossesProtector;
    }

    public long getCraftedEpic() {
        return craftedEpic;
    }

    public void setCraftedEpic(long craftedEpic) {
        this.craftedEpic = craftedEpic;
    }

    public long getCrafted() {
        return crafted;
    }

    public void setCrafted(long crafted) {
        this.crafted = crafted;
    }

    public long getUnlockPlaystreak() {
        return unlockPlaystreak;
    }

    public void setUnlockPlaystreak(long unlockPlaystreak) {
        this.unlockPlaystreak = unlockPlaystreak;
    }

    public long getUnlockPlaystreakLegendary() {
        return unlockPlaystreakLegendary;
    }

    public void setUnlockPlaystreakLegendary(long unlockPlaystreakLegendary) {
        this.unlockPlaystreakLegendary = unlockPlaystreakLegendary;
    }

    public long getWarriorHelmetSelection() {
        return warriorHelmetSelection;
    }

    public void setWarriorHelmetSelection(long warriorHelmetSelection) {
        this.warriorHelmetSelection = warriorHelmetSelection;
    }

    public long getWarriorArmorSelection() {
        return warriorArmorSelection;
    }

    public void setWarriorArmorSelection(long warriorArmorSelection) {
        this.warriorArmorSelection = warriorArmorSelection;
    }

    public long getSalvagedWeaponsLegendary() {
        return salvagedWeaponsLegendary;
    }

    public void setSalvagedWeaponsLegendary(long salvagedWeaponsLegendary) {
        this.salvagedWeaponsLegendary = salvagedWeaponsLegendary;
    }

    public long getDamageDefender() {
        return damageDefender;
    }

    public void setDamageDefender(long damageDefender) {
        this.damageDefender = damageDefender;
    }

    public long getHealDefender() {
        return healDefender;
    }

    public void setHealDefender(long healDefender) {
        this.healDefender = healDefender;
    }

    public long getLossesDefender() {
        return lossesDefender;
    }

    public void setLossesDefender(long lossesDefender) {
        this.lossesDefender = lossesDefender;
    }

    public long getDefenderPlays() {
        return defenderPlays;
    }

    public void setDefenderPlays(long defenderPlays) {
        this.defenderPlays = defenderPlays;
    }

    public long getDamagePreventedDefender() {
        return damagePreventedDefender;
    }

    public void setDamagePreventedDefender(long damagePreventedDefender) {
        this.damagePreventedDefender = damagePreventedDefender;
    }

    public long getEarthwardenPlays() {
        return earthwardenPlays;
    }

    public void setEarthwardenPlays(long earthwardenPlays) {
        this.earthwardenPlays = earthwardenPlays;
    }

    public long getHealEarthwarden() {
        return healEarthwarden;
    }

    public void setHealEarthwarden(long healEarthwarden) {
        this.healEarthwarden = healEarthwarden;
    }

    public long getDamagePreventedEarthwarden() {
        return damagePreventedEarthwarden;
    }

    public void setDamagePreventedEarthwarden(long damagePreventedEarthwarden) {
        this.damagePreventedEarthwarden = damagePreventedEarthwarden;
    }

    public long getWinsEarthwarden() {
        return winsEarthwarden;
    }

    public void setWinsEarthwarden(long winsEarthwarden) {
        this.winsEarthwarden = winsEarthwarden;
    }

    public long getDamageEarthwarden() {
        return damageEarthwarden;
    }

    public void setDamageEarthwarden(long damageEarthwarden) {
        this.damageEarthwarden = damageEarthwarden;
    }

    public long getHealCryomancer() {
        return healCryomancer;
    }

    public void setHealCryomancer(long healCryomancer) {
        this.healCryomancer = healCryomancer;
    }

    public long getDamageCryomancer() {
        return damageCryomancer;
    }

    public void setDamageCryomancer(long damageCryomancer) {
        this.damageCryomancer = damageCryomancer;
    }

    public long getDamagePreventedCryomancer() {
        return damagePreventedCryomancer;
    }

    public void setDamagePreventedCryomancer(long damagePreventedCryomancer) {
        this.damagePreventedCryomancer = damagePreventedCryomancer;
    }

    public long getCryomancerPlays() {
        return cryomancerPlays;
    }

    public void setCryomancerPlays(long cryomancerPlays) {
        this.cryomancerPlays = cryomancerPlays;
    }

    public long getUpgradeCrafted() {
        return upgradeCrafted;
    }

    public void setUpgradeCrafted(long upgradeCrafted) {
        this.upgradeCrafted = upgradeCrafted;
    }

    public long getUpgradeCraftedLegendary() {
        return upgradeCraftedLegendary;
    }

    public void setUpgradeCraftedLegendary(long upgradeCraftedLegendary) {
        this.upgradeCraftedLegendary = upgradeCraftedLegendary;
    }

    public long getDamageAquamancer() {
        return damageAquamancer;
    }

    public void setDamageAquamancer(long damageAquamancer) {
        this.damageAquamancer = damageAquamancer;
    }

    public long getHealAquamancer() {
        return healAquamancer;
    }

    public void setHealAquamancer(long healAquamancer) {
        this.healAquamancer = healAquamancer;
    }

    public long getAquamancerPlays() {
        return aquamancerPlays;
    }

    public void setAquamancerPlays(long aquamancerPlays) {
        this.aquamancerPlays = aquamancerPlays;
    }

    public long getDamagePreventedAquamancer() {
        return damagePreventedAquamancer;
    }

    public void setDamagePreventedAquamancer(long damagePreventedAquamancer) {
        this.damagePreventedAquamancer = damagePreventedAquamancer;
    }

    public long getWinsAquamancer() {
        return winsAquamancer;
    }

    public void setWinsAquamancer(long winsAquamancer) {
        this.winsAquamancer = winsAquamancer;
    }

}

