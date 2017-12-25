package me.kbrewster.hypixelapi.player.misc;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.List;

@Getter
public class VanityMeta {

    @SerializedName("packages")
    @Expose
    private List<Object> packages = null;

}
