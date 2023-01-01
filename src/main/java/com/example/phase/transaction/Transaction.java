package com.example.phase.transaction;

public class Transaction {
    private final int id;
    private final String type;
    private final double amount;


    public Transaction(int id, String type,double amount) {
        this.id = id;
        this.type = type;
        this.amount=amount;

    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public int getId() {
        return id;
    }

}
