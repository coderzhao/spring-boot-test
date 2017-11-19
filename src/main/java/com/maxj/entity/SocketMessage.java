package com.maxj.entity;

public class SocketMessage {

    private String message;

    private String date;

    public SocketMessage() {
    }

    public SocketMessage(String message, String date) {
        this.message = message;
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
