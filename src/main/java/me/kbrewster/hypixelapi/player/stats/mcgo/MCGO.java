package me.kbrewster.hypixelapi.player.stats.mcgo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.List;

@Getter
public class MCGO {

    @SerializedName("body_armor_cost")
    @Expose 
    private long bodyArmorCost;
    @SerializedName("bombs_defused")
    @Expose 
    private long bombsDefused;
    @SerializedName("bombs_planted")
    @Expose 
    private long bombsPlanted;
    @SerializedName("bounty_hunter")
    @Expose 
    private long bountyHunter;
    @SerializedName("carbine_cost_reduction")
    @Expose 
    private long carbineCostReduction;
    @SerializedName("carbine_damage_increase")
    @Expose 
    private long carbineDamageIncrease;
    @SerializedName("carbine_recoil_reduction")
    @Expose 
    private long carbineRecoilReduction;
    @SerializedName("carbine_reload_speed_reduction")
    @Expose 
    private long carbineReloadSpeedReduction;
    @SerializedName("coins")
    @Expose 
    private long coins;
    @SerializedName("cop_kills")
    @Expose 
    private long copKills;
    @SerializedName("criminal_kills")
    @Expose 
    private long criminalKills;
    @SerializedName("deaths")
    @Expose 
    private long deaths;
    @SerializedName("game_wins")
    @Expose 
    private long gameWins;
    @SerializedName("headshot_kills")
    @Expose 
    private long headshotKills;
    @SerializedName("kills")
    @Expose 
    private long kills;
    @SerializedName("killsNew")
    @Expose 
    private long killsNew;
    @SerializedName("killsNew_10_2014")
    @Expose 
    private long killsNew102014;
    @SerializedName("killsNew_11_2014")
    @Expose 
    private long killsNew112014;
    @SerializedName("killsNew_1_11_2014")
    @Expose 
    private long killsNew1112014;
    @SerializedName("killsNew_2_11_2014")
    @Expose 
    private long killsNew2112014;
    @SerializedName("killsNew_3_11_2014")
    @Expose 
    private long killsNew3112014;
    @SerializedName("killsNew_4_10_2014")
    @Expose 
    private long killsNew4102014;
    @SerializedName("killsNew_4_11_2014")
    @Expose 
    private long killsNew4112014;
    @SerializedName("killsNew_5_10_2014")
    @Expose 
    private long killsNew5102014;
    @SerializedName("killsNew_5_11_2014")
    @Expose 
    private long killsNew5112014;
    @SerializedName("kills_10_2014")
    @Expose 
    private long kills102014;
    @SerializedName("kills_11_2014")
    @Expose 
    private long kills112014;
    @SerializedName("kills_1_11_2014")
    @Expose 
    private long kills1112014;
    @SerializedName("kills_2_11_2014")
    @Expose 
    private long kills2112014;
    @SerializedName("kills_3_10_2014")
    @Expose 
    private long kills3102014;
    @SerializedName("kills_3_11_2014")
    @Expose 
    private long kills3112014;
    @SerializedName("kills_4_10_2014")
    @Expose 
    private long kills4102014;
    @SerializedName("kills_4_11_2014")
    @Expose 
    private long kills4112014;
    @SerializedName("kills_5_10_2014")
    @Expose 
    private long kills5102014;
    @SerializedName("kills_5_11_2014")
    @Expose 
    private long kills5112014;
    @SerializedName("knife_attack_delay")
    @Expose 
    private long knifeAttackDelay;
    @SerializedName("knife_damage_increase")
    @Expose 
    private long knifeDamageIncrease;
    @SerializedName("magnum_cost_reduction")
    @Expose 
    private long magnumCostReduction;
    @SerializedName("magnum_damage_increase")
    @Expose 
    private long magnumDamageIncrease;
    @SerializedName("magnum_recoil_reduction")
    @Expose 
    private long magnumRecoilReduction;
    @SerializedName("magnum_reload_speed_reduction")
    @Expose 
    private long magnumReloadSpeedReduction;
    @SerializedName("packages")
    @Expose 
    private List<String> packages = null;
    @SerializedName("pistol_damage_increase")
    @Expose 
    private long pistolDamageIncrease;
    @SerializedName("pistol_recoil_reduction")
    @Expose 
    private long pistolRecoilReduction;
    @SerializedName("pistol_reload_speed_reduction")
    @Expose 
    private long pistolReloadSpeedReduction;
    @SerializedName("pocket_change")
    @Expose 
    private long pocketChange;
    @SerializedName("rifle_cost_reduction")
    @Expose 
    private long rifleCostReduction;
    @SerializedName("rifle_damage_increase")
    @Expose 
    private long rifleDamageIncrease;
    @SerializedName("rifle_recoil_reduction")
    @Expose 
    private long rifleRecoilReduction;
    @SerializedName("rifle_reload_speed_reduction")
    @Expose 
    private long rifleReloadSpeedReduction;
    @SerializedName("round_wins")
    @Expose 
    private long roundWins;
    @SerializedName("selectedCarbineDev")
    @Expose 
    private String selectedCarbineDev;
    @SerializedName("selectedCreeperChestplateDev")
    @Expose 
    private String selectedCreeperChestplateDev;
    @SerializedName("selectedCreeperHelmetDev")
    @Expose 
    private String selectedCreeperHelmetDev;
    @SerializedName("selectedKnifeDev")
    @Expose 
    private String selectedKnifeDev;
    @SerializedName("selectedMagnumDev")
    @Expose 
    private String selectedMagnumDev;
    @SerializedName("selectedOcelotChestplateDev")
    @Expose 
    private String selectedOcelotChestplateDev;
    @SerializedName("selectedOcelotHelmetDev")
    @Expose 
    private String selectedOcelotHelmetDev;
    @SerializedName("selectedPistolDev")
    @Expose 
    private String selectedPistolDev;
    @SerializedName("selectedRifleDev")
    @Expose 
    private String selectedRifleDev;
    @SerializedName("selectedShotgunDev")
    @Expose 
    private String selectedShotgunDev;
    @SerializedName("selectedSmgDev")
    @Expose 
    private String selectedSmgDev;
    @SerializedName("shotgun_cost_reduction")
    @Expose 
    private long shotgunCostReduction;
    @SerializedName("shotgun_damage_increase")
    @Expose 
    private long shotgunDamageIncrease;
    @SerializedName("shotgun_recoil_reduction")
    @Expose 
    private long shotgunRecoilReduction;
    @SerializedName("shotgun_reload_speed_reduction")
    @Expose 
    private long shotgunReloadSpeedReduction;
    @SerializedName("shots_fired")
    @Expose 
    private long shotsFired;
    @SerializedName("smg_cost_reduction")
    @Expose 
    private long smgCostReduction;
    @SerializedName("smg_damage_increase")
    @Expose 
    private long smgDamageIncrease;
    @SerializedName("smg_recoil_reduction")
    @Expose 
    private long smgRecoilReduction;
    @SerializedName("smg_reload_speed_reduction")
    @Expose 
    private long smgReloadSpeedReduction;
    @SerializedName("sniper_charge_bonus")
    @Expose 
    private long sniperChargeBonus;
    @SerializedName("sniper_cost_reduction")
    @Expose 
    private long sniperCostReduction;
    @SerializedName("sniper_damage_increase")
    @Expose 
    private long sniperDamageIncrease;
    @SerializedName("sniper_reload_speed_reduction")
    @Expose 
    private long sniperReloadSpeedReduction;
    @SerializedName("strength_training")
    @Expose 
    private long strengthTraining;
    @SerializedName("weekly_kills_b")
    @Expose 
    private long weeklyKillsB;
    @SerializedName("monthly_kills_b")
    @Expose 
    private long monthlyKillsB;
    @SerializedName("monthly_kills_a")
    @Expose 
    private long monthlyKillsA;
    @SerializedName("game_wins_sandstorm")
    @Expose 
    private long gameWinsSandstorm;
    @SerializedName("game_wins_temple")
    @Expose 
    private long gameWinsTemple;
    @SerializedName("game_wins_overgrown")
    @Expose 
    private long gameWinsOvergrown;
    @SerializedName("weekly_kills_a")
    @Expose 
    private long weeklyKillsA;
    @SerializedName("game_wins_atomic")
    @Expose 
    private long gameWinsAtomic;
    @SerializedName("game_wins_carrier")
    @Expose 
    private long gameWinsCarrier;
    @SerializedName("deaths_deathmatch")
    @Expose 
    private long deathsDeathmatch;
    @SerializedName("game_wins_deathmatch")
    @Expose 
    private long gameWinsDeathmatch;
    @SerializedName("cop_kills_deathmatch")
    @Expose 
    private long copKillsDeathmatch;
    @SerializedName("kills_deathmatch")
    @Expose 
    private long killsDeathmatch;
    @SerializedName("criminal_kills_deathmatch")
    @Expose 
    private long criminalKillsDeathmatch;
    @SerializedName("game_wins_alleyway")
    @Expose 
    private long gameWinsAlleyway;
    @SerializedName("show_lobby_prefix")
    @Expose 
    private boolean showLobbyPrefix;
    @SerializedName("selected_lobby_prefix")
    @Expose 
    private String selectedLobbyPrefix;
    @SerializedName("game_wins_reserve")
    @Expose 
    private long gameWinsReserve;
    
}
