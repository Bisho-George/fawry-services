package com.example.phase.serviceprovider;

import com.example.phase.payment.PaymentBody;

import java.util.Map;

public class WE extends Service{
    public WE(String name) {
        super(name);
    }

    @Override
    public boolean handle(Map<String, ?> body) {
        // Assert that mobile number exists
        if (body.get("mobile number") == null) {
            // Invalid input for WE
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