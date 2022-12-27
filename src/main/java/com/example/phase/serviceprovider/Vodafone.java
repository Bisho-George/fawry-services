package com.example.phase.serviceprovider;

import com.example.phase.payment.PaymentBody;

import java.util.Map;

public class Vodafone extends Service {
    public Vodafone(String name) {
        super(name);
    }

    @Override
    public void handle(Map<String, ?> body) {
        // Assert that mobile number exists
        if (body.get("mobile number") == null) {
            // Invalid input for Vodafone
        }

        // API call
    }
}
