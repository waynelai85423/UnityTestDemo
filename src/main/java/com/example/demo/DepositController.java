package com.example.demo;

import java.util.HashMap;

public class DepositController {

    private  AccountService accountService;
    public DepositController(AccountService accountService){
        this.accountService = accountService;
    }

    public void add(Long id, int money) {
        accountService.addDeposit(id,money);
    }

    void createUser(Long id,int money){
        accountService.createUser(id,money);
    }

    public Integer query(Long id) {
       return accountService.query(id);
    }
}
