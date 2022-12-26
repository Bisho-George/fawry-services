package com.example.demo.Authentication;

public class Person
{
    protected String password;
    protected String username;
    protected UserData cl;

    // Constructor
    public Person(String user, String pass) {
        this.username = user;
        this.password = pass;
    }

    public Person() {}

    // Getters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setClient(UserData context) {
        this.cl = context;
    }

    public UserData getClient() {
        return cl;
    }
}
