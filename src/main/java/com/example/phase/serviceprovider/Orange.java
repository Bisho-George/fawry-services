package com.example.phase.serviceprovider;

import java.util.Map;

public class Orange extends Service{
    public Orange(String name) {
        super(name);
    }
    @Override
    public boolean handle(Map<String, ?> body) {
        // Assert that mobile number exists
        if (body.get("mobile number") == null) {
            // Invalid input for Orange
            return false;
        }
        if (body.get("amount") == null) {
            // Invalid input for Orange
            return false;
        }
        return true;
        // API call
    }
}