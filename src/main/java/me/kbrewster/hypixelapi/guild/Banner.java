package me.kbrewster.hypixelapi.guild;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.List;

@Getter
public class Banner {

    @SerializedName("Base")
    @Expose
    private long base;
    @SerializedName("Patterns")
    @Expose
    private List<Pattern> patterns = null;

}
