package com.example.demo.Payment;

public class WalletBsl
{
    private Wallet w;

    public WalletBsl(Wallet w) {
        this.w = w;
    }

    // Consume the money you want to send from your wallet
    public String consume(double am) {
        // consume amount of money from the wallet.
        w.amount -= am;
        return "Money taken from the wallet.";
    }
    public String put(double val){
        w.amount += val;
        return "Money Returned back to the wallet";
    }
}
