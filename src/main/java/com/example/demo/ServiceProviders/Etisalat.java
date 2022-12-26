package com.example.demo.ServiceProviders;

import java.util.SplittableRandom;

public class Etisalat implements ServicesProvider {
    @Override
    public String providerOperation() {
        return "Using Etisalat Service provider";
    }
}
