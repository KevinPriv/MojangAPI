package me.kbrewster.mojangapi.authentication;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class SelectedProfile {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("legacy")
    @Expose
    private boolean legacy;
}
