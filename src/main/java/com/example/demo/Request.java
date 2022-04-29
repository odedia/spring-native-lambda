package com.example.demo;

import java.io.Serializable;

public class Request implements Serializable {
    private String userId;

    // constructors, getters & setters
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


}