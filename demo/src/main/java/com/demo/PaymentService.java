package com.demo;

import com.demo.bank.Bank;

public class PaymentService {
    private Bank bank;

    public PaymentService(Bank bank) {
        this.bank = bank;
    }

    public boolean checkCard(String cardDetails) {
        System.out.println("checking card");
        return bank.checkAccount("secret", cardDetails);
    }
}
