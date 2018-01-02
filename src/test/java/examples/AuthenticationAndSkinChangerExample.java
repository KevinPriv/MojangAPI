package examples;

import me.kbrewster.mojangapi.MojangAPI;
import me.kbrewster.mojangapi.authentication.AuthenticatedUser;
import me.kbrewster.mojangapi.profile.Model;

import java.io.File;

public class AuthenticationAndSkinChangerExample {

    private final static String USERNAME = "PUT_USERNAME_HERE";
    private final static String PASSWORD = "PUT_PASSWORD_HERE";

    public static void main(String[] args) throws Exception {
        AuthenticatedUser user = MojangAPI.authenticate(USERNAME, PASSWORD, true);
        System.out.println("User successfully authenticated: " + user.getSelectedProfile().getName());

        MojangAPI.uploadSkin(user.getAccessToken(),
                USERNAME,
                Model.ALEX,
                new File("C:\\...\\skin.png"));
        System.out.println("Skin was successfully uploaded!");

        MojangAPI.changeSkin(user.getAccessToken(),
                USERNAME,
                Model.STEVE,
                "https://namemc.com/skin/f85aeacbe49dfffd");
        System.out.println("Skin was successfully changed!");

        MojangAPI.resetSkin(user.getAccessToken(),
                USERNAME);
        System.out.println("Skin was successfully reset!");
    }

}
