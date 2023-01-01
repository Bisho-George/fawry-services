package com.example.phase.authentication;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountDatabase {
    private final List<Account> accounts = new ArrayList<>();

    public void createNewAccount(String username, String password) {
        int id = accounts.size()+1;
        accounts.add(new Account(id, username, password));
    }

    public Account getAccount(String username, String password) {
        for (Account account : accounts) {
            if (account.getUsername().equals(username) && account.getPassword().equals(password)) {
                return account;
            }
        }
        return null;
    }

    // CRUD on Accounts
}
