package com.kbrewster.hypixelapi.player;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.kbrewster.hypixelapi.player.stats.Stats;
import lombok.Getter;

public class Player {

    @SerializedName("_id")
    @Expose @Getter
    private String id;
    @Expose @Getter
    private String channel;
    @Expose @Getter
    private String displayName;
    @Expose @Getter
    private long firstLogin;
    @Expose @Getter
    private boolean guildNotifications;
    @Expose @Getter
    private int karma;
    @Expose @Getter
    private long lastLogin;
    @Expose @Getter
    private boolean mainlobbytutorial;
    @Expose @Getter
    private int mostRecentMinecraftVersion;
    @Expose @Getter
    private String mostRecentlyThankedUuid;
    @Expose @Getter
    private String mostRecentlyTippedUuid;
    @Expose @Getter
    private long networkExp;
    @Expose @Getter
    private int networkLevel;
    @Expose @Getter
    private String newClock;
    @Expose @Getter
    private String newPackageRank;
    @Expose @Getter
    private String rank;
    @Expose @Getter
    private String particalQuality;
    @Expose @Getter
    private String playername;
    @Expose @Getter
    private int thanksSent;
    @Expose @Getter
    private long timePlaying;
    @Expose @Getter
    private String uuid;
    @Expose @Getter
    private int vanityTokens;
    @Expose @Getter
    private boolean websiteSet;
    @Expose @Getter
    private int thanksReceived;
    @Expose @Getter
    private long lastEugeneMessage;
    @Expose @Getter
    private long last_survey;
    @Expose @Getter
    private String gadget;
    @Expose @Getter
    private String wardrobe;
    @Expose @Getter
    private String pp;
    @Expose @Getter
    private String mcVersionRp;

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

    @Expose @Getter
    private boolean testPass;
    @Expose @Getter
    private long vanityFirstConvertedBox;
    @Expose @Getter
    private long lastAdsenseGenerateTime;
    @Expose @Getter
    private long petJourneyTimestamp;
    @Expose @Getter
    private long lastClaimedReward;
    @Expose @Getter
    private int totalRewards;
    @Expose @Getter
    private int totalDailyRewards;
    @Expose @Getter
    private int rewardStreak;
    @Expose @Getter
    private int rewardScore;
    @Expose @Getter
    private int rewardHighScore;
    @Expose @Getter
    private int adsense_tokens;
    @Expose @Getter
    private String userLanguage;
    @Expose @Getter
    private boolean translationMsgFirstLogin;
    @Expose @Getter
    private boolean autoDetectLanguage;
    @Expose @Getter
    private int flashingSalePopup;
    @Expose @Getter
    private int flashingSaleOpens;
    @Expose @Getter
    private int flashingSaleClicks;
    @Expose @Getter
    private int flashingSalePoppedUp;
    @Expose @Getter
    private boolean translationMsgFirstLoginEnglish;
    @Expose @Getter
    private boolean combatTracker;
    @Expose @Getter
    private boolean beamLink;
    @Expose @Getter
    private int quickjoin_timestamp;
    @Expose @Getter
    private int quickjoin_uses;
    @Expose @Getter
    private boolean SANTA_QUEST_STARTED;
    @Expose @Getter
    private int gifts_grinch;
    @Expose @Getter
    private boolean SANTA_FINISHED;
    @Expose @Getter
    private int spec_speed;
    @Expose @Getter
    private boolean show_tip_holograms;
    @Expose @Getter
    private boolean show_wizard_actionbar_info;
    @Expose @Getter
    private boolean show_tntrun_actionbar_info;
    @Expose @Getter
    private boolean show_tnttag_actionbar_info;
    @Expose @Getter
    private long lastLogout;
    @Expose @Getter
    private long networkExpNew;
    @Expose @Getter
    private String currentGadget;
    @Expose @Getter
    private String network_update_book;
    @Expose @Getter
    private String mostRecentGameType;

    @Expose @Getter
    private Stats stats;


}
