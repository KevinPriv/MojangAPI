package com.kbrewster.hypixelapi.player.stats.walls;


import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Walls {

    @SerializedName("coins")
    @Expose
    private long coins;
    @SerializedName("deaths")
    @Expose
    private long deaths;
    @SerializedName("losses")
    @Expose
    private long losses;
    @SerializedName("kills")
    @Expose
    private long kills;
    @SerializedName("weekly_wins_a")
    @Expose
    private long weeklyWinsA;
    @SerializedName("monthly_wins_b")
    @Expose
    private long monthlyWinsB;
    @SerializedName("wins")
    @Expose
    private long wins;
    @SerializedName("packages")
    @Expose
    private List<String> packages = null;
    @SerializedName("weekly_wins_b")
    @Expose
    private long weeklyWinsB;
    @SerializedName("final_form")
    @Expose
    private long finalForm;
    @SerializedName("berserk")
    @Expose
    private long berserk;
    @SerializedName("swift")
    @Expose
    private long swift;
    @SerializedName("opportunity")
    @Expose
    private long opportunity;
    @SerializedName("vampirism")
    @Expose
    private long vampirism;
    @SerializedName("fortune")
    @Expose
    private long fortune;
    @SerializedName("expert_miner")
    @Expose
    private long expertMiner;
    @SerializedName("tenacity")
    @Expose
    private long tenacity;
    @SerializedName("adrenaline")
    @Expose
    private long adrenaline;
    @SerializedName("shout_count")
    @Expose
    private long shoutCount;
    @SerializedName("chainkiller")
    @Expose
    private long chainkiller;
    @SerializedName("haste")
    @Expose
    private long haste;
    @SerializedName("vitality")
    @Expose
    private long vitality;
    @SerializedName("dwarwen_skills")
    @Expose
    private long dwarwenSkills;
    @SerializedName("grave_digger")
    @Expose
    private long graveDigger;
    @SerializedName("hunter")
    @Expose
    private long hunter;
    @SerializedName("stone_guardian")
    @Expose
    private long stoneGuardian;
    @SerializedName("master_troll")
    @Expose
    private long masterTroll;
    @SerializedName("sage")
    @Expose
    private long sage;
    @SerializedName("step")
    @Expose
    private long step;
    @SerializedName("redstone_expert")
    @Expose
    private long redstoneExpert;
    @SerializedName("farmer")
    @Expose
    private long farmer;
    @SerializedName("ready")
    @Expose
    private long ready;
    @SerializedName("canadian")
    @Expose
    private long canadian;
    @SerializedName("guitarist")
    @Expose
    private long guitarist;
    @SerializedName("necromancer")
    @Expose
    private long necromancer;
    @SerializedName("lazyman")
    @Expose
    private long lazyman;
    @SerializedName("fireproof")
    @Expose
    private long fireproof;
    @SerializedName("weekly_kills_a")
    @Expose
    private long weeklyKillsA;
    @SerializedName("monthly_kills_a")
    @Expose
    private long monthlyKillsA;
    @SerializedName("fisherman")
    @Expose
    private long fisherman;
    @SerializedName("trap_engineer")
    @Expose
    private long trapEngineer;
    @SerializedName("gold_rush")
    @Expose
    private long goldRush;
    @SerializedName("creeper_egg")
    @Expose
    private long creeperEgg;
    @SerializedName("get_to_the_choppa")
    @Expose
    private long getToTheChoppa;
    @SerializedName("very_fortunate")
    @Expose
    private long veryFortunate;
    @SerializedName("leather_worker")
    @Expose
    private long leatherWorker;
    @SerializedName("really_shiny")
    @Expose
    private long reallyShiny;
    @SerializedName("soup_drinker")
    @Expose
    private long soupDrinker;
    @SerializedName("pyromaniac")
    @Expose
    private long pyromaniac;
    @SerializedName("einstein")
    @Expose
    private long einstein;
    @SerializedName("skybase_king")
    @Expose
    private long skybaseKing;
    @SerializedName("burn_baby_burn")
    @Expose
    private long burnBabyBurn;
    @SerializedName("thats_hot")
    @Expose
    private long thatsHot;
    @SerializedName("insane_farmer")
    @Expose
    private long insaneFarmer;
    @SerializedName("scotsman")
    @Expose
    private long scotsman;
    @SerializedName("boss_guardian")
    @Expose
    private long bossGuardian;
    @SerializedName("boss_digger")
    @Expose
    private long bossDigger;
    @SerializedName("boss_skills")
    @Expose
    private long bossSkills;
    @SerializedName("cats_eye")
    @Expose
    private long catsEye;
    @SerializedName("artisan")
    @Expose
    private long artisan;
    @SerializedName("bacon")
    @Expose
    private long bacon;
    @SerializedName("bomberman")
    @Expose
    private long bomberman;
    @SerializedName("chemist")
    @Expose
    private long chemist;
    @SerializedName("smart_boy")
    @Expose
    private long smartBoy;
    @SerializedName("snack_lover")
    @Expose
    private long snackLover;
    @SerializedName("blacksmith")
    @Expose
    private long blacksmith;
    @SerializedName("escapist")
    @Expose
    private long escapist;
    @SerializedName("chef")
    @Expose
    private long chef;
    @SerializedName("Inventory")
    @Expose
    private Inventory inventory;
    @SerializedName("monthly_kills_b")
    @Expose
    private long monthlyKillsB;
    @SerializedName("monthly_wins_a")
    @Expose
    private long monthlyWinsA;
    @SerializedName("weekly_kills_b")
    @Expose
    private long weeklyKillsB;
    @SerializedName("monthly_assists_a")
    @Expose
    private long monthlyAssistsA;
    @SerializedName("assists")
    @Expose
    private long assists;
    @SerializedName("weekly_assists_a")
    @Expose
    private long weeklyAssistsA;

    public long getCoins() {
        return coins;
    }

    public void setCoins(long coins) {
        this.coins = coins;
    }

    public long getDeaths() {
        return deaths;
    }

    public void setDeaths(long deaths) {
        this.deaths = deaths;
    }

    public long getLosses() {
        return losses;
    }

    public void setLosses(long losses) {
        this.losses = losses;
    }

    public long getKills() {
        return kills;
    }

    public void setKills(long kills) {
        this.kills = kills;
    }

    public long getWeeklyWinsA() {
        return weeklyWinsA;
    }

    public void setWeeklyWinsA(long weeklyWinsA) {
        this.weeklyWinsA = weeklyWinsA;
    }

    public long getMonthlyWinsB() {
        return monthlyWinsB;
    }

    public void setMonthlyWinsB(long monthlyWinsB) {
        this.monthlyWinsB = monthlyWinsB;
    }

    public long getWins() {
        return wins;
    }

    public void setWins(long wins) {
        this.wins = wins;
    }

    public List<String> getPackages() {
        return packages;
    }

    public void setPackages(List<String> packages) {
        this.packages = packages;
    }

    public long getWeeklyWinsB() {
        return weeklyWinsB;
    }

    public void setWeeklyWinsB(long weeklyWinsB) {
        this.weeklyWinsB = weeklyWinsB;
    }

    public long getFinalForm() {
        return finalForm;
    }

    public void setFinalForm(long finalForm) {
        this.finalForm = finalForm;
    }

    public long getBerserk() {
        return berserk;
    }

    public void setBerserk(long berserk) {
        this.berserk = berserk;
    }

    public long getSwift() {
        return swift;
    }

    public void setSwift(long swift) {
        this.swift = swift;
    }

    public long getOpportunity() {
        return opportunity;
    }

    public void setOpportunity(long opportunity) {
        this.opportunity = opportunity;
    }

    public long getVampirism() {
        return vampirism;
    }

    public void setVampirism(long vampirism) {
        this.vampirism = vampirism;
    }

    public long getFortune() {
        return fortune;
    }

    public void setFortune(long fortune) {
        this.fortune = fortune;
    }

    public long getExpertMiner() {
        return expertMiner;
    }

    public void setExpertMiner(long expertMiner) {
        this.expertMiner = expertMiner;
    }

    public long getTenacity() {
        return tenacity;
    }

    public void setTenacity(long tenacity) {
        this.tenacity = tenacity;
    }

    public long getAdrenaline() {
        return adrenaline;
    }

    public void setAdrenaline(long adrenaline) {
        this.adrenaline = adrenaline;
    }

    public long getShoutCount() {
        return shoutCount;
    }

    public void setShoutCount(long shoutCount) {
        this.shoutCount = shoutCount;
    }

    public long getChainkiller() {
        return chainkiller;
    }

    public void setChainkiller(long chainkiller) {
        this.chainkiller = chainkiller;
    }

    public long getHaste() {
        return haste;
    }

    public void setHaste(long haste) {
        this.haste = haste;
    }

    public long getVitality() {
        return vitality;
    }

    public void setVitality(long vitality) {
        this.vitality = vitality;
    }

    public long getDwarwenSkills() {
        return dwarwenSkills;
    }

    public void setDwarwenSkills(long dwarwenSkills) {
        this.dwarwenSkills = dwarwenSkills;
    }

    public long getGraveDigger() {
        return graveDigger;
    }

    public void setGraveDigger(long graveDigger) {
        this.graveDigger = graveDigger;
    }

    public long getHunter() {
        return hunter;
    }

    public void setHunter(long hunter) {
        this.hunter = hunter;
    }

    public long getStoneGuardian() {
        return stoneGuardian;
    }

    public void setStoneGuardian(long stoneGuardian) {
        this.stoneGuardian = stoneGuardian;
    }

    public long getMasterTroll() {
        return masterTroll;
    }

    public void setMasterTroll(long masterTroll) {
        this.masterTroll = masterTroll;
    }

    public long getSage() {
        return sage;
    }

    public void setSage(long sage) {
        this.sage = sage;
    }

    public long getStep() {
        return step;
    }

    public void setStep(long step) {
        this.step = step;
    }

    public long getRedstoneExpert() {
        return redstoneExpert;
    }

    public void setRedstoneExpert(long redstoneExpert) {
        this.redstoneExpert = redstoneExpert;
    }

    public long getFarmer() {
        return farmer;
    }

    public void setFarmer(long farmer) {
        this.farmer = farmer;
    }

    public long getReady() {
        return ready;
    }

    public void setReady(long ready) {
        this.ready = ready;
    }

    public long getCanadian() {
        return canadian;
    }

    public void setCanadian(long canadian) {
        this.canadian = canadian;
    }

    public long getGuitarist() {
        return guitarist;
    }

    public void setGuitarist(long guitarist) {
        this.guitarist = guitarist;
    }

    public long getNecromancer() {
        return necromancer;
    }

    public void setNecromancer(long necromancer) {
        this.necromancer = necromancer;
    }

    public long getLazyman() {
        return lazyman;
    }

    public void setLazyman(long lazyman) {
        this.lazyman = lazyman;
    }

    public long getFireproof() {
        return fireproof;
    }

    public void setFireproof(long fireproof) {
        this.fireproof = fireproof;
    }

    public long getWeeklyKillsA() {
        return weeklyKillsA;
    }

    public void setWeeklyKillsA(long weeklyKillsA) {
        this.weeklyKillsA = weeklyKillsA;
    }

    public long getMonthlyKillsA() {
        return monthlyKillsA;
    }

    public void setMonthlyKillsA(long monthlyKillsA) {
        this.monthlyKillsA = monthlyKillsA;
    }

    public long getFisherman() {
        return fisherman;
    }

    public void setFisherman(long fisherman) {
        this.fisherman = fisherman;
    }

    public long getTrapEngineer() {
        return trapEngineer;
    }

    public void setTrapEngineer(long trapEngineer) {
        this.trapEngineer = trapEngineer;
    }

    public long getGoldRush() {
        return goldRush;
    }

    public void setGoldRush(long goldRush) {
        this.goldRush = goldRush;
    }

    public long getCreeperEgg() {
        return creeperEgg;
    }

    public void setCreeperEgg(long creeperEgg) {
        this.creeperEgg = creeperEgg;
    }

    public long getGetToTheChoppa() {
        return getToTheChoppa;
    }

    public void setGetToTheChoppa(long getToTheChoppa) {
        this.getToTheChoppa = getToTheChoppa;
    }

    public long getVeryFortunate() {
        return veryFortunate;
    }

    public void setVeryFortunate(long veryFortunate) {
        this.veryFortunate = veryFortunate;
    }

    public long getLeatherWorker() {
        return leatherWorker;
    }

    public void setLeatherWorker(long leatherWorker) {
        this.leatherWorker = leatherWorker;
    }

    public long getReallyShiny() {
        return reallyShiny;
    }

    public void setReallyShiny(long reallyShiny) {
        this.reallyShiny = reallyShiny;
    }

    public long getSoupDrinker() {
        return soupDrinker;
    }

    public void setSoupDrinker(long soupDrinker) {
        this.soupDrinker = soupDrinker;
    }

    public long getPyromaniac() {
        return pyromaniac;
    }

    public void setPyromaniac(long pyromaniac) {
        this.pyromaniac = pyromaniac;
    }

    public long getEinstein() {
        return einstein;
    }

    public void setEinstein(long einstein) {
        this.einstein = einstein;
    }

    public long getSkybaseKing() {
        return skybaseKing;
    }

    public void setSkybaseKing(long skybaseKing) {
        this.skybaseKing = skybaseKing;
    }

    public long getBurnBabyBurn() {
        return burnBabyBurn;
    }

    public void setBurnBabyBurn(long burnBabyBurn) {
        this.burnBabyBurn = burnBabyBurn;
    }

    public long getThatsHot() {
        return thatsHot;
    }

    public void setThatsHot(long thatsHot) {
        this.thatsHot = thatsHot;
    }

    public long getInsaneFarmer() {
        return insaneFarmer;
    }

    public void setInsaneFarmer(long insaneFarmer) {
        this.insaneFarmer = insaneFarmer;
    }

    public long getScotsman() {
        return scotsman;
    }

    public void setScotsman(long scotsman) {
        this.scotsman = scotsman;
    }

    public long getBossGuardian() {
        return bossGuardian;
    }

    public void setBossGuardian(long bossGuardian) {
        this.bossGuardian = bossGuardian;
    }

    public long getBossDigger() {
        return bossDigger;
    }

    public void setBossDigger(long bossDigger) {
        this.bossDigger = bossDigger;
    }

    public long getBossSkills() {
        return bossSkills;
    }

    public void setBossSkills(long bossSkills) {
        this.bossSkills = bossSkills;
    }

    public long getCatsEye() {
        return catsEye;
    }

    public void setCatsEye(long catsEye) {
        this.catsEye = catsEye;
    }

    public long getArtisan() {
        return artisan;
    }

    public void setArtisan(long artisan) {
        this.artisan = artisan;
    }

    public long getBacon() {
        return bacon;
    }

    public void setBacon(long bacon) {
        this.bacon = bacon;
    }

    public long getBomberman() {
        return bomberman;
    }

    public void setBomberman(long bomberman) {
        this.bomberman = bomberman;
    }

    public long getChemist() {
        return chemist;
    }

    public void setChemist(long chemist) {
        this.chemist = chemist;
    }

    public long getSmartBoy() {
        return smartBoy;
    }

    public void setSmartBoy(long smartBoy) {
        this.smartBoy = smartBoy;
    }

    public long getSnackLover() {
        return snackLover;
    }

    public void setSnackLover(long snackLover) {
        this.snackLover = snackLover;
    }

    public long getBlacksmith() {
        return blacksmith;
    }

    public void setBlacksmith(long blacksmith) {
        this.blacksmith = blacksmith;
    }

    public long getEscapist() {
        return escapist;
    }

    public void setEscapist(long escapist) {
        this.escapist = escapist;
    }

    public long getChef() {
        return chef;
    }

    public void setChef(long chef) {
        this.chef = chef;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public long getMonthlyKillsB() {
        return monthlyKillsB;
    }

    public void setMonthlyKillsB(long monthlyKillsB) {
        this.monthlyKillsB = monthlyKillsB;
    }

    public long getMonthlyWinsA() {
        return monthlyWinsA;
    }

    public void setMonthlyWinsA(long monthlyWinsA) {
        this.monthlyWinsA = monthlyWinsA;
    }

    public long getWeeklyKillsB() {
        return weeklyKillsB;
    }

    public void setWeeklyKillsB(long weeklyKillsB) {
        this.weeklyKillsB = weeklyKillsB;
    }

    public long getMonthlyAssistsA() {
        return monthlyAssistsA;
    }

    public void setMonthlyAssistsA(long monthlyAssistsA) {
        this.monthlyAssistsA = monthlyAssistsA;
    }

    public long getAssists() {
        return assists;
    }

    public void setAssists(long assists) {
        this.assists = assists;
    }

    public long getWeeklyAssistsA() {
        return weeklyAssistsA;
    }

    public void setWeeklyAssistsA(long weeklyAssistsA) {
        this.weeklyAssistsA = weeklyAssistsA;
    }

}
