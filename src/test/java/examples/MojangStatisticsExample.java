package examples;

import me.kbrewster.mojangapi.MojangAPI;
import me.kbrewster.mojangapi.stats.MetricKeys;
import me.kbrewster.mojangapi.stats.MojangStatistics;

public class MojangStatisticsExample {

    public static void main(String[] args) throws Exception {
        MojangStatistics mc = MojangAPI.getStatistics(MetricKeys.ITEM_MINECRAFT);
        System.out.println("In the past day minecraft has sold: " + mc.getLastDay() + " copies!");
        System.out.println("Minecraft is estimating " + mc.getSaleVelocityPerSeconds() + " copies per second!");
        System.out.println("In total minecraft has sold: " + mc.getTotal() + " copies!");
    }
}
