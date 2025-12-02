package org.example.model;

public abstract class Customer {

    private static long nextCustomerId = 2_000_000;

    private final long CUSTOMER_ID;
    private String name;
    private String address;

    // TODO: Add Accounts
    public Customer(String name, String address) {
        this.CUSTOMER_ID = nextCustomerId;
        nextCustomerId += 7;  // Increment by 7 for every new customer

        this.name = name;
        this.address = address;
    }

    public long getCUSTOMER_ID() {
        return CUSTOMER_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
