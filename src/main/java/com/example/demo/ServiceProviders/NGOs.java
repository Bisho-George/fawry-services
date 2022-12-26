package com.example.demo.ServiceProviders;

public class NGOs implements ServicesProvider {

    @Override
    public String providerOperation() {
        return "Using NGOs Service provider";
    }
}
