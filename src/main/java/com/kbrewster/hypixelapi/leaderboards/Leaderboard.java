package com.kbrewster.hypixelapi.leaderboards;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.List;

@Getter
public class Leaderboard {

    @SerializedName("path")
    @Expose
    private String path;
    @SerializedName("prefix")
    @Expose
    private String prefix;
    @SerializedName("count")
    @Expose
    private long count;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("leaders")
    @Expose
    private List<String> leaders = null;
    @SerializedName("title")
    @Expose
    private String title;
}
