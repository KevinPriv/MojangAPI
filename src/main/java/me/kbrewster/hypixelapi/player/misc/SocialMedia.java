package me.kbrewster.hypixelapi.player.misc;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class SocialMedia {

    @SerializedName("links")
    @Expose
    private Links links;
    @SerializedName("prompt")
    @Expose
    private boolean prompt;

}
