package com.example.phase.payment;

import org.springframework.stereotype.Service;


public class WalletPaymentMethod implements PaymentMethod{
    private Wallet w;

    public WalletPaymentMethod(Wallet w){
        this.w=w;

    }
    @Override
    public String pay(double amount) {
        w.consume(amount);
        return amount + " Has Payed With Wallet ";
    }




}
