package me.kbrewster.hypixelapi.key;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class APIKey {

    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("owner")
    @Expose
    private String owner;
    @SerializedName("ownerUuid")
    @Expose
    private String ownerUuid;
    @SerializedName("totalQueries")
    @Expose
    private long totalQueries;

    @Override
    public String toString() {
        return key;
    }
}
