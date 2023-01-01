package com.example.phase.serviceprovider;

import com.example.phase.payment.PaymentBody;

import java.util.Map;

public class Vodafone extends Service {
    public Vodafone(String name) {
        super(name);
    }

    @Override
    public boolean handle(Map<String, ?> body) {
        // Assert that mobile number exists
        if (body.get("mobile number") == null) {
            // Invalid input for Vodafone
            return false;
        }
        if (body.get("amount") == null) {
            // Invalid input for WE
            return false;
        }

        return true;
        // API call
    }
}