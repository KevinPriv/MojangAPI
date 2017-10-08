package com.kbrewster.hypixelapi.player.misc;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.List;

@Getter
public class HousingMeta {

    @SerializedName("tutorialStep")
    @Expose
    private String tutorialStep;
    @SerializedName("packages")
    @Expose
    private List<Object> packages = null;
    @SerializedName("allowedBlocks")
    @Expose
    private List<Object> allowedBlocks = null;
    @SerializedName("visibilityDisabled")
    @Expose
    private boolean visibilityDisabled;
    @SerializedName("playerSettings")
    @Expose
    private PlayerSettings playerSettings;
    @SerializedName("given_cookies_c")
    @Expose
    private List<String> givenCookiesC = null;

}
