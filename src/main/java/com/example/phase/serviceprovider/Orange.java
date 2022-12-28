package com.example.phase.serviceprovider;

import java.util.Map;

public class Orange extends Service{
    public Orange(String name) {
        super(name);
    }
    @Override
    public String handle(Map<String, ?> body) {
        // Assert that mobile number exists
        if (body.get("mobile number") == null) {
            // Invalid input for Orange
            return "Invalid input for Orange";
        }
        if (body.get("zip") == null) {
            // Invalid input for Orange
            return "Invalid input for Orange";
        }
        return "charged successfully";
        // API call
    }
}
