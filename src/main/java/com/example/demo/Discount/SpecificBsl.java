package com.example.demo.Discount;


import com.example.demo.Payment.IPayment;
import org.springframework.stereotype.Service;

@Service
public class SpecificBsl
{
    private IPayment payment;
    public double cost()
    {
        double totalcost = payment.cost();
        totalcost -= (totalcost * 0.2);
        return totalcost;
    }
}
