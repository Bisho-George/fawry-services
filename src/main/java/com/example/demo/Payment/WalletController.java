package com.example.demo.Payment;

public class WalletController {
    private WalletBsl walletBsl;

    public WalletController(WalletBsl walletBsl) {
        this.walletBsl = walletBsl;
    }

    public String consume(double am) {
        return walletBsl.consume(am);
    }

    // add the refunded money back to your wallet.
    public String put(double val){
        return walletBsl.put(val);
    }
}
