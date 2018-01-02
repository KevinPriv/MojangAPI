package me.kbrewster.hypixelapi.player;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import me.kbrewster.hypixelapi.player.misc.*;
import me.kbrewster.hypixelapi.player.stats.Stats;
import me.kbrewster.hypixelapi.utils.ILeveling;

import java.util.List;

@Getter
public class HypixelPlayer {

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
    @SerializedName("rankPlusColor")
    @Expose
    private String rankPlusColor;
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
    @SerializedName("SANTA_FINISHED")
    @Expose
    private boolean santaFinished;
    @SerializedName("gifts_grinch")
    @Expose
    private long giftsGrinch;
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
    @SerializedName("monthlyPackageRank")
    @Expose
    private String monthlyPackageRank;
    @SerializedName("lastNick")
    @Expose
    private String lastNick;

    public double getAbsoluteLevel() {
        return ILeveling.getExactLevel(networkExp + ILeveling.getTotalExpToFullLevel(networkLevel + 1));
    }

    public String getCurrentRank() {
        if (monthlyPackageRank != null) return monthlyPackageRank;
        if (rank != null && !rank.equals("NORMAL")) return rank;
        if (newPackageRank != null) return newPackageRank;
        if (packageRank != null) return packageRank;
        return "NONE";
    }
}
