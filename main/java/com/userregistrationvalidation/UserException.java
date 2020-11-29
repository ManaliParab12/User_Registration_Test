package com.userregistrationvalidation;

public class UserException extends Exception {
    enum ExceptionType {
        Invali_Input, Null;
    }

    ExceptionType type;
    public UserException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }
}