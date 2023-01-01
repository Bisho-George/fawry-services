package com.example.phase.payment;


public class WalletPaymentMethod implements PaymentMethod{
    private Wallet wallet;

    public WalletPaymentMethod(Wallet wallet){
        this.wallet = wallet;
    }
    @Override
    public String pay(double amount) {
        wallet.consume(amount);
        return amount + " Has Payed With Wallet ";
    }




}
