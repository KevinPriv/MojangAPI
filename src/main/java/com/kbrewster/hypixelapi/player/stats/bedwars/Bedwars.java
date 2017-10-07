package com.kbrewster.hypixelapi.player.stats.bedwars;


import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class Bedwars {

    @SerializedName("bedwars_boxes")
    @Expose
    @Getter private long bedwarsBoxes;
    @SerializedName("first_join_7")
    @Expose
    @Getter private boolean firstJoin7;
    @SerializedName("Experience_new")
    @Expose
    @Getter private long experienceNew;
    @SerializedName("bedwars_box_commons")
    @Expose
    @Getter private long bedwarsBoxCommons;
    @SerializedName("chest_history")
    @Expose
    @Getter private String chestHistory;
    @SerializedName("bedwars_box_rares")
    @Expose
    @Getter private long bedwarsBoxRares;
    @SerializedName("packages")
    @Expose
    @Getter private List<String> packages = null;
    @SerializedName("bedwars_box")
    @Expose
    @Getter private long bedwarsBox;
    @SerializedName("spray_storage_new")
    @Expose
    @Getter private String sprayStorageNew;
    @SerializedName("activeIslandTopper")
    @Expose
    @Getter private String activeIslandTopper;
    @SerializedName("games_played_bedwars_1")
    @Expose
    @Getter private long gamesPlayedBedwars1;
    @SerializedName("winstreak")
    @Expose
    @Getter private long winstreak;
    @SerializedName("eight_one_beds_lost_bedwars")
    @Expose
    @Getter private long eightOneBedsLostBedwars;
    @SerializedName("gold_resources_collected_bedwars")
    @Expose
    @Getter private long goldResourcesCollectedBedwars;
    @SerializedName("eight_one_items_purchased_bedwars")
    @Expose
    @Getter private long eightOneItemsPurchasedBedwar;
    @SerializedName("beds_lost_bedwars")
    @Expose
    @Getter private long bedsLostBedwars;
    @SerializedName("kills_bedwars")
    @Expose
    @Getter private long killsBedwars;
    @SerializedName("eight_one_diamond_resources_collected_bedwars")
    @Expose
    @Getter private long eightOneDiamondResourcesCollectedBedwars;
    @SerializedName("entity_attack_kills_bedwars")
    @Expose
    @Getter private long entityAttackKillsBedwars;
    @SerializedName("eight_one_games_played_bedwars")
    @Expose
    @Getter private long eightOneGamesPlayedBedwars;
    @SerializedName("diamond_resources_collected_bedwars")
    @Expose
    @Getter private long diamondResourcesCollectedBedwars;
    @SerializedName("eight_one_entity_attack_kills_bedwars")
    @Expose
    @Getter private long eightOneEntityAttackKillsBedwars;
    @SerializedName("resources_collected_bedwars")
    @Expose
    @Getter private long resourcesCollectedBedwars;
    @SerializedName("eight_one_kills_bedwars")
    @Expose
    @Getter private long eightOneKillsBedwars;
    @SerializedName("eight_one_losses_bedwars")
    @Expose
    @Getter private long eightOneLossesBedwars;
    @SerializedName("losses_bedwars")
    @Expose
    @Getter private long lossesBedwars;
    @SerializedName("items_purchased_bedwars")
    @Expose
    @Getter private long itemsPurchasedBedwar;
    @SerializedName("games_played_bedwars")
    @Expose
    @Getter private long gamesPlayedBedwars;
    @SerializedName("eight_one_iron_resources_collected_bedwars")
    @Expose
    @Getter private long eightOneIronResourcesCollectedBedwars;
    @SerializedName("eight_one_resources_collected_bedwars")
    @Expose
    @Getter private long eightOneResourcesCollectedBedwars;
    @SerializedName("iron_resources_collected_bedwars")
    @Expose
    @Getter private long ironResourcesCollectedBedwars;
    @SerializedName("eight_one__items_purchased_bedwars")
    @Expose
    @Getter private long eightOneItemsPurchasedBedwars;
    @SerializedName("eight_one_gold_resources_collected_bedwars")
    @Expose
    @Getter private long eightOneGoldResourcesCollectedBedwars;
    @SerializedName("_items_purchased_bedwars")
    @Expose
    @Getter private long itemsPurchasedBedwars;
    @SerializedName("eight_one_entity_attack_final_kills_bedwars")
    @Expose
    @Getter private long eightOneEntityAttackFinalKillsBedwars;
    @SerializedName("eight_one_final_kills_bedwars")
    @Expose
    @Getter private long eightOneFinalKillsBedwars;
    @SerializedName("eight_one_beds_broken_bedwars")
    @Expose
    @Getter private long eightOneBedsBrokenBedwars;
    @SerializedName("emerald_resources_collected_bedwars")
    @Expose
    @Getter private long emeraldResourcesCollectedBedwars;
    @SerializedName("coins")
    @Expose
    @Getter private long coins;
    @SerializedName("permanent _items_purchased_bedwars")
    @Expose
    @Getter private long permanentItemsPurchasedBedwars;
    @SerializedName("entity_attack_final_kills_bedwars")
    @Expose
    @Getter private long entityAttackFinalKillsBedwars;
    @SerializedName("eight_one_emerald_resources_collected_bedwars")
    @Expose
    @Getter private long eightOneEmeraldResourcesCollectedBedwars;
    @SerializedName("eight_one_permanent _items_purchased_bedwars")
    @Expose
    @Getter private long eightOnePermanentItemsPurchasedBedwars;
    @SerializedName("eight_one_wins_bedwars")
    @Expose
    @Getter private long eightOneWinsBedwars;
    @SerializedName("wins_bedwars")
    @Expose
    @Getter private long winsBedwars;
    @SerializedName("final_kills_bedwars")
    @Expose
    @Getter private long finalKillsBedwars;
    @SerializedName("beds_broken_bedwars")
    @Expose
    @Getter private long bedsBrokenBedwars;
    @SerializedName("Experience")
    @Expose
    @Getter private long experience;
    @SerializedName("eight_one_deaths_bedwars")
    @Expose
    @Getter private long eightOneDeathsBedwars;
    @SerializedName("deaths_bedwars")
    @Expose
    @Getter private long deathsBedwars;
    @SerializedName("eight_one_entity_attack_deaths_bedwars")
    @Expose
    @Getter private long eightOneEntityAttackDeathsBedwars;
    @SerializedName("entity_attack_deaths_bedwars")
    @Expose
    @Getter private long entityAttackDeathsBedwars;
    @SerializedName("void_deaths_bedwars")
    @Expose
    @Getter private long voidDeathsBedwars;
    @SerializedName("eight_one_void_deaths_bedwars")
    @Expose
    @Getter private long eightOneVoidDeathsBedwars;
    @SerializedName("void_kills_bedwars")
    @Expose
    @Getter private long voidKillsBedwars;
    @SerializedName("eight_one_void_kills_bedwars")
    @Expose
    @Getter private long eightOneVoidKillsBedwars;
    @SerializedName("final_deaths_bedwars")
    @Expose
    @Getter private long finalDeathsBedwars;
    @SerializedName("four_four__items_purchased_bedwars")
    @Expose
    @Getter private long fourFourItemsPurchasedBedwar;
    @SerializedName("entity_attack_final_deaths_bedwars")
    @Expose
    @Getter private long entityAttackFinalDeathsBedwars;
    @SerializedName("four_four_void_kills_bedwars")
    @Expose
    @Getter private long fourFourVoidKillsBedwars;
    @SerializedName("four_four_kills_bedwars")
    @Expose
    @Getter private long fourFourKillsBedwars;
    @SerializedName("four_four_final_deaths_bedwars")
    @Expose
    @Getter private long fourFourFinalDeathsBedwars;
    @SerializedName("four_four_deaths_bedwars")
    @Expose
    @Getter private long fourFourDeathsBedwars;
    @SerializedName("four_four_gold_resources_collected_bedwars")
    @Expose
    @Getter private long fourFourGoldResourcesCollectedBedwars;
    @SerializedName("four_four_diamond_resources_collected_bedwars")
    @Expose
    @Getter private long fourFourDiamondResourcesCollectedBedwars;
    @SerializedName("four_four_beds_lost_bedwars")
    @Expose
    @Getter private long fourFourBedsLostBedwars;
    @SerializedName("four_four_iron_resources_collected_bedwars")
    @Expose
    @Getter private long fourFourIronResourcesCollectedBedwars;
    @SerializedName("four_four_entity_attack_final_deaths_bedwars")
    @Expose
    @Getter private long fourFourEntityAttackFinalDeathsBedwars;
    @SerializedName("four_four_games_played_bedwars")
    @Expose
    @Getter private long fourFourGamesPlayedBedwars;
    @SerializedName("four_four_wins_bedwars")
    @Expose
    @Getter private long fourFourWinsBedwars;
    @SerializedName("four_four_resources_collected_bedwars")
    @Expose
    @Getter private long fourFourResourcesCollectedBedwars;
    @SerializedName("four_four_void_deaths_bedwars")
    @Expose
    @Getter private long fourFourVoidDeathsBedwars;
    @SerializedName("four_four_items_purchased_bedwars")
    @Expose
    @Getter private long fourFourItemsPurchasedBedwars;
    @SerializedName("four_four_entity_attack_kills_bedwars")
    @Expose
    @Getter private long fourFourEntityAttackKillsBedwars;
    @SerializedName("eight_one_void_final_kills_bedwars")
    @Expose
    @Getter private long eightOneVoidFinalKillsBedwars;
    @SerializedName("void_final_kills_bedwars")
    @Expose
    @Getter private long voidFinalKillsBedwars;
    @SerializedName("quickjoin_uses_random")
    @Expose
    @Getter private long quickjoinUsesRandom;
    @SerializedName("quickjoin_uses_total")
    @Expose
    @Getter private long quickjoinUsesTotal;
    @SerializedName("eight_one_final_deaths_bedwars")
    @Expose
    @Getter private long eightOneFinalDeathsBedwars;
    @SerializedName("void_final_deaths_bedwars")
    @Expose
    @Getter private long voidFinalDeathsBedwars;
    @SerializedName("eight_one_void_final_deaths_bedwars")
    @Expose
    @Getter private long eightOneVoidFinalDeathsBedwars;
    @SerializedName("eight_one_entity_attack_final_deaths_bedwars")
    @Expose
    @Getter private long eightOneEntityAttackFinalDeathsBedwars;
    @SerializedName("fall_kills_bedwars")
    @Expose
    @Getter private long fallKillsBedwars;
    @SerializedName("eight_one_fall_kills_bedwars")
    @Expose
    @Getter private long eightOneFallKillsBedwars;
    @SerializedName("eight_one_projectile_kills_bedwars")
    @Expose
    @Getter private long eightOneProjectileKillsBedwars;
    @SerializedName("projectile_kills_bedwars")
    @Expose
    @Getter private long projectileKillsBedwars;
    @SerializedName("eight_one_projectile_final_kills_bedwars")
    @Expose
    @Getter private long eightOneProjectileFinalKillsBedwars;
    @SerializedName("projectile_final_kills_bedwars")
    @Expose
    @Getter private long projectileFinalKillsBedwars;
    @SerializedName("four_three_void_final_kills_bedwars")
    @Expose
    @Getter private long fourThreeVoidFinalKillsBedwars;
    @SerializedName("four_three_void_kills_bedwars")
    @Expose
    @Getter private long fourThreeVoidKillsBedwars;
    @SerializedName("four_three_entity_attack_kills_bedwars")
    @Expose
    @Getter private long fourThreeEntityAttackKillsBedwars;
    @SerializedName("four_three_wins_bedwars")
    @Expose
    @Getter private long fourThreeWinsBedwars;
    @SerializedName("four_three_iron_resources_collected_bedwars")
    @Expose
    @Getter private long fourThreeIronResourcesCollectedBedwars;
    @SerializedName("four_three_games_played_bedwars")
    @Expose
    @Getter private long fourThreeGamesPlayedBedwars;
    @SerializedName("four_three__items_purchased_bedwars")
    @Expose
    @Getter private long fourThreeItemsPurchasedBedwars;
    @SerializedName("four_three_emerald_resources_collected_bedwars")
    @Expose
    @Getter private long fourThreeEmeraldResourcesCollectedBedwars;
    @SerializedName("four_three_void_deaths_bedwars")
    @Expose
    @Getter private long fourThreeVoidDeathsBedwars;
    @SerializedName("four_three_entity_attack_deaths_bedwars")
    @Expose
    @Getter private long fourThreeEntityAttackDeathsBedwars;
    @SerializedName("four_three_beds_lost_bedwars")
    @Expose
    @Getter private long fourThreeBedsLostBedwars;
    @SerializedName("four_three_gold_resources_collected_bedwars")
    @Expose
    @Getter private long fourThreeGoldResourcesCollectedBedwars;
    @SerializedName("four_three_permanent _items_purchased_bedwars")
    @Expose
    @Getter private long fourThreePermanentItemsPurchasedBedwars;
    @SerializedName("four_three_deaths_bedwars")
    @Expose
    @Getter private long fourThreeDeathsBedwars;
    @SerializedName("four_three_beds_broken_bedwars")
    @Expose
    @Getter private long fourThreeBedsBrokenBedwars;
    @SerializedName("four_three_entity_attack_final_kills_bedwars")
    @Expose
    @Getter private long fourThreeEntityAttackFinalKillsBedwars;
    @SerializedName("four_three_diamond_resources_collected_bedwars")
    @Expose
    @Getter private long fourThreeDiamondResourcesCollectedBedwars;
    @SerializedName("four_three_final_kills_bedwars")
    @Expose
    @Getter private long fourThreeFinalKillsBedwars;
    @SerializedName("four_three_items_purchased_bedwars")
    @Expose
    @Getter private long fourThreeItemsPurchasedBedwar;
    @SerializedName("four_three_kills_bedwars")
    @Expose
    @Getter private long fourThreeKillsBedwars;
    @SerializedName("four_three_resources_collected_bedwars")
    @Expose
    @Getter private long fourThreeResourcesCollectedBedwars;
    @SerializedName("activeDeathCry")
    @Expose
    @Getter private String activeDeathCry;
    @SerializedName("activeNPCSkin")
    @Expose
    @Getter private String activeNPCSkin;
    @SerializedName("four_three_fall_kills_bedwars")
    @Expose
    @Getter private long fourThreeFallKillsBedwars;
    @SerializedName("four_three_fall_final_kills_bedwars")
    @Expose
    @Getter private long fourThreeFallFinalKillsBedwars;
    @SerializedName("four_three_losses_bedwars")
    @Expose
    @Getter private long fourThreeLossesBedwars;
    @SerializedName("fall_final_kills_bedwars")
    @Expose
    @Getter private long fallFinalKillsBedwars;
    @SerializedName("four_three_void_final_deaths_bedwars")
    @Expose
    @Getter private long fourThreeVoidFinalDeathsBedwars;
    @SerializedName("four_three_final_deaths_bedwars")
    @Expose
    @Getter private long fourThreeFinalDeathsBedwars;
    @SerializedName("eight_two_beds_broken_bedwars")
    @Expose
    @Getter private long eightTwoBedsBrokenBedwars;
    @SerializedName("eight_two_emerald_resources_collected_bedwars")
    @Expose
    @Getter private long eightTwoEmeraldResourcesCollectedBedwars;
    @SerializedName("eight_two_permanent _items_purchased_bedwars")
    @Expose
    @Getter private long eightTwoPermanentItemsPurchasedBedwars;
    @SerializedName("eight_two_resources_collected_bedwars")
    @Expose
    @Getter private long eightTwoResourcesCollectedBedwars;
    @SerializedName("eight_two_diamond_resources_collected_bedwars")
    @Expose
    @Getter private long eightTwoDiamondResourcesCollectedBedwars;
    @SerializedName("eight_two_kills_bedwars")
    @Expose
    @Getter private long eightTwoKillsBedwars;
    @SerializedName("eight_two_entity_attack_kills_bedwars")
    @Expose
    @Getter private long eightTwoEntityAttackKillsBedwars;
    @SerializedName("eight_two_projectile_kills_bedwars")
    @Expose
    @Getter private long eightTwoProjectileKillsBedwars;
    @SerializedName("eight_two_iron_resources_collected_bedwars")
    @Expose
    @Getter private long eightTwoIronResourcesCollectedBedwars;
    @SerializedName("eight_two_void_kills_bedwars")
    @Expose
    @Getter private long eightTwoVoidKillsBedwars;
    @SerializedName("eight_two_final_deaths_bedwars")
    @Expose
    @Getter private long eightTwoFinalDeathsBedwars;
    @SerializedName("eight_two_void_final_deaths_bedwars")
    @Expose
    @Getter private long eightTwoVoidFinalDeathsBedwars;
    @SerializedName("eight_two__items_purchased_bedwars")
    @Expose
    @Getter private long eightTwoItemsPurchasedBedwars;
    @SerializedName("eight_two_games_played_bedwars")
    @Expose
    @Getter private long eightTwoGamesPlayedBedwars;
    @SerializedName("eight_two_items_purchased_bedwars")
    @Expose
    @Getter private long eightTwoItemsPurchasedBedwar;
    @SerializedName("eight_two_beds_lost_bedwars")
    @Expose
    @Getter private long eightTwoBedsLostBedwars;
    @SerializedName("eight_two_gold_resources_collected_bedwars")
    @Expose
    @Getter private long eightTwoGoldResourcesCollectedBedwars;
    @SerializedName("eight_two_void_final_kills_bedwars")
    @Expose
    @Getter private long eightTwoVoidFinalKillsBedwars;
    @SerializedName("eight_two_losses_bedwars")
    @Expose
    @Getter private long eightTwoLossesBedwars;
    @SerializedName("eight_two_final_kills_bedwars")
    @Expose
    @Getter private long eightTwoFinalKillsBedwars;
    @SerializedName("eight_two_void_deaths_bedwars")
    @Expose
    @Getter private long eightTwoVoidDeathsBedwars;
    @SerializedName("eight_two_wins_bedwars")
    @Expose
    @Getter private long eightTwoWinsBedwars;
    @SerializedName("eight_two_deaths_bedwars")
    @Expose
    @Getter private long eightTwoDeathsBedwars;
    @SerializedName("eight_two_entity_attack_final_kills_bedwars")
    @Expose
    @Getter private long eightTwoEntityAttackFinalKillsBedwars;
    @SerializedName("eight_two_entity_attack_final_deaths_bedwars")
    @Expose
    @Getter private long eightTwoEntityAttackFinalDeathsBedwars;
    @SerializedName("eight_two_entity_attack_deaths_bedwars")
    @Expose
    @Getter private long eightTwoEntityAttackDeathsBedwars;
    @SerializedName("glyph_storage_new")
    @Expose
    @Getter private String glyphStorageNew;
    @SerializedName("four_three_projectile_kills_bedwars")
    @Expose
    @Getter
    private long fourThreeProjectileKillsBedwars;
    @SerializedName("four_four_entity_attack_deaths_bedwars")
    @Expose
    @Getter private long fourFourEntityAttackDeathsBedwars;
    @SerializedName("four_four_beds_broken_bedwars")
    @Expose
    @Getter private long fourFourBedsBrokenBedwars;
    @SerializedName("four_four_losses_bedwars")
    @Expose
    @Getter private long fourFourLossesBedwars;
    @SerializedName("four_four_emerald_resources_collected_bedwars")
    @Expose
    @Getter private long fourFourEmeraldResourcesCollectedBedwars;
    @SerializedName("activeProjectileTrail")
    @Expose
    @Getter private String activeProjectileTrail;
    @SerializedName("four_four_void_final_kills_bedwars")
    @Expose
    @Getter private long fourFourVoidFinalKillsBedwars;
    @SerializedName("four_four_entity_attack_final_kills_bedwars")
    @Expose
    @Getter private long fourFourEntityAttackFinalKillsBedwars;
    @SerializedName("four_four_final_kills_bedwars")
    @Expose
    @Getter private long fourFourFinalKillsBedwars;
    @SerializedName("quickjoin_uses_Lectus")
    @Expose
    @Getter private long quickjoinUsesLectus;
    @SerializedName("four_four_projectile_final_deaths_bedwars")
    @Expose
    @Getter private long fourFourProjectileFinalDeathsBedwars;
    @SerializedName("four_four_permanent _items_purchased_bedwars")
    @Expose
    @Getter private long fourFourPermanentItemsPurchasedBedwars;
    @SerializedName("projectile_final_deaths_bedwars")
    @Expose
    @Getter private long projectileFinalDeathsBedwars;
    @SerializedName("quickjoin_uses_Eastwood")
    @Expose
    @Getter private long quickjoinUsesEastwood;
    @SerializedName("quickjoin_uses_Invasion")
    @Expose
    @Getter private long quickjoinUsesInvasion;
    @SerializedName("four_three_entity_attack_final_deaths_bedwars")
    @Expose
    @Getter private long fourThreeEntityAttackFinalDeathsBedwars;
    @SerializedName("fall_deaths_bedwars")
    @Expose
    @Getter private long fallDeathsBedwars;
    @SerializedName("eight_one_fall_deaths_bedwars")
    @Expose
    @Getter private long eightOneFallDeathsBedwars;
    @SerializedName("quickjoin_uses_Swashbuckle")
    @Expose
    @Getter private long quickjoinUsesSwashbuckle;
    @SerializedName("four_four_void_final_deaths_bedwars")
    @Expose
    @Getter private long fourFourVoidFinalDeathsBedwars;
    @SerializedName("chest_history_new")
    @Expose
    @Getter private List<String> chestHistoryNew = null;
    @SerializedName("spray_glyph_field")
    @Expose
    @Getter private String sprayGlyphField;
    @SerializedName("four_four_fall_final_kills_bedwars")
    @Expose
    @Getter private long fourFourFallFinalKillsBedwars;
    @SerializedName("bedwars_box_epics")
    @Expose
    @Getter private long bedwarsBoxEpics;
    @SerializedName("activeKillMessages")
    @Expose
    @Getter private String activeKillMessages;
    @SerializedName("quickjoin_uses_Lotus")
    @Expose
    @Getter private long quickjoinUsesLotus;
    @SerializedName("quickjoin_uses_Speedway")
    @Expose
    @Getter private long quickjoinUsesSpeedway;
    @SerializedName("projectile_deaths_bedwars")
    @Expose
    @Getter private long projectileDeathsBedwars;
    @SerializedName("eight_one_projectile_deaths_bedwars")
    @Expose
    @Getter private long eightOneProjectileDeathsBedwars;
    @SerializedName("activeKillEffect")
    @Expose
    @Getter private String activeKillEffect;
    @SerializedName("eight_two_fall_final_deaths_bedwars")
    @Expose
    @Getter private long eightTwoFallFinalDeathsBedwars;
    @SerializedName("fall_final_deaths_bedwars")
    @Expose
    @Getter private long fallFinalDeathsBedwars;
    @SerializedName("four_three_fall_final_deaths_bedwars")
    @Expose
    @Getter private long fourThreeFallFinalDeathsBedwars;
    @SerializedName("four_three_fall_deaths_bedwars")
    @Expose
    @Getter private long fourThreeFallDeathsBedwars;
    @SerializedName("bedwars_box_legendaries")
    @Expose
    @Getter private long bedwarsBoxLegendaries;
    @SerializedName("activeVictoryDance")
    @Expose
    @Getter private String activeVictoryDance;
    @SerializedName("eight_two_fall_deaths_bedwars")
    @Expose
    @Getter private long eightTwoFallDeathsBedwars;
    @SerializedName("eight_two_fall_kills_bedwars")
    @Expose
    @Getter private long eightTwoFallKillsBedwars;
    @SerializedName("four_four_fall_kills_bedwars")
    @Expose
    @Getter private long fourFourFallKillsBedwars;
    @SerializedName("quickjoin_uses_Airshow")
    @Expose
    @Getter private long quickjoinUsesAirshow;
    @SerializedName("four_four_projectile_deaths_bedwars")
    @Expose
    @Getter private long fourFourProjectileDeathsBedwars;

}
