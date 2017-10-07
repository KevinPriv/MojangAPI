package com.kbrewster.hypixelapi.exceptions;

public class InvalidApiKeyException extends IllegalStateException {

    public InvalidApiKeyException() {
        super("Invalid API Key");
    }
}
