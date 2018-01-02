package examples;

import me.kbrewster.mojangapi.MojangAPI;
import me.kbrewster.mojangapi.profile.Name;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.UUID;

public class MojangNamesExample {

    public static void main(String[] args) throws Exception {
        System.out.println("------Name -> UUID-----");
        String username = MojangAPI.getName(UUID.fromString("8233b1e5-bd74-441b-aa34-ee812263cca9"));
        System.out.println("UUID (8233b1e5-bd74-441b-aa34-ee812263cca9) is " + username);
        System.out.println("--------------------------\n");

        System.out.println("------UUID -> Username-----");
        UUID uuid = MojangAPI.getUUID("TheDestinyPig");
        System.out.println("TheDestinyPigs UUID is " + uuid);
        System.out.println("--------------------------\n");

        System.out.println("------- Name History -----");
        for (Name history : MojangAPI.getNameHistory(uuid)) {
            String name = history.getName();
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println(String.format("%s -> %s", name, formatter.format(history.getChangedToAt())));
        }
        System.out.println("--------------------------\n");
    }
}
