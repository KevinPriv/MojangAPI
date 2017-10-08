package com.kbrewster.hypixelapi.guild;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class Pattern {

    @SerializedName("Pattern")
    @Expose
    private String pattern;
    @SerializedName("Color")
    @Expose
    private long color;

}
