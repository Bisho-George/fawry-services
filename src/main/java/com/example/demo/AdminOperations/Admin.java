package com.example.demo.AdminOperations;


import com.example.demo.Authentication.Person;

import java.util.ArrayList;

public class Admin extends Person
{
    private ArrayList<RefundTransController> ref;
    private ArrayList<PaymentTransController> payTrans;

    private ArrayList<AddWalletController> addition;

    public Admin() {
        super();
        ref = new ArrayList<RefundTransController>();
        payTrans = new ArrayList<PaymentTransController>();
        addition = new ArrayList<AddWalletController>();
    }

    public ArrayList<AddWalletController> getAddition() {
        return addition;
    }

    public ArrayList<PaymentTransController> getPayTrans() {
        return payTrans;
    }

    public ArrayList<RefundTransController> getref() {
        return ref;
    }

}
