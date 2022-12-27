package com.example.demo.UserOperations;

import com.example.demo.AdminOperations.*;

public class UserController {

    private UserBsl userbsl;

    public UserController(UserBsl userbsl) {
        this.userbsl = userbsl;
    }

    public void payment(double value, PaymentTransController payment){
       userbsl.payment( value,  payment);
    }

    public void startref(RefundTransController payment){
       userbsl.startref(payment);
    }
    public void adding(double value, AddWalletController payment){
        userbsl.adding(value,payment);
    }
}
