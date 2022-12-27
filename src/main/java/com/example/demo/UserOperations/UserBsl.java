package com.example.demo.UserOperations;

import com.example.demo.AdminOperations.*;

public class UserBsl {

    private User user;


    public UserBsl(User user) {
        this.user = user;
    }

    public void payment(double value, PaymentTransController payment){
        payment.startPayment(payment);

        user.getWalletc().consume(value);
    }

    public void startref(RefundTransController payment){
        payment.startRefund(payment);
    }
    public void adding(double value, AddWalletController payment){
        payment.startAddWallet(payment);

        user.getWalletc().put(value);
    }


}
