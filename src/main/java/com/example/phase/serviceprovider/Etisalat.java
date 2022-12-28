package com.example.phase.serviceprovider;

import java.util.Map;

public class Etisalat extends Service{
    public Etisalat(String name) {
        super(name);
    }
    @Override
    public String handle(Map<String, ?> body) {
        // Assert that mobile number exists
        if (body.get("mobile number") == null) {
            // Invalid input for WE
            return "Invalid input for WE";
        }
        if (body.get("zip") == null) {
            // Invalid input for WE
            return "Invalid input for WE";
        }
        return "charged successfully";
        // API call
    }
}
