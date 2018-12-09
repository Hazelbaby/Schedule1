package com.schedule1.demo.exception;

public class NoBusinessException extends RuntimeException {
    public NoBusinessException(String message){
        super("No Work!!!");
    }
}
