package com.example.phase.transaction;

import com.example.phase.payment.Wallet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Objects;

@RestController
public class RefundTransactionController {

    TransactionDatabase tb;
    Wallet w;

    @Autowired
    public RefundTransactionController(TransactionDatabase tb, Wallet w) {
        this.tb = tb;
        this.w = w;
    }

    @PostMapping("/refund/{indx}")
    public void adding(@PathVariable("indx") int indx) {
        int id = tb.getAll().size() + 1;
        double amount = tb.getAll().get(indx - 1).getAmount();

        tb.addRefund(id, amount);
    }


    @PostMapping("/response")
    public String response(@RequestBody Map<String, ?> body) {
        int indx = Integer.parseInt(body.get("index").toString());
        double amount = tb.getAll().get(indx - 1).getAmount();

        // tb.getAll().add(new Transaction(id, "Refund", amount));
        if (Objects.equals(body.get("response").toString(), "Accepted")) {
            w.addToWallet(amount);
            return "Response Accepted And " + amount + " Returned Back Successfully";

        }
        else {
            return "Refund Rejected Successfully";
        }

    }
}