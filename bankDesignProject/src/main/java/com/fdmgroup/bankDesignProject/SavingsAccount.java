package com.fdmgroup.bankDesignProject;

public class SavingsAccount extends Account{
    private double interest;


    public SavingsAccount(){

    };


    public void addInterest(){
        interest = (super.getBalance() * interest) /100;
        balance = super.getBalance() + interest;
    }

    @Override
    public double withdraw(double amount) {
        if(super.getBalance() < amount){
            return 0;
        }
        super.setBalance(balance - amount);
        return amount;
    }

    public double getInterest(){
        return interest;
    }

    public void setInterestRate(double rate){
        this.interest = rate;
    }
}
