package com.example.demo.Authentication;

import com.example.demo.UserOperations.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Objects;
@Service
public class PersonBsl
{
    private UserData con;
    @Autowired
    public PersonBsl(UserData con) {
        this.con = con;
    }
    public User signin(String Username, String Password)
    {
        ArrayList<User> us = con.getU();
        for(int i = 0; i < us.size(); i++) {
            if (Objects.equals(us.get(i).getPassword(), Password) && Objects.equals(us.get(i).getUsername(), Username)) {
                // System.out.println("Signed In Successfully");
                return us.get(i);
            }
        }
        return new User();
    }
    public String signout()
    {
        return "Signed Out Successfully";
    }

    public String signup(String username, String Password)
    {
        User us = new User(username, Password);
        con.setU(us);
        return "Your Account Got Created Successfully";
    }
}
