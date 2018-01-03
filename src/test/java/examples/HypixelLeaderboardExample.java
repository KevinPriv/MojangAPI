package examples;

import me.kbrewster.hypixelapi.HypixelAPI;
import me.kbrewster.hypixelapi.leaderboards.Leaderboard;
import me.kbrewster.hypixelapi.leaderboards.Leaderboards;
import me.kbrewster.mojangapi.MojangAPI;

import java.util.List;
import java.util.UUID;

public class HypixelLeaderboardExample {

    /**
     * You can get your key vai /api new on the Hypixel Network
     */
    private static final String KEY = "KEY_HERE";

    public static void main(String[] args) throws Exception {
        HypixelAPI api = new HypixelAPI(KEY);
        List<Leaderboard> sgLeaderboards = api.getLeaderboard(Leaderboards.SURVIVAL_GAMES);
        for (Leaderboard leaderboard : sgLeaderboards) {
            System.out.println(String.format("%s (%s)", leaderboard.getTitle(), leaderboard.getPrefix()));
            for (int i = 0; leaderboard.getLeaders().size() > i; i++) {
                UUID uuid = UUID.fromString(leaderboard.getLeaders().get(i));
                System.out.println(i + ") " + MojangAPI.getName(uuid));
            }
        }

    }
}
