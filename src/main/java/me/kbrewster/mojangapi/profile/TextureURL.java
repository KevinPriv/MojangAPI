package me.kbrewster.mojangapi.profile;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class TextureURL {
    @SerializedName("url")
    @Expose
    private String url;
}
