package com.example.demo.AdminOperations;

public class PaymentTransController {

    private PaymentTransactions pt;

    public String startPayment(PaymentTransController obj) {
        pt.getAdmin().getPayTrans().add(obj);
        return "Payment request sent successfully to the admin";
    }

    public PaymentTransactions getPt() {
        return pt;
    }
}
