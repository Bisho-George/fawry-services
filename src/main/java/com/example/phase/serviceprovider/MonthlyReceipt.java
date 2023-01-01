package com.example.phase.serviceprovider;

import java.util.Map;

public class MonthlyReceipt extends Service{

public MonthlyReceipt(String name){
    super(name);

}

    public boolean handle(Map<String, ?> body) {
        // Assert that mobile number exists
        if (body.get("mobile number") == null) {
            return false;
        }
        if (body.get("zip") == null) {
            return false;
        }
        if (body.get("amount") == null) {
            return false;
        }
        return true;
        // API call
    }
}
