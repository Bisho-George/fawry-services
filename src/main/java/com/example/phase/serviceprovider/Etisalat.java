package com.example.phase.serviceprovider;

import java.util.Map;

public class Etisalat extends Service{
    public Etisalat(String name) {
        super(name);
    }
    @Override
    public boolean handle(Map<String, ?> body) {
        // Assert that mobile number exists
        if (body.get("mobile number") == null) {
            // Invalid input for Etisalat
            return false;
        }
        if (body.get("amount") == null) {
            // Invalid input for Etisalat
            return false;
        }
        return true;
        // API call
    }
}