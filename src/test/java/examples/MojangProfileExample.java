package examples;

import me.kbrewster.mojangapi.MojangAPI;
import me.kbrewster.mojangapi.profile.Profile;

import java.util.UUID;

public class MojangProfileExample {

    public static void main(String[] args) throws Exception {

        // They do the same thing, however two different ways to access them :)
        System.out.println("------Profile vai UUID-----");
        Profile uuidProfile = MojangAPI.getProfile(UUID.fromString("1a5c41c8-a952-4ddf-a19c-66f6bb3707a1"));
        System.out.println("Username: " + uuidProfile.getName());
        System.out.println("ID: " + uuidProfile.getId());
        System.out.println("Skin URL: " + uuidProfile.getTextures().getTextures().getSkin().getUrl());
        System.out.println("Cape URL: " + uuidProfile.getTextures().getTextures().getCape().getUrl());
        System.out.println("--------------------------\n");

        System.out.println("------Profile vai Username-----");
        Profile userProfile = MojangAPI.getProfile("prplz");
        System.out.println("Username: " + userProfile.getName());
        System.out.println("ID: " + userProfile.getId());
        System.out.println("Skin URL: " + userProfile.getTextures().getTextures().getSkin().getUrl());
        System.out.println("Cape URL: " + userProfile.getTextures().getTextures().getCape().getUrl());
        System.out.println("--------------------------\n");

    }
}
