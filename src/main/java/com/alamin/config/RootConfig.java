package com.alamin.config;

import com.alamin.service.Account;
import com.alamin.service.AccountService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


//@ComponentScan(basePackages = {"com.spring5.practice.service"})

//@Configuration
//@Import(DBConfig.class)
@ComponentScan(basePackages = {"com.alamin.converter"})
public class RootConfig {

//    @Bean
//    public AccountService getAccountService(){
//        return new AccountService();
//    }

//    @Bean
//    public AccountService getAccountService(){
//        Account account = new Account();
//        account.setAccountId("123");
//        account.setAccountType("Business");
//        account.setAccountHolderName("Alamin");
//        return new AccountService(account);
//    }


//    @Bean
//    public Account getAccountService(){
//        Account account = new Account();
//        account.setAccountId("123");
//        account.setAccountType("Business");
//        account.setAccountHolderName("Alamin");
//        return account;
//    }



}
