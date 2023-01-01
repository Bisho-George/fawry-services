package com.example.phase.serviceprovider;

import com.example.phase.Discount.SpecificDiscount;
import com.example.phase.payment.PaymentBody;

import java.util.Map;

public abstract class Service {
    private final String name;


    protected Service(String name) {
        this.name = name;
    }

    public abstract boolean handle(Map<String, ?> body);

    public String getName() {
        return name;
    }
}
