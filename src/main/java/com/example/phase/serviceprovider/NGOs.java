package com.example.phase.serviceprovider;

import java.util.Map;

public class NGOs extends Service {

    public NGOs(String name) {
        super(name);
    }

    public boolean handle(Map<String, ?> body) {
        // Assert that mobile number exists
        if (body.get("amount") == null) {
            // Invalid input for WE
            return false;
        }

        return true;
        // API call
    }
}