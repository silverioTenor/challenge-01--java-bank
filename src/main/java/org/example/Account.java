package org.example;

public class Account {
    private final long number;
    private String owner;
    private double balance;

    public Account(long number, String owner, double balance) {
        this.number = number;
        this.owner = owner;
        this.balance = balance;
    }

    public long getNumber() {
        return number;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    void deposit(double value) {
        if (value > 0) {
            balance += value;
            System.out.println("Operation success!");
        }
    }

    void withDraw(double value) {
        if (value > 0 && value < balance) {
            balance -= value;
            System.out.println("Operation success!");
        }
    }

    void transfer(Account accountDest, double value) {
        if (value > 0 && value < balance) {
            balance -= value;
            accountDest.balance += value;
        }
    }

    @Override
    public String toString() {
        return "{ number: " + number + ", owner: " + owner + ", balance: " + balance + "US$ }";
    }

    private static class Builder {
        private long number = System.currentTimeMillis();
        private String owner;
        private double balance;

        Builder number(long number) {
            this.number = number;
            return this;
        }

        Builder owner(String owner) {
            this.owner = owner;
            return this;
        }

        Builder balance(double balance) {
            this.balance = balance;
            return this;
        }

        Account build() {
            return new Account(number, owner, balance);
        }
    }
}
