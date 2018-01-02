package me.kbrewster.mojangapi.authentication;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import me.kbrewster.mojangapi.Property;

import java.util.List;

@Getter
public class User {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("properties")
    @Expose
    private List<Property> properties = null;
}
