package me.kbrewster.mojangapi.profile;

import lombok.Getter;

public enum Model {

    STEVE(""),
    ALEX("slim");

    @Getter
    private String model;

    Model(String model) {
        this.model = model;
    }
}
