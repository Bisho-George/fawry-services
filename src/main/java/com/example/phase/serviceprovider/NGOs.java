package com.example.phase.serviceprovider;

import java.util.Map;

public class NGOs extends Service {

    public NGOs(String name) {
        super(name);
    }

    public boolean handle(Map<String, ?> body) {
        if (body.get("amount") == null) {
            return false;
        }
        return true;
        // API call
    }
}
