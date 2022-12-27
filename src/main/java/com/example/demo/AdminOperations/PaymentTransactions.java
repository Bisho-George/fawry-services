package com.example.demo.AdminOperations;

import com.example.demo.UserOperations.User;

public class PaymentTransactions {
    private String mobileNumber;
    private double amount;
    private String provider;
    private String method;
    private Admin admin;

    private User user;

    public PaymentTransactions(String mn, double am,String provider,String method) {
        this.mobileNumber = mn;
        this.amount = am;
        this.provider=provider;
        this.method=method;

    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public Admin getAdmin() {
        return admin;
    }

    public double getAmount() {
        return amount;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }



}
