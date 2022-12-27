package com.example.demo.Handle;

public class HandlerController {
    private HandlerBsl handlerBsl;

    public HandlerController(HandlerBsl handlerBsl) {
        this.handlerBsl = handlerBsl;
    }

    public String Check()
    {
        return handlerBsl.Check();
    }
}
