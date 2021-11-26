package com.demo.bank;

public class DBBank implements Bank {
    public DBBank() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean checkAccount(String shopSecret, String cardDetails) {
        return true;
    }
}
