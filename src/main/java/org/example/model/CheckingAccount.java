package org.example.model;

public class CheckingAccount extends Account {

    private int nextCheckNumber = 1;

    public CheckingAccount() {
        super();
    }

    public int getNextCheckNumber() {
        int current = nextCheckNumber;
        nextCheckNumber++;   // Increment before returning the current one
        return current;
    }

    public void setNextCheckNumber(int nextCheckNumber) {
        this.nextCheckNumber = nextCheckNumber;
    }

    // Return current check number, then increment
    public int issueCheckNumber() {
        int current = nextCheckNumber;
        nextCheckNumber++;
        return current;
    }
}
