package com.kbrewster.hypixelapi.player.stats.uhc;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

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

    public String getEquippedKit() {
        return equippedKit;
    }

    public void setEquippedKit(String equippedKit) {
        this.equippedKit = equippedKit;
    }

    public long getHeadsEaten() {
        return headsEaten;
    }

    public void setHeadsEaten(long headsEaten) {
        this.headsEaten = headsEaten;
    }

    public long getKills() {
        return kills;
    }

    public void setKills(long kills) {
        this.kills = kills;
    }

    public List<String> getPackages() {
        return packages;
    }

    public void setPackages(List<String> packages) {
        this.packages = packages;
    }

    public long getPerkCookingLineA() {
        return perkCookingLineA;
    }

    public void setPerkCookingLineA(long perkCookingLineA) {
        this.perkCookingLineA = perkCookingLineA;
    }

    public long getPerkEnchantingLineA() {
        return perkEnchantingLineA;
    }

    public void setPerkEnchantingLineA(long perkEnchantingLineA) {
        this.perkEnchantingLineA = perkEnchantingLineA;
    }

    public long getPerkEnchantingLineB() {
        return perkEnchantingLineB;
    }

    public void setPerkEnchantingLineB(long perkEnchantingLineB) {
        this.perkEnchantingLineB = perkEnchantingLineB;
    }

    public long getPerkEngineeringLineA() {
        return perkEngineeringLineA;
    }

    public void setPerkEngineeringLineA(long perkEngineeringLineA) {
        this.perkEngineeringLineA = perkEngineeringLineA;
    }

    public long getPerkEngineeringLineB() {
        return perkEngineeringLineB;
    }

    public void setPerkEngineeringLineB(long perkEngineeringLineB) {
        this.perkEngineeringLineB = perkEngineeringLineB;
    }

    public long getPerkEngineeringLineC() {
        return perkEngineeringLineC;
    }

    public void setPerkEngineeringLineC(long perkEngineeringLineC) {
        this.perkEngineeringLineC = perkEngineeringLineC;
    }

    public long getPerkSurvivalismLineA() {
        return perkSurvivalismLineA;
    }

    public void setPerkSurvivalismLineA(long perkSurvivalismLineA) {
        this.perkSurvivalismLineA = perkSurvivalismLineA;
    }

    public long getScore() {
        return score;
    }

    public void setScore(long score) {
        this.score = score;
    }

    public long getPerkCookingLineC() {
        return perkCookingLineC;
    }

    public void setPerkCookingLineC(long perkCookingLineC) {
        this.perkCookingLineC = perkCookingLineC;
    }

    public long getPerkArmorsmithLineA() {
        return perkArmorsmithLineA;
    }

    public void setPerkArmorsmithLineA(long perkArmorsmithLineA) {
        this.perkArmorsmithLineA = perkArmorsmithLineA;
    }

    public long getPerkSurvivalismLineB() {
        return perkSurvivalismLineB;
    }

    public void setPerkSurvivalismLineB(long perkSurvivalismLineB) {
        this.perkSurvivalismLineB = perkSurvivalismLineB;
    }

    public long getPerkEnchantingLineC() {
        return perkEnchantingLineC;
    }

    public void setPerkEnchantingLineC(long perkEnchantingLineC) {
        this.perkEnchantingLineC = perkEnchantingLineC;
    }

    public long getPerkCookingLineB() {
        return perkCookingLineB;
    }

    public void setPerkCookingLineB(long perkCookingLineB) {
        this.perkCookingLineB = perkCookingLineB;
    }

    public long getPerkSurvivalismLineC() {
        return perkSurvivalismLineC;
    }

    public void setPerkSurvivalismLineC(long perkSurvivalismLineC) {
        this.perkSurvivalismLineC = perkSurvivalismLineC;
    }

    public long getPerkHunterLineA() {
        return perkHunterLineA;
    }

    public void setPerkHunterLineA(long perkHunterLineA) {
        this.perkHunterLineA = perkHunterLineA;
    }

    public long getWins() {
        return wins;
    }

    public void setWins(long wins) {
        this.wins = wins;
    }

    public long getPerkBloodcraftLineA() {
        return perkBloodcraftLineA;
    }

    public void setPerkBloodcraftLineA(long perkBloodcraftLineA) {
        this.perkBloodcraftLineA = perkBloodcraftLineA;
    }

    public long getPerkBloodcraftLineB() {
        return perkBloodcraftLineB;
    }

    public void setPerkBloodcraftLineB(long perkBloodcraftLineB) {
        this.perkBloodcraftLineB = perkBloodcraftLineB;
    }

    public long getPerkArmorsmithLineB() {
        return perkArmorsmithLineB;
    }

    public void setPerkArmorsmithLineB(long perkArmorsmithLineB) {
        this.perkArmorsmithLineB = perkArmorsmithLineB;
    }

    public long getPerkArmorsmithLineC() {
        return perkArmorsmithLineC;
    }

    public void setPerkArmorsmithLineC(long perkArmorsmithLineC) {
        this.perkArmorsmithLineC = perkArmorsmithLineC;
    }

    public long getPerkAlchemyLineA() {
        return perkAlchemyLineA;
    }

    public void setPerkAlchemyLineA(long perkAlchemyLineA) {
        this.perkAlchemyLineA = perkAlchemyLineA;
    }

    public long getPerkAlchemyLineC() {
        return perkAlchemyLineC;
    }

    public void setPerkAlchemyLineC(long perkAlchemyLineC) {
        this.perkAlchemyLineC = perkAlchemyLineC;
    }

    public long getPerkWeaponsmithLineA() {
        return perkWeaponsmithLineA;
    }

    public void setPerkWeaponsmithLineA(long perkWeaponsmithLineA) {
        this.perkWeaponsmithLineA = perkWeaponsmithLineA;
    }

    public long getPerkWeaponsmithLineC() {
        return perkWeaponsmithLineC;
    }

    public void setPerkWeaponsmithLineC(long perkWeaponsmithLineC) {
        this.perkWeaponsmithLineC = perkWeaponsmithLineC;
    }

    public long getPerkWeaponsmithLineB() {
        return perkWeaponsmithLineB;
    }

    public void setPerkWeaponsmithLineB(long perkWeaponsmithLineB) {
        this.perkWeaponsmithLineB = perkWeaponsmithLineB;
    }

    public long getPerkBloodcraftLineC() {
        return perkBloodcraftLineC;
    }

    public void setPerkBloodcraftLineC(long perkBloodcraftLineC) {
        this.perkBloodcraftLineC = perkBloodcraftLineC;
    }

    public long getMonthlyKillsa() {
        return monthlyKillsa;
    }

    public void setMonthlyKillsa(long monthlyKillsa) {
        this.monthlyKillsa = monthlyKillsa;
    }

    public long getMonthlyKillsb() {
        return monthlyKillsb;
    }

    public void setMonthlyKillsb(long monthlyKillsb) {
        this.monthlyKillsb = monthlyKillsb;
    }

    public long getPerkHunterLineB() {
        return perkHunterLineB;
    }

    public void setPerkHunterLineB(long perkHunterLineB) {
        this.perkHunterLineB = perkHunterLineB;
    }

    public boolean isCache3() {
        return cache3;
    }

    public void setCache3(boolean cache3) {
        this.cache3 = cache3;
    }

    public long getDeathsSolo() {
        return deathsSolo;
    }

    public void setDeathsSolo(long deathsSolo) {
        this.deathsSolo = deathsSolo;
    }

    public long getKillsSolo() {
        return killsSolo;
    }

    public void setKillsSolo(long killsSolo) {
        this.killsSolo = killsSolo;
    }

    public long getMonthlyKillsSoloB() {
        return monthlyKillsSoloB;
    }

    public void setMonthlyKillsSoloB(long monthlyKillsSoloB) {
        this.monthlyKillsSoloB = monthlyKillsSoloB;
    }

    public long getHeadsEatenSolo() {
        return headsEatenSolo;
    }

    public void setHeadsEatenSolo(long headsEatenSolo) {
        this.headsEatenSolo = headsEatenSolo;
    }

    public long getMonthlyKillsSoloA() {
        return monthlyKillsSoloA;
    }

    public void setMonthlyKillsSoloA(long monthlyKillsSoloA) {
        this.monthlyKillsSoloA = monthlyKillsSoloA;
    }

    public long getMonthlyKillsA() {
        return monthlyKillsA;
    }

    public void setMonthlyKillsA(long monthlyKillsA) {
        this.monthlyKillsA = monthlyKillsA;
    }

    public long getKitARCHERYTOOLS() {
        return kitARCHERYTOOLS;
    }

    public void setKitARCHERYTOOLS(long kitARCHERYTOOLS) {
        this.kitARCHERYTOOLS = kitARCHERYTOOLS;
    }

    public boolean isClearupAchievement() {
        return clearupAchievement;
    }

    public void setClearupAchievement(boolean clearupAchievement) {
        this.clearupAchievement = clearupAchievement;
    }

    public long getPerkAlchemyLineB() {
        return perkAlchemyLineB;
    }

    public void setPerkAlchemyLineB(long perkAlchemyLineB) {
        this.perkAlchemyLineB = perkAlchemyLineB;
    }

    public long getPerkEngineeringPrestige() {
        return perkEngineeringPrestige;
    }

    public void setPerkEngineeringPrestige(long perkEngineeringPrestige) {
        this.perkEngineeringPrestige = perkEngineeringPrestige;
    }

    public long getKitLOOTER() {
        return kitLOOTER;
    }

    public void setKitLOOTER(long kitLOOTER) {
        this.kitLOOTER = kitLOOTER;
    }

    public long getPerkHunterLineC() {
        return perkHunterLineC;
    }

    public void setPerkHunterLineC(long perkHunterLineC) {
        this.perkHunterLineC = perkHunterLineC;
    }

    public long getPerkToolsmithingLineA() {
        return perkToolsmithingLineA;
    }

    public void setPerkToolsmithingLineA(long perkToolsmithingLineA) {
        this.perkToolsmithingLineA = perkToolsmithingLineA;
    }

    public long getPerkToolsmithingLineB() {
        return perkToolsmithingLineB;
    }

    public void setPerkToolsmithingLineB(long perkToolsmithingLineB) {
        this.perkToolsmithingLineB = perkToolsmithingLineB;
    }

    public long getPerkApprenticeLineA() {
        return perkApprenticeLineA;
    }

    public void setPerkApprenticeLineA(long perkApprenticeLineA) {
        this.perkApprenticeLineA = perkApprenticeLineA;
    }

    public long getPerkApprenticeLineB() {
        return perkApprenticeLineB;
    }

    public void setPerkApprenticeLineB(long perkApprenticeLineB) {
        this.perkApprenticeLineB = perkApprenticeLineB;
    }

    public long getPerkApprenticeLineC() {
        return perkApprenticeLineC;
    }

    public void setPerkApprenticeLineC(long perkApprenticeLineC) {
        this.perkApprenticeLineC = perkApprenticeLineC;
    }

    public long getPerkToolsmithingLineC() {
        return perkToolsmithingLineC;
    }

    public void setPerkToolsmithingLineC(long perkToolsmithingLineC) {
        this.perkToolsmithingLineC = perkToolsmithingLineC;
    }

}

