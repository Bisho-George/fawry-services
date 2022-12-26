package com.example.demo.Discount;


import com.example.demo.Payment.IPayment;
import org.springframework.stereotype.Service;

@Service
public class OverrallBsl {
    public IPayment payment;
    public double cost()
    {
        double totalcost = payment.cost();
        totalcost -= (totalcost * 0.1);
        return totalcost;
    }
}
