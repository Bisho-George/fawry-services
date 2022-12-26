package com.example.demo.ServiceProviders;

public class Schools implements ServicesProvider {
    @Override
    public String providerOperation() {
        return "Using School Service provider";
    }
}
