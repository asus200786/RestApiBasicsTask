package com.epam.esm.exceptions;

public class ServletRuntimeException extends RuntimeException {

    public ServletRuntimeException(String message) {
        super(message);
    }

    public ServletRuntimeException(String message, Exception e) {
        super(message + e.getMessage());
        this.setStackTrace (e.getStackTrace());
    }

    public ServletRuntimeException(Exception e) {
        super(e.getClass().getSimpleName() + ": " +  e.getMessage());
        this.setStackTrace (e.getStackTrace());
    }
}
