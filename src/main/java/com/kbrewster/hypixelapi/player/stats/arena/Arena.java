package com.kbrewster.hypixelapi.player.stats.arena;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.List;

public class Arena {

    @SerializedName("coins")
    @Expose @Getter
    private long coins;
    @SerializedName("damage_2v2")
    @Expose @Getter
    private long damage2v2;
    @SerializedName("deaths_2v2")
    @Expose @Getter
    private long deaths2v2;
    @SerializedName("games_2v2")
    @Expose @Getter
    private long games2v2;
    @SerializedName("healed_2v2")
    @Expose @Getter
    private long healed2v2;
    @SerializedName("losses_2v2")
    @Expose @Getter
    private long losses2v2;
    @SerializedName("offensive")
    @Expose @Getter
    private String offensive;
    @SerializedName("packages")
    @Expose @Getter
    private List<String> packages = null;
    @SerializedName("rating")
    @Expose @Getter
    private double rating;
    @SerializedName("win_streaks_2v2")
    @Expose @Getter
    private long winStreaks2v2;
    @SerializedName("wins_2v2")
    @Expose @Getter
    private long wins2v2;
    @SerializedName("win_streaks_1v1")
    @Expose @Getter
    private long winStreaks1v1;
    @SerializedName("deaths_1v1")
    @Expose @Getter
    private long deaths1v1;
    @SerializedName("damage_1v1")
    @Expose @Getter
    private long damage1v1;
    @SerializedName("losses_1v1")
    @Expose @Getter
    private long losses1v1;
    @SerializedName("games_1v1")
    @Expose @Getter
    private long games1v1;
    @SerializedName("ultimate")
    @Expose @Getter
    private String ultimate;
    @SerializedName("support")
    @Expose @Getter
    private String support;
    @SerializedName("utility")
    @Expose @Getter
    private String utility;
    @SerializedName("active_rune")
    @Expose @Getter
    private String activeRune;
    @SerializedName("rune_level_slowing")
    @Expose @Getter
    private long runeLevelSlowing;
    @SerializedName("rune_level_damage")
    @Expose @Getter
    private long runeLevelDamage;
    @SerializedName("rune_level_energy")
    @Expose @Getter
    private long runeLevelEnergy;
    @SerializedName("rune_level_speed")
    @Expose @Getter
    private long runeLevelSpeed;
    @SerializedName("lvl_damage")
    @Expose @Getter
    private long lvlDamage;
    @SerializedName("lvl_health")
    @Expose @Getter
    private long lvlHealth;
    @SerializedName("lvl_energy")
    @Expose @Getter
    private long lvlEnergy;
    @SerializedName("lvl_cooldown")
    @Expose @Getter
    private long lvlCooldown;
    @SerializedName("keys")
    @Expose @Getter
    private long keys;
    @SerializedName("coins_spent")
    @Expose @Getter
    private long coinsSpent;
    @SerializedName("magical_chest")
    @Expose @Getter
    private long magicalChest;
    @SerializedName("selected_sword")
    @Expose @Getter
    private String selectedSword;
    @SerializedName("healed_1v1")
    @Expose @Getter
    private long healed1v1;
    @SerializedName("hat")
    @Expose @Getter
    private String hat;
    @SerializedName("win_streaks_4v4")
    @Expose @Getter
    private long winStreaks4v4;
    @SerializedName("losses_4v4")
    @Expose @Getter
    private long losses4v4;
    @SerializedName("healed_4v4")
    @Expose @Getter
    private long healed4v4;
    @SerializedName("damage_4v4")
    @Expose @Getter
    private long damage4v4;
    @SerializedName("deaths_4v4")
    @Expose @Getter
    private long deaths4v4;
    @SerializedName("games_4v4")
    @Expose @Getter
    private long games4v4;
    @SerializedName("wins_4v4")
    @Expose @Getter
    private long wins4v4;

}
