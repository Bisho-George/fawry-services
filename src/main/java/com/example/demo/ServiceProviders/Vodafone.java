package com.example.demo.ServiceProviders;

public class Vodafone implements ServicesProvider {

    @Override
    public String providerOperation() {
        return "Using Vodafone Service provider";
    }
}
