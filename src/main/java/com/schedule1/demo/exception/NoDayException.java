package com.schedule1.demo.exception;

public class NoDayException extends RuntimeException{
    public NoDayException(String message) {
        super("dayOfWeek is null");}
}
