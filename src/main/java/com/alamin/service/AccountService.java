package com.alamin.service;

import com.alamin.config.DBConfig;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Service
//@Component
public class AccountService {
    private final Account account;

    public AccountService() {
        Account account = new Account();
        account.setAccountId("123");
        account.setAccountType("Business");
        account.setAccountHolderName("Alamin");
        this.account = account;
    }

//    public AccountService(Account account) {
//        this.account = account;
//    }

    public Account getAccountDetails() {
        return this.account;
    }
}
