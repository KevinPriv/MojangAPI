package me.kbrewster.mojangapi.profile;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class Textures {
    @SerializedName("SKIN")
    @Expose
    private TextureURL skin;
    @SerializedName("CAPE")
    @Expose
    private TextureURL cape;
}
