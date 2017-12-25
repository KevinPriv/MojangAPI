package me.kbrewster.exceptions;

public class APIException extends IllegalAccessException {
    public APIException(String msg) {
        super(msg);
    }
}
