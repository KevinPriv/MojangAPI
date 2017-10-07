package com.kbrewster.hypixelapi.player.stats.uhc;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

public class UHC {

    @SerializedName("coins")
    @Expose @Getter
    private long coins;
    @SerializedName("deaths")
    @Expose @Getter
    private long deaths;
    @SerializedName("equippedKit")
    @Expose @Getter
    private String equippedKit;
    @SerializedName("heads_eaten")
    @Expose @Getter
    private long headsEaten;
    @SerializedName("kills")
    @Expose @Getter
    private long kills;
    @SerializedName("packages")
    @Expose @Getter
    private List<String> packages = null;
    @SerializedName("perk_cooking_line_a")
    @Expose @Getter
    private long perkCookingLineA;
    @SerializedName("perk_enchanting_line_a")
    @Expose @Getter
    private long perkEnchantingLineA;
    @SerializedName("perk_enchanting_line_b")
    @Expose @Getter
    private long perkEnchantingLineB;
    @SerializedName("perk_engineering_line_a")
    @Expose @Getter
    private long perkEngineeringLineA;
    @SerializedName("perk_engineering_line_b")
    @Expose @Getter
    private long perkEngineeringLineB;
    @SerializedName("perk_engineering_line_c")
    @Expose @Getter
    private long perkEngineeringLineC;
    @SerializedName("perk_survivalism_line_a")
    @Expose @Getter
    private long perkSurvivalismLineA;
    @SerializedName("score")
    @Expose @Getter
    private long score;
    @SerializedName("perk_cooking_line_c")
    @Expose @Getter
    private long perkCookingLineC;
    @SerializedName("perk_armorsmith_line_a")
    @Expose @Getter
    private long perkArmorsmithLineA;
    @SerializedName("perk_survivalism_line_b")
    @Expose @Getter
    private long perkSurvivalismLineB;
    @SerializedName("perk_enchanting_line_c")
    @Expose @Getter
    private long perkEnchantingLineC;
    @SerializedName("perk_cooking_line_b")
    @Expose @Getter
    private long perkCookingLineB;
    @SerializedName("perk_survivalism_line_c")
    @Expose @Getter
    private long perkSurvivalismLineC;
    @SerializedName("perk_hunter_line_a")
    @Expose @Getter
    private long perkHunterLineA;
    @SerializedName("wins")
    @Expose @Getter
    private long wins;
    @SerializedName("perk_bloodcraft_line_a")
    @Expose @Getter
    private long perkBloodcraftLineA;
    @SerializedName("perk_bloodcraft_line_b")
    @Expose @Getter
    private long perkBloodcraftLineB;
    @SerializedName("perk_armorsmith_line_b")
    @Expose @Getter
    private long perkArmorsmithLineB;
    @SerializedName("perk_armorsmith_line_c")
    @Expose @Getter
    private long perkArmorsmithLineC;
    @SerializedName("perk_alchemy_line_a")
    @Expose @Getter
    private long perkAlchemyLineA;
    @SerializedName("perk_alchemy_line_c")
    @Expose @Getter
    private long perkAlchemyLineC;
    @SerializedName("perk_weaponsmith_line_a")
    @Expose @Getter
    private long perkWeaponsmithLineA;
    @SerializedName("perk_weaponsmith_line_c")
    @Expose @Getter
    private long perkWeaponsmithLineC;
    @SerializedName("perk_weaponsmith_line_b")
    @Expose @Getter
    private long perkWeaponsmithLineB;
    @SerializedName("perk_bloodcraft_line_c")
    @Expose @Getter
    private long perkBloodcraftLineC;
    @SerializedName("monthly_kills_a")
    @Expose @Getter
    private long monthlyKillsa;
    @SerializedName("monthly_kills_b")
    @Expose @Getter
    private long monthlyKillsb;
    @SerializedName("perk_hunter_line_b")
    @Expose @Getter
    private long perkHunterLineB;
    @SerializedName("cache3")
    @Expose @Getter
    private boolean cache3;
    @SerializedName("deaths_solo")
    @Expose @Getter
    private long deathsSolo;
    @SerializedName("kills_solo")
    @Expose @Getter
    private long killsSolo;
    @SerializedName("monthly_kills__solo_b")
    @Expose @Getter
    private long monthlyKillsSoloB;
    @SerializedName("heads_eaten_solo")
    @Expose @Getter
    private long headsEatenSolo;
    @SerializedName("monthly_kills__solo_a")
    @Expose @Getter
    private long monthlyKillsSoloA;
    @SerializedName("monthly_kills__a")
    @Expose @Getter
    private long monthlyKillsA;
    @SerializedName("kit_ARCHERY_TOOLS")
    @Expose @Getter
    private long kitARCHERYTOOLS;
    @SerializedName("clearup_achievement")
    @Expose @Getter
    private boolean clearupAchievement;
    @SerializedName("perk_alchemy_line_b")
    @Expose @Getter
    private long perkAlchemyLineB;
    @SerializedName("perk_engineering_prestige")
    @Expose @Getter
    private long perkEngineeringPrestige;
    @SerializedName("kit_LOOTER")
    @Expose @Getter
    private long kitLOOTER;
    @SerializedName("perk_hunter_line_c")
    @Expose @Getter
    private long perkHunterLineC;
    @SerializedName("perk_toolsmithing_line_a")
    @Expose @Getter
    private long perkToolsmithingLineA;
    @SerializedName("perk_toolsmithing_line_b")
    @Expose @Getter
    private long perkToolsmithingLineB;
    @SerializedName("perk_apprentice_line_a")
    @Expose @Getter
    private long perkApprenticeLineA;
    @SerializedName("perk_apprentice_line_b")
    @Expose @Getter
    private long perkApprenticeLineB;
    @SerializedName("perk_apprentice_line_c")
    @Expose @Getter
    private long perkApprenticeLineC;
    @SerializedName("perk_toolsmithing_line_c")
    @Expose @Getter
    private long perkToolsmithingLineC;

}

