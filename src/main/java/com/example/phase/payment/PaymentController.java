package com.example.phase.payment;

import com.example.phase.Discount.OverallDiscount;
import com.example.phase.Discount.SpecificDiscount;
import com.example.phase.serviceprovider.*;
import com.example.phase.transaction.Transaction;
import com.example.phase.transaction.TransactionDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
public class PaymentController {
    List<Service> services = List.of(new WE("we"),new Orange("orange"),new Vodafone("vodafone"),new Etisalat("etisalat"),new NGOs("ngos"),new QuarterReceipt("quarter"),new MonthlyReceipt("monthly"),new CancerHospitals("cancer"),new Schools("schools"));

    TransactionDatabase tb;
    Wallet w;

    SpecificDiscount specificDiscount;
    OverallDiscount overallDiscount;


     @Autowired
    public PaymentController(TransactionDatabase tb,Wallet w,SpecificDiscount specificDiscount,OverallDiscount overallDiscount) {
        this.tb = tb;
        this.w=w;
        this.specificDiscount=specificDiscount;
        this.overallDiscount=overallDiscount;


    }


    public List<Service> getServices() {
        return services;
    }


    @PostMapping("/pay")
    public String pay(@RequestBody Map<String, ?> body) {
        String paymentMethod = body.get("method").toString();
        double amount = Double.parseDouble(body.get("amount").toString());


        String requestedService = body.get("service").toString();
        amount = overallDiscount.disc(amount,requestedService);
        amount = specificDiscount.disc(amount,requestedService);
        for (Service service : services) {
            if (service.getName().equals(requestedService)) {
                if(service.handle(body)){
                    int id = tb.getAll().size()+1;
                    tb.addPayment(id,amount);

                    if(Objects.equals(paymentMethod, "wallet")){
                        if(w.getAmount()>=amount){
                        
                            PaymentMethod p = new WalletPaymentMethod(w);
                            return p.pay(amount);
                        }
                       return "No Enough Money In Your Wallet";
                    }
                    else if(Objects.equals(paymentMethod, "credit")){
                        PaymentMethod p = new CreditCardPaymentMethod();
                        return p.pay(amount);
                    }
                    else{
                        PaymentMethod p = new CashPaymentMethod();
                        return p.pay(amount);
                    }





                }
            }
        }


    return "Payment Transaction Failed";}



}
