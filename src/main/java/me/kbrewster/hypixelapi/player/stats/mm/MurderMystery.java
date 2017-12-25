package me.kbrewster.hypixelapi.player.stats.mm;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.List;

@Getter
public class MurderMystery {

    @SerializedName("murdermystery_books")
    @Expose
    private List<String> murdermysteryBooks = null;
    @SerializedName("detective_chance")
    @Expose
    private long detectiveChance;
    @SerializedName("murderer_chance")
    @Expose
    private long murdererChance;
    @SerializedName("wins")
    @Expose
    private long wins;
    @SerializedName("wins_MURDER_HARDCORE")
    @Expose
    private long winsMURDERHARDCORE;
    @SerializedName("games_MURDER_HARDCORE")
    @Expose
    private long gamesMURDERHARDCORE;
    @SerializedName("coins")
    @Expose
    private long coins;
    @SerializedName("detective_wins_gold_rush")
    @Expose
    private long detectiveWinsGoldRush;
    @SerializedName("detective_wins_gold_rush_MURDER_HARDCORE")
    @Expose
    private long detectiveWinsGoldRushMURDERHARDCORE;
    @SerializedName("detective_wins")
    @Expose
    private long detectiveWins;
    @SerializedName("detective_wins_MURDER_HARDCORE")
    @Expose
    private long detectiveWinsMURDERHARDCORE;
    @SerializedName("games")
    @Expose
    private long games;
    @SerializedName("wins_gold_rush")
    @Expose
    private long winsGoldRush;
    @SerializedName("wins_gold_rush_MURDER_HARDCORE")
    @Expose
    private long winsGoldRushMURDERHARDCORE;
    @SerializedName("coins_pickedup")
    @Expose
    private long coinsPickedup;
    @SerializedName("coins_pickedup_gold_rush_MURDER_HARDCORE")
    @Expose
    private long coinsPickedupGoldRushMURDERHARDCORE;
    @SerializedName("coins_pickedup_MURDER_HARDCORE")
    @Expose
    private long coinsPickedupMURDERHARDCORE;
    @SerializedName("coins_pickedup_gold_rush")
    @Expose
    private long coinsPickedupGoldRush;
    @SerializedName("games_gold_rush")
    @Expose
    private long gamesGoldRush;
    @SerializedName("games_gold_rush_MURDER_HARDCORE")
    @Expose
    private long gamesGoldRushMURDERHARDCORE;
    @SerializedName("games_ancient_tomb")
    @Expose
    private long gamesAncientTomb;
    @SerializedName("kills_MURDER_HARDCORE")
    @Expose
    private long killsMURDERHARDCORE;
    @SerializedName("bow_kills_ancient_tomb")
    @Expose
    private long bowKillsAncientTomb;
    @SerializedName("was_hero")
    @Expose
    private long wasHero;
    @SerializedName("detective_wins_ancient_tomb_MURDER_HARDCORE")
    @Expose
    private long detectiveWinsAncientTombMURDERHARDCORE;
    @SerializedName("detective_wins_ancient_tomb")
    @Expose
    private long detectiveWinsAncientTomb;
    @SerializedName("kills_ancient_tomb")
    @Expose
    private long killsAncientTomb;
    @SerializedName("bow_kills_MURDER_HARDCORE")
    @Expose
    private long bowKillsMURDERHARDCORE;
    @SerializedName("coins_pickedup_ancient_tomb")
    @Expose
    private long coinsPickedupAncientTomb;
    @SerializedName("was_hero_ancient_tomb")
    @Expose
    private long wasHeroAncientTomb;
    @SerializedName("wins_ancient_tomb_MURDER_HARDCORE")
    @Expose
    private long winsAncientTombMURDERHARDCORE;
    @SerializedName("wins_ancient_tomb")
    @Expose
    private long winsAncientTomb;
    @SerializedName("games_ancient_tomb_MURDER_HARDCORE")
    @Expose
    private long gamesAncientTombMURDERHARDCORE;
    @SerializedName("bow_kills_ancient_tomb_MURDER_HARDCORE")
    @Expose
    private long bowKillsAncientTombMURDERHARDCORE;
    @SerializedName("bow_kills")
    @Expose
    private long bowKills;
    @SerializedName("kills_ancient_tomb_MURDER_HARDCORE")
    @Expose
    private long killsAncientTombMURDERHARDCORE;
    @SerializedName("was_hero_ancient_tomb_MURDER_HARDCORE")
    @Expose
    private long wasHeroAncientTombMURDERHARDCORE;
    @SerializedName("coins_pickedup_ancient_tomb_MURDER_HARDCORE")
    @Expose
    private long coinsPickedupAncientTombMURDERHARDCORE;
    @SerializedName("kills")
    @Expose
    private long kills;
    @SerializedName("was_hero_MURDER_HARDCORE")
    @Expose
    private long wasHeroMURDERHARDCORE;
    @SerializedName("granted_chests")
    @Expose
    private long grantedChests;
    @SerializedName("mm_chests")
    @Expose
    private long mmChests;
    @SerializedName("packages")
    @Expose
    private List<String> packages = null;
    @SerializedName("mm_chest_history")
    @Expose
    private List<String> mmChestHistory = null;
    @SerializedName("MurderMystery_openedRares")
    @Expose
    private long murderMysteryOpenedRares;
    @SerializedName("MurderMystery_openedCommons")
    @Expose
    private long murderMysteryOpenedCommons;
    @SerializedName("MurderMystery_openedChests")
    @Expose
    private long murderMysteryOpenedChests;
    @SerializedName("active_kill_note")
    @Expose
    private String activeKillNote;
    @SerializedName("active_victory_dance")
    @Expose
    private String activeVictoryDance;
    @SerializedName("wasSpecialRoleLastGame")
    @Expose
    private boolean wasSpecialRoleLastGame;
    @SerializedName("knife_kills_MURDER_CLASSIC")
    @Expose
    private long knifeKillsMURDERCLASSIC;
    @SerializedName("kills_as_murderer_ancient_tomb_MURDER_CLASSIC")
    @Expose
    private long killsAsMurdererAncientTombMURDERCLASSIC;
    @SerializedName("murderer_wins_ancient_tomb_MURDER_CLASSIC")
    @Expose
    private long murdererWinsAncientTombMURDERCLASSIC;
    @SerializedName("wins_ancient_tomb_MURDER_CLASSIC")
    @Expose
    private long winsAncientTombMURDERCLASSIC;
    @SerializedName("kills_ancient_tomb_MURDER_CLASSIC")
    @Expose
    private long killsAncientTombMURDERCLASSIC;
    @SerializedName("kills_MURDER_CLASSIC")
    @Expose
    private long killsMURDERCLASSIC;
    @SerializedName("wins_MURDER_CLASSIC")
    @Expose
    private long winsMURDERCLASSIC;
    @SerializedName("kills_as_murderer_MURDER_CLASSIC")
    @Expose
    private long killsAsMurdererMURDERCLASSIC;
    @SerializedName("kills_as_murderer_ancient_tomb")
    @Expose
    private long killsAsMurdererAncientTomb;
    @SerializedName("coins_pickedup_MURDER_CLASSIC")
    @Expose
    private long coinsPickedupMURDERCLASSIC;
    @SerializedName("kills_as_murderer")
    @Expose
    private long killsAsMurderer;
    @SerializedName("knife_kills_ancient_tomb_MURDER_CLASSIC")
    @Expose
    private long knifeKillsAncientTombMURDERCLASSIC;
    @SerializedName("knife_kills")
    @Expose
    private long knifeKills;
    @SerializedName("murderer_wins_ancient_tomb")
    @Expose
    private long murdererWinsAncientTomb;
    @SerializedName("games_ancient_tomb_MURDER_CLASSIC")
    @Expose
    private long gamesAncientTombMURDERCLASSIC;
    @SerializedName("knife_kills_ancient_tomb")
    @Expose
    private long knifeKillsAncientTomb;
    @SerializedName("coins_pickedup_ancient_tomb_MURDER_CLASSIC")
    @Expose
    private long coinsPickedupAncientTombMURDERCLASSIC;
    @SerializedName("murderer_wins_MURDER_CLASSIC")
    @Expose
    private long murdererWinsMURDERCLASSIC;
    @SerializedName("games_MURDER_CLASSIC")
    @Expose
    private long gamesMURDERCLASSIC;
    @SerializedName("murderer_wins")
    @Expose
    private long murdererWins;
    @SerializedName("coins_pickedup_cruise_ship_MURDER_CLASSIC")
    @Expose
    private long coinsPickedupCruiseShipMURDERCLASSIC;
    @SerializedName("games_cruise_ship_MURDER_CLASSIC")
    @Expose
    private long gamesCruiseShipMURDERCLASSIC;
    @SerializedName("coins_pickedup_cruise_ship")
    @Expose
    private long coinsPickedupCruiseShip;
    @SerializedName("games_cruise_ship")
    @Expose
    private long gamesCruiseShip;
    @SerializedName("wins_cruise_ship_MURDER_CLASSIC")
    @Expose
    private long winsCruiseShipMURDERCLASSIC;
    @SerializedName("wins_cruise_ship")
    @Expose
    private long winsCruiseShip;
    @SerializedName("quickjoin_uses_Gold Rush")
    @Expose
    private long quickjoinUsesGoldRush;
    @SerializedName("quickjoin_uses_total")
    @Expose
    private long quickjoinUsesTotal;
    @SerializedName("wins_gold_rush_MURDER_CLASSIC")
    @Expose
    private long winsGoldRushMURDERCLASSIC;
    @SerializedName("suicides_MURDER_CLASSIC")
    @Expose
    private long suicidesMURDERCLASSIC;
    @SerializedName("games_gold_rush_MURDER_CLASSIC")
    @Expose
    private long gamesGoldRushMURDERCLASSIC;
    @SerializedName("suicides_gold_rush_MURDER_CLASSIC")
    @Expose
    private long suicidesGoldRushMURDERCLASSIC;
    @SerializedName("deaths_gold_rush")
    @Expose
    private long deathsGoldRush;
    @SerializedName("suicides")
    @Expose
    private long suicides;
    @SerializedName("deaths_gold_rush_MURDER_CLASSIC")
    @Expose
    private long deathsGoldRushMURDERCLASSIC;
    @SerializedName("deaths")
    @Expose
    private long deaths;
    @SerializedName("deaths_MURDER_CLASSIC")
    @Expose
    private long deathsMURDERCLASSIC;
    @SerializedName("coins_pickedup_gold_rush_MURDER_CLASSIC")
    @Expose
    private long coinsPickedupGoldRushMURDERCLASSIC;
    @SerializedName("suicides_gold_rush")
    @Expose
    private long suicidesGoldRush;
    @SerializedName("wins_headquarters_MURDER_ASSASSINS")
    @Expose
    private long winsHeadquartersMURDERASSASSINS;
    @SerializedName("kills_headquarters")
    @Expose
    private long killsHeadquarters;
    @SerializedName("thrown_knife_kills")
    @Expose
    private long thrownKnifeKills;
    @SerializedName("thrown_knife_kills_MURDER_ASSASSINS")
    @Expose
    private long thrownKnifeKillsMURDERASSASSINS;
    @SerializedName("kills_headquarters_MURDER_ASSASSINS")
    @Expose
    private long killsHeadquartersMURDERASSASSINS;
    @SerializedName("coins_pickedup_headquarters_MURDER_ASSASSINS")
    @Expose
    private long coinsPickedupHeadquartersMURDERASSASSINS;
    @SerializedName("knife_kills_MURDER_ASSASSINS")
    @Expose
    private long knifeKillsMURDERASSASSINS;
    @SerializedName("kills_MURDER_ASSASSINS")
    @Expose
    private long killsMURDERASSASSINS;
    @SerializedName("knife_kills_headquarters")
    @Expose
    private long knifeKillsHeadquarters;
    @SerializedName("games_MURDER_ASSASSINS")
    @Expose
    private long gamesMURDERASSASSINS;
    @SerializedName("games_headquarters_MURDER_ASSASSINS")
    @Expose
    private long gamesHeadquartersMURDERASSASSINS;
    @SerializedName("coins_pickedup_headquarters")
    @Expose
    private long coinsPickedupHeadquarters;
    @SerializedName("wins_headquarters")
    @Expose
    private long winsHeadquarters;
    @SerializedName("thrown_knife_kills_headquarters")
    @Expose
    private long thrownKnifeKillsHeadquarters;
    @SerializedName("thrown_knife_kills_headquarters_MURDER_ASSASSINS")
    @Expose
    private long thrownKnifeKillsHeadquartersMURDERASSASSINS;
    @SerializedName("games_headquarters")
    @Expose
    private long gamesHeadquarters;
    @SerializedName("coins_pickedup_MURDER_ASSASSINS")
    @Expose
    private long coinsPickedupMURDERASSASSINS;
    @SerializedName("wins_MURDER_ASSASSINS")
    @Expose
    private long winsMURDERASSASSINS;
    @SerializedName("knife_kills_headquarters_MURDER_ASSASSINS")
    @Expose
    private long knifeKillsHeadquartersMURDERASSASSINS;
    @SerializedName("knife_kills_hollywood")
    @Expose
    private long knifeKillsHollywood;
    @SerializedName("kills_hollywood")
    @Expose
    private long killsHollywood;
    @SerializedName("thrown_knife_kills_hollywood")
    @Expose
    private long thrownKnifeKillsHollywood;
    @SerializedName("games_hollywood")
    @Expose
    private long gamesHollywood;
    @SerializedName("deaths_hollywood_MURDER_ASSASSINS")
    @Expose
    private long deathsHollywoodMURDERASSASSINS;
    @SerializedName("games_hollywood_MURDER_ASSASSINS")
    @Expose
    private long gamesHollywoodMURDERASSASSINS;
    @SerializedName("deaths_MURDER_ASSASSINS")
    @Expose
    private long deathsMURDERASSASSINS;
    @SerializedName("coins_pickedup_hollywood_MURDER_ASSASSINS")
    @Expose
    private long coinsPickedupHollywoodMURDERASSASSINS;
    @SerializedName("coins_pickedup_hollywood")
    @Expose
    private long coinsPickedupHollywood;
    @SerializedName("deaths_hollywood")
    @Expose
    private long deathsHollywood;
    @SerializedName("kills_hollywood_MURDER_ASSASSINS")
    @Expose
    private long killsHollywoodMURDERASSASSINS;
    @SerializedName("thrown_knife_kills_hollywood_MURDER_ASSASSINS")
    @Expose
    private long thrownKnifeKillsHollywoodMURDERASSASSINS;
    @SerializedName("knife_kills_hollywood_MURDER_ASSASSINS")
    @Expose
    private long knifeKillsHollywoodMURDERASSASSINS;
    @SerializedName("detective_wins_ancient_tomb_MURDER_CLASSIC")
    @Expose
    private long detectiveWinsAncientTombMURDERCLASSIC;
    @SerializedName("was_hero_MURDER_CLASSIC")
    @Expose
    private long wasHeroMURDERCLASSIC;
    @SerializedName("bow_kills_MURDER_CLASSIC")
    @Expose
    private long bowKillsMURDERCLASSIC;
    @SerializedName("bow_kills_ancient_tomb_MURDER_CLASSIC")
    @Expose
    private long bowKillsAncientTombMURDERCLASSIC;
    @SerializedName("detective_wins_MURDER_CLASSIC")
    @Expose
    private long detectiveWinsMURDERCLASSIC;
    @SerializedName("was_hero_ancient_tomb_MURDER_CLASSIC")
    @Expose
    private long wasHeroAncientTombMURDERCLASSIC;
    @SerializedName("deaths_hypixel_world")
    @Expose
    private long deathsHypixelWorld;
    @SerializedName("games_hypixel_world_MURDER_CLASSIC")
    @Expose
    private long gamesHypixelWorldMURDERCLASSIC;
    @SerializedName("deaths_hypixel_world_MURDER_CLASSIC")
    @Expose
    private long deathsHypixelWorldMURDERCLASSIC;
    @SerializedName("wins_hypixel_world_MURDER_CLASSIC")
    @Expose
    private long winsHypixelWorldMURDERCLASSIC;
    @SerializedName("games_hypixel_world")
    @Expose
    private long gamesHypixelWorld;
    @SerializedName("coins_pickedup_hypixel_world_MURDER_CLASSIC")
    @Expose
    private long coinsPickedupHypixelWorldMURDERCLASSIC;
    @SerializedName("coins_pickedup_hypixel_world")
    @Expose
    private long coinsPickedupHypixelWorld;
    @SerializedName("wins_hypixel_world")
    @Expose
    private long winsHypixelWorld;
    @SerializedName("deaths_cruise_ship")
    @Expose
    private long deathsCruiseShip;
    @SerializedName("deaths_cruise_ship_MURDER_CLASSIC")
    @Expose
    private long deathsCruiseShipMURDERCLASSIC;
    @SerializedName("kills_as_murderer_hollywood_MURDER_CLASSIC")
    @Expose
    private long killsAsMurdererHollywoodMURDERCLASSIC;
    @SerializedName("coins_pickedup_hollywood_MURDER_CLASSIC")
    @Expose
    private long coinsPickedupHollywoodMURDERCLASSIC;
    @SerializedName("kills_hollywood_MURDER_CLASSIC")
    @Expose
    private long killsHollywoodMURDERCLASSIC;
    @SerializedName("knife_kills_hollywood_MURDER_CLASSIC")
    @Expose
    private long knifeKillsHollywoodMURDERCLASSIC;
    @SerializedName("kills_as_murderer_hollywood")
    @Expose
    private long killsAsMurdererHollywood;
    @SerializedName("games_hollywood_MURDER_CLASSIC")
    @Expose
    private long gamesHollywoodMURDERCLASSIC;
    @SerializedName("wins_hollywood")
    @Expose
    private long winsHollywood;
    @SerializedName("wins_hollywood_MURDER_CLASSIC")
    @Expose
    private long winsHollywoodMURDERCLASSIC;
    @SerializedName("detective_wins_hollywood")
    @Expose
    private long detectiveWinsHollywood;
    @SerializedName("bow_kills_hollywood_MURDER_CLASSIC")
    @Expose
    private long bowKillsHollywoodMURDERCLASSIC;
    @SerializedName("detective_wins_hollywood_MURDER_CLASSIC")
    @Expose
    private long detectiveWinsHollywoodMURDERCLASSIC;
    @SerializedName("was_hero_hollywood")
    @Expose
    private long wasHeroHollywood;
    @SerializedName("was_hero_hollywood_MURDER_CLASSIC")
    @Expose
    private long wasHeroHollywoodMURDERCLASSIC;
    @SerializedName("bow_kills_hollywood")
    @Expose
    private long bowKillsHollywood;
    @SerializedName("games_headquarters_MURDER_CLASSIC")
    @Expose
    private long gamesHeadquartersMURDERCLASSIC;
    @SerializedName("quickjoin_uses_Transport")
    @Expose
    private long quickjoinUsesTransport;
    @SerializedName("quickjoin_uses_Towerfall")
    @Expose
    private long quickjoinUsesTowerfall;
    @SerializedName("kills_gold_rush_MURDER_CLASSIC")
    @Expose
    private long killsGoldRushMURDERCLASSIC;
    @SerializedName("bow_kills_gold_rush_MURDER_CLASSIC")
    @Expose
    private long bowKillsGoldRushMURDERCLASSIC;
    @SerializedName("was_hero_gold_rush_MURDER_CLASSIC")
    @Expose
    private long wasHeroGoldRushMURDERCLASSIC;
    @SerializedName("detective_wins_gold_rush_MURDER_CLASSIC")
    @Expose
    private long detectiveWinsGoldRushMURDERCLASSIC;
    @SerializedName("kills_gold_rush")
    @Expose
    private long killsGoldRush;
    @SerializedName("was_hero_gold_rush")
    @Expose
    private long wasHeroGoldRush;
    @SerializedName("bow_kills_gold_rush")
    @Expose
    private long bowKillsGoldRush;
    @SerializedName("bow_kills_library_MURDER_CLASSIC")
    @Expose
    private long bowKillsLibraryMURDERCLASSIC;
    @SerializedName("kills_library_MURDER_CLASSIC")
    @Expose
    private long killsLibraryMURDERCLASSIC;
    @SerializedName("deaths_library_MURDER_CLASSIC")
    @Expose
    private long deathsLibraryMURDERCLASSIC;
    @SerializedName("deaths_library")
    @Expose
    private long deathsLibrary;
    @SerializedName("knife_kills_library_MURDER_CLASSIC")
    @Expose
    private long knifeKillsLibraryMURDERCLASSIC;
    @SerializedName("coins_pickedup_library")
    @Expose
    private long coinsPickedupLibrary;
    @SerializedName("bow_kills_library")
    @Expose
    private long bowKillsLibrary;
    @SerializedName("kills_as_murderer_library")
    @Expose
    private long killsAsMurdererLibrary;
    @SerializedName("knife_kills_library")
    @Expose
    private long knifeKillsLibrary;
    @SerializedName("kills_as_murderer_library_MURDER_CLASSIC")
    @Expose
    private long killsAsMurdererLibraryMURDERCLASSIC;
    @SerializedName("games_library_MURDER_CLASSIC")
    @Expose
    private long gamesLibraryMURDERCLASSIC;
    @SerializedName("coins_pickedup_library_MURDER_CLASSIC")
    @Expose
    private long coinsPickedupLibraryMURDERCLASSIC;
    @SerializedName("games_library")
    @Expose
    private long gamesLibrary;
    @SerializedName("kills_library")
    @Expose
    private long killsLibrary;
    @SerializedName("kills_gold_rush_MURDER_HARDCORE")
    @Expose
    private long killsGoldRushMURDERHARDCORE;
    @SerializedName("was_hero_gold_rush_MURDER_HARDCORE")
    @Expose
    private long wasHeroGoldRushMURDERHARDCORE;
    @SerializedName("bow_kills_gold_rush_MURDER_HARDCORE")
    @Expose
    private long bowKillsGoldRushMURDERHARDCORE;
    @SerializedName("wins_hypixel_world_MURDER_HARDCORE")
    @Expose
    private long winsHypixelWorldMURDERHARDCORE;
    @SerializedName("coins_pickedup_hypixel_world_MURDER_HARDCORE")
    @Expose
    private long coinsPickedupHypixelWorldMURDERHARDCORE;
    @SerializedName("games_hypixel_world_MURDER_HARDCORE")
    @Expose
    private long gamesHypixelWorldMURDERHARDCORE;
    @SerializedName("active_knife_skin")
    @Expose
    private String activeKnifeSkin;
    @SerializedName("was_hero_transport")
    @Expose
    private long wasHeroTransport;
    @SerializedName("kills_transport_MURDER_CLASSIC")
    @Expose
    private long killsTransportMURDERCLASSIC;
    @SerializedName("wins_transport_MURDER_CLASSIC")
    @Expose
    private long winsTransportMURDERCLASSIC;
    @SerializedName("games_transport")
    @Expose
    private long gamesTransport;
    @SerializedName("kills_transport")
    @Expose
    private long killsTransport;
    @SerializedName("wins_transport")
    @Expose
    private long winsTransport;
    @SerializedName("detective_wins_transport")
    @Expose
    private long detectiveWinsTransport;
    @SerializedName("detective_wins_transport_MURDER_CLASSIC")
    @Expose
    private long detectiveWinsTransportMURDERCLASSIC;
    @SerializedName("bow_kills_transport_MURDER_CLASSIC")
    @Expose
    private long bowKillsTransportMURDERCLASSIC;
    @SerializedName("coins_pickedup_transport")
    @Expose
    private long coinsPickedupTransport;
    @SerializedName("bow_kills_transport")
    @Expose
    private long bowKillsTransport;
    @SerializedName("was_hero_transport_MURDER_CLASSIC")
    @Expose
    private long wasHeroTransportMURDERCLASSIC;
    @SerializedName("games_transport_MURDER_CLASSIC")
    @Expose
    private long gamesTransportMURDERCLASSIC;
    @SerializedName("coins_pickedup_transport_MURDER_CLASSIC")
    @Expose
    private long coinsPickedupTransportMURDERCLASSIC;
    @SerializedName("quickjoin_uses_Cruise Ship")
    @Expose
    private long quickjoinUsesCruiseShip;
    @SerializedName("quickjoin_uses_random")
    @Expose
    private long quickjoinUsesRandom;
    @SerializedName("detective_wins_cruise_ship")
    @Expose
    private long detectiveWinsCruiseShip;
    @SerializedName("detective_wins_cruise_ship_MURDER_CLASSIC")
    @Expose
    private long detectiveWinsCruiseShipMURDERCLASSIC;
    @SerializedName("games_towerfall_MURDER_CLASSIC")
    @Expose
    private long gamesTowerfallMURDERCLASSIC;
    @SerializedName("coins_pickedup_towerfall")
    @Expose
    private long coinsPickedupTowerfall;
    @SerializedName("kills_as_murderer_towerfall_MURDER_CLASSIC")
    @Expose
    private long killsAsMurdererTowerfallMURDERCLASSIC;
    @SerializedName("knife_kills_towerfall")
    @Expose
    private long knifeKillsTowerfall;
    @SerializedName("kills_towerfall")
    @Expose
    private long killsTowerfall;
    @SerializedName("knife_kills_towerfall_MURDER_CLASSIC")
    @Expose
    private long knifeKillsTowerfallMURDERCLASSIC;
    @SerializedName("thrown_knife_kills_towerfall")
    @Expose
    private long thrownKnifeKillsTowerfall;
    @SerializedName("thrown_knife_kills_MURDER_CLASSIC")
    @Expose
    private long thrownKnifeKillsMURDERCLASSIC;
    @SerializedName("thrown_knife_kills_towerfall_MURDER_CLASSIC")
    @Expose
    private long thrownKnifeKillsTowerfallMURDERCLASSIC;
    @SerializedName("games_towerfall")
    @Expose
    private long gamesTowerfall;
    @SerializedName("deaths_towerfall_MURDER_CLASSIC")
    @Expose
    private long deathsTowerfallMURDERCLASSIC;
    @SerializedName("kills_towerfall_MURDER_CLASSIC")
    @Expose
    private long killsTowerfallMURDERCLASSIC;
    @SerializedName("kills_as_murderer_towerfall")
    @Expose
    private long killsAsMurdererTowerfall;
    @SerializedName("deaths_towerfall")
    @Expose
    private long deathsTowerfall;
    @SerializedName("coins_pickedup_towerfall_MURDER_CLASSIC")
    @Expose
    private long coinsPickedupTowerfallMURDERCLASSIC;
    @SerializedName("wins_towerfall_MURDER_CLASSIC")
    @Expose
    private long winsTowerfallMURDERCLASSIC;
    @SerializedName("wins_towerfall")
    @Expose
    private long winsTowerfall;
    @SerializedName("murderer_wins_gold_rush_MURDER_CLASSIC")
    @Expose
    private long murdererWinsGoldRushMURDERCLASSIC;
    @SerializedName("murderer_wins_gold_rush")
    @Expose
    private long murdererWinsGoldRush;
    @SerializedName("kills_as_murderer_gold_rush_MURDER_CLASSIC")
    @Expose
    private long killsAsMurdererGoldRushMURDERCLASSIC;
    @SerializedName("thrown_knife_kills_gold_rush")
    @Expose
    private long thrownKnifeKillsGoldRush;
    @SerializedName("kills_as_murderer_gold_rush")
    @Expose
    private long killsAsMurdererGoldRush;
    @SerializedName("thrown_knife_kills_gold_rush_MURDER_CLASSIC")
    @Expose
    private long thrownKnifeKillsGoldRushMURDERCLASSIC;
    @SerializedName("knife_kills_gold_rush")
    @Expose
    private long knifeKillsGoldRush;
    @SerializedName("knife_kills_gold_rush_MURDER_CLASSIC")
    @Expose
    private long knifeKillsGoldRushMURDERCLASSIC;
    @SerializedName("wins_headquarters_MURDER_CLASSIC")
    @Expose
    private long winsHeadquartersMURDERCLASSIC;
    @SerializedName("coins_pickedup_headquarters_MURDER_CLASSIC")
    @Expose
    private long coinsPickedupHeadquartersMURDERCLASSIC;
    @SerializedName("thrown_knife_kills_ancient_tomb_MURDER_CLASSIC")
    @Expose
    private long thrownKnifeKillsAncientTombMURDERCLASSIC;
    @SerializedName("thrown_knife_kills_ancient_tomb")
    @Expose
    private long thrownKnifeKillsAncientTomb;
    @SerializedName("coins_pickedup_archives")
    @Expose
    private long coinsPickedupArchives;
    @SerializedName("wins_archives_MURDER_CLASSIC")
    @Expose
    private long winsArchivesMURDERCLASSIC;
    @SerializedName("games_archives_MURDER_CLASSIC")
    @Expose
    private long gamesArchivesMURDERCLASSIC;
    @SerializedName("coins_pickedup_archives_MURDER_CLASSIC")
    @Expose
    private long coinsPickedupArchivesMURDERCLASSIC;
    @SerializedName("games_archives")
    @Expose
    private long gamesArchives;
    @SerializedName("wins_archives")
    @Expose
    private long winsArchives;
    @SerializedName("wins_library_MURDER_CLASSIC")
    @Expose
    private long winsLibraryMURDERCLASSIC;
    @SerializedName("wins_library")
    @Expose
    private long winsLibrary;
    @SerializedName("deaths_ancient_tomb_MURDER_CLASSIC")
    @Expose
    private long deathsAncientTombMURDERCLASSIC;
    @SerializedName("deaths_ancient_tomb")
    @Expose
    private long deathsAncientTomb;
    @SerializedName("trap_kills_MURDER_CLASSIC")
    @Expose
    private long trapKillsMURDERCLASSIC;
    @SerializedName("trap_kills_towerfall_MURDER_CLASSIC")
    @Expose
    private long trapKillsTowerfallMURDERCLASSIC;
    @SerializedName("trap_kills_towerfall")
    @Expose
    private long trapKillsTowerfall;
    @SerializedName("trap_kills")
    @Expose
    private long trapKills;
    @SerializedName("murderer_wins_cruise_ship")
    @Expose
    private long murdererWinsCruiseShip;
    @SerializedName("murderer_wins_cruise_ship_MURDER_CLASSIC")
    @Expose
    private long murdererWinsCruiseShipMURDERCLASSIC;
    @SerializedName("thrown_knife_kills_cruise_ship")
    @Expose
    private long thrownKnifeKillsCruiseShip;
    @SerializedName("kills_as_murderer_cruise_ship")
    @Expose
    private long killsAsMurdererCruiseShip;
    @SerializedName("kills_cruise_ship")
    @Expose
    private long killsCruiseShip;
    @SerializedName("thrown_knife_kills_cruise_ship_MURDER_CLASSIC")
    @Expose
    private long thrownKnifeKillsCruiseShipMURDERCLASSIC;
    @SerializedName("kills_as_murderer_cruise_ship_MURDER_CLASSIC")
    @Expose
    private long killsAsMurdererCruiseShipMURDERCLASSIC;
    @SerializedName("knife_kills_cruise_ship_MURDER_CLASSIC")
    @Expose
    private long knifeKillsCruiseShipMURDERCLASSIC;
    @SerializedName("knife_kills_cruise_ship")
    @Expose
    private long knifeKillsCruiseShip;
    @SerializedName("kills_cruise_ship_MURDER_CLASSIC")
    @Expose
    private long killsCruiseShipMURDERCLASSIC;
    @SerializedName("was_hero_towerfall")
    @Expose
    private long wasHeroTowerfall;
    @SerializedName("was_hero_towerfall_MURDER_CLASSIC")
    @Expose
    private long wasHeroTowerfallMURDERCLASSIC;
    @SerializedName("wins_hollywood_MURDER_ASSASSINS")
    @Expose
    private long winsHollywoodMURDERASSASSINS;
    @SerializedName("bow_kills_hollywood_MURDER_ASSASSINS")
    @Expose
    private long bowKillsHollywoodMURDERASSASSINS;
    @SerializedName("bow_kills_MURDER_ASSASSINS")
    @Expose
    private long bowKillsMURDERASSASSINS;
    @SerializedName("murderer_wins_towerfall_MURDER_CLASSIC")
    @Expose
    private long murdererWinsTowerfallMURDERCLASSIC;
    @SerializedName("murderer_wins_towerfall")
    @Expose
    private long murdererWinsTowerfall;
    @SerializedName("thrown_knife_kills_gold_rush_MURDER_ASSASSINS")
    @Expose
    private long thrownKnifeKillsGoldRushMURDERASSASSINS;
    @SerializedName("kills_gold_rush_MURDER_ASSASSINS")
    @Expose
    private long killsGoldRushMURDERASSASSINS;
    @SerializedName("knife_kills_gold_rush_MURDER_ASSASSINS")
    @Expose
    private long knifeKillsGoldRushMURDERASSASSINS;
    @SerializedName("games_gold_rush_MURDER_ASSASSINS")
    @Expose
    private long gamesGoldRushMURDERASSASSINS;
    @SerializedName("coins_pickedup_gold_rush_MURDER_ASSASSINS")
    @Expose
    private long coinsPickedupGoldRushMURDERASSASSINS;
    @SerializedName("wins_gold_rush_MURDER_ASSASSINS")
    @Expose
    private long winsGoldRushMURDERASSASSINS;
    @SerializedName("bow_kills_hypixel_world_MURDER_HARDCORE")
    @Expose
    private long bowKillsHypixelWorldMURDERHARDCORE;
    @SerializedName("detective_wins_hypixel_world_MURDER_HARDCORE")
    @Expose
    private long detectiveWinsHypixelWorldMURDERHARDCORE;
    @SerializedName("kills_hypixel_world_MURDER_HARDCORE")
    @Expose
    private long killsHypixelWorldMURDERHARDCORE;
    @SerializedName("detective_wins_hypixel_world")
    @Expose
    private long detectiveWinsHypixelWorld;
    @SerializedName("was_hero_hypixel_world_MURDER_HARDCORE")
    @Expose
    private long wasHeroHypixelWorldMURDERHARDCORE;
    @SerializedName("kills_hypixel_world")
    @Expose
    private long killsHypixelWorld;
    @SerializedName("bow_kills_hypixel_world")
    @Expose
    private long bowKillsHypixelWorld;
    @SerializedName("was_hero_hypixel_world")
    @Expose
    private long wasHeroHypixelWorld;

}
