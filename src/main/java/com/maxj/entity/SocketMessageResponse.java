package com.maxj.entity;

public class SocketMessageResponse {

    private String content;

    public SocketMessageResponse() {
    }

    public SocketMessageResponse(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
