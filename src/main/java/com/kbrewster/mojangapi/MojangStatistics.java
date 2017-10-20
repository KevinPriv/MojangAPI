package com.kbrewster.mojangapi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class MojangStatistics {
    @SerializedName("total")
    @Expose
    private long total;
    @SerializedName("last24_h")
    @Expose
    private long lastDay;
    @SerializedName("saleVelocityPerSeconds")
    @Expose
    private long saleVelocityPerSeconds;

}
