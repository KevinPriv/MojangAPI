package me.kbrewster.mojangapi.stats;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class MojangStatistics {
    @SerializedName("total")
    @Expose
    private long total;
    @SerializedName("last24h")
    @Expose
    private long lastDay;
    @SerializedName("saleVelocityPerSeconds")
    @Expose
    private long saleVelocityPerSeconds;

}
