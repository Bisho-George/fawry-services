package com.example.demo.Handle;

public class HandlerBsl
{
    private Handler hand;

    public HandlerBsl(Handler hand) {
        this.hand = hand;
    }

    public String Check()
    {
        // Mobile number size must be equal 11.
        if (hand.getForm().getMobilenumber().length() != 11) {
            return "Request Failed, Mobile Number not correct.";
        }
        else if (hand.getForm().getAmount() > hand.getForm().getUser().getObj().getWalletamount()){
            return "Request Failed, Not Enough Money in your wallet.";
        }
        else{
            return "Request Transaction successfully Happened";
        }
    }
}
