package com.fdmgroup.bankDesignProject;

public abstract class Account {
    private final long ACCOUNT_ID;
    private static long nextAccountId = 1000;
    protected double balance;



    public Account() {
        ACCOUNT_ID = nextAccountId;
        nextAccountId+=5;

        balance = balance;
    }

    public double withdraw(double amount){
        balance=  balance- amount;
        return amount;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void correctBalance(double amount){
        this.balance = amount;
    }

    public double getBalance() {
        return balance;
    }

    public long getACCOUNT_ID() {
        return ACCOUNT_ID;
    }

    public static long getNextAccountId() {
        return nextAccountId;
    }

    public static void setNextAccountId(long nextAccountId) {
        Account.nextAccountId = nextAccountId;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
