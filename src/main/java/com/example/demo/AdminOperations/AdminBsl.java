package com.example.demo.AdminOperations;

import java.util.ArrayList;

public class AdminBsl
{
    private Admin admin;
    public AdminBsl() {
        admin = new Admin();
    }





    public String Response(int indx, Boolean State)
    {
        admin.getref().get(indx).getRf().setState(State);
        if(State){
            admin.getref().get(indx).getRf().getUser().getWalletc().put(admin.getref().get(indx).getRf().getAmount());
        }
        return "Admin response done successfully";
    }



}