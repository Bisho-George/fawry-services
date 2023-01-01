package com.example.phase.payment;

import com.example.phase.transaction.TransactionDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Wallet")
public class WalletController {
    private Wallet wallet;
    private TransactionDatabase transactionDatabase;

    @Autowired
    public WalletController(Wallet wallet, TransactionDatabase transactionDatabase) {
        this.wallet = wallet;
        this.transactionDatabase = transactionDatabase;
    }


    @PostMapping("/Add/{amount}")
    public String addToWallet(@PathVariable ("amount") double amount){
        wallet.addToWallet(amount);
        transactionDatabase.addAddition(amount);
        return amount + " Added Successfully To Your Wallet";


    }

    @GetMapping("/ViewAmount")
    public String viewAmount(){
        return "Your Current Balance = " + wallet.getAmount();

    }



}