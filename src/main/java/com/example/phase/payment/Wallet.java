package com.example.phase.payment;

import org.springframework.stereotype.Service;

@Service
public class Wallet {

    private double amount;

    public Wallet(){this.amount=0;}

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void addToWallet(double am){
        amount+=am;

    }

    public void consume(double am){
        amount-=am;
    }
}
