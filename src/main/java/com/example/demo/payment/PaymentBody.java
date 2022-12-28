package com.example.demo.payment;

public class PaymentBody {
    private final String service;
    private final String method;
    private final int amount;

    public PaymentBody(String service, String method, int amount) {
        this.service = service;
        this.method = method;
        this.amount = amount;
    }

    public String getService() {
        return service;
    }

    public int getAmount() {
        return amount;
    }

    public String getMethod() {
        return method;
    }
}
