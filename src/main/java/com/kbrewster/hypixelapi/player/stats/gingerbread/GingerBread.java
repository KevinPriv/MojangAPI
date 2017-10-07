package com.kbrewster.hypixelapi.player.stats.gingerbread;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.List;

public class GingerBread {

    @SerializedName("coins")
    @Expose @Getter
    private long coins;
    @SerializedName("booster_active")
    @Expose @Getter
    private String boosterActive;
    @SerializedName("engine_active")
    @Expose @Getter
    private String engineActive;
    @SerializedName("frame_active")
    @Expose @Getter
    private String frameActive;
    @SerializedName("packages")
    @Expose @Getter
    private List<String> packages = null;
    @SerializedName("helmet_active")
    @Expose @Getter
    private String helmetActive;
    @SerializedName("jacket_active")
    @Expose @Getter
    private String jacketActive;
    @SerializedName("shoes_active")
    @Expose @Getter
    private String shoesActive;
    @SerializedName("skin_active")
    @Expose @Getter
    private String skinActive;
    @SerializedName("pants_active")
    @Expose @Getter
    private String pantsActive;
    @SerializedName("horn")
    @Expose @Getter
    private String horn;
    @SerializedName("box_pickups")
    @Expose @Getter
    private long boxPickups;
    @SerializedName("laps_completed")
    @Expose @Getter
    private long lapsCompleted;
    @SerializedName("banana_hits_received")
    @Expose @Getter
    private long bananaHitsReceived;
    @SerializedName("coins_picked_up")
    @Expose @Getter
    private long coinsPickedUp;
    @SerializedName("parts")
    @Expose @Getter
    private String parts;
    @SerializedName("banana_hits_sent")
    @Expose @Getter
    private long bananaHitsSent;
    @SerializedName("silver_trophy")
    @Expose @Getter
    private long silverTrophy;
    @SerializedName("wins")
    @Expose @Getter
    private long wins;
    @SerializedName("blue_torpedo_hit")
    @Expose @Getter
    private long blueTorpedoHit;
    @SerializedName("bronze_trophy")
    @Expose @Getter
    private long bronzeTrophy;
    @SerializedName("gold_trophy")
    @Expose @Getter
    private long goldTrophy;
    @SerializedName("gold_trophy_olympus")
    @Expose @Getter
    private long goldTrophyOlympus;
    @SerializedName("gold_trophy_junglerush")
    @Expose @Getter
    private long goldTrophyJunglerush;
    @SerializedName("silver_trophy_weekly_b")
    @Expose @Getter
    private long silverTrophyWeeklyB;
    @SerializedName("silver_trophy_monthly_b")
    @Expose @Getter
    private long silverTrophyMonthlyB;
    @SerializedName("silver_trophy_olympus")
    @Expose @Getter
    private long silverTrophyOlympus;
    @SerializedName("silver_trophy_junglerush")
    @Expose @Getter
    private long silverTrophyJunglerush;
    @SerializedName("silver_trophy_retro")
    @Expose @Getter
    private long silverTrophyRetro;
    @SerializedName("bronze_trophy_weekly_b")
    @Expose @Getter
    private long bronzeTrophyWeeklyB;
    @SerializedName("bronze_trophy_monthly_b")
    @Expose @Getter
    private long bronzeTrophyMonthlyB;
    @SerializedName("bronze_trophy_olympus")
    @Expose @Getter
    private long bronzeTrophyOlympus;
    @SerializedName("bronze_trophy_junglerush")
    @Expose @Getter
    private long bronzeTrophyJunglerush;
    @SerializedName("bronze_trophy_canyon")
    @Expose @Getter
    private long bronzeTrophyCanyon;
    @SerializedName("box_pickups_weekly_b")
    @Expose @Getter
    private long boxPickupsWeeklyB;
    @SerializedName("box_pickups_monthly_b")
    @Expose @Getter
    private long boxPickupsMonthlyB;
    @SerializedName("box_pickups_olympus")
    @Expose @Getter
    private long boxPickupsOlympus;
    @SerializedName("box_pickups_junglerush")
    @Expose @Getter
    private long boxPickupsJunglerush;
    @SerializedName("box_pickups_hypixelgp")
    @Expose @Getter
    private long boxPickupsHypixelgp;
    @SerializedName("box_pickups_retro")
    @Expose @Getter
    private long boxPickupsRetro;
    @SerializedName("box_pickups_canyon")
    @Expose @Getter
    private long boxPickupsCanyon;
    @SerializedName("olympus_plays")
    @Expose @Getter
    private long olympusPlays;
    @SerializedName("junglerush_plays")
    @Expose @Getter
    private long junglerushPlays;
    @SerializedName("hypixelgp_plays")
    @Expose @Getter
    private long hypixelgpPlays;
    @SerializedName("retro_plays")
    @Expose @Getter
    private long retroPlays;
    @SerializedName("canyon_plays")
    @Expose @Getter
    private long canyonPlays;
    @SerializedName("particle_trail")
    @Expose @Getter
    private String particleTrail;
    @SerializedName("box_pickups_monthly_a")
    @Expose @Getter
    private long boxPickupsMonthlyA;
    @SerializedName("gold_trophy_retro")
    @Expose @Getter
    private long goldTrophyRetro;
    @SerializedName("silver_trophy_monthly_a")
    @Expose @Getter
    private long silverTrophyMonthlyA;
    @SerializedName("silver_trophy_hypixelgp")
    @Expose @Getter
    private long silverTrophyHypixelgp;
    @SerializedName("silver_trophy_canyon")
    @Expose @Getter
    private long silverTrophyCanyon;
    @SerializedName("bronze_trophy_hypixelgp")
    @Expose @Getter
    private long bronzeTrophyHypixelgp;
    @SerializedName("bronze_trophy_monthly_a")
    @Expose @Getter
    private long bronzeTrophyMonthlyA;
    @SerializedName("gold_trophy_canyon")
    @Expose @Getter
    private long goldTrophyCanyon;
    @SerializedName("gold_trophy_hypixelgp")
    @Expose @Getter
    private long goldTrophyHypixelgp;
    @SerializedName("box_pickups_weekly_a")
    @Expose @Getter
    private long boxPickupsWeeklyA;
    @SerializedName("silver_trophy_weekly_a")
    @Expose @Getter
    private long silverTrophyWeeklyA;
    @SerializedName("bronze_trophy_retro")
    @Expose @Getter
    private long bronzeTrophyRetro;
    @SerializedName("bronze_trophy_weekly_a")
    @Expose @Getter
    private long bronzeTrophyWeeklyA;
    @SerializedName("gold_trophy_monthly_b")
    @Expose @Getter
    private long goldTrophyMonthlyB;
    @SerializedName("gold_trophy_weekly_b")
    @Expose @Getter
    private long goldTrophyWeeklyB;
    @SerializedName("gold_trophy_weekly_a")
    @Expose @Getter
    private long goldTrophyWeeklyA;
    @SerializedName("gold_trophy_monthly_a")
    @Expose @Getter
    private long goldTrophyMonthlyA;

