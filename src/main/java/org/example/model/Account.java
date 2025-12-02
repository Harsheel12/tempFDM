package org.example.model;

public abstract class Account {

    private static long nextAccountId = 1_000;

    private final long ACCOUNT_ID;

    protected double balance;

    // TODO: Maybe need to pass in balance here? Missing initial balance right now I think
    public Account() {
        this.ACCOUNT_ID = nextAccountId;
        nextAccountId += 5; // Increment by 5 for every new account
    }

    // TODO: Maybe a bug here?
    public double withdraw(double amount) {
        this.balance -= amount;
        return amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void correctBalance(double amount) {
        this.balance = amount;
    }

    public long getACCOUNT_ID() {
        return ACCOUNT_ID;
    }

    public double getBalance() {
        return balance;
    }
}
