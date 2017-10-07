package com.kbrewster.hypixelapi.player;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.kbrewster.hypixelapi.player.stats.Stats;

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

    private Stats stats;

    public Stats getStats() {
        return stats;
    }

    public String getId() {
        return id;
    }

    public String getChannel() {
        return channel;
    }

    public String getDisplayName() {
        return displayName;
    }

    public long getFirstLogin() {
        return firstLogin;
    }

    public boolean isGuildNotifications() {
        return guildNotifications;
    }

    public int getKarma() {
        return karma;
    }

    public long getLastLogin() {
        return lastLogin;
    }

    public boolean isMainlobbytutorial() {
        return mainlobbytutorial;
    }

    public int getMostRecentMinecraftVersion() {
        return mostRecentMinecraftVersion;
    }

    public String getMostRecentlyThankedUuid() {
        return mostRecentlyThankedUuid;
    }

    public String getMostRecentlyTippedUuid() {
        return mostRecentlyTippedUuid;
    }

    public long getNetworkExp() {
        return networkExp;
    }

    public int getNetworkLevel() {
        return networkLevel;
    }

    public String getNewClock() {
        return newClock;
    }

    public String getNewPackageRank() {
        return newPackageRank;
    }

    public String getRank() {
        return rank;
    }

    public String getParticalQuality() {
        return particalQuality;
    }

    public String getPlayername() {
        return playername;
    }

    public int getThanksSent() {
        return thanksSent;
    }

    public long getTimePlaying() {
        return timePlaying;
    }

    public String getUuid() {
        return uuid;
    }

    public int getVanityTokens() {
        return vanityTokens;
    }

    public boolean isWebsiteSet() {
        return websiteSet;
    }

    public int getThanksReceived() {
        return thanksReceived;
    }

    public long getLastEugeneMessage() {
        return lastEugeneMessage;
    }

    public long getLast_survey() {
        return last_survey;
    }

    public String getGadget() {
        return gadget;
    }

    public String getWardrobe() {
        return wardrobe;
    }

    public String getPp() {
        return pp;
    }

    public String getMcVersionRp() {
        return mcVersionRp;
    }

    public boolean isNewMainTutorial() {
        return newMainTutorial;
    }

    public boolean isREWARD_FIND_JAMIETHEGEEK() {
        return REWARD_FIND_JAMIETHEGEEK;
    }

    public boolean isREWARD_FIND_AGENTK() {
        return REWARD_FIND_AGENTK;
    }

    public boolean isREWARD_FIND_REZZUS() {
        return REWARD_FIND_REZZUS;
    }

    public boolean isREWARD_FIND_HCHERNDON() {
        return REWARD_FIND_HCHERNDON;
    }

    public boolean isREWARD_FIND_ZEROERRORS() {
        return REWARD_FIND_ZEROERRORS;
    }

    public boolean isREWARD_FIND_VLADTOBEHERE() {
        return REWARD_FIND_VLADTOBEHERE;
    }

    public boolean isREWARD_FIND_CRYPTKEEPER() {
        return REWARD_FIND_CRYPTKEEPER;
    }

    public boolean isREWARD_FIND_MINIKLOON() {
        return REWARD_FIND_MINIKLOON;
    }

    public boolean isREWARD_FIND_PXLPANDA() {
        return REWARD_FIND_PXLPANDA;
    }

    public boolean isREWARD_FIND_ZUMULUS() {
        return REWARD_FIND_ZUMULUS;
    }

    public boolean isREWARD_FIND_PLANCKE() {
        return REWARD_FIND_PLANCKE;
    }

    public boolean isREWARD_FIND_NITROHOLIC() {
        return REWARD_FIND_NITROHOLIC;
    }

    public boolean isREWARD_FIND_APUNCH() {
        return REWARD_FIND_APUNCH;
    }

    public boolean isREWARD_FIND_LUCKYKESSIE() {
        return REWARD_FIND_LUCKYKESSIE;
    }

    public boolean isREWARD_FIND_DCTR() {
        return REWARD_FIND_DCTR;
    }

    public boolean isREWARD_FIND_CTD() {
        return REWARD_FIND_CTD;
    }

    public boolean isREWARD_FIND_NINJACHARLIET() {
        return REWARD_FIND_NINJACHARLIET;
    }

    public boolean isREWARD_FIND_VINNY8BALL() {
        return REWARD_FIND_VINNY8BALL;
    }

    public boolean isTestPass() {
        return testPass;
    }

    public long getVanityFirstConvertedBox() {
        return vanityFirstConvertedBox;
    }

    public long getLastAdsenseGenerateTime() {
        return lastAdsenseGenerateTime;
    }

    public long getPetJourneyTimestamp() {
        return petJourneyTimestamp;
    }

    public long getLastClaimedReward() {
        return lastClaimedReward;
    }

    public int getTotalRewards() {
        return totalRewards;
    }

    public int getTotalDailyRewards() {
        return totalDailyRewards;
    }

    public int getRewardStreak() {
        return rewardStreak;
    }

    public int getRewardScore() {
        return rewardScore;
    }

    public int getRewardHighScore() {
        return rewardHighScore;
    }

    public int getAdsense_tokens() {
        return adsense_tokens;
    }

    public String getUserLanguage() {
        return userLanguage;
    }

    public boolean isTranslationMsgFirstLogin() {
        return translationMsgFirstLogin;
    }

    public boolean isAutoDetectLanguage() {
        return autoDetectLanguage;
    }

    public int getFlashingSalePopup() {
        return flashingSalePopup;
    }

    public int getFlashingSaleOpens() {
        return flashingSaleOpens;
    }

    public int getFlashingSaleClicks() {
        return flashingSaleClicks;
    }

    public int getFlashingSalePoppedUp() {
        return flashingSalePoppedUp;
    }

    public boolean isTranslationMsgFirstLoginEnglish() {
        return translationMsgFirstLoginEnglish;
    }

    public boolean isCombatTracker() {
        return combatTracker;
    }

    public boolean isBeamLink() {
        return beamLink;
    }

    public int getQuickjoin_timestamp() {
        return quickjoin_timestamp;
    }

    public int getQuickjoin_uses() {
        return quickjoin_uses;
    }

    public boolean isSANTA_QUEST_STARTED() {
        return SANTA_QUEST_STARTED;
    }

    public int getGifts_grinch() {
        return gifts_grinch;
    }

    public boolean isSANTA_FINISHED() {
        return SANTA_FINISHED;
    }

    public int getSpec_speed() {
        return spec_speed;
    }

    public boolean isShow_tip_holograms() {
        return show_tip_holograms;
    }

    public boolean isShow_wizard_actionbar_info() {
        return show_wizard_actionbar_info;
    }

    public boolean isShow_tntrun_actionbar_info() {
        return show_tntrun_actionbar_info;
    }

    public boolean isShow_tnttag_actionbar_info() {
        return show_tnttag_actionbar_info;
    }

    public long getLastLogout() {
        return lastLogout;
    }

    public long getNetworkExpNew() {
        return networkExpNew;
    }

    public String getCurrentGadget() {
        return currentGadget;
    }

    public String getNetwork_update_book() {
        return network_update_book;
    }

    public String getMostRecentGameType() {
        return mostRecentGameType;
    }


}
