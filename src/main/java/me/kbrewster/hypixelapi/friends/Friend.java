package me.kbrewster.hypixelapi.friends;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class Friend {
    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("uuidSender")
    @Expose
    private String uuidSender;
    @SerializedName("uuidReceiver")
    @Expose
    private String uuidReceiver;
    @SerializedName("started")
    @Expose
    private long started;
}
