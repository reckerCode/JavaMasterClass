package com.reckercode;

import java.util.ArrayList;
import java.util.Objects;

public class Branch {
    private String name;
    private ArrayList<Customers> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public boolean newCustomers(String customerName, double initialAmount){
        if(findCustomers(customerName)==null){
            this.customers.add(new Customers(customerName, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addTransaction (String customerName, double amount){
        Customers existingCustomer = findCustomers(customerName);
        if(existingCustomer!=null){
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customers findCustomers(String customerName){
        for(int i=0; i<this.customers.size();i++){
            Customers isCustomer = this.customers.get(i);
            if(isCustomer.getName().equals(customerName)){
                return isCustomer;
            }
        }
        return null;
    }

    public ArrayList<Customers> getCustomers() {
        return customers;
    }
}
