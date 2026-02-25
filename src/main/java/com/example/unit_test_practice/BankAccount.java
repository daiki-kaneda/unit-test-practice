package com.example.unit_test_practice;

public class BankAccount {
    private int balance;

    public void withDraw(int amount) {
        if(amount>balance)throw new IllegalStateException("残高が不足しています。");
        balance -= amount;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public int getBalance() {
        return balance;
    }
}
