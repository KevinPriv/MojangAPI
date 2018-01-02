package examples;

import me.kbrewster.hypixelapi.HypixelAPI;
import me.kbrewster.hypixelapi.guild.Guild;
import me.kbrewster.mojangapi.MojangAPI;

import java.util.UUID;

public class HypixelGuildExample {

    /**
     * You can get your key vai /api new on the Hypixel Network
     */
    private static final String KEY = "KEY_HERE";

    public static void main(String[] args) throws Exception {
        HypixelAPI api = new HypixelAPI(KEY);
        String guildID = api.getGuildID("prplz"); // Gets Guilds Identifier
        Guild guild = api.getGuild(guildID);
        System.out.println("Guild Information:");
        System.out.println("Name: " + guild.getName());
        System.out.println("ID: " + guild.getId());
        System.out.println("Tag: " + (guild.isCanTag() ? guild.getTag() : "None"));
        System.out.println("Coins: " + guild.getCoins());
        System.out.println("Members: ");
        guild.getMembers().forEach(member -> {
            String name = MojangAPI.getName(UUID.fromString(MojangAPI.addDashes(member.getUuid())));
            System.out.println(String.format("%s (%s)", name, member.getRank()));
        });

    }
}
