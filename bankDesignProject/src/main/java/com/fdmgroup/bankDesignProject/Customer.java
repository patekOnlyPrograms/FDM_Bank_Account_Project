package com.fdmgroup.bankDesignProject;

import java.util.ArrayList;
import java.util.List;

public abstract class Customer {
    private final long CUSTOMER_ID;
    private static long nextCustomerId = 2000000;
    private String name;
    private String address;
    private List<Account> accounts = new ArrayList<>();

    public Customer(String name, String address){
        CUSTOMER_ID = nextCustomerId;
        nextCustomerId+=7;
        this.name = name;
        this.address = address;

    }

    public void addAccount(Account account){
        accounts.add(account);
    }

    public void removeAccount(Account account){
        accounts.remove(account);
    }

    public abstract void chargeAllAccounts(double amount);

    public List<Account> getAccounts(){

        return accounts;
    }

    public long getCUSTOMER_ID(){

        return CUSTOMER_ID;
    }

    public String getName(){
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setCUSTOMER_ID(long customer_id){

    }



    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static long getNextCustomerId() {
        return nextCustomerId;
    }

    public static void setNextCustomerId(long nextCustomerId) {
        Customer.nextCustomerId = nextCustomerId;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
