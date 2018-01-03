package examples;

import me.kbrewster.hypixelapi.HypixelAPI;
import me.kbrewster.hypixelapi.key.APIKey;

public class HypixelKeyInfoExample {

    /**
     * You can get your key vai /api new on the Hypixel Network
     */
    private static final String KEY = "KEY_HERE";

    public static void main(String[] args) throws Exception {
        HypixelAPI api = new HypixelAPI(KEY);
        APIKey key = api.getKeyInfo();
        System.out.println(String.format("%s's key has been used a total of %s times", key.getOwner(), key.getTotalQueries()));
    }
}
