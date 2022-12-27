package com.example.demo.AdminOperations;

public class AddWalletController {
private AddWalletTransactions adt;


    public String startAddWallet(AddWalletController obj) {
        adt.getAdmin().getAddition().add(obj);
        return "Addition request sent successfully to the admin";
    }

    public AddWalletTransactions getAdt() {
        return adt;
    }
}
