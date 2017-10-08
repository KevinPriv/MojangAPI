package com.kbrewster.hypixelapi.player;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.kbrewster.hypixelapi.player.misc.Achievements;
import com.kbrewster.hypixelapi.player.misc.HousingMeta;
import com.kbrewster.hypixelapi.player.misc.SocialMedia;
import com.kbrewster.hypixelapi.player.misc.VanityMeta;
import com.kbrewster.hypixelapi.player.stats.Stats;
import lombok.Getter;

import java.util.List;

@Getter
public class Player {

    @SerializedName("_id")
    @Expose 
    private String id;
    @Expose 
    private String channel;
    @Expose 
    private String displayName;
    @Expose 
    private long firstLogin;
    @Expose 
    private boolean guildNotifications;
    @Expose 
    private int karma;
    @Expose 
    private long lastLogin;
    @Expose 
    private boolean mainlobbytutorial;
    @Expose 
    private int mostRecentMinecraftVersion;
    @Expose 
    private String mostRecentlyThankedUuid;
    @Expose 
    private String mostRecentlyTippedUuid;
    @Expose 
    private long networkExp;
    @Expose 
    private int networkLevel;
    @Expose 
    private String newClock;
    @Expose 
    private String newPackageRank;
    @Expose 
    private String rank;
    @Expose 
    private String particalQuality;
    @Expose 
    private String playername;
    @Expose 
    private int thanksSent;
    @Expose 
    private long timePlaying;
    @Expose 
    private String uuid;
    @Expose 
    private int vanityTokens;
    @Expose 
    private boolean websiteSet;
    @Expose 
    private int thanksReceived;
    @Expose 
    private long lastEugeneMessage;
    @Expose 
    private long last_survey;
    @Expose 
    private String gadget;
    @Expose 
    private String wardrobe;
    @Expose 
    private String pp;
    @Expose 
    private String mcVersionRp;
    @Expose
    private boolean newMainTutorial;

    private boolean REWARD_FIND_JAMIETHEGEEK;
    private boolean REWARD_FIND_AGENTK;
    private boolean REWARD_FIND_REZZUS;
    private boolean REWARD_FIND_HCHERNDON;
    private boolean REWARD_FIND_ZEROERRORS;
    private boolean REWARD_FIND_VLADTOBEHERE;
    private boolean REWARD_FIND_CRYPTKEEPER;
    private boolean REWARD_FIND_MINIKLOON;
    private boolean REWARD_FIND_PXLPANDA;
    private boolean REWARD_FIND_ZUMULUS;
    private boolean REWARD_FIND_PLANCKE;
    private boolean REWARD_FIND_NITROHOLIC;
    private boolean REWARD_FIND_APUNCH;
    private boolean REWARD_FIND_LUCKYKESSIE;
    private boolean REWARD_FIND_DCTR;
    private boolean REWARD_FIND_CTD;
    private boolean REWARD_FIND_NINJACHARLIET;
    private boolean REWARD_FIND_VINNY8BALL;
    //TODO: PRESENTS; I REALLY CBA

    @Expose 
    private boolean testPass;
    @Expose 
    private long vanityFirstConvertedBox;
    @Expose 
    private long lastAdsenseGenerateTime;
    @Expose 
    private long petJourneyTimestamp;
    @Expose 
    private long lastClaimedReward;
    @Expose 
    private int totalRewards;
    @Expose 
    private int totalDailyRewards;
    @Expose 
    private int rewardStreak;
    @Expose 
    private int rewardScore;
    @Expose 
    private int rewardHighScore;
    @Expose 
    private int adsense_tokens;
    @Expose 
    private String userLanguage;
    @Expose 
    private boolean translationMsgFirstLogin;
    @Expose 
    private boolean autoDetectLanguage;
    @Expose 
    private int flashingSalePopup;
    @Expose 
    private int flashingSaleOpens;
    @Expose 
    private int flashingSaleClicks;
    @Expose 
    private int flashingSalePoppedUp;
    @Expose 
    private boolean translationMsgFirstLoginEnglish;
    @Expose 
    private boolean combatTracker;
    @Expose 
    private boolean beamLink;
    @Expose 
    private int quickjoin_timestamp;
    @Expose 
    private int quickjoin_uses;
    @Expose 
    private boolean SANTA_QUEST_STARTED;
    @Expose 
    private int gifts_grinch;
    @Expose 
    private boolean SANTA_FINISHED;
    @Expose 
    private int spec_speed;
    @Expose 
    private boolean show_tip_holograms;
    @Expose 
    private boolean show_wizard_actionbar_info;
    @Expose 
    private boolean show_tntrun_actionbar_info;
    @Expose 
    private boolean show_tnttag_actionbar_info;
    @Expose 
    private long lastLogout;
    @Expose 
    private long networkExpNew;
    @Expose 
    private String currentGadget;
    @Expose 
    private String network_update_book;
    @Expose 
    private String mostRecentGameType;
    @Expose 
    private Stats stats;
    @Expose
    private Achievements achievements;
    @Expose
    private List<String> knownAliases = null;
    @Expose
    private List<String> knownAliasesLower = null;
    @SerializedName("housingMeta")
    @Expose
    private HousingMeta housingMeta;
    @SerializedName("vanityMeta")
    @Expose
    private VanityMeta vanityMeta;
    @SerializedName("socialMedia")
    @Expose
    private SocialMedia socialMedia;




}
