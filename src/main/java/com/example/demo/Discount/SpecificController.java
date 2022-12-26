package com.example.demo.Discount;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpecificController
{
    private SpecificBsl specificBsl;
    @Autowired
    public SpecificController(SpecificBsl specificBsl) {
        this.specificBsl = specificBsl;
    }

    public double cost() {
        return specificBsl.cost();
    }
}
