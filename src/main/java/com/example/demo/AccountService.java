package com.example.demo;

public class AccountService {


    public AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    public void addDeposit(long id, int money) {
        accountRepository.add(id,money);
    }

    public void createUser(long id, int money) {
        accountRepository.createUser(id ,money);
    }

    public Integer query(long id) {
        return accountRepository.query(id);
    }
}
