package com.example.phase.payment;

public class CashPaymentMethod implements PaymentMethod{
    @Override
    public String pay(double amount) {
        return amount + " Has Payed With Cash ";
    }
}
