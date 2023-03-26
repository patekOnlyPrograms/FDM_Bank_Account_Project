package com.fdmgroup.bankDesignProject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class AccountController {
    private List<Customer> customers = new ArrayList<>();
    private List<Account> accounts = new ArrayList<>();


    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public Customer createCustomer(String name, String address, String type){
        if (type.equals("person")){
            Person person = new Person(name, address);
            customers.add(person);
            return person;
        }
        else {
            Company company = new Company(name,address);
            customers.add(company);
            return company;
        }
    }

    public Account createAccount(Customer customer, String type){
        return null;
    }

    public void removeCustomer(Customer customer){

    }

    public void removeAccount(Account account){
        accounts.remove(account);
    }

    public List<Customer> getCustomers(){

        return customers;
    }

    public List<Account> getAccounts(){
        return accounts;
    }
}
