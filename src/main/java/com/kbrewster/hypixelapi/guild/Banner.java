package com.kbrewster.hypixelapi.guild;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class Banner {

    @SerializedName("Base")
    @Expose
    private long base;
    @SerializedName("Patterns")
    @Expose
    private List<Pattern> patterns = null;

}