    public long getCoins() {
        return coins;
    }

    public void setCoins(long coins) {
        this.coins = coins;
    }

    public String getBoosterActive() {
        return boosterActive;
    }

    public void setBoosterActive(String boosterActive) {
        this.boosterActive = boosterActive;
    }

    public String getEngineActive() {
        return engineActive;
    }

    public void setEngineActive(String engineActive) {
        this.engineActive = engineActive;
    }

    public String getFrameActive() {
        return frameActive;
    }

    public void setFrameActive(String frameActive) {
        this.frameActive = frameActive;
    }

    public List<String> getPackages() {
        return packages;
    }

    public void setPackages(List<String> packages) {
        this.packages = packages;
    }

    public String getHelmetActive() {
        return helmetActive;
    }

    public void setHelmetActive(String helmetActive) {
        this.helmetActive = helmetActive;
    }

    public String getJacketActive() {
        return jacketActive;
    }

    public void setJacketActive(String jacketActive) {
        this.jacketActive = jacketActive;
    }

    public String getShoesActive() {
        return shoesActive;
    }

    public void setShoesActive(String shoesActive) {
        this.shoesActive = shoesActive;
    }

    public String getSkinActive() {
        return skinActive;
    }

    public void setSkinActive(String skinActive) {
        this.skinActive = skinActive;
    }

