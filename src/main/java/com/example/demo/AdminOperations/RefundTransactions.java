package com.example.demo.AdminOperations;


import com.example.demo.UserOperations.User;

public class RefundTransactions {

    private String mobileNumber;
    private double amount;
    private Boolean state;
    private User user;
    private Admin admin;

    public RefundTransactions(String mn, double am, Boolean st) {
        this.mobileNumber = mn;
        this.amount = am;
        this.state = st;
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

    public String getMobileNumber(){
        return mobileNumber;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public Boolean getState() {
        return state;
    }


}
