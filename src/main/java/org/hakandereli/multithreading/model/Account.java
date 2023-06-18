package org.hakandereli.multithreading.model;

public class Account {

    private int balance = 6000;

    public int getBalance() {
        return balance;
    }

    public void withDraw(int amount) {
        balance = balance - amount;
    }
}