    public String getPantsActive() {
        return pantsActive;
    }

    public void setPantsActive(String pantsActive) {
        this.pantsActive = pantsActive;
    }

    public String getHorn() {
        return horn;
    }

    public void setHorn(String horn) {
        this.horn = horn;
    }

    public long getBoxPickups() {
        return boxPickups;
    }

    public void setBoxPickups(long boxPickups) {
        this.boxPickups = boxPickups;
    }

    public long getLapsCompleted() {
        return lapsCompleted;
    }

    public void setLapsCompleted(long lapsCompleted) {
        this.lapsCompleted = lapsCompleted;
    }

    public long getBananaHitsReceived() {
        return bananaHitsReceived;
    }

    public void setBananaHitsReceived(long bananaHitsReceived) {
        this.bananaHitsReceived = bananaHitsReceived;
    }

    public long getCoinsPickedUp() {
        return coinsPickedUp;
    }

    public void setCoinsPickedUp(long coinsPickedUp) {
        this.coinsPickedUp = coinsPickedUp;
    }

    public String getParts() {
        return parts;
    }

    public void setParts(String parts) {
        this.parts = parts;
    }

    public long getBananaHitsSent() {
        return bananaHitsSent;
    }

    public void setBananaHitsSent(long bananaHitsSent) {
        this.bananaHitsSent = bananaHitsSent;
    }

    public long getSilverTrophy() {
        return silverTrophy;
    }

    public void setSilverTrophy(long silverTrophy) {
        this.silverTrophy = silverTrophy;
    }

    public long getWins() {
        return wins;
    }

    public void setWins(long wins) {
        this.wins = wins;
    }

    public long getBlueTorpedoHit() {
        return blueTorpedoHit;
    }

    public void setBlueTorpedoHit(long blueTorpedoHit) {
        this.blueTorpedoHit = blueTorpedoHit;
    }

    public long getBronzeTrophy() {
        return bronzeTrophy;
    }

    public void setBronzeTrophy(long bronzeTrophy) {
        this.bronzeTrophy = bronzeTrophy;
    }

    public long getGoldTrophy() {
        return goldTrophy;
    }

    public void setGoldTrophy(long goldTrophy) {
        this.goldTrophy = goldTrophy;
    }

    public long getGoldTrophyOlympus() {
        return goldTrophyOlympus;
    }

    public void setGoldTrophyOlympus(long goldTrophyOlympus) {
        this.goldTrophyOlympus = goldTrophyOlympus;
    }

    public long getGoldTrophyJunglerush() {
        return goldTrophyJunglerush;
    }

    public void setGoldTrophyJunglerush(long goldTrophyJunglerush) {
        this.goldTrophyJunglerush = goldTrophyJunglerush;
    }

    public long getSilverTrophyWeeklyB() {
        return silverTrophyWeeklyB;
    }

    public void setSilverTrophyWeeklyB(long silverTrophyWeeklyB) {
        this.silverTrophyWeeklyB = silverTrophyWeeklyB;
    }

    public long getSilverTrophyMonthlyB() {
        return silverTrophyMonthlyB;
    }

    public void setSilverTrophyMonthlyB(long silverTrophyMonthlyB) {
        this.silverTrophyMonthlyB = silverTrophyMonthlyB;
    }

    public long getSilverTrophyOlympus() {
        return silverTrophyOlympus;
    }

    public void setSilverTrophyOlympus(long silverTrophyOlympus) {
        this.silverTrophyOlympus = silverTrophyOlympus;
    }

    public long getSilverTrophyJunglerush() {
        return silverTrophyJunglerush;
    }

    public void setSilverTrophyJunglerush(long silverTrophyJunglerush) {
        this.silverTrophyJunglerush = silverTrophyJunglerush;
    }

    public long getSilverTrophyRetro() {
        return silverTrophyRetro;
    }

    public void setSilverTrophyRetro(long silverTrophyRetro) {
        this.silverTrophyRetro = silverTrophyRetro;
    }

    public long getBronzeTrophyWeeklyB() {
        return bronzeTrophyWeeklyB;
    }

    public void setBronzeTrophyWeeklyB(long bronzeTrophyWeeklyB) {
        this.bronzeTrophyWeeklyB = bronzeTrophyWeeklyB;
    }

