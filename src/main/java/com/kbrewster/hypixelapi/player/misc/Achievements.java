package com.kbrewster.hypixelapi.player.misc;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class Achievements {

    @SerializedName("arena_bossed")
    @Expose
    private long arenaBossed;
    @SerializedName("arena_climb_the_ranks")
    @Expose
    private long arenaClimbTheRanks;
    @SerializedName("arena_gladiator")
    @Expose
    private long arenaGladiator;
    @SerializedName("arena_gotta_wear_em_all")
    @Expose
    private long arenaGottaWearEmAll;
    @SerializedName("blitz_coins")
    @Expose
    private long blitzCoins;
    @SerializedName("blitz_kills")
    @Expose
    private long blitzKills;
    @SerializedName("blitz_wins")
    @Expose
    private long blitzWins;
    @SerializedName("general_coins")
    @Expose
    private long generalCoins;
    @SerializedName("general_wins")
    @Expose
    private long generalWins;
    @SerializedName("paintball_coins")
    @Expose
    private long paintballCoins;
    @SerializedName("paintball_kills")
    @Expose
    private long paintballKills;
    @SerializedName("paintball_wins")
    @Expose
    private long paintballWins;
    @SerializedName("quake_killing_sprees")
    @Expose
    private long quakeKillingSprees;
    @SerializedName("quake_kills")
    @Expose
    private long quakeKills;
    @SerializedName("quake_wins")
    @Expose
    private long quakeWins;
    @SerializedName("tntgames_bow_spleef_wins")
    @Expose
    private long tntgamesBowSpleefWins;
    @SerializedName("tntgames_tnt_run_wins")
    @Expose
    private long tntgamesTntRunWins;
    @SerializedName("tntgames_wizards_wins")
    @Expose
    private long tntgamesWizardsWins;
    @SerializedName("vampirez_coins")
    @Expose
    private long vampirezCoins;
    @SerializedName("vampirez_kill_survivors")
    @Expose
    private long vampirezKillSurvivors;
    @SerializedName("vampirez_kill_vampires")
    @Expose
    private long vampirezKillVampires;
    @SerializedName("vampirez_survivor_wins")
    @Expose
    private long vampirezSurvivorWins;
    @SerializedName("walls_kills")
    @Expose
    private long wallsKills;
    @SerializedName("walls_wins")
    @Expose
    private long wallsWins;
    @SerializedName("walls3_kills")
    @Expose
    private long walls3Kills;
    @SerializedName("walls3_coins")
    @Expose
    private long walls3Coins;
    @SerializedName("warlords_warrior_level")
    @Expose
    private long warlordsWarriorLevel;
    @SerializedName("warlords_mage_level")
    @Expose
    private long warlordsMageLevel;
    @SerializedName("warlords_paladin_level")
    @Expose
    private long warlordsPaladinLevel;
    @SerializedName("warlords_kills")
    @Expose
    private long warlordsKills;
    @SerializedName("warlords_shaman_level")
    @Expose
    private long warlordsShamanLevel;
    @SerializedName("warlords_assist")
    @Expose
    private long warlordsAssist;
    @SerializedName("warlords_repair_weapons")
    @Expose
    private long warlordsRepairWeapons;
    @SerializedName("warlords_coins")
    @Expose
    private long warlordsCoins;
    @SerializedName("walls_coins")
    @Expose
    private long wallsCoins;
    @SerializedName("uhc_champion")
    @Expose
    private long uhcChampion;
    @SerializedName("uhc_hunter")
    @Expose
    private long uhcHunter;
    @SerializedName("uhc_moving_up")
    @Expose
    private long uhcMovingUp;
    @SerializedName("skywars_kills_team")
    @Expose
    private long skywarsKillsTeam;
    @SerializedName("skywars_wins_team")
    @Expose
    private long skywarsWinsTeam;
    @SerializedName("skywars_wins_solo")
    @Expose
    private long skywarsWinsSolo;
    @SerializedName("skywars_kills_solo")
    @Expose
    private long skywarsKillsSolo;
    @SerializedName("skywars_kits_solo")
    @Expose
    private long skywarsKitsSolo;
    @SerializedName("skywars_kits_team")
    @Expose
    private long skywarsKitsTeam;
    @SerializedName("skywars_cages")
    @Expose
    private long skywarsCages;
    @SerializedName("uhc_bounty")
    @Expose
    private long uhcBounty;
    @SerializedName("truecombat_solo_killer")
    @Expose
    private long truecombatSoloKiller;
    @SerializedName("truecombat_team_killer")
    @Expose
    private long truecombatTeamKiller;
    @SerializedName("truecombat_kit_hoarder_solo")
    @Expose
    private long truecombatKitHoarderSolo;
    @SerializedName("truecombat_kit_hoarder_team")
    @Expose
    private long truecombatKitHoarderTeam;
    @SerializedName("truecombat_team_winner")
    @Expose
    private long truecombatTeamWinner;
    @SerializedName("truecombat_solo_winner")
    @Expose
    private long truecombatSoloWinner;
    @SerializedName("warlords_ctf_wins")
    @Expose
    private long warlordsCtfWins;
    @SerializedName("warlords_dom_wins")
    @Expose
    private long warlordsDomWins;
    @SerializedName("supersmash_smash_champion")
    @Expose
    private long supersmashSmashChampion;
    @SerializedName("supersmash_hero_slayer")
    @Expose
    private long supersmashHeroSlayer;
    @SerializedName("supersmash_smash_winner")
    @Expose
    private long supersmashSmashWinner;
    @SerializedName("copsandcrims_serial_killer")
    @Expose
    private long copsandcrimsSerialKiller;
    @SerializedName("copsandcrims_bomb_specialist")
    @Expose
    private long copsandcrimsBombSpecialist;
    @SerializedName("copsandcrims_hero_terrorist")
    @Expose
    private long copsandcrimsHeroTerrorist;
    @SerializedName("copsandcrims_cac_banker")
    @Expose
    private long copsandcrimsCacBanker;
    @SerializedName("warlords_tdm_wins")
    @Expose
    private long warlordsTdmWins;
    @SerializedName("skywars_kills_mega")
    @Expose
    private long skywarsKillsMega;
    @SerializedName("skywars_kits_mega")
    @Expose
    private long skywarsKitsMega;
    @SerializedName("skywars_wins_mega")
    @Expose
    private long skywarsWinsMega;
    @SerializedName("walls3_guardian")
    @Expose
    private long walls3Guardian;
    @SerializedName("walls3_rusher")
    @Expose
    private long walls3Rusher;
    @SerializedName("walls3_wins")
    @Expose
    private long walls3Wins;
    @SerializedName("supersmash_handyman")
    @Expose
    private long supersmashHandyman;
    @SerializedName("general_challenger")
    @Expose
    private long generalChallenger;
    @SerializedName("general_quest_master")
    @Expose
    private long generalQuestMaster;
    @SerializedName("speeduhc_hunter")
    @Expose
    private long speeduhcHunter;
    @SerializedName("speeduhc_uhc_master")
    @Expose
    private long speeduhcUhcMaster;
    @SerializedName("speeduhc_collector")
    @Expose
    private long speeduhcCollector;
    @SerializedName("speeduhc_salty")
    @Expose
    private long speeduhcSalty;
    @SerializedName("skyclash_packs_opened")
    @Expose
    private long skyclashPacksOpened;
    @SerializedName("skyclash_cards_unlocked")
    @Expose
    private long skyclashCardsUnlocked;
    @SerializedName("skyclash_kills")
    @Expose
    private long skyclashKills;
    @SerializedName("skyclash_wins")
    @Expose
    private long skyclashWins;
    @SerializedName("arcade_bounty_hunter")
    @Expose
    private long arcadeBountyHunter;
    @SerializedName("arcade_team_work")
    @Expose
    private long arcadeTeamWork;
    @SerializedName("arcade_arcade_winner")
    @Expose
    private long arcadeArcadeWinner;
    @SerializedName("arcade_football_pro")
    @Expose
    private long arcadeFootballPro;
    @SerializedName("arcade_zombie_killer")
    @Expose
    private long arcadeZombieKiller;
    @SerializedName("arcade_farmhunt_dominator")
    @Expose
    private long arcadeFarmhuntDominator;
    @SerializedName("arcade_miniwalls_winner")
    @Expose
    private long arcadeMiniwallsWinner;
    @SerializedName("arcade_arcade_banker")
    @Expose
    private long arcadeArcadeBanker;
    @SerializedName("arcade_buildbattle_points")
    @Expose
    private long arcadeBuildbattlePoints;
    @SerializedName("quake_coins")
    @Expose
    private long quakeCoins;
    @SerializedName("quake_headshots")
    @Expose
    private long quakeHeadshots;
    @SerializedName("quake_weapon_arsenal")
    @Expose
    private long quakeWeaponArsenal;
    @SerializedName("skyclash_mob_beheading")
    @Expose
    private long skyclashMobBeheading;
    @SerializedName("skyclash_treasure_hunter")
    @Expose
    private long skyclashTreasureHunter;
    @SerializedName("gingerbread_racer")
    @Expose
    private long gingerbreadRacer;
    @SerializedName("gingerbread_banker")
    @Expose
    private long gingerbreadBanker;
    @SerializedName("vampirez_zombie_killer")
    @Expose
    private long vampirezZombieKiller;
    @SerializedName("gingerbread_winner")
    @Expose
    private long gingerbreadWinner;
    @SerializedName("tntgames_tnt_tag_wins")
    @Expose
    private long tntgamesTntTagWins;
    @SerializedName("tntgames_pvp_run_wins")
    @Expose
    private long tntgamesPvpRunWins;
    @SerializedName("tntgames_tnt_wizards_kills")
    @Expose
    private long tntgamesTntWizardsKills;
    @SerializedName("tntgames_pvp_run_killer")
    @Expose
    private long tntgamesPvpRunKiller;
    @SerializedName("tntgames_tnt_triathlon")
    @Expose
    private long tntgamesTntTriathlon;
    @SerializedName("tntgames_tnt_banker")
    @Expose
    private long tntgamesTntBanker;
    @SerializedName("tntgames_tnt_wizards_caps")
    @Expose
    private long tntgamesTntWizardsCaps;
    @SerializedName("blitz_wins_teams")
    @Expose
    private long blitzWinsTeams;
    @SerializedName("blitz_war_veteran")
    @Expose
    private long blitzWarVeteran;
    @SerializedName("blitz_looter")
    @Expose
    private long blitzLooter;
    @SerializedName("bedwars_beds")
    @Expose
    private long bedwarsBeds;
    @SerializedName("bedwars_wins")
    @Expose
    private long bedwarsWins;
    @SerializedName("bedwars_level")
    @Expose
    private long bedwarsLevel;
    @SerializedName("bedwars_loot_box")
    @Expose
    private long bedwarsLootBox;
    @SerializedName("truecombat_king")
    @Expose
    private long truecombatKing;
    @SerializedName("murdermystery_wins_as_survivor")
    @Expose
    private long murdermysteryWinsAsSurvivor;
    @SerializedName("murdermystery_kills_as_murderer")
    @Expose
    private long murdermysteryKillsAsMurderer;
    @SerializedName("murdermystery_wins_as_murderer")
    @Expose
    private long murdermysteryWinsAsMurderer;
}