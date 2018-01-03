package examples;

import me.kbrewster.hypixelapi.HypixelAPI;
import me.kbrewster.hypixelapi.friends.Friend;
import me.kbrewster.mojangapi.MojangAPI;

import java.util.List;
import java.util.UUID;

public class HypixelFriendsExample {

    /**
     * You can get your key vai /api new on the Hypixel Network
     */
    private static final String KEY = "KEY_HERE";

    public static void main(String[] args) throws Exception {
        HypixelAPI api = new HypixelAPI(KEY);
        UUID uuid = MojangAPI.getUUID("boomboompower");
        List<Friend> friends = api.getFriends(uuid);
        for (Friend friend : friends) {
            boolean isReciever = friend.getUuidReceiver().equals(MojangAPI.stripDashes(uuid));
            String uuidStr = (isReciever ? friend.getUuidSender() : friend.getUuidReceiver());
            UUID uuidFriend = UUID.fromString(MojangAPI.addDashes(uuidStr));
            System.out.println(MojangAPI.getName(uuidFriend));
        }
    }
}
