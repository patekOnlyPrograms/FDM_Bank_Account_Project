package com.fdmgroup.bankDesignProject;

public class Company extends Customer{

    public Company(String name, String Address) {
        super(name, Address);
    }

    @Override
    public void chargeAllAccounts(double amount) {
        for (Account accounts:super.getAccounts()) {
            if(accounts instanceof CheckingAccount){
                accounts.withdraw(amount);
            }
            if(accounts instanceof SavingsAccount){
                accounts.withdraw(amount * 2);
            }
        }
    }
}
