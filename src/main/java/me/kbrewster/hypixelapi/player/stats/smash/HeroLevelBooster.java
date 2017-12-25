package me.kbrewster.hypixelapi.player.stats.smash;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class HeroLevelBooster {

    @SerializedName("key")
    @Expose
    @Getter private String key;
    @SerializedName("multiplier")
    @Expose
    @Getter private long multiplier;
    @SerializedName("value")
    @Expose
    @Getter private long value;
    @SerializedName("plays")
    @Expose
    @Getter private long plays;

}