package com.kbrewster.hypixelapi.session;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.List;

@Getter
public class Session {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("server")
    @Expose
    private String server;
    @SerializedName("players")
    @Expose
    private List<String> players = null;


}