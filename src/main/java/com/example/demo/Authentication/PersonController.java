package com.example.demo.Authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController
{
    private PersonBsl personBsl;
    @Autowired
    public PersonController(PersonBsl personBsl) {
        this.personBsl = personBsl;
    }
    public User signin(String Username, String Password){
        return personBsl.signin(Username, Password);
    }
    public String signout(){
        return personBsl.signout();
    }
    public String signup(String Username, String Password){
        return personBsl.signup(Username, Password);
    }
}
