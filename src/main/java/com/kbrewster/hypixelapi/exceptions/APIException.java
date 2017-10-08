package com.kbrewster.hypixelapi.exceptions;

public class APIException extends IllegalStateException {
    public APIException(String msg) {
        super(msg);
    }
}
