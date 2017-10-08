package com.kbrewster.hypixelapi.exceptions;

public class InvalidGuildException extends IllegalStateException {
    public InvalidGuildException() {
        super("Invalid Guild!");
    }
}
