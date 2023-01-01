package com.example.phase.serviceprovider;

import java.util.Map;

public class CancerHospitals extends Service {


    public CancerHospitals(String name) {
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
