package me.kbrewster.hypixelapi.player.stats.uhc;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.List;

@Getter
public class UHC {

    @SerializedName("coins")
    @Expose
    private long coins;
    @SerializedName("deaths")
    @Expose
    private long deaths;
    @SerializedName("equippedKit")
    @Expose
    private String equippedKit;
    @SerializedName("heads_eaten")
    @Expose
    private long headsEaten;
    @SerializedName("kills")
    @Expose
    private long kills;
    @SerializedName("packages")
    @Expose
    private List<String> packages = null;
    @SerializedName("perk_cooking_line_a")
    @Expose
    private long perkCookingLineA;
    @SerializedName("perk_enchanting_line_a")
    @Expose
    private long perkEnchantingLineA;
    @SerializedName("perk_enchanting_line_b")
    @Expose
    private long perkEnchantingLineB;
    @SerializedName("perk_engineering_line_a")
    @Expose
    private long perkEngineeringLineA;
    @SerializedName("perk_engineering_line_b")
    @Expose
    private long perkEngineeringLineB;
    @SerializedName("perk_engineering_line_c")
    @Expose
    private long perkEngineeringLineC;
    @SerializedName("perk_survivalism_line_a")
    @Expose
    private long perkSurvivalismLineA;
    @SerializedName("score")
    @Expose
    private long score;
    @SerializedName("perk_cooking_line_c")
    @Expose
    private long perkCookingLineC;
    @SerializedName("perk_armorsmith_line_a")
    @Expose
    private long perkArmorsmithLineA;
    @SerializedName("perk_survivalism_line_b")
    @Expose
    private long perkSurvivalismLineB;
    @SerializedName("perk_enchanting_line_c")
    @Expose
    private long perkEnchantingLineC;
    @SerializedName("perk_cooking_line_b")
    @Expose
    private long perkCookingLineB;
    @SerializedName("perk_survivalism_line_c")
    @Expose
    private long perkSurvivalismLineC;
    @SerializedName("perk_hunter_line_a")
    @Expose
    private long perkHunterLineA;
    @SerializedName("wins")
    @Expose
    private long wins;
    @SerializedName("perk_bloodcraft_line_a")
    @Expose
    private long perkBloodcraftLineA;
    @SerializedName("perk_bloodcraft_line_b")
    @Expose
    private long perkBloodcraftLineB;
    @SerializedName("perk_armorsmith_line_b")
    @Expose
    private long perkArmorsmithLineB;
    @SerializedName("perk_armorsmith_line_c")
    @Expose
    private long perkArmorsmithLineC;
    @SerializedName("perk_alchemy_line_a")
    @Expose
    private long perkAlchemyLineA;
    @SerializedName("perk_alchemy_line_c")
    @Expose
    private long perkAlchemyLineC;
    @SerializedName("perk_weaponsmith_line_a")
    @Expose
    private long perkWeaponsmithLineA;
    @SerializedName("perk_weaponsmith_line_c")
    @Expose
    private long perkWeaponsmithLineC;
    @SerializedName("perk_weaponsmith_line_b")
    @Expose
    private long perkWeaponsmithLineB;
    @SerializedName("perk_bloodcraft_line_c")
    @Expose
    private long perkBloodcraftLineC;
    @SerializedName("monthly_kills_a")
    @Expose
    private long monthlyKillsa;
    @SerializedName("monthly_kills_b")
    @Expose
    private long monthlyKillsb;
    @SerializedName("perk_hunter_line_b")
    @Expose
    private long perkHunterLineB;
    @SerializedName("cache3")
    @Expose
    private boolean cache3;
    @SerializedName("deaths_solo")
    @Expose
    private long deathsSolo;
    @SerializedName("kills_solo")
    @Expose
    private long killsSolo;
    @SerializedName("monthly_kills__solo_b")
    @Expose
    private long monthlyKillsSoloB;
    @SerializedName("heads_eaten_solo")
    @Expose
    private long headsEatenSolo;
    @SerializedName("monthly_kills__solo_a")
    @Expose
    private long monthlyKillsSoloA;
    @SerializedName("monthly_kills__a")
    @Expose
    private long monthlyKillsA;
    @SerializedName("kit_ARCHERY_TOOLS")
    @Expose
    private long kitARCHERYTOOLS;
    @SerializedName("clearup_achievement")
    @Expose
    private boolean clearupAchievement;
    @SerializedName("perk_alchemy_line_b")
    @Expose
    private long perkAlchemyLineB;
    @SerializedName("perk_engineering_prestige")
    @Expose
    private long perkEngineeringPrestige;
    @SerializedName("kit_LOOTER")
    @Expose
    private long kitLOOTER;
    @SerializedName("perk_hunter_line_c")
    @Expose
    private long perkHunterLineC;
    @SerializedName("perk_toolsmithing_line_a")
    @Expose
    private long perkToolsmithingLineA;
    @SerializedName("perk_toolsmithing_line_b")
    @Expose
    private long perkToolsmithingLineB;
    @SerializedName("perk_apprentice_line_a")
    @Expose
    private long perkApprenticeLineA;
    @SerializedName("perk_apprentice_line_b")
    @Expose
    private long perkApprenticeLineB;
    @SerializedName("perk_apprentice_line_c")
    @Expose
    private long perkApprenticeLineC;
    @SerializedName("perk_toolsmithing_line_c")
    @Expose
    private long perkToolsmithingLineC;

}

