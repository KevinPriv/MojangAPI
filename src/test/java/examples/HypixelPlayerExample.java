package examples;

import me.kbrewster.hypixelapi.HypixelAPI;
import me.kbrewster.hypixelapi.player.HypixelPlayer;
import me.kbrewster.hypixelapi.player.stats.uhc.UHC;

public class HypixelPlayerExample {

    /**
     * You can get your key vai /api new on the Hypixel Network
     */
    private static final String KEY = "KEY_HERE";

    public static void main(String[] args) throws Exception {
        HypixelAPI api = new HypixelAPI(KEY);
        HypixelPlayer player = api.getPlayer("2PI"); // this instance should only be created once/player! (recommended to cache)
        System.out.println("TheDestinyPig's Stats:");
        System.out.println("Level: " + player.getAbsoluteLevel());
        System.out.println("Rank: " + player.getCurrentRank());
        System.out.println("Total Rewards: " + player.getTotalRewards());
        // You can also get minigame information such as wins/losses and even kit!
        UHC uhc = player.getStats().getUHC();
        System.out.println("UHC Kit: " + uhc.getEquippedKit());
        System.out.println("UHC Coins: " + uhc.getCoins());
        // Values that the player does not have will be assigned as 'null'
        // to safely check if the player has it we suggest to use a null check for these variables
        if (player.getLastNick() != null) {
            System.out.println("The player is currently nicked: " + player.getLastNick());
        }

    }
}
