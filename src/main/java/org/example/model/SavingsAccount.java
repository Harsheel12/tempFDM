package org.example.model;

public class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount() {
        super();
    }

    public void addInterest() {
        double balance = getBalance();

        double interest = balance * (interestRate / 100);

        deposit(interest);
    }

    // Need to override because no overdraft allowed
    @Override
    public double withdraw(double amount) {
        if (amount > getBalance()) {
            return 0;
        }
        return super.withdraw(amount);
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
