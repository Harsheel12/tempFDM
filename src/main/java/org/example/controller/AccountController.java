package org.example.controller;

import org.example.model.*;

import java.util.ArrayList;
import java.util.List;

public class AccountController {

    private List<Customer> customers = new ArrayList<>();
    private List<Account> accounts = new ArrayList<>();

    public Customer createCustomer(String name, String address, String type) {
        Customer newCustomer = null;

        if (type.equalsIgnoreCase("person")) {
            newCustomer = new Person(name, address);
        } else if (type.equalsIgnoreCase("company")) {
            newCustomer = new Company(name, address);
        } else {
            throw new IllegalArgumentException("Unknown customer type: " + type);
        }

        customers.add(newCustomer);

        return newCustomer;
    }

    public Account createAccount(Customer customer, String type) {
        Account newAccount = null;

        if (type.equalsIgnoreCase("checking")) {
            newAccount = new CheckingAccount();
        } else if (type.equalsIgnoreCase("savings")) {
            newAccount = new SavingsAccount();
        } else {
            throw new IllegalArgumentException("Unknown account type: " + type);
        }

        accounts.add(newAccount);
        customer.addAccount(newAccount);

        return newAccount;
    }

    public void removeCustomer(Customer customer) {
        // Empty customer
        if (customer == null) return;

        // Get all the customers accounts
        List<Account> allAccounts = customer.getAccounts();

        for (Account account : allAccounts) {
            removeAccount(account);
        }

        // Remove from Account controller's customers list
        customers.remove(customer);
    }

    public void removeAccount(Account account) {
        // Empty account
        if (account == null) return;

        // Remove from Account controller's account list
        accounts.remove(account);

        // Remove from all customers who may own it
        for (Customer customer : customers) {
            customer.removeAccount(account);
        }
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}
