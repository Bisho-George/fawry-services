package com.example.demo.AdminOperations;

import com.example.demo.UserOperations.User;

public class AddWalletTransactions {

    private String mobileNumber;
    private double amount;

    private User user;
    private Admin admin;

    public AddWalletTransactions(String mn, double am) {
        this.mobileNumber = mn;
        this.amount = am;

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

    public String getMobileNumber(){
        return mobileNumber;
    }




}
