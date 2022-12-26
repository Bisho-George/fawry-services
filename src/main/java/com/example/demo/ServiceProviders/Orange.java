package com.example.demo.ServiceProviders;

public class Orange implements ServicesProvider {

    @Override
    public String providerOperation() {
        return "Using Orange Service provider";
    }
}
