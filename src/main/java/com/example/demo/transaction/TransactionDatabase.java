package com.example.demo.transaction;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionDatabase {
    private final List<Transaction> transactions = new ArrayList<>();

    public List<Transaction> getAll() {
        return transactions;
    }

    public List<Transaction> getAllRefundTransactions() {
        List<Transaction> results = new ArrayList<>();

        for (Transaction transaction : transactions) {
            if (transaction.getType() == TransactionType.REFUND) {
                results.add(transaction);
            }
        }

        return results;
    }
}
