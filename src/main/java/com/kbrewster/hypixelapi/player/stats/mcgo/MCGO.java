package com.kbrewster.hypixelapi.player.stats.mcgo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

public class MCGO {

    @SerializedName("body_armor_cost")
    @Expose @Getter
    private long bodyArmorCost;
    @SerializedName("bombs_defused")
    @Expose @Getter
    private long bombsDefused;
    @SerializedName("bombs_planted")
    @Expose @Getter
    private long bombsPlanted;
    @SerializedName("bounty_hunter")
    @Expose @Getter
    private long bountyHunter;
    @SerializedName("carbine_cost_reduction")
    @Expose @Getter
    private long carbineCostReduction;
    @SerializedName("carbine_damage_increase")
    @Expose @Getter
    private long carbineDamageIncrease;
    @SerializedName("carbine_recoil_reduction")
    @Expose @Getter
    private long carbineRecoilReduction;
    @SerializedName("carbine_reload_speed_reduction")
    @Expose @Getter
    private long carbineReloadSpeedReduction;
    @SerializedName("coins")
    @Expose @Getter
    private long coins;
    @SerializedName("cop_kills")
    @Expose @Getter
    private long copKills;
    @SerializedName("criminal_kills")
    @Expose @Getter
    private long criminalKills;
    @SerializedName("deaths")
    @Expose @Getter
    private long deaths;
    @SerializedName("game_wins")
    @Expose @Getter
    private long gameWins;
    @SerializedName("headshot_kills")
    @Expose @Getter
    private long headshotKills;
    @SerializedName("kills")
    @Expose @Getter
    private long kills;
    @SerializedName("killsNew")
    @Expose @Getter
    private long killsNew;
    @SerializedName("killsNew_10_2014")
    @Expose @Getter
    private long killsNew102014;
    @SerializedName("killsNew_11_2014")
    @Expose @Getter
    private long killsNew112014;
    @SerializedName("killsNew_1_11_2014")
    @Expose @Getter
    private long killsNew1112014;
    @SerializedName("killsNew_2_11_2014")
    @Expose @Getter
    private long killsNew2112014;
    @SerializedName("killsNew_3_11_2014")
    @Expose @Getter
    private long killsNew3112014;
    @SerializedName("killsNew_4_10_2014")
    @Expose @Getter
    private long killsNew4102014;
    @SerializedName("killsNew_4_11_2014")
    @Expose @Getter
    private long killsNew4112014;
    @SerializedName("killsNew_5_10_2014")
    @Expose @Getter
    private long killsNew5102014;
    @SerializedName("killsNew_5_11_2014")
    @Expose @Getter
    private long killsNew5112014;
    @SerializedName("kills_10_2014")
    @Expose @Getter
    private long kills102014;
    @SerializedName("kills_11_2014")
    @Expose @Getter
    private long kills112014;
    @SerializedName("kills_1_11_2014")
    @Expose @Getter
    private long kills1112014;
    @SerializedName("kills_2_11_2014")
    @Expose @Getter
    private long kills2112014;
    @SerializedName("kills_3_10_2014")
    @Expose @Getter
    private long kills3102014;
    @SerializedName("kills_3_11_2014")
    @Expose @Getter
    private long kills3112014;
    @SerializedName("kills_4_10_2014")
    @Expose @Getter
    private long kills4102014;
    @SerializedName("kills_4_11_2014")
    @Expose @Getter
    private long kills4112014;
    @SerializedName("kills_5_10_2014")
    @Expose @Getter
    private long kills5102014;
    @SerializedName("kills_5_11_2014")
    @Expose @Getter
    private long kills5112014;
    @SerializedName("knife_attack_delay")
    @Expose @Getter
    private long knifeAttackDelay;
    @SerializedName("knife_damage_increase")
    @Expose @Getter
    private long knifeDamageIncrease;
    @SerializedName("magnum_cost_reduction")
    @Expose @Getter
    private long magnumCostReduction;
    @SerializedName("magnum_damage_increase")
    @Expose @Getter
    private long magnumDamageIncrease;
    @SerializedName("magnum_recoil_reduction")
    @Expose @Getter
    private long magnumRecoilReduction;
    @SerializedName("magnum_reload_speed_reduction")
    @Expose @Getter
    private long magnumReloadSpeedReduction;
    @SerializedName("packages")
    @Expose @Getter
    private List<String> packages = null;
    @SerializedName("pistol_damage_increase")
    @Expose @Getter
    private long pistolDamageIncrease;
    @SerializedName("pistol_recoil_reduction")
    @Expose @Getter
    private long pistolRecoilReduction;
    @SerializedName("pistol_reload_speed_reduction")
    @Expose @Getter
    private long pistolReloadSpeedReduction;
    @SerializedName("pocket_change")
    @Expose @Getter
    private long pocketChange;
    @SerializedName("rifle_cost_reduction")
    @Expose @Getter
    private long rifleCostReduction;
    @SerializedName("rifle_damage_increase")
    @Expose @Getter
    private long rifleDamageIncrease;
    @SerializedName("rifle_recoil_reduction")
    @Expose @Getter
    private long rifleRecoilReduction;
    @SerializedName("rifle_reload_speed_reduction")
    @Expose @Getter
    private long rifleReloadSpeedReduction;
    @SerializedName("round_wins")
    @Expose @Getter
    private long roundWins;
    @SerializedName("selectedCarbineDev")
    @Expose @Getter
    private String selectedCarbineDev;
    @SerializedName("selectedCreeperChestplateDev")
    @Expose @Getter
    private String selectedCreeperChestplateDev;
    @SerializedName("selectedCreeperHelmetDev")
    @Expose @Getter
    private String selectedCreeperHelmetDev;
    @SerializedName("selectedKnifeDev")
    @Expose @Getter
    private String selectedKnifeDev;
    @SerializedName("selectedMagnumDev")
    @Expose @Getter
    private String selectedMagnumDev;
    @SerializedName("selectedOcelotChestplateDev")
    @Expose @Getter
    private String selectedOcelotChestplateDev;
    @SerializedName("selectedOcelotHelmetDev")
    @Expose @Getter
    private String selectedOcelotHelmetDev;
    @SerializedName("selectedPistolDev")
    @Expose @Getter
    private String selectedPistolDev;
    @SerializedName("selectedRifleDev")
    @Expose @Getter
    private String selectedRifleDev;
    @SerializedName("selectedShotgunDev")
    @Expose @Getter
    private String selectedShotgunDev;
    @SerializedName("selectedSmgDev")
    @Expose @Getter
    private String selectedSmgDev;
    @SerializedName("shotgun_cost_reduction")
    @Expose @Getter
    private long shotgunCostReduction;
    @SerializedName("shotgun_damage_increase")
    @Expose @Getter
    private long shotgunDamageIncrease;
    @SerializedName("shotgun_recoil_reduction")
    @Expose @Getter
    private long shotgunRecoilReduction;
    @SerializedName("shotgun_reload_speed_reduction")
    @Expose @Getter
    private long shotgunReloadSpeedReduction;
    @SerializedName("shots_fired")
    @Expose @Getter
    private long shotsFired;
    @SerializedName("smg_cost_reduction")
    @Expose @Getter
    private long smgCostReduction;
    @SerializedName("smg_damage_increase")
    @Expose @Getter
    private long smgDamageIncrease;
    @SerializedName("smg_recoil_reduction")
    @Expose @Getter
    private long smgRecoilReduction;
    @SerializedName("smg_reload_speed_reduction")
    @Expose @Getter
    private long smgReloadSpeedReduction;
    @SerializedName("sniper_charge_bonus")
    @Expose @Getter
    private long sniperChargeBonus;
    @SerializedName("sniper_cost_reduction")
    @Expose @Getter
    private long sniperCostReduction;
    @SerializedName("sniper_damage_increase")
    @Expose @Getter
    private long sniperDamageIncrease;
    @SerializedName("sniper_reload_speed_reduction")
    @Expose @Getter
    private long sniperReloadSpeedReduction;
    @SerializedName("strength_training")
    @Expose @Getter
    private long strengthTraining;
    @SerializedName("weekly_kills_b")
    @Expose @Getter
    private long weeklyKillsB;
    @SerializedName("monthly_kills_b")
    @Expose @Getter
    private long monthlyKillsB;
    @SerializedName("monthly_kills_a")
    @Expose @Getter
    private long monthlyKillsA;
    @SerializedName("game_wins_sandstorm")
    @Expose @Getter
    private long gameWinsSandstorm;
    @SerializedName("game_wins_temple")
    @Expose @Getter
    private long gameWinsTemple;
    @SerializedName("game_wins_overgrown")
    @Expose @Getter
    private long gameWinsOvergrown;
    @SerializedName("weekly_kills_a")
    @Expose @Getter
    private long weeklyKillsA;
    @SerializedName("game_wins_atomic")
    @Expose @Getter
    private long gameWinsAtomic;
    @SerializedName("game_wins_carrier")
    @Expose @Getter
    private long gameWinsCarrier;
    @SerializedName("deaths_deathmatch")
    @Expose @Getter
    private long deathsDeathmatch;
    @SerializedName("game_wins_deathmatch")
    @Expose @Getter
    private long gameWinsDeathmatch;
    @SerializedName("cop_kills_deathmatch")
    @Expose @Getter
    private long copKillsDeathmatch;
    @SerializedName("kills_deathmatch")
    @Expose @Getter
    private long killsDeathmatch;
    @SerializedName("criminal_kills_deathmatch")
    @Expose @Getter
    private long criminalKillsDeathmatch;
    @SerializedName("game_wins_alleyway")
    @Expose @Getter
    private long gameWinsAlleyway;
    @SerializedName("show_lobby_prefix")
    @Expose @Getter
    private boolean showLobbyPrefix;
    @SerializedName("selected_lobby_prefix")
    @Expose @Getter
    private String selectedLobbyPrefix;
    @SerializedName("game_wins_reserve")
    @Expose @Getter
    private long gameWinsReserve;
    
}
