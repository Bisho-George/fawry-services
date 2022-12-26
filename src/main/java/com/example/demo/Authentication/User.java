package com.example.demo.Authentication;


import com.example.demo.Payment.Wallet;
import com.example.demo.Payment.WalletController;

public class User extends Person {
    private Wallet obj;
    private WalletController walletc;

    private int paymentCount = 0;

    public User(String user, String pass) {
        super(user, pass);
    }

    public User() {
        super();
    }

    public void setObj(Wallet obj) {
        this.obj = obj;
    }

    public void setWalletc(WalletController obj) {
        this.walletc = obj;
    }

    public Wallet getObj() {
        return obj;
    }

    public WalletController getWalletc() {
        return walletc;
    }

    public void setPaymentCount(int paymentCount) {
        this.paymentCount = paymentCount;
    }

    public int getPaymentCount() {
        return paymentCount;
    }

    public void starttrans() {
        paymentCount++;
    }

    public void payment(double value){
        walletc.consume(value);
    }
}
