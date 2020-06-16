package com.thoughtworks.exception;

public class OutOfBoundaryException extends RuntimeException {
    private String errorCode;
    private String errorMessage;


    public OutOfBoundaryException(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}
