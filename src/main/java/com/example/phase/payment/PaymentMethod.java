package com.example.phase.payment;

import org.springframework.stereotype.Service;


public interface PaymentMethod {

    String pay(double amount);

}
