package me.kbrewster.mojangapi.profile;


import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import me.kbrewster.mojangapi.Property;

import java.util.Base64;
import java.util.List;

@Getter
public class Profile {

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("properties")
    @Expose
    private List<Property> properties = null;

    public ProfileTextures getTextures() {
        String decoded = new String(Base64.getDecoder().decode(properties.get(0).getValue()));
        return new Gson().fromJson(decoded, ProfileTextures.class);
    }
}