    public long getBronzeTrophyMonthlyB() {
        return bronzeTrophyMonthlyB;
    }

    public void setBronzeTrophyMonthlyB(long bronzeTrophyMonthlyB) {
        this.bronzeTrophyMonthlyB = bronzeTrophyMonthlyB;
    }

    public long getBronzeTrophyOlympus() {
        return bronzeTrophyOlympus;
    }

    public void setBronzeTrophyOlympus(long bronzeTrophyOlympus) {
        this.bronzeTrophyOlympus = bronzeTrophyOlympus;
    }

    public long getBronzeTrophyJunglerush() {
        return bronzeTrophyJunglerush;
    }

    public void setBronzeTrophyJunglerush(long bronzeTrophyJunglerush) {
        this.bronzeTrophyJunglerush = bronzeTrophyJunglerush;
    }

    public long getBronzeTrophyCanyon() {
        return bronzeTrophyCanyon;
    }

    public void setBronzeTrophyCanyon(long bronzeTrophyCanyon) {
        this.bronzeTrophyCanyon = bronzeTrophyCanyon;
    }

    public long getBoxPickupsWeeklyB() {
        return boxPickupsWeeklyB;
    }

    public void setBoxPickupsWeeklyB(long boxPickupsWeeklyB) {
        this.boxPickupsWeeklyB = boxPickupsWeeklyB;
    }

    public long getBoxPickupsMonthlyB() {
        return boxPickupsMonthlyB;
    }

    public void setBoxPickupsMonthlyB(long boxPickupsMonthlyB) {
        this.boxPickupsMonthlyB = boxPickupsMonthlyB;
    }

    public long getBoxPickupsOlympus() {
        return boxPickupsOlympus;
    }

    public void setBoxPickupsOlympus(long boxPickupsOlympus) {
        this.boxPickupsOlympus = boxPickupsOlympus;
    }

    public long getBoxPickupsJunglerush() {
        return boxPickupsJunglerush;
    }

    public void setBoxPickupsJunglerush(long boxPickupsJunglerush) {
        this.boxPickupsJunglerush = boxPickupsJunglerush;
    }

    public long getBoxPickupsHypixelgp() {
        return boxPickupsHypixelgp;
    }

    public void setBoxPickupsHypixelgp(long boxPickupsHypixelgp) {
        this.boxPickupsHypixelgp = boxPickupsHypixelgp;
    }

    public long getBoxPickupsRetro() {
        return boxPickupsRetro;
    }

    public void setBoxPickupsRetro(long boxPickupsRetro) {
        this.boxPickupsRetro = boxPickupsRetro;
    }

    public long getBoxPickupsCanyon() {
        return boxPickupsCanyon;
    }

    public void setBoxPickupsCanyon(long boxPickupsCanyon) {
        this.boxPickupsCanyon = boxPickupsCanyon;
    }

    public long getOlympusPlays() {
        return olympusPlays;
    }

    public void setOlympusPlays(long olympusPlays) {
        this.olympusPlays = olympusPlays;
    }

    public long getJunglerushPlays() {
        return junglerushPlays;
    }

    public void setJunglerushPlays(long junglerushPlays) {
        this.junglerushPlays = junglerushPlays;
    }

    public long getHypixelgpPlays() {
        return hypixelgpPlays;
    }

    public void setHypixelgpPlays(long hypixelgpPlays) {
        this.hypixelgpPlays = hypixelgpPlays;
    }

    public long getRetroPlays() {
        return retroPlays;
    }

    public void setRetroPlays(long retroPlays) {
        this.retroPlays = retroPlays;
    }

    public long getCanyonPlays() {
        return canyonPlays;
    }

    public void setCanyonPlays(long canyonPlays) {
        this.canyonPlays = canyonPlays;
    }

    public String getParticleTrail() {
        return particleTrail;
    }

    public void setParticleTrail(String particleTrail) {
        this.particleTrail = particleTrail;
    }

    public long getBoxPickupsMonthlyA() {
        return boxPickupsMonthlyA;
    }

    public void setBoxPickupsMonthlyA(long boxPickupsMonthlyA) {
        this.boxPickupsMonthlyA = boxPickupsMonthlyA;
    }

