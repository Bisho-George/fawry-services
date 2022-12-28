package com.example.demo.serviceprovider;

import com.example.demo.payment.PaymentBody;

import java.util.Map;

public abstract class Service {
    private final String name;

    protected Service(String name) {
        this.name = name;
    }

    public abstract String handle(Map<String, ?> body);

    public String getName() {
        return name;
    }
}
