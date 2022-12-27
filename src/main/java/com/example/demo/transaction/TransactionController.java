package com.example.phase.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
    private final TransactionDatabase transactionDatabase;

    @Autowired
    public TransactionController(TransactionDatabase transactionDatabase) {
        this.transactionDatabase = transactionDatabase;
    }

    @GetMapping("/refund")
    public List<Transaction> getAllRefundTransactions() {
        return transactionDatabase.getAllRefundTransactions();
    }
}
