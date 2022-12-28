package com.example.demo.serviceprovider;

import com.example.demo.payment.PaymentBody;
import org.springframework.http.ResponseEntity;

import java.util.Map;


public class WE extends Service {
    public WE(String name) {
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
        // API call
        return "charged successfully";
    }
}
