package com.example.phase.payment;

import com.example.phase.serviceprovider.Service;
import com.example.phase.serviceprovider.WE;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class PaymentController {
    List<Service> services = List.of(new WE("we"));

    @PostMapping("/pay")
    public void pay(@RequestBody Map<String, ?> body) {
        String paymentMethod = body.get("method").toString();
        int amount = Integer.parseInt(body.get("amount").toString());

        String requestedService = body.get("service").toString();
        for (Service service : services) {
            if (service.getName().equals(requestedService)) {
                service.handle(body);
            }
        }

        // Add new payment transaction (possibly wallet transaction)
    }


//    public void pay(service) {
//        // Apply discounts
//
//        PaymentMethod.pay(discountedAmount);
//    }
}
