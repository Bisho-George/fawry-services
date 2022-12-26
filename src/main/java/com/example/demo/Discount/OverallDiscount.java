package com.example.demo.Discount;


import com.example.demo.Payment.IPayment;

public class OverallDiscount extends Discount
{
    public OverallDiscount(IPayment payment) {
        super(payment);
    }
}
