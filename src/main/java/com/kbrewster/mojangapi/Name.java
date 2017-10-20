package com.kbrewster.mojangapi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class Name {
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("changedToAt")
    @Expose
    private long changedToAt;
}
