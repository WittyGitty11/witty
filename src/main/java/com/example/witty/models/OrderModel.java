package com.example.witty.models;

public class OrderModel {
    String response;

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "OrderModel{" +
                "response='" + response + '\'' +
                '}';
    }
}
