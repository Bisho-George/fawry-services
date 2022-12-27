package com.example.demo.AdminOperations;

public class RefundTransController {

    private RefundTransactions rf;

    public String startRefund(RefundTransController obj) {
        rf.getAdmin().getref().add(obj);
        return "Refund request sent successfully to the admin";
    }

    public RefundTransactions getRf() {
        return rf;
    }
}
