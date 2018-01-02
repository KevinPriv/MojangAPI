import me.kbrewster.mojangapi.MojangAPI;

public class SkinAPI {

    public static void main(String[] args) throws Exception {
        //    AuthenticatedUser user = MojangAPI.authenticate("aurora1983", "knight", null, true);
        //   System.out.println(user.getAccessToken());

        System.out.println(MojangAPI.getProfile(MojangAPI.
                getUUID("thedestinypig"))
                .getTextures().getTextures().getSkin().getUrl());
      /*  MojangAPI.uploadSkin("6438aa46337643bb829b24197f880335",
                MojangAPI.getUUID("aurora1983"),
                Model.ALEX,
                new File("C:\\Users\\Kevin Brewster\\skin.png"));*/
    }
}
