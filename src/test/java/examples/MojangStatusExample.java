package examples;

import me.kbrewster.mojangapi.MojangAPI;


public class MojangStatusExample {

    public static void main(String[] args) throws Exception {
        System.out.println("Mojang Service Status Example");
        MojangAPI.getStatus().forEach((url, state) ->
                System.out.println(url + " is currently " + state + "!")
        );
    }
}
