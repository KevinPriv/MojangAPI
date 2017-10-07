package com.kbrewster.hypixelapi.player.stats.arena;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import java.util.List;

/**
 * JSON Class to parse Arcade Stats
 */
@Getter
public class Arena {

    @SerializedName("coins")
    @Expose 
    private long coins;
    @SerializedName("damage_2v2")
    @Expose 
    private long damage2v2;
    @SerializedName("deaths_2v2")
    @Expose 
    private long deaths2v2;
    @SerializedName("games_2v2")
    @Expose 
    private long games2v2;
    @SerializedName("healed_2v2")
    @Expose 
    private long healed2v2;
    @SerializedName("losses_2v2")
    @Expose 
    private long losses2v2;
    @SerializedName("offensive")
    @Expose 
    private String offensive;
    @SerializedName("packages")
    @Expose 
    private List<String> packages = null;
    @SerializedName("rating")
    @Expose 
    private double rating;
    @SerializedName("win_streaks_2v2")
    @Expose 
    private long winStreaks2v2;
    @SerializedName("wins_2v2")
    @Expose 
    private long wins2v2;
    @SerializedName("win_streaks_1v1")
    @Expose 
    private long winStreaks1v1;
    @SerializedName("deaths_1v1")
    @Expose 
    private long deaths1v1;
    @SerializedName("damage_1v1")
    @Expose 
    private long damage1v1;
    @SerializedName("losses_1v1")
    @Expose 
    private long losses1v1;
    @SerializedName("games_1v1")
    @Expose 
    private long games1v1;
    @SerializedName("ultimate")
    @Expose 
    private String ultimate;
    @SerializedName("support")
    @Expose 
    private String support;
    @SerializedName("utility")
    @Expose 
    private String utility;
    @SerializedName("active_rune")
    @Expose 
    private String activeRune;
    @SerializedName("rune_level_slowing")
    @Expose 
    private long runeLevelSlowing;
    @SerializedName("rune_level_damage")
    @Expose 
    private long runeLevelDamage;
    @SerializedName("rune_level_energy")
    @Expose 
    private long runeLevelEnergy;
    @SerializedName("rune_level_speed")
    @Expose 
    private long runeLevelSpeed;
    @SerializedName("lvl_damage")
    @Expose 
    private long lvlDamage;
    @SerializedName("lvl_health")
    @Expose 
    private long lvlHealth;
    @SerializedName("lvl_energy")
    @Expose 
    private long lvlEnergy;
    @SerializedName("lvl_cooldown")
    @Expose 
    private long lvlCooldown;
    @SerializedName("keys")
    @Expose 
    private long keys;
    @SerializedName("coins_spent")
    @Expose 
    private long coinsSpent;
    @SerializedName("magical_chest")
    @Expose 
    private long magicalChest;
    @SerializedName("selected_sword")
    @Expose 
    private String selectedSword;
    @SerializedName("healed_1v1")
    @Expose 
    private long healed1v1;
    @SerializedName("hat")
    @Expose 
    private String hat;
    @SerializedName("win_streaks_4v4")
    @Expose 
    private long winStreaks4v4;
    @SerializedName("losses_4v4")
    @Expose 
    private long losses4v4;
    @SerializedName("healed_4v4")
    @Expose 
    private long healed4v4;
    @SerializedName("damage_4v4")
    @Expose 
    private long damage4v4;
    @SerializedName("deaths_4v4")
    @Expose 
    private long deaths4v4;
    @SerializedName("games_4v4")
    @Expose 
    private long games4v4;
    @SerializedName("wins_4v4")
    @Expose 
    private long wins4v4;

}
