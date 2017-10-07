package com.kbrewster.hypixelapi.exceptions;

public class InvalidPlayerException extends IllegalStateException {

    public InvalidPlayerException() {
        super("Invalid Player!");
    }
}
