package me.kbrewster.mojangapi.profile;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class ProfileTextures {

    @SerializedName("timestamp")
    @Expose
    private long timestamp;
    @SerializedName("profileId")
    @Expose
    private String profileId;
    @SerializedName("profileName")
    @Expose
    private String profileName;
    @SerializedName("textures")
    @Expose
    private Textures textures;
}
