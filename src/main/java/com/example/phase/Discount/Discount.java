package com.example.phase.Discount;

import org.springframework.stereotype.Service;


public abstract class Discount {


    //cost -= cost*(disc/100)
    public abstract double disc(double amount,String requestedservice);





}
