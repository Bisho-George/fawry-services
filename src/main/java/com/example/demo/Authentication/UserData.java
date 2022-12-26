package com.example.demo.Authentication;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserData
{
    private ArrayList<User> u;

    public UserData() {
        u = new ArrayList<User>();
    }

    public ArrayList<User> getU() {
        return u;
    }

    public void setU(User obj) {
        u.add(obj);
    }
}