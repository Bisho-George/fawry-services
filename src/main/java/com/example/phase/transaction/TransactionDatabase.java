package com.example.phase.transaction;

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
            if (transaction.getType() == "Refund") {
                results.add(transaction);
            }
        }

        return results;
    }

    public void addRefund(double amount){
        int id = transactions.size();
        transactions.add(new Transaction(id,"Refund",amount));
    }

    public List<Transaction> getAllPaymentTransactions() {
        List<Transaction> results = new ArrayList<>();

        for (Transaction transaction : transactions) {
            if (transaction.getType() == "Payment") {
                results.add(transaction);
            }
        }

        return results;
    }

    public void addPayment(double amount){
        int id = transactions.size();
        transactions.add(new Transaction(id,"Payment",amount));
    }

    public List<Transaction> getAllAddingWalletTransactions() {
        List<Transaction> results = new ArrayList<>();

        for (Transaction transaction : transactions) {
            if (transaction.getType() == "Addition") {
                results.add(transaction);
            }
        }

        return results;
    }


    public void addAddition(double amount){
        int id = transactions.size();
        transactions.add(new Transaction(id,"Addition",amount));
    }
}
