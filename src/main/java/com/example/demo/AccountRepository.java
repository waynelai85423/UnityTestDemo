package com.example.demo;

import java.util.HashMap;

public class AccountRepository implements AccountRepositoryInterface {
    HashMap<Long ,Account> accountHashMap = new HashMap<>();

    @Override
    public void add(long id, int money) {
        accountHashMap.get(id).add(money);
    }

    @Override
    public void createUser(long id, int money) {
        accountHashMap.put(id,new Account(id,money));
    }

    @Override
    public Integer query(long id) {
        return accountHashMap.get(id).getDeposit();
    }
}
