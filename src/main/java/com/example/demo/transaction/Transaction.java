package com.example.demo.transaction;

public class Transaction {
    private final int id;
    private final TransactionType type;

    public Transaction(int id, TransactionType type) {
        this.id = id;
        this.type = type;
    }

    public TransactionType getType() {
        return type;
    }
}
