package com.example.phase.serviceprovider;

import com.example.phase.payment.PaymentBody;

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
