package com.example.phase.serviceprovider;

import java.util.Map;

public class QuarterReceipt extends Service {

    public QuarterReceipt(String name) {
        super(name);
    }

    public boolean handle(Map<String, ?> body) {
        // Assert that mobile number exists
        if (body.get("mobile number") == null) {
            // Invalid input for WE
            return false;
        }
        if (body.get("zip") == null) {
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
