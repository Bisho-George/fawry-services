package com.example.phase.authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AccountController {
    private final AccountDatabase accountDatabase;

    @Autowired
    public AccountController(AccountDatabase accountDatabase) {
        this.accountDatabase = accountDatabase;
    }

    @PostMapping("/signin")
    public ResponseEntity<?> signIn(@RequestBody Account account) {
        Account acc = accountDatabase.getAccount(account.getUsername(), account.getPassword());
        if (acc == null) {
            return new ResponseEntity<>("Invalid username or password", HttpStatus.OK);
        }

        return new ResponseEntity<>(acc, HttpStatus.OK);
    }

    @PostMapping("/signup")
    public String signUp(@RequestBody Account account) {
        Account acc = accountDatabase.getAccount(account.getUsername(), account.getPassword());
        if (acc != null) {
            return "This username is in use";
        }
        accountDatabase.createNewAccount(account.getUsername(), account.getPassword());
        return "Account is created successfully";
    }
}
