package com.example.phase.Discount;

import com.example.phase.serviceprovider.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@org.springframework.stereotype.Service
public class SpecificDiscount extends Discount {

    HashMap<String, Double> hash_map;

    public SpecificDiscount() {
        this.hash_map = new HashMap<String, Double>();
    }

    public HashMap<String, Double> getHash_map() {
        return hash_map;
    }

    public void setServiceType(String service, Double amount) {
        hash_map.put(service, amount);
    }

    @Override
    public double disc(double amount,String requestedservice) {
        if(hash_map.get(requestedservice)!=null){
            double disc = hash_map.get(requestedservice);
            amount -= (amount*disc/100);
        }



        return amount;

    }

}
