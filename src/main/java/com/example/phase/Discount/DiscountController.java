package com.example.phase.Discount;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DiscountController {

   private SpecificDiscount specificDiscount;
   private OverallDiscount overallDiscount;

    @Autowired
    public DiscountController(SpecificDiscount specificDiscount,OverallDiscount overallDiscount){
        this.specificDiscount=specificDiscount;
       this.overallDiscount=overallDiscount;
    }

    @PostMapping("/overalldiscount")
    public String setOverallDisc(@RequestBody Map<String,?> body){
        double amount = Double.parseDouble(body.get("amount").toString());
        overallDiscount.setDiscount(amount);

        return "Discount "+ amount +"% Added For All Services Providers Successfully";
    }

    @PostMapping("/specificdiscount")
    public String setSpecificDisc(@RequestBody Map<String,?> body){
        double amount = Double.parseDouble(body.get("amount").toString());
       // specificDiscount.setDiscount(amount);

        String service = body.get("service").toString();
        specificDiscount.setServiceType(service,amount);


        return "Discount "+ amount +"% Added For " +service+" Successfully";

    }


    @GetMapping("/listspecific")
    public HashMap<String,Double> getdiscounts(){
        return specificDiscount.getHash_map();
    }



}
