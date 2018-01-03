package examples;

import me.kbrewster.exceptions.APIException;
import me.kbrewster.exceptions.InvalidSessionException;
import me.kbrewster.hypixelapi.HypixelAPI;
import me.kbrewster.hypixelapi.session.Session;
import me.kbrewster.mojangapi.MojangAPI;

import java.io.IOException;
import java.util.UUID;

public class HypixelSessionExample {
    /**
     * You can get your key vai /api new on the Hypixel Network
     */
    private static final String KEY = "KEY_HERE";

    public static void main(String[] args) throws IOException, APIException {
        try {
            HypixelAPI api = new HypixelAPI(KEY);
            Session session = api.getSession("Semx11");

            System.out.println("Semx11 is currently in " + session.getServer());
            System.out.println("He is currently ingame with: ");
            for (String player : session.getPlayers()) {
                UUID uuid = UUID.fromString(MojangAPI.addDashes(player));
                System.out.println(MojangAPI.getName(uuid));
            }
        } catch (InvalidSessionException e) {
            System.out.println("Semx11 is not in a game!");
        }
    }
}
