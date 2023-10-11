package com.example.demo;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DepositControllerTest {





    @Test
    void addDepositTwoUser(){
        DepositController depositController = new DepositController(new AccountService(new AccountRepository()));

        //創建兩個用戶
        depositController.createUser(1L,0);
        depositController.createUser(2L,0);

        //對用戶1和2存款
        depositController.add(1L,100);
        depositController.add(2L,200);

        //驗證存款的結果是否正確
        Assertions.assertEquals(depositController.query(1L),100);
        Assertions.assertEquals(depositController.query(2L),200);
    }
}
