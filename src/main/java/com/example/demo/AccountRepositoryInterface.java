package com.example.demo;

public interface AccountRepositoryInterface {
    void add(long id, int money);

    void createUser(long id, int money);

    Integer query(long id);
}
