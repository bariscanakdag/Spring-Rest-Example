package com.baris.spring.model;

import org.springframework.http.HttpStatus;

import java.util.TimeZone;

public class ErrorResponse {

    private HttpStatus httpStatus;
    private String errorMessage;
    private long timeZone;

    public ErrorResponse() {

    }

    public ErrorResponse(HttpStatus httpStatus, String errorMessage, long timeZone) {
        this.httpStatus = httpStatus;
        this.errorMessage = errorMessage;
        this.timeZone = timeZone;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public long getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(long timeZone) {
        this.timeZone = timeZone;
    }
}
