package com.example.phase.payment;

public class CreditCardPaymentMethod implements PaymentMethod{
    @Override
    public String pay(double amount) {
        return amount + " Has Payed With Credit ";
    }
}
