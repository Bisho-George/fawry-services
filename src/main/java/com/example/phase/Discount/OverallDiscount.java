package com.example.phase.Discount;

import org.springframework.stereotype.Service;

@Service
public class OverallDiscount extends Discount {
    private double discount;

    @Override
    public double disc(double amount,String requestedservice) {
        amount -= (amount*discount/100);

        return amount;

    }

    public void setDiscount(double discount){
        this.discount=discount;
    }




}
