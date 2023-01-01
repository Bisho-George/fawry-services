package com.example.phase.payment;

import com.example.phase.transaction.Transaction;
import com.example.phase.transaction.TransactionDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Wallet")
public class WalletController {
    private Wallet w;
    private TransactionDatabase tb;

    @Autowired
    public WalletController(Wallet w,TransactionDatabase tb) {
        this.w = w;
        this.tb=tb;
    }


    @PostMapping("/Add/{amount}")
    public String addToWallet(@PathVariable ("amount") double amount){
        w.addToWallet(amount);
        tb.addAddition(amount);
        return amount + " Added Successfully To Your Wallet";


    }

    @GetMapping("/ViewAmount")
    public String viewAmount(){
        return "Your Current Balance = " + w.getAmount();

    }



}