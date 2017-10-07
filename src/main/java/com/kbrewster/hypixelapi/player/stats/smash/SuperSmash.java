package com.kbrewster.hypixelapi.player.stats.smash;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class SuperSmash {

    @SerializedName("smashLevel")
    @Expose
    public long smashLevel;
    @SerializedName("lastLevel_THE_BULK")
    @Expose
    public long lastLevelTHEBULK;
    @SerializedName("active_class")
    @Expose
    public String activeClass;
    @SerializedName("lastLevel_GENERAL_CLUCK")
    @Expose
    public long lastLevelGENERALCLUCK;
    @SerializedName("win_streak")
    @Expose
    public long winStreak;
    @SerializedName("class_stats")
    @Expose
    public ClassStats classStats;
    @SerializedName("damage_dealt")
    @Expose
    public long damageDealt;
    @SerializedName("coins")
    @Expose
    public long coins;
    @SerializedName("losses_weekly_a")
    @Expose
    public long lossesWeeklyA;
    @SerializedName("games_weekly_a")
    @Expose
    public long gamesWeeklyA;
    @SerializedName("losses_monthly_b")
    @Expose
    public long lossesMonthlyB;
    @SerializedName("losses")
    @Expose
    public long losses;
    @SerializedName("games_monthly_b")
    @Expose
    public long gamesMonthlyB;
    @SerializedName("smashed_normal")
    @Expose
    public long smashedNormal;
    @SerializedName("quits")
    @Expose
    public long quits;
    @SerializedName("deaths_normal")
    @Expose
    public long deathsNormal;
    @SerializedName("games_normal")
    @Expose
    public long gamesNormal;
    @SerializedName("losses_normal")
    @Expose
    public long lossesNormal;
    @SerializedName("smashed")
    @Expose
    public long smashed;
    @SerializedName("deaths")
    @Expose
    public long deaths;
    @SerializedName("games")
    @Expose
    public long games;
    @SerializedName("damage_dealt_normal")
    @Expose
    public long damageDealtNormal;
    @SerializedName("smasher")
    @Expose
    public long smasher;
    @SerializedName("kills_monthly_b")
    @Expose
    public long killsMonthlyB;
    @SerializedName("smasher_normal")
    @Expose
    public long smasherNormal;
    @SerializedName("kills")
    @Expose
    public long kills;
    @SerializedName("kills_weekly_a")
    @Expose
    public long killsWeeklyA;
    @SerializedName("kills_normal")
    @Expose
    public long killsNormal;
    @SerializedName("xp_GENERAL_CLUCK")
    @Expose
    public long xpGENERALCLUCK;
    @SerializedName("smash_level_total")
    @Expose
    public long smashLevelTotal;
    @SerializedName("wins_normal")
    @Expose
    public long winsNormal;
    @SerializedName("wins")
    @Expose
    public long wins;
    @SerializedName("wins_weekly_a")
    @Expose
    public long winsWeeklyA;
    @SerializedName("wins_monthly_b")
    @Expose
    public long winsMonthlyB;
    @SerializedName("xp_BOTMUN")
    @Expose
    public long xpBOTMUN;
    @SerializedName("lastLevel_BOTMUN")
    @Expose
    public long lastLevelBOTMUN;
    @SerializedName("xp_THE_BULK")
    @Expose
    public long xpTHEBULK;
    @SerializedName("lastLevel_CAKE_MONSTER")
    @Expose
    public long lastLevelCAKEMONSTER;
    @SerializedName("damage_dealt_teams")
    @Expose
    public long damageDealtTeams;
    @SerializedName("losses_teams")
    @Expose
    public long lossesTeams;
    @SerializedName("games_teams")
    @Expose
    public long gamesTeams;
    @SerializedName("kills_teams")
    @Expose
    public long killsTeams;
    @SerializedName("smasher_teams")
    @Expose
    public long smasherTeams;
    @SerializedName("deaths_teams")
    @Expose
    public long deathsTeams;
    @SerializedName("wins_teams")
    @Expose
    public long winsTeams;
    @SerializedName("smashed_teams")
    @Expose
    public long smashedTeams;
    @SerializedName("lastLevel_MARAUDER")
    @Expose
    public long lastLevelMARAUDER;
    @SerializedName("xp_MARAUDER")
    @Expose
    public long xpMARAUDER;
    @SerializedName("deaths_2v2")
    @Expose
    public long deaths2v2;
    @SerializedName("losses_2v2")
    @Expose
    public long losses2v2;
    @SerializedName("games_2v2")
    @Expose
    public long games2v2;
    @SerializedName("smashed_2v2")
    @Expose
    public long smashed2v2;
    @SerializedName("damage_dealt_2v2")
    @Expose
    public long damageDealt2v2;
    @SerializedName("wins_2v2")
    @Expose
    public long wins2v2;
    @SerializedName("kills_2v2")
    @Expose
    public long kills2v2;
    @SerializedName("smasher_2v2")
    @Expose
    public long smasher2v2;
    @SerializedName("games_weekly_b")
    @Expose
    public long gamesWeeklyB;
    @SerializedName("kills_weekly_b")
    @Expose
    public long killsWeeklyB;
    @SerializedName("wins_weekly_b")
    @Expose
    public long winsWeeklyB;
    @SerializedName("losses_weekly_b")
    @Expose
    public long lossesWeeklyB;
    @SerializedName("expBooster_purchases_10_plays")
    @Expose
    public long expBoosterPurchases10Plays;
    @SerializedName("xp_CAKE_MONSTER")
    @Expose
    public long xpCAKEMONSTER;
    @SerializedName("expired_booster")
    @Expose
    public boolean expiredBooster;
    @SerializedName("xp_SPODERMAN")
    @Expose
    public long xpSPODERMAN;
    @SerializedName("lastLevel_SPODERMAN")
    @Expose
    public long lastLevelSPODERMAN;
    @SerializedName("FRIENDS_gamesDay")
    @Expose
    public long fRIENDSGamesDay;
    @SerializedName("FRIENDS_firstGame")
    @Expose
    public long fRIENDSFirstGame;
    @SerializedName("friend_losses")
    @Expose
    public long friendLosses;
    @SerializedName("friend_wins")
    @Expose
    public long friendWins;
    @SerializedName("friend_wins_normal")
    @Expose
    public long friendWinsNormal;
    @SerializedName("assists")
    @Expose
    public long assists;
    @SerializedName("assists_normal")
    @Expose
    public long assistsNormal;
    @SerializedName("friend_losses_normal")
    @Expose
    public long friendLossesNormal;
    @SerializedName("xp_GOKU")
    @Expose
    public long xpGOKU;
    @SerializedName("lastLevel_GOKU")
    @Expose
    public long lastLevelGOKU;
    @SerializedName("xp_TINMAN")
    @Expose
    public long xpTINMAN;
    @SerializedName("lastLevel_TINMAN")
    @Expose
    public long lastLevelTINMAN;
    @SerializedName("xp_FROSTY")
    @Expose
    public long xpFROSTY;
    @SerializedName("lastLevel_FROSTY")
    @Expose
    public long lastLevelFROSTY;
    @SerializedName("xp_DUSK_CRAWLER")
    @Expose
    public long xpDUSKCRAWLER;
    @SerializedName("lastLevel_DUSK_CRAWLER")
    @Expose
    public long lastLevelDUSKCRAWLER;
    @SerializedName("pg_DUSK_CRAWLER")
    @Expose
    public long pgDUSKCRAWLER;
    @SerializedName("expBooster_purchases_30_plays")
    @Expose
    public long expBoosterPurchases30Plays;
    @SerializedName("games_monthly_a")
    @Expose
    public long gamesMonthlyA;
    @SerializedName("kills_monthly_a")
    @Expose
    public long killsMonthlyA;
    @SerializedName("wins_monthly_a")
    @Expose
    public long winsMonthlyA;
    @SerializedName("losses_monthly_a")
    @Expose
    public long lossesMonthlyA;
    @SerializedName("expBooster_purchases_100_plays")
    @Expose
    public long expBoosterPurchases100Plays;
    @SerializedName("pg_TINMAN")
    @Expose
    public long pgTINMAN;
    @SerializedName("votes_Grove")
    @Expose
    public long votesGrove;
    @SerializedName("votes_Cogsworth")
    @Expose
    public long votesCogsworth;
    @SerializedName("votes_Equinox")
    @Expose
    public long votesEquinox;
    @SerializedName("votes_Swift")
    @Expose
    public long votesSwift;
    @SerializedName("votes_Mosaic")
    @Expose
    public long votesMosaic;
    @SerializedName("votes_Dojo")
    @Expose
    public long votesDojo;
    @SerializedName("votes_Bawk")
    @Expose
    public long votesBawk;
    @SerializedName("votes_Strawberry Towers")
    @Expose
    public long votesStrawberryTowers;
    @SerializedName("votes_Cobalt")
    @Expose
    public long votesCobalt;
    @SerializedName("masterArmor_TINMAN")
    @Expose
    public boolean masterArmorTINMAN;
    @SerializedName("pg_GENERAL_CLUCK")
    @Expose
    public long pgGENERALCLUCK;
    @SerializedName("pg_GOKU")
    @Expose
    public long pgGOKU;
    @SerializedName("xp_PUG")
    @Expose
    public long xpPUG;
    @SerializedName("lastLevel_PUG")
    @Expose
    public long lastLevelPUG;
    @SerializedName("xp_SKULLFIRE")
    @Expose
    public long xpSKULLFIRE;
    @SerializedName("lastLevel_SKULLFIRE")
    @Expose
    public long lastLevelSKULLFIRE;
    @SerializedName("lastLevel_SERGEANT_SHIELD")
    @Expose
    public long lastLevelSERGEANTSHIELD;
    @SerializedName("xp_SERGEANT_SHIELD")
    @Expose
    public long xpSERGEANTSHIELD;
    @SerializedName("xp_SANIC")
    @Expose
    public long xpSANIC;
    @SerializedName("lastLevel_SANIC")
    @Expose
    public long lastLevelSANIC;
    @SerializedName("expBooster_purchases_50_plays")
    @Expose
    public long expBoosterPurchases50Plays;
    @SerializedName("pg_SANIC")
    @Expose
    public long pgSANIC;
    @SerializedName("combatTracker")
    @Expose
    public boolean combatTracker;
    @SerializedName("lastLevel_SHOOP_DA_WHOOP")
    @Expose
    public long lastLevelSHOOPDAWHOOP;
    @SerializedName("xp_SHOOP_DA_WHOOP")
    @Expose
    public long xpSHOOPDAWHOOP;
    @SerializedName("packages")
    @Expose
    public List<Object> packages = null;
    @SerializedName("pg_SHOOP_DA_WHOOP")
    @Expose
    public long pgSHOOPDAWHOOP;
    @SerializedName("pg_FROSTY")
    @Expose
    public long pgFROSTY;
    @SerializedName("lastLevel_GREEN_HOOD")
    @Expose
    public long lastLevelGREENHOOD;
    @SerializedName("xp_GREEN_HOOD")
    @Expose
    public long xpGREENHOOD;
    @SerializedName("pg_THE_BULK")
    @Expose
    public long pgTHEBULK;
    @SerializedName("pg_BOTMUN")
    @Expose
    public long pgBOTMUN;
    @SerializedName("pg_MARAUDER")
    @Expose
    public long pgMARAUDER;
    @SerializedName("pg_SPODERMAN")
    @Expose
    public long pgSPODERMAN;
    @SerializedName("pg_PUG")
    @Expose
    public long pgPUG;
    @SerializedName("pg_SKULLFIRE")
    @Expose
    public long pgSKULLFIRE;
    @SerializedName("pg_CAKE_MONSTER")
    @Expose
    public long pgCAKEMONSTER;
    @SerializedName("pg_SERGEANT_SHIELD")
    @Expose
    public long pgSERGEANTSHIELD;
    @SerializedName("pg_GREEN_HOOD")
    @Expose
    public long pgGREENHOOD;
    @SerializedName("votes_Remains")
    @Expose
    public long votesRemains;
    @SerializedName("votes_Luxor")
    @Expose
    public long votesLuxor;
    @SerializedName("votes_Harmony")
    @Expose
    public long votesHarmony;
    @SerializedName("hero_level_booster_active")
    @Expose
    public HeroLevelBooster heroLevelBoosterActive;

}