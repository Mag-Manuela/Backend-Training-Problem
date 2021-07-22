package com.example.insurance_company.exceptions;

public class AccidentNotFoundException extends RuntimeException{

    public AccidentNotFoundException() {
    }

    public AccidentNotFoundException(String message) {
        super(message);
    }

    public AccidentNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public AccidentNotFoundException(Throwable cause) {
        super(cause);
    }

    public AccidentNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
