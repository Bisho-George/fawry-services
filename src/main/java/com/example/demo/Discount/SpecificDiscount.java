package com.example.demo.Discount;

import com.example.demo.Payment.IPayment;

public class SpecificDiscount extends Discount {
    public SpecificDiscount(IPayment payment) {
        super(payment);
    }
}
