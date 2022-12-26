package com.example.demo.ServiceProviders;

public class MonthlyReceipt implements ServicesProvider {

    @Override
    public String providerOperation() {
        return "Using Monthly Receipt Service provider";
    }
}
