package com.example.witty.models;

public class CreateOrderModel {

    private String msisdn;
    private String mid;

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    @Override
    public String toString() {
        return "CreateOrderModel{" +
                "msisdn='" + msisdn + '\'' +
                ", mid='" + mid + '\'' +
                '}';
    }
}
