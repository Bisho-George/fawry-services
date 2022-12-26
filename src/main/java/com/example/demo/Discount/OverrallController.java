package com.example.demo.Discount;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OverrallController {
    private OverrallBsl overrallBsl;

    @Autowired
    public OverrallController(OverrallBsl overrallBsl) {
        this.overrallBsl = overrallBsl;
    }

    public double cost()
    {
        return overrallBsl.cost();
    }
}
