package com.fdmgroup.bankDesignProject;

public class Person extends Customer{

    public Person(String name, String address){
        super(name, address);
    }

    @Override
    public void chargeAllAccounts(double amount) {
        for (Account accounts:super.getAccounts()) {
            accounts.withdraw(amount);
        }
    }
}
