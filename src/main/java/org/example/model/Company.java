package org.example.model;

import java.util.List;

public class Company extends Customer {

    public Company(String name, String address) {
        super(name, address);
    }

    @Override
    public void chargeAllAccounts(double amount) {
        List<Account> allAccounts = getAccounts();

        for (Account account : allAccounts) {
            if (account instanceof CheckingAccount) {
                account.withdraw(amount);
            } else if (account instanceof SavingsAccount) {
                account.withdraw(amount * 2); // Double the fee for savings accounts
            }
        }
    }
}
