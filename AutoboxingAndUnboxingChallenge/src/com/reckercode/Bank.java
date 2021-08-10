package com.reckercode;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name){
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName){
        if(findBranch(branchName)==null){
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomers(String branchName, String customerName, double initialAmount){
        Branch branch = findBranch(branchName);
        if(branch!=null){
            return branch.newCustomers(customerName, initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount){
        Branch branch = findBranch(branchName);
        if(branch!=null){
            return branch.addTransaction(customerName, amount);
        }
        return false;
    }

    private Branch findBranch(String branchName){
        for(int i=0; i<this.branches.size();i++){
            Branch isBranch = this.branches.get(i);
            if(isBranch.getName().equals(branchName)){
                return isBranch;
            }
        }
        return null;
    }
    public boolean listCustomers(String branchName, boolean showTransaction){
        Branch branch = findBranch(branchName);
        if(branch!=null){
            System.out.println("Customer detail for branch " + branch.getName());
            ArrayList<Customers> branchCustomers = branch.getCustomers();
            for(int i =0; i<branchCustomers.size();i++){
                Customers branchCustomer  = branchCustomers.get(i);
                System.out.println("Customers: "+ branchCustomer.getName() + "["+(i+1)+"]");
                if(showTransaction){
                    System.out.println("Transactions");
                    ArrayList<Double> transaction = branchCustomer.getTransactions();
                    for(int j=0;j<transaction.size();j++){
                        System.out.println("Transactions "+ (j+1)+ " Amount: "+ transaction.get(j));
                    }
                }
            }
            return true;
        }else{
            return false;
        }
    }










}
