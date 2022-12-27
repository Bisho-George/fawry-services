package com.example.demo.AdminOperations;

import java.util.ArrayList;

public class AdminController {
    private AdminBsl adminBsl;

    public AdminController(AdminBsl adminBsl) {
        this.adminBsl = adminBsl;
    }



    public String Response(int indx, Boolean State)
    {
        return adminBsl.Response(indx, State);
    }

}