    public long getGoldTrophyRetro() {
        return goldTrophyRetro;
    }

    public void setGoldTrophyRetro(long goldTrophyRetro) {
        this.goldTrophyRetro = goldTrophyRetro;
    }

    public long getSilverTrophyMonthlyA() {
        return silverTrophyMonthlyA;
    }

    public void setSilverTrophyMonthlyA(long silverTrophyMonthlyA) {
        this.silverTrophyMonthlyA = silverTrophyMonthlyA;
    }

    public long getSilverTrophyHypixelgp() {
        return silverTrophyHypixelgp;
    }

    public void setSilverTrophyHypixelgp(long silverTrophyHypixelgp) {
        this.silverTrophyHypixelgp = silverTrophyHypixelgp;
    }

    public long getSilverTrophyCanyon() {
        return silverTrophyCanyon;
    }

    public void setSilverTrophyCanyon(long silverTrophyCanyon) {
        this.silverTrophyCanyon = silverTrophyCanyon;
    }

    public long getBronzeTrophyHypixelgp() {
        return bronzeTrophyHypixelgp;
    }

    public void setBronzeTrophyHypixelgp(long bronzeTrophyHypixelgp) {
        this.bronzeTrophyHypixelgp = bronzeTrophyHypixelgp;
    }

    public long getBronzeTrophyMonthlyA() {
        return bronzeTrophyMonthlyA;
    }

    public void setBronzeTrophyMonthlyA(long bronzeTrophyMonthlyA) {
        this.bronzeTrophyMonthlyA = bronzeTrophyMonthlyA;
    }

    public long getGoldTrophyCanyon() {
        return goldTrophyCanyon;
    }

    public void setGoldTrophyCanyon(long goldTrophyCanyon) {
        this.goldTrophyCanyon = goldTrophyCanyon;
    }

    public long getGoldTrophyHypixelgp() {
        return goldTrophyHypixelgp;
    }

    public void setGoldTrophyHypixelgp(long goldTrophyHypixelgp) {
        this.goldTrophyHypixelgp = goldTrophyHypixelgp;
    }

    public long getBoxPickupsWeeklyA() {
        return boxPickupsWeeklyA;
    }

    public void setBoxPickupsWeeklyA(long boxPickupsWeeklyA) {
        this.boxPickupsWeeklyA = boxPickupsWeeklyA;
    }

    public long getSilverTrophyWeeklyA() {
        return silverTrophyWeeklyA;
    }

    public void setSilverTrophyWeeklyA(long silverTrophyWeeklyA) {
        this.silverTrophyWeeklyA = silverTrophyWeeklyA;
    }

    public long getBronzeTrophyRetro() {
        return bronzeTrophyRetro;
    }

    public void setBronzeTrophyRetro(long bronzeTrophyRetro) {
        this.bronzeTrophyRetro = bronzeTrophyRetro;
    }

    public long getBronzeTrophyWeeklyA() {
        return bronzeTrophyWeeklyA;
    }

    public void setBronzeTrophyWeeklyA(long bronzeTrophyWeeklyA) {
        this.bronzeTrophyWeeklyA = bronzeTrophyWeeklyA;
    }

    public long getGoldTrophyMonthlyB() {
        return goldTrophyMonthlyB;
    }

    public void setGoldTrophyMonthlyB(long goldTrophyMonthlyB) {
        this.goldTrophyMonthlyB = goldTrophyMonthlyB;
    }

    public long getGoldTrophyWeeklyB() {
        return goldTrophyWeeklyB;
    }

    public void setGoldTrophyWeeklyB(long goldTrophyWeeklyB) {
        this.goldTrophyWeeklyB = goldTrophyWeeklyB;
    }

    public long getGoldTrophyWeeklyA() {
        return goldTrophyWeeklyA;
    }

    public void setGoldTrophyWeeklyA(long goldTrophyWeeklyA) {
        this.goldTrophyWeeklyA = goldTrophyWeeklyA;
    }

    public long getGoldTrophyMonthlyA() {
        return goldTrophyMonthlyA;
    }

    public void setGoldTrophyMonthlyA(long goldTrophyMonthlyA) {
        this.goldTrophyMonthlyA = goldTrophyMonthlyA;
    }

}
