package com.kbrewster.hypixelapi.guild;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class Member {

    @SerializedName("uuid")
    @Expose
    private String uuid;
    @SerializedName("rank")
    @Expose
    private String rank;
    @SerializedName("joined")
    @Expose
    private long joined;
}
