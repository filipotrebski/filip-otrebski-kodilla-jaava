package com.kodilla.exception.nullpoiter;

public class MessageNotSentException extends Exception{
    public MessageNotSentException(final String message) {
        super(message);
    }
}
