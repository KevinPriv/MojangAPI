package com.kbrewster.hypixelapi.guild;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.List;

@Getter
public class Guild {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("coins")
    @Expose
    private long coins;
    @SerializedName("memberSizeLevel")
    @Expose
    private long memberSizeLevel;
    @SerializedName("bankSizeLevel")
    @Expose
    private long bankSizeLevel;
    @SerializedName("coinsEver")
    @Expose
    private long coinsEver;
    @SerializedName("created")
    @Expose
    private long created;
    @SerializedName("members")
    @Expose
    private List<Member> members = null;
    @SerializedName("vipCount")
    @Expose
    private long vipCount;
    @SerializedName("mvpCount")
    @Expose
    private long mvpCount;
    @SerializedName("canTag")
    @Expose
    private boolean canTag;
    @SerializedName("tag")
    @Expose
    private String tag;
    @SerializedName("canMotd")
    @Expose
    private boolean canMotd;
    @SerializedName("canParty")
    @Expose
    private boolean canParty;
    @SerializedName("publiclyListed")
    @Expose
    private boolean publiclyListed;
    @SerializedName("banner")
    @Expose
    private Banner banner;
}
