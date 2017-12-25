package me.kbrewster.hypixelapi.player.stats.battlegrounds;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.List;

@Getter
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

}

