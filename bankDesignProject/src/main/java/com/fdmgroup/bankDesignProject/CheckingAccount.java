package com.fdmgroup.bankDesignProject;

public class CheckingAccount extends Account{
    private int nextCheckNumber;

    public CheckingAccount() {
        setNextCheckNumber(0);
    }


    public void setNextCheckNumber(int nextCheckNumber) {
        this.nextCheckNumber = nextCheckNumber;
    }

    public int getNextCheckNumber(){
        nextCheckNumber++;
        return nextCheckNumber;
    }
}
