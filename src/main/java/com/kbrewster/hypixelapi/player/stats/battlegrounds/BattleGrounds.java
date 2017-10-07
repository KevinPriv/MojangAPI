package com.kbrewster.hypixelapi.player.stats.battlegrounds;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

public class BattleGrounds {

    @SerializedName("afk_warned")
    @Expose @Getter
    private long afkWarned;
    @SerializedName("assists")
    @Expose @Getter
    private long assists;
    @SerializedName("berserker_plays")
    @Expose @Getter
    private long berserkerPlays;
    @SerializedName("broken_inventory")
    @Expose @Getter
    private long brokenInventory;
    @SerializedName("chosen_class")
    @Expose @Getter
    private String chosenClass;
    @SerializedName("coins")
    @Expose @Getter
    private long coins;
    @SerializedName("crusader_plays")
    @Expose @Getter
    private long crusaderPlays;
    @SerializedName("current_weapon")
    @Expose @Getter
    private long currentWeapon;
    @SerializedName("damage")
    @Expose @Getter
    private long damage;
    @SerializedName("damage_berserker")
    @Expose @Getter
    private long damageBerserker;
    @SerializedName("damage_crusader")
    @Expose @Getter
    private long damageCrusader;
    @SerializedName("damage_mage")
    @Expose @Getter
    private long damageMage;
    @SerializedName("damage_paladin")
    @Expose @Getter
    private long damagePaladin;
    @SerializedName("damage_prevented")
    @Expose @Getter
    private long damagePrevented;
    @SerializedName("damage_prevented_berserker")
    @Expose @Getter
    private long damagePreventedBerserker;
    @SerializedName("damage_prevented_crusader")
    @Expose @Getter
    private long damagePreventedCrusader;
    @SerializedName("damage_prevented_mage")
    @Expose @Getter
    private long damagePreventedMage;
    @SerializedName("damage_prevented_paladin")
    @Expose @Getter
    private long damagePreventedPaladin;
    @SerializedName("damage_prevented_protector")
    @Expose @Getter
    private long damagePreventedProtector;
    @SerializedName("damage_prevented_pyromancer")
    @Expose @Getter
    private long damagePreventedPyromancer;
    @SerializedName("damage_prevented_warrior")
    @Expose @Getter
    private long damagePreventedWarrior;
    @SerializedName("damage_protector")
    @Expose @Getter
    private long damageProtector;
    @SerializedName("damage_pyromancer")
    @Expose @Getter
    private long damagePyromancer;
    @SerializedName("damage_taken")
    @Expose @Getter
    private long damageTaken;
    @SerializedName("damage_warrior")
    @Expose @Getter
    private long damageWarrior;
    @SerializedName("deaths")
    @Expose @Getter
    private long deaths;
    @SerializedName("flag_conquer_self")
    @Expose @Getter
    private long flagConquerSelf;
    @SerializedName("flag_conquer_team")
    @Expose @Getter
    private long flagConquerTeam;
    @SerializedName("heal")
    @Expose @Getter
    private long heal;
    @SerializedName("heal_berserker")
    @Expose @Getter
    private long healBerserker;
    @SerializedName("heal_crusader")
    @Expose @Getter
    private long healCrusader;
    @SerializedName("heal_mage")
    @Expose @Getter
    private long healMage;
    @SerializedName("heal_paladin")
    @Expose @Getter
    private long healPaladin;
    @SerializedName("heal_protector")
    @Expose @Getter
    private long healProtector;
    @SerializedName("heal_pyromancer")
    @Expose @Getter
    private long healPyromancer;
    @SerializedName("heal_warrior")
    @Expose @Getter
    private long healWarrior;
    @SerializedName("kills")
    @Expose @Getter
    private long kills;
    @SerializedName("life_leeched")
    @Expose @Getter
    private long lifeLeeched;
    @SerializedName("life_leeched_berserker")
    @Expose @Getter
    private long lifeLeechedBerserker;
    @SerializedName("life_leeched_warrior")
    @Expose @Getter
    private long lifeLeechedWarrior;
    @SerializedName("losses")
    @Expose @Getter
    private long losses;
    @SerializedName("losses_berserker")
    @Expose @Getter
    private long lossesBerserker;
    @SerializedName("losses_mage")
    @Expose @Getter
    private long lossesMage;
    @SerializedName("losses_pyromancer")
    @Expose @Getter
    private long lossesPyromancer;
    @SerializedName("losses_warrior")
    @Expose @Getter
    private long lossesWarrior;
    @SerializedName("mage_plays")
    @Expose @Getter
    private long magePlays;
    @SerializedName("mage_skill1")
    @Expose @Getter
    private long mageSkill1;
    @SerializedName("mage_skill2")
    @Expose @Getter
    private long mageSkill2;
    @SerializedName("mage_skill3")
    @Expose @Getter
    private long mageSkill3;
    @SerializedName("mage_spec")
    @Expose @Getter
    private String mageSpec;
    @SerializedName("magic_dust")
    @Expose @Getter
    private long magicDust;
    @SerializedName("packages")
    @Expose @Getter
    private List<String> packages = null;
    @SerializedName("paladin_cooldown")
    @Expose @Getter
    private long paladinCooldown;
    @SerializedName("paladin_critchance")
    @Expose @Getter
    private long paladinCritchance;
    @SerializedName("paladin_critmultiplier")
    @Expose @Getter
    private long paladinCritmultiplier;
    @SerializedName("paladin_energy")
    @Expose @Getter
    private long paladinEnergy;
    @SerializedName("paladin_health")
    @Expose @Getter
    private long paladinHealth;
    @SerializedName("paladin_plays")
    @Expose @Getter
    private long paladinPlays;
    @SerializedName("paladin_skill1")
    @Expose @Getter
    private long paladinSkill1;
    @SerializedName("paladin_skill2")
    @Expose @Getter
    private long paladinSkill2;
    @SerializedName("paladin_skill3")
    @Expose @Getter
    private long paladinSkill3;
    @SerializedName("paladin_skill4")
    @Expose @Getter
    private long paladinSkill4;
    @SerializedName("paladin_skill5")
    @Expose @Getter
    private long paladinSkill5;
    @SerializedName("paladin_spec")
    @Expose @Getter
    private String paladinSpec;
    @SerializedName("penalty")
    @Expose @Getter
    private long penalty;
    @SerializedName("protector_plays")
    @Expose @Getter
    private long protectorPlays;
    @SerializedName("pyromancer_plays")
    @Expose @Getter
    private long pyromancerPlays;
    @SerializedName("repaired")
    @Expose @Getter
    private long repaired;
    @SerializedName("repaired_common")
    @Expose @Getter
    private long repairedCommon;
    @SerializedName("repaired_epic")
    @Expose @Getter
    private long repairedEpic;
    @SerializedName("repaired_rare")
    @Expose @Getter
    private long repairedRare;
    @SerializedName("salvaged_dust_reward")
    @Expose @Getter
    private long salvagedDustReward;
    @SerializedName("salvaged_shards_reward")
    @Expose @Getter
    private long salvagedShardsReward;
    @SerializedName("salvaged_weapons")
    @Expose @Getter
    private long salvagedWeapons;
    @SerializedName("salvaged_weapons_common")
    @Expose @Getter
    private long salvagedWeaponsCommon;
    @SerializedName("salvaged_weapons_rare")
    @Expose @Getter
    private long salvagedWeaponsRare;
    @SerializedName("selected_mount")
    @Expose @Getter
    private String selectedMount;
    @SerializedName("upgrade_random")
    @Expose @Getter
    private long upgradeRandom;
    @SerializedName("upgrade_random_epic")
    @Expose @Getter
    private long upgradeRandomEpic;
    @SerializedName("void_shards")
    @Expose @Getter
    private long voidShards;
    @SerializedName("warrior_cooldown")
    @Expose @Getter
    private long warriorCooldown;
    @SerializedName("warrior_critchance")
    @Expose @Getter
    private long warriorCritchance;
    @SerializedName("warrior_critmultiplier")
    @Expose @Getter
    private long warriorCritmultiplier;
    @SerializedName("warrior_energy")
    @Expose @Getter
    private long warriorEnergy;
    @SerializedName("warrior_health")
    @Expose @Getter
    private long warriorHealth;
    @SerializedName("warrior_plays")
    @Expose @Getter
    private long warriorPlays;
    @SerializedName("warrior_skill1")
    @Expose @Getter
    private long warriorSkill1;
    @SerializedName("warrior_skill2")
    @Expose @Getter
    private long warriorSkill2;
    @SerializedName("warrior_spec")
    @Expose @Getter
    private String warriorSpec;
    @SerializedName("weapon_inventory")
    @Expose @Getter
    private List<WeaponInventory> weaponInventory = null;
    @SerializedName("win_streak")
    @Expose @Getter
    private long winStreak;
    @SerializedName("wins")
    @Expose @Getter
    private long wins;
    @SerializedName("wins_berserker")
    @Expose @Getter
    private long winsBerserker;
    @SerializedName("wins_blu")
    @Expose @Getter
    private long winsBlu;
    @SerializedName("wins_capturetheflag")
    @Expose @Getter
    private long winsCapturetheflag;
    @SerializedName("wins_capturetheflag_blu")
    @Expose @Getter
    private long winsCapturetheflagBlu;
    @SerializedName("wins_capturetheflag_red")
    @Expose @Getter
    private long winsCapturetheflagRed;
    @SerializedName("wins_crusader")
    @Expose @Getter
    private long winsCrusader;
    @SerializedName("wins_domination")
    @Expose @Getter
    private long winsDomination;
    @SerializedName("wins_domination_blu")
    @Expose @Getter
    private long winsDominationBlu;
    @SerializedName("wins_domination_red")
    @Expose @Getter
    private long winsDominationRed;
    @SerializedName("wins_mage")
    @Expose @Getter
    private long winsMage;
    @SerializedName("wins_paladin")
    @Expose @Getter
    private long winsPaladin;
    @SerializedName("wins_pyromancer")
    @Expose @Getter
    private long winsPyromancer;
    @SerializedName("wins_red")
    @Expose @Getter
    private long winsRed;
    @SerializedName("wins_warrior")
    @Expose @Getter
    private long winsWarrior;
    @SerializedName("warrior_skill3")
    @Expose @Getter
    private long warriorSkill3;
    @SerializedName("warrior_skill4")
    @Expose @Getter
    private long warriorSkill4;
    @SerializedName("warrior_skill5")
    @Expose @Getter
    private long warriorSkill5;
    @SerializedName("losses_paladin")
    @Expose @Getter
    private long lossesPaladin;
    @SerializedName("losses_crusader")
    @Expose @Getter
    private long lossesCrusader;
    @SerializedName("wins_protector")
    @Expose @Getter
    private long winsProtector;
    @SerializedName("display_damage")
    @Expose @Getter
    private boolean displayDamage;
    @SerializedName("hints")
    @Expose @Getter
    private boolean hints;
    @SerializedName("reroll")
    @Expose @Getter
    private long reroll;
    @SerializedName("reroll_epic")
    @Expose @Getter
    private long rerollEpic;
    @SerializedName("mage_skill4")
    @Expose @Getter
    private long mageSkill4;
    @SerializedName("mage_skill5")
    @Expose @Getter
    private long mageSkill5;
    @SerializedName("shaman_spec")
    @Expose @Getter
    private String shamanSpec;
    @SerializedName("hotkeymode")
    @Expose @Getter
    private boolean hotkeymode;
    @SerializedName("play_streak")
    @Expose @Getter
    private long playStreak;
    @SerializedName("damage_avenger")
    @Expose @Getter
    private long damageAvenger;
    @SerializedName("avenger_plays")
    @Expose @Getter
    private long avengerPlays;
    @SerializedName("heal_avenger")
    @Expose @Getter
    private long healAvenger;
    @SerializedName("damage_prevented_avenger")
    @Expose @Getter
    private long damagePreventedAvenger;
    @SerializedName("shaman_skill1")
    @Expose @Getter
    private long shamanSkill1;
    @SerializedName("shaman_skill2")
    @Expose @Getter
    private long shamanSkill2;
    @SerializedName("shaman_skill3")
    @Expose @Getter
    private long shamanSkill3;
    @SerializedName("shaman_skill4")
    @Expose @Getter
    private long shamanSkill4;
    @SerializedName("shaman_skill5")
    @Expose @Getter
    private long shamanSkill5;
    @SerializedName("shaman_health")
    @Expose @Getter
    private long shamanHealth;
    @SerializedName("damage_prevented_thunderlord")
    @Expose @Getter
    private long damagePreventedThunderlord;
    @SerializedName("heal_shaman")
    @Expose @Getter
    private long healShaman;
    @SerializedName("wins_shaman")
    @Expose @Getter
    private long winsShaman;
    @SerializedName("heal_thunderlord")
    @Expose @Getter
    private long healThunderlord;
    @SerializedName("wins_thunderlord")
    @Expose @Getter
    private long winsThunderlord;
    @SerializedName("thunderlord_plays")
    @Expose @Getter
    private long thunderlordPlays;
    @SerializedName("damage_shaman")
    @Expose @Getter
    private long damageShaman;
    @SerializedName("damage_thunderlord")
    @Expose @Getter
    private long damageThunderlord;
    @SerializedName("damage_prevented_shaman")
    @Expose @Getter
    private long damagePreventedShaman;
    @SerializedName("shaman_plays")
    @Expose @Getter
    private long shamanPlays;
    @SerializedName("shaman_critmultiplier")
    @Expose @Getter
    private long shamanCritmultiplier;
    @SerializedName("shaman_critchance")
    @Expose @Getter
    private long shamanCritchance;
    @SerializedName("shaman_cooldown")
    @Expose @Getter
    private long shamanCooldown;
    @SerializedName("shaman_energy")
    @Expose @Getter
    private long shamanEnergy;
    @SerializedName("losses_thunderlord")
    @Expose @Getter
    private long lossesThunderlord;
    @SerializedName("losses_shaman")
    @Expose @Getter
    private long lossesShaman;
    @SerializedName("wins_capturetheflag_a")
    @Expose @Getter
    private long winsCapturetheflagA;
    @SerializedName("wins_teamdeathmatch_b")
    @Expose @Getter
    private long winsTeamdeathmatchB;
    @SerializedName("wins_teamdeathmatch")
    @Expose @Getter
    private long winsTeamdeathmatch;
    @SerializedName("wins_teamdeathmatch_red")
    @Expose @Getter
    private long winsTeamdeathmatchRed;
    @SerializedName("wins_domination_b")
    @Expose @Getter
    private long winsDominationB;
    @SerializedName("wins_teamdeathmatch_a")
    @Expose @Getter
    private long winsTeamdeathmatchA;
    @SerializedName("wins_domination_a")
    @Expose @Getter
    private long winsDominationA;
    @SerializedName("wins_capturetheflag_b")
    @Expose @Getter
    private long winsCapturetheflagB;
    @SerializedName("wins_teamdeathmatch_blu")
    @Expose @Getter
    private long winsTeamdeathmatchBlu;
    @SerializedName("mage_health")
    @Expose @Getter
    private long mageHealth;
    @SerializedName("mage_energy")
    @Expose @Getter
    private long mageEnergy;
    @SerializedName("mage_critchance")
    @Expose @Getter
    private long mageCritchance;
    @SerializedName("mage_critmultiplier")
    @Expose @Getter
    private long mageCritmultiplier;
    @SerializedName("mage_cooldown")
    @Expose @Getter
    private long mageCooldown;
    @SerializedName("repaired_legendary")
    @Expose @Getter
    private long repairedLegendary;
    @SerializedName("salvaged_weapons_epic")
    @Expose @Getter
    private long salvagedWeaponsEpic;
    @SerializedName("reroll_legendary")
    @Expose @Getter
    private long rerollLegendary;
    @SerializedName("wins_avenger")
    @Expose @Getter
    private long winsAvenger;
    @SerializedName("losses_avenger")
    @Expose @Getter
    private long lossesAvenger;
    @SerializedName("reward_inventory")
    @Expose @Getter
    private long rewardInventory;
    @SerializedName("losses_protector")
    @Expose @Getter
    private long lossesProtector;
    @SerializedName("crafted_epic")
    @Expose @Getter
    private long craftedEpic;
    @SerializedName("crafted")
    @Expose @Getter
    private long crafted;
    @SerializedName("unlock_playstreak")
    @Expose @Getter
    private long unlockPlaystreak;
    @SerializedName("unlock_playstreak_legendary")
    @Expose @Getter
    private long unlockPlaystreakLegendary;
    @SerializedName("warrior_helmet_selection")
    @Expose @Getter
    private long warriorHelmetSelection;
    @SerializedName("warrior_armor_selection")
    @Expose @Getter
    private long warriorArmorSelection;
    @SerializedName("salvaged_weapons_legendary")
    @Expose @Getter
    private long salvagedWeaponsLegendary;
    @SerializedName("damage_defender")
    @Expose @Getter
    private long damageDefender;
    @SerializedName("heal_defender")
    @Expose @Getter
    private long healDefender;
    @SerializedName("losses_defender")
    @Expose @Getter
    private long lossesDefender;
    @SerializedName("defender_plays")
    @Expose @Getter
    private long defenderPlays;
    @SerializedName("damage_prevented_defender")
    @Expose @Getter
    private long damagePreventedDefender;
    @SerializedName("earthwarden_plays")
    @Expose @Getter
    private long earthwardenPlays;
    @SerializedName("heal_earthwarden")
    @Expose @Getter
    private long healEarthwarden;
    @SerializedName("damage_prevented_earthwarden")
    @Expose @Getter
    private long damagePreventedEarthwarden;
    @SerializedName("wins_earthwarden")
    @Expose @Getter
    private long winsEarthwarden;
    @SerializedName("damage_earthwarden")
    @Expose @Getter
    private long damageEarthwarden;
    @SerializedName("heal_cryomancer")
    @Expose @Getter
    private long healCryomancer;
    @SerializedName("damage_cryomancer")
    @Expose @Getter
    private long damageCryomancer;
    @SerializedName("damage_prevented_cryomancer")
    @Expose @Getter
    private long damagePreventedCryomancer;
    @SerializedName("cryomancer_plays")
    @Expose @Getter
    private long cryomancerPlays;
    @SerializedName("upgrade_crafted")
    @Expose @Getter
    private long upgradeCrafted;
    @SerializedName("upgrade_crafted_legendary")
    @Expose @Getter
    private long upgradeCraftedLegendary;
    @SerializedName("damage_aquamancer")
    @Expose @Getter
    private long damageAquamancer;
    @SerializedName("heal_aquamancer")
    @Expose @Getter
    private long healAquamancer;
    @SerializedName("aquamancer_plays")
    @Expose @Getter
    private long aquamancerPlays;
    @SerializedName("damage_prevented_aquamancer")
    @Expose @Getter
    private long damagePreventedAquamancer;
    @SerializedName("wins_aquamancer")
    @Expose @Getter
    private long winsAquamancer;

}

