package com.example.demo.Handle;

import com.example.demo.UserOperations.User;
public class Form
{
    private String mobilenumber;
    private double amount;

    private User user;

    public Form(String mn, double am) {
        this.mobilenumber = mn;
        this.amount = am;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public double getAmount() {
        return amount;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }
}

