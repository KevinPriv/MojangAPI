package com.kbrewster.hypixelapi.player;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.kbrewster.hypixelapi.player.misc.*;
import com.kbrewster.hypixelapi.player.stats.Stats;
import lombok.Getter;

import java.util.List;

@Getter
public class Player {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("achievements")
    @Expose
    private Achievements achievements;
    @SerializedName("achievementsOneTime")
    @Expose
    private List<Object> achievementsOneTime = null;
    @SerializedName("channel")
    @Expose
    private String channel;
    @SerializedName("clock")
    @Expose
    private boolean clock;
    @SerializedName("displayname")
    @Expose
    private String displayname;
    @SerializedName("firstLogin")
    @Expose
    private long firstLogin;
    @SerializedName("friendRequests")
    @Expose
    private List<Object> friendRequests = null;
    @SerializedName("karma")
    @Expose
    private long karma;
    @SerializedName("knownAliases")
    @Expose
    private List<Object> knownAliases = null;
    @SerializedName("knownAliasesLower")
    @Expose
    private List<Object> knownAliasesLower = null;
    @SerializedName("lastLogin")
    @Expose
    private long lastLogin;
    @SerializedName("mostRecentlyThanked")
    @Expose
    private String mostRecentlyThanked;
    @SerializedName("mostRecentlyTipped")
    @Expose
    private String mostRecentlyTipped;
    @SerializedName("mostRecentlyTippedUuid")
    @Expose
    private String mostRecentlyTippedUuid;
    @SerializedName("networkExp")
    @Expose
    private long networkExp;
    @SerializedName("networkLevel")
    @Expose
    private long networkLevel;
    @SerializedName("newClock")
    @Expose
    private String newClock;
  //  @SerializedName("parkourCompletions")
   // @Expose
  //  private ParkourCompletions parkourCompletions;
    @SerializedName("playername")
    @Expose
    private String playername;
 //   @SerializedName("quests")
 //   @Expose
 //   private Quests quests;
    @SerializedName("settings")
    @Expose
    private Settings settings;
    @SerializedName("stats")
    @Expose
    private Stats stats;
    @SerializedName("thanksSent")
    @Expose
    private long thanksSent;
    @SerializedName("timePlaying")
    @Expose
    private long timePlaying;
    @SerializedName("tournamentTokens")
    @Expose
    private long tournamentTokens;
    @SerializedName("uuid")
    @Expose
    private String uuid;
    @SerializedName("vanityTokens")
    @Expose
    private long vanityTokens;
    @SerializedName("friendRequestsUuid")
    @Expose
    private List<Object> friendRequestsUuid = null;
    @SerializedName("particleQuality")
    @Expose
    private String particleQuality;
    @SerializedName("mainlobbytutorial")
    @Expose
    private boolean mainlobbytutorial;
    @SerializedName("mostRecentlyThankedUuid")
    @Expose
    private String mostRecentlyThankedUuid;
    @SerializedName("thanksReceived")
    @Expose
    private long thanksReceived;
    @SerializedName("lastEugeneMessage")
    @Expose
    private long lastEugeneMessage;
 //   @SerializedName("eugene")
 //   @Expose
  //  private Eugene eugene;
    @SerializedName("last_survey")
    @Expose
    private long lastSurvey;
  //  @SerializedName("voting")
 //  @Expose
  //  private Voting voting;
    @SerializedName("websiteSet")
    @Expose
    private boolean websiteSet;
    @SerializedName("rank")
    @Expose
    private String rank;
    @SerializedName("packageRank")
    @Expose
    private String packageRank;
    @SerializedName("newPackageRank")
    @Expose
    private String newPackageRank;
    @SerializedName("fireworkStorage")
    @Expose
    private List<Object> fireworkStorage = null;
    @SerializedName("wardrobe")
    @Expose
    private String wardrobe;
    @SerializedName("mcVersionRp")
    @Expose
    private String mcVersionRp;
    @SerializedName("gadget")
    @Expose
    private String gadget;
    @SerializedName("REWARD_FIND_AGENTK")
    @Expose
    private boolean rewardAgentK;
    @SerializedName("newMainTutorial")
    @Expose
    private boolean newMainTutorial;
    @SerializedName("REWARD_FIND_THORLON")
    @Expose
    private boolean rewardThorlon;
    @SerializedName("REWARD_FIND_MINIKLOON")
    @Expose
    private boolean rewardMinikloon;
    @SerializedName("REWARD_FIND_XAEL")
    @Expose
    private boolean rewardXael;
    @SerializedName("REWARD_FIND_SLIKEY")
    @Expose
    private boolean rewardSlinkey;
    @SerializedName("REWARD_FIND_PLANCKE")
    @Expose
    private boolean rewardPlanke;
    @SerializedName("REWARD_FIND_DONPIRESO")
    @Expose
    private boolean rewardDonpireso;
    @SerializedName("REWARD_FIND_NOXYD")
    @Expose
    private boolean rewardNoxyD;
    @SerializedName("REWARD_FIND_HCHERNDON")
    @Expose
    private boolean rewardHcherndon;
    @SerializedName("REWARD_FIND_REZZUS")
    @Expose
    private boolean rewardRezzus;
    @SerializedName("REWARD_FIND_CRYPTKEEPER")
    @Expose
    private boolean rewardCryptkeeper;
    @SerializedName("REWARD_FIND_DEPRECATEDNETHER")
    @Expose
    private boolean rewardDeprecatednether;
    @SerializedName("REWARD_FIND_ZUMULUS")
    @Expose
    private boolean rewardZumulus;
    @SerializedName("REWARD_FIND_ZEROERRORS")
    @Expose
    private boolean rewardZeroErrors;
    @SerializedName("REWARD_FIND_ROGUE")
    @Expose
    private boolean rewardRogue;
    @SerializedName("REWARD_FIND_VLADTOBEHERE")
    @Expose
    private boolean rewardVladToBeHere;
    @SerializedName("REWARD_FIND_JAMIETHEGEEK")
    @Expose
    private boolean rewardJamieTheGeek;
    @SerializedName("REWARD_FIND_PXLPANDA")
    @Expose
    private boolean rewardPxlPanda;
    @SerializedName("REWARD_FIND_SHEROM")
    @Expose
    private boolean rewardSherom;
    @SerializedName("REWARD_FIND_HYPIXEL")
    @Expose
    private boolean rewardHypixel;
    @SerializedName("REWARD_FIND_MOOTV")
    @Expose
    private boolean rewardMooTV;
    @SerializedName("housingMeta")
    @Expose
    private HousingMeta housingMeta;
    @SerializedName("vanityMeta")
    @Expose
    private VanityMeta vanityMeta;
    @SerializedName("pp")
    @Expose
    private String pp;
  //  @SerializedName("petConsumables")
 //   @Expose
  //  private PetConsumables petConsumables;
  //  @SerializedName("petStats")
  //  @Expose
   // private PetStats petStats;
    @SerializedName("petJourneyTimestamp")
    @Expose
    private long petJourneyTimestamp;
    @SerializedName("transformation")
    @Expose
    private String transformation;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("REWARD_FIND_DRARTIST")
    @Expose
    private boolean rewardDrartist;
    @SerializedName("REWARD_FIND_PIXELBAKER")
    @Expose
    private boolean rewardPixelBaker;
    @SerializedName("REWARD_FIND_LYALL")
    @Expose
    private boolean rewardLyall;
    @SerializedName("PRESENT_FIND_ARCADE")
    @Expose
    private boolean pRESENTFINDARCADE;
    @SerializedName("PRESENT_FIND_ARENA")
    @Expose
    private boolean pRESENTFINDARENA;
    @SerializedName("PRESENT_FIND_WALLS")
    @Expose
    private boolean pRESENTFINDWALLS;
    @SerializedName("PRESENT_FIND_TNTGAMES")
    @Expose
    private boolean pRESENTFINDTNTGAMES;
    @SerializedName("PRESENT_FIND_WARLORDS")
    @Expose
    private boolean pRESENTFINDWARLORDS;
    @SerializedName("PRESENT_FIND_QUAKE")
    @Expose
    private boolean pRESENTFINDQUAKE;
    @SerializedName("PRESENT_FIND_BLITZ")
    @Expose
    private boolean pRESENTFINDBLITZ;
    @SerializedName("PRESENT_FIND_VAMPIREZ")
    @Expose
    private boolean pRESENTFINDVAMPIREZ;
    @SerializedName("PRESENT_FIND_UHC")
    @Expose
    private boolean pRESENTFINDUHC;
    @SerializedName("PRESENT_FIND_PAINTBALL")
    @Expose
    private boolean pRESENTFINDPAINTBALL;
    @SerializedName("PRESENT_FIND_EXP")
    @Expose
    private boolean pRESENTFINDEXP;
    @SerializedName("PRESENT_FIND_MEGAWALLS")
    @Expose
    private boolean pRESENTFINDMEGAWALLS;
    @SerializedName("PRESENT_FIND_COPSNCRIMS")
    @Expose
    private boolean pRESENTFINDCOPSNCRIMS;
    @SerializedName("PRESENT_FIND_SKYWARS")
    @Expose
    private boolean pRESENTFINDSKYWARS;
    @SerializedName("PRESENT_FIND_CRAZYWALLS")
    @Expose
    private boolean pRESENTFINDCRAZYWALLS;
    @SerializedName("PRESENT_FIND_TURBOKARTRACERS")
    @Expose
    private boolean pRESENTFINDTURBOKARTRACERS;
    @SerializedName("REWARD_FIND_JAYAVARMEN")
    @Expose
    private boolean rewardJayavarmen;
    @SerializedName("REWARD_FIND_DARKACENESS")
    @Expose
    private boolean rewardDaraceness;
    @SerializedName("REWARD_FIND_SPHAX")
    @Expose
    private boolean rewardSphax;
    @SerializedName("REWARD_FIND_ZANFLANGO")
    @Expose
    private boolean rewardZanflango;
    @SerializedName("REWARD_FIND_AMICO")
    @Expose
    private boolean rewardAmico;
    @SerializedName("REWARD_FIND_TYRON")
    @Expose
    private boolean rewardTyron;
    @SerializedName("REWARD_FIND_LEGITMODERN")
    @Expose
    private boolean rewardLegitModern;
    @SerializedName("REWARD_FIND_TACTFUL")
    @Expose
    private boolean rewardTactful;
    @SerializedName("REWARD_FIND_GURUN")
    @Expose
    private boolean rewardGunrun;
    @SerializedName("spec_speed")
    @Expose
    private long specSpeed;
    @SerializedName("levelingReward_0")
    @Expose
    private boolean levelingReward0;
    @SerializedName("levelingReward_1")
    @Expose
    private boolean levelingReward1;
    @SerializedName("levelingReward_2")
    @Expose
    private boolean levelingReward2;
    @SerializedName("levelingReward_3")
    @Expose
    private boolean levelingReward3;
    @SerializedName("levelingReward_4")
    @Expose
    private boolean levelingReward4;
    @SerializedName("levelingReward_99")
    @Expose
    private boolean levelingReward99;
    @SerializedName("levelingReward_109")
    @Expose
    private boolean levelingReward109;
    @SerializedName("levelingReward_98")
    @Expose
    private boolean levelingReward98;
    @SerializedName("levelingReward_97")
    @Expose
    private boolean levelingReward97;
    @SerializedName("levelingReward_96")
    @Expose
    private boolean levelingReward96;
    @SerializedName("levelingReward_95")
    @Expose
    private boolean levelingReward95;
    @SerializedName("levelingReward_94")
    @Expose
    private boolean levelingReward94;
    @SerializedName("rankPlusColor")
    @Expose
    private String rankPlusColor;
    @SerializedName("levelingReward_93")
    @Expose
    private boolean levelingReward93;
    @SerializedName("levelingReward_92")
    @Expose
    private boolean levelingReward92;
    @SerializedName("levelingReward_91")
    @Expose
    private boolean levelingReward91;
    @SerializedName("levelingReward_90")
    @Expose
    private boolean levelingReward90;
    @SerializedName("levelingReward_89")
    @Expose
    private boolean levelingReward89;
    @SerializedName("levelingReward_88")
    @Expose
    private boolean levelingReward88;
    @SerializedName("levelingReward_24")
    @Expose
    private boolean levelingReward24;
    @SerializedName("levelingReward_5")
    @Expose
    private boolean levelingReward5;
    @SerializedName("levelingReward_6")
    @Expose
    private boolean levelingReward6;
    @SerializedName("levelingReward_7")
    @Expose
    private boolean levelingReward7;
    @SerializedName("levelingReward_8")
    @Expose
    private boolean levelingReward8;
    @SerializedName("levelingReward_9")
    @Expose
    private boolean levelingReward9;
    @SerializedName("levelingReward_10")
    @Expose
    private boolean levelingReward10;
    @SerializedName("levelingReward_11")
    @Expose
    private boolean levelingReward11;
    @SerializedName("levelingReward_12")
    @Expose
    private boolean levelingReward12;
    @SerializedName("levelingReward_13")
    @Expose
    private boolean levelingReward13;
    @SerializedName("levelingReward_14")
    @Expose
    private boolean levelingReward14;
    @SerializedName("levelingReward_15")
    @Expose
    private boolean levelingReward15;
    @SerializedName("levelingReward_16")
    @Expose
    private boolean levelingReward16;
    @SerializedName("levelingReward_17")
    @Expose
    private boolean levelingReward17;
    @SerializedName("levelingReward_18")
    @Expose
    private boolean levelingReward18;
    @SerializedName("levelingReward_19")
    @Expose
    private boolean levelingReward19;
    @SerializedName("levelingReward_21")
    @Expose
    private boolean levelingReward21;
    @SerializedName("levelingReward_20")
    @Expose
    private boolean levelingReward20;
    @SerializedName("levelingReward_23")
    @Expose
    private boolean levelingReward23;
    @SerializedName("levelingReward_22")
    @Expose
    private boolean levelingReward22;
    @SerializedName("levelingReward_87")
    @Expose
    private boolean levelingReward87;
    @SerializedName("levelingReward_25")
    @Expose
    private boolean levelingReward25;
    @SerializedName("levelingReward_26")
    @Expose
    private boolean levelingReward26;
    @SerializedName("levelingReward_27")
    @Expose
    private boolean levelingReward27;
    @SerializedName("levelingReward_28")
    @Expose
    private boolean levelingReward28;
    @SerializedName("levelingReward_29")
    @Expose
    private boolean levelingReward29;
    @SerializedName("levelingReward_30")
    @Expose
    private boolean levelingReward30;
    @SerializedName("levelingReward_31")
    @Expose
    private boolean levelingReward31;
    @SerializedName("levelingReward_32")
    @Expose
    private boolean levelingReward32;
    @SerializedName("levelingReward_33")
    @Expose
    private boolean levelingReward33;
    @SerializedName("levelingReward_34")
    @Expose
    private boolean levelingReward34;
    @SerializedName("levelingReward_35")
    @Expose
    private boolean levelingReward35;
    @SerializedName("levelingReward_36")
    @Expose
    private boolean levelingReward36;
    @SerializedName("levelingReward_37")
    @Expose
    private boolean levelingReward37;
    @SerializedName("levelingReward_38")
    @Expose
    private boolean levelingReward38;
    @SerializedName("levelingReward_39")
    @Expose
    private boolean levelingReward39;
    @SerializedName("levelingReward_40")
    @Expose
    private boolean levelingReward40;
    @SerializedName("levelingReward_41")
    @Expose
    private boolean levelingReward41;
    @SerializedName("levelingReward_42")
    @Expose
    private boolean levelingReward42;
    @SerializedName("levelingReward_43")
    @Expose
    private boolean levelingReward43;
    @SerializedName("levelingReward_44")
    @Expose
    private boolean levelingReward44;
    @SerializedName("levelingReward_45")
    @Expose
    private boolean levelingReward45;
    @SerializedName("levelingReward_46")
    @Expose
    private boolean levelingReward46;
    @SerializedName("levelingReward_47")
    @Expose
    private boolean levelingReward47;
    @SerializedName("levelingReward_48")
    @Expose
    private boolean levelingReward48;
    @SerializedName("levelingReward_49")
    @Expose
    private boolean levelingReward49;
    @SerializedName("levelingReward_50")
    @Expose
    private boolean levelingReward50;
    @SerializedName("levelingReward_51")
    @Expose
    private boolean levelingReward51;
    @SerializedName("levelingReward_52")
    @Expose
    private boolean levelingReward52;
    @SerializedName("levelingReward_53")
    @Expose
    private boolean levelingReward53;
    @SerializedName("levelingReward_54")
    @Expose
    private boolean levelingReward54;
    @SerializedName("levelingReward_55")
    @Expose
    private boolean levelingReward55;
    @SerializedName("levelingReward_56")
    @Expose
    private boolean levelingReward56;
    @SerializedName("levelingReward_57")
    @Expose
    private boolean levelingReward57;
    @SerializedName("levelingReward_58")
    @Expose
    private boolean levelingReward58;
    @SerializedName("levelingReward_59")
    @Expose
    private boolean levelingReward59;
    @SerializedName("levelingReward_60")
    @Expose
    private boolean levelingReward60;
    @SerializedName("levelingReward_61")
    @Expose
    private boolean levelingReward61;
    @SerializedName("levelingReward_62")
    @Expose
    private boolean levelingReward62;
    @SerializedName("levelingReward_63")
    @Expose
    private boolean levelingReward63;
    @SerializedName("levelingReward_64")
    @Expose
    private boolean levelingReward64;
    @SerializedName("levelingReward_65")
    @Expose
    private boolean levelingReward65;
    @SerializedName("levelingReward_66")
    @Expose
    private boolean levelingReward66;
    @SerializedName("levelingReward_67")
    @Expose
    private boolean levelingReward67;
    @SerializedName("levelingReward_68")
    @Expose
    private boolean levelingReward68;
    @SerializedName("levelingReward_70")
    @Expose
    private boolean levelingReward70;
    @SerializedName("levelingReward_69")
    @Expose
    private boolean levelingReward69;
    @SerializedName("levelingReward_71")
    @Expose
    private boolean levelingReward71;
    @SerializedName("levelingReward_73")
    @Expose
    private boolean levelingReward73;
    @SerializedName("levelingReward_72")
    @Expose
    private boolean levelingReward72;
    @SerializedName("levelingReward_74")
    @Expose
    private boolean levelingReward74;
    @SerializedName("levelingReward_75")
    @Expose
    private boolean levelingReward75;
    @SerializedName("levelingReward_76")
    @Expose
    private boolean levelingReward76;
    @SerializedName("levelingReward_78")
    @Expose
    private boolean levelingReward78;
    @SerializedName("levelingReward_77")
    @Expose
    private boolean levelingReward77;
    @SerializedName("levelingReward_80")
    @Expose
    private boolean levelingReward80;
    @SerializedName("levelingReward_79")
    @Expose
    private boolean levelingReward79;
    @SerializedName("levelingReward_81")
    @Expose
    private boolean levelingReward81;
    @SerializedName("levelingReward_82")
    @Expose
    private boolean levelingReward82;
    @SerializedName("levelingReward_83")
    @Expose
    private boolean levelingReward83;
    @SerializedName("levelingReward_86")
    @Expose
    private boolean levelingReward86;
    @SerializedName("levelingReward_84")
    @Expose
    private boolean levelingReward84;
    @SerializedName("levelingReward_85")
    @Expose
    private boolean levelingReward85;
    @SerializedName("guildNotifications")
    @Expose
    private boolean guildNotifications;
    @SerializedName("levelingReward_119")
    @Expose
    private boolean levelingReward119;
    @SerializedName("customFilter")
    @Expose
    private String customFilter;
 //   @SerializedName("specialtyCooldowns")
 //   @Expose
//    private SpecialtyCooldowns specialtyCooldowns;
 //   @SerializedName("giftingMeta")
 //   @Expose
 //   private GiftingMeta giftingMeta;
    @SerializedName("fortuneBuff")
    @Expose
    private long fortuneBuff;
//    @SerializedName("questSettings")
///    @Expose
 //   private QuestSettings questSettings;
    @SerializedName("levelingReward_129")
    @Expose
    private boolean levelingReward129;
    @SerializedName("lastAdsenseGenerateTime")
    @Expose
    private long lastAdsenseGenerateTime;
    @SerializedName("lastClaimedReward")
    @Expose
    private long lastClaimedReward;
    @SerializedName("totalRewards")
    @Expose
    private long totalRewards;
    @SerializedName("totalDailyRewards")
    @Expose
    private long totalDailyRewards;
    @SerializedName("rewardStreak")
    @Expose
    private long rewardStreak;
    @SerializedName("rewardScore")
    @Expose
    private long rewardScore;
    @SerializedName("rewardHighScore")
    @Expose
    private long rewardHighScore;
//    @SerializedName("boosterCooldowns")
//    @Expose
//    private BoosterCooldowns boosterCooldowns;
    @SerializedName("adsense_tokens")
    @Expose
    private long adsenseTokens;
    @SerializedName("vanityFirstConvertedBox")
    @Expose
    private long vanityFirstConvertedBox;
    @SerializedName("vanityConvertedBoxToday")
    @Expose
    private long vanityConvertedBoxToday;
    @SerializedName("levelingReward_139")
    @Expose
    private boolean levelingReward139;
  //  @SerializedName("dmcrates-7-2016")
  //  @Expose
 //   private Dmcrates72016 dmcrates72016;
  //  @SerializedName("dmcrates-8-2016")
//    @Expose
 //   private Dmcrates82016 dmcrates82016;
    @SerializedName("flashingSalePopup")
    @Expose
    private long flashingSalePopup;
    @SerializedName("flashingSaleOpens")
    @Expose
    private long flashingSaleOpens;
    @SerializedName("flashingSaleClicks")
    @Expose
    private long flashingSaleClicks;
    @SerializedName("flashingSalePoppedUp")
    @Expose
    private long flashingSalePoppedUp;
    @SerializedName("combatTracker")
    @Expose
    private boolean combatTracker;
    @SerializedName("levelingReward_149")
    @Expose
    private boolean levelingReward149;
  //  @SerializedName("dmcrates-9-2016")
  //  @Expose
  //  private Dmcrates92016 dmcrates92016;
    @SerializedName("levelingReward_159")
    @Expose
    private boolean levelingReward159;
    @SerializedName("autoDetectLanguage")
    @Expose
    private boolean autoDetectLanguage;
    @SerializedName("userLanguage")
    @Expose
    private String userLanguage;
    @SerializedName("REWARD_FIND_CTD")
    @Expose
    private boolean rEWARDFINDCTD;
    @SerializedName("REWARD_FIND_LUCKYKESSIE")
    @Expose
    private boolean rEWARDFINDLUCKYKESSIE;
    @SerializedName("REWARD_FIND_APUNCH")
    @Expose
    private boolean rEWARDFINDAPUNCH;
    @SerializedName("REWARD_FIND_NITROHOLIC")
    @Expose
    private boolean rEWARDFINDNITROHOLIC;
    @SerializedName("REWARD_FIND_VINNY8BALL")
    @Expose
    private boolean rEWARDFINDVINNY8BALL;
    @SerializedName("REWARD_FIND_DCTR")
    @Expose
    private boolean rEWARDFINDDCTR;
    @SerializedName("REWARD_FIND_NINJACHARLIET")
    @Expose
    private boolean rEWARDFINDNINJACHARLIET;
    @SerializedName("levelingReward_169")
    @Expose
    private boolean levelingReward169;
    @SerializedName("quickjoin_timestamp")
    @Expose
    private long quickjoinTimestamp;
    @SerializedName("quickjoin_uses")
    @Expose
    private long quickjoinUses;
    @SerializedName("levelingReward_179")
    @Expose
    private boolean levelingReward179;
    @SerializedName("levelingReward_189")
    @Expose
    private boolean levelingReward189;
    @SerializedName("levelingReward_199")
    @Expose
    private boolean levelingReward199;
    @SerializedName("SANTA_QUEST_STARTED")
    @Expose
    private boolean sANTAQUESTSTARTED;
    @SerializedName("xmas2016_MAIN_LOBBY_8")
    @Expose
    private boolean xmas2016MAINLOBBY8;
    @SerializedName("xmas2016_MAIN_LOBBY_9")
    @Expose
    private boolean xmas2016MAINLOBBY9;
    @SerializedName("xmas2016_MAIN_LOBBY_10")
    @Expose
    private boolean xmas2016MAINLOBBY10;
    @SerializedName("xmas2016_MAIN_LOBBY_11")
    @Expose
    private boolean xmas2016MAINLOBBY11;
    @SerializedName("xmas2016_MAIN_LOBBY_12")
    @Expose
    private boolean xmas2016MAINLOBBY12;
    @SerializedName("xmas2016_MAIN_LOBBY_4")
    @Expose
    private boolean xmas2016MAINLOBBY4;
    @SerializedName("xmas2016_MAIN_LOBBY_6")
    @Expose
    private boolean xmas2016MAINLOBBY6;
    @SerializedName("xmas2016_CVC")
    @Expose
    private boolean xmas2016CVC;
    @SerializedName("xmas2016_BLITZ")
    @Expose
    private boolean xmas2016BLITZ;
    @SerializedName("xmas2016_WALLS")
    @Expose
    private boolean xmas2016WALLS;
    @SerializedName("xmas2016_PAINTBALL")
    @Expose
    private boolean xmas2016PAINTBALL;
    @SerializedName("xmas2016_VAMPZ")
    @Expose
    private boolean xmas2016VAMPZ;
    @SerializedName("xmas2016_ARCADE")
    @Expose
    private boolean xmas2016ARCADE;
    @SerializedName("xmas2016_QUAKE")
    @Expose
    private boolean xmas2016QUAKE;
    @SerializedName("xmas2016_MEGAWALLS")
    @Expose
    private boolean xmas2016MEGAWALLS;
    @SerializedName("xmas2016_TNT")
    @Expose
    private boolean xmas2016TNT;
    @SerializedName("xmas2016_ARENA")
    @Expose
    private boolean xmas2016ARENA;
    @SerializedName("xmas2016_CRAZYWALLS")
    @Expose
    private boolean xmas2016CRAZYWALLS;
    @SerializedName("xmas2016_UHC")
    @Expose
    private boolean xmas2016UHC;
    @SerializedName("xmas2016_WARLORDS")
    @Expose
    private boolean xmas2016WARLORDS;
    @SerializedName("xmas2016_SKYWARS")
    @Expose
    private boolean xmas2016SKYWARS;
    @SerializedName("xmas2016_TKR")
    @Expose
    private boolean xmas2016TKR;
    @SerializedName("xmas2016_SMASH")
    @Expose
    private boolean xmas2016SMASH;
    @SerializedName("xmas2016_SPEEDUHC")
    @Expose
    private boolean xmas2016SPEEDUHC;
    @SerializedName("xmas2016_SKYCLASH")
    @Expose
    private boolean xmas2016SKYCLASH;
    @SerializedName("xmas2016_MAIN_LOBBY_3")
    @Expose
    private boolean xmas2016MAINLOBBY3;
    @SerializedName("xmas2016_MAIN_LOBBY_1")
    @Expose
    private boolean xmas2016MAINLOBBY1;
    @SerializedName("xmas2016_MAIN_LOBBY_5")
    @Expose
    private boolean xmas2016MAINLOBBY5;
    @SerializedName("xmas2016_MAIN_LOBBY_7")
    @Expose
    private boolean xmas2016MAINLOBBY7;
    @SerializedName("xmas2016_MAIN_LOBBY_2")
    @Expose
    private boolean xmas2016MAINLOBBY2;
    @SerializedName("SANTA_FINISHED")
    @Expose
    private boolean santaFinished;
    @SerializedName("gifts_grinch")
    @Expose
    private long giftsGrinch;
    @SerializedName("levelingReward_209")
    @Expose
    private boolean levelingReward209;
    @SerializedName("levelingReward_219")
    @Expose
    private boolean levelingReward219;
    @SerializedName("levelingReward_224")
    @Expose
    private boolean levelingReward224;
    @SerializedName("levelingReward_249")
    @Expose
    private boolean levelingReward249;
  //  @SerializedName("survey")
  //  @Expose
  //  private Survey survey;
 //   @SerializedName("compassStats")
  //  @Expose
 //   private CompassStats compassStats;
    @SerializedName("show_tip_holograms")
    @Expose
    private boolean showTipHolograms;
    @SerializedName("show_wizards_actionbar_info")
    @Expose
    private boolean showWizardsActionbarInfo;
    @SerializedName("show_wizards_cooldown_notifications")
    @Expose
    private boolean showWizardsCooldownNotifications;
    @SerializedName("show_tnttag_actionbar_info")
    @Expose
    private boolean showTnttagActionbarInfo;
    @SerializedName("show_tntrun_actionbar_info")
    @Expose
    private boolean showTntrunActionbarInfo;
    @SerializedName("spec_night_vision")
    @Expose
    private boolean specNightVision;
    @SerializedName("lastLogout")
    @Expose
    private long lastLogout;
   // @SerializedName("challenges")
   // @Expose
   // private Challenges challenges;
    @SerializedName("REWARD_FIND_ORANGEMARSHALL")
    @Expose
    private boolean rEWARDFINDORANGEMARSHALL;
    @SerializedName("networkExpNew")
    @Expose
    private long networkExpNew;
    @SerializedName("socialMedia")
    @Expose
    private SocialMedia socialMedia;
    @SerializedName("network_update_book")
    @Expose
    private String networkUpdateBook;
    @SerializedName("mostRecentGameType")
    @Expose
    private String mostRecentGameType;
    @SerializedName("currentHat")
    @Expose
    private String currentHat;
    @SerializedName("currentGadget")
    @Expose
    private String currentGadget;

    public String getCurrentRank() {
        if (rank != null) return rank;
        if (newPackageRank != null) return newPackageRank;
        if (packageRank != null) return packageRank;
        return "NONE";
    }
}
