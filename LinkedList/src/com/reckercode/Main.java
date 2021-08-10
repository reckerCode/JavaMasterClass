package com.reckercode;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Hardik", 34.43);
        Customer another = customer;
        System.out.println("Balance for customer "+customer.getName()+" is "+ customer.getBalance());
        System.out.println("Balance for customer "+another.getName()+" is "+ another.getBalance());
        customer.setBalance(12.18);
        System.out.println("Balance for customer "+customer.getName()+" is "+ customer.getBalance());
        System.out.println("Balance for customer "+another.getName()+" is "+ another.getBalance());

        ArrayList<Integer> intList = new ArrayList<>();

        intList.add(1);
        intList.add(3);
        intList.add(4);

        for(int i = 0; i<intList.size();i++){
            System.out.println(i+": "+intList.get(i));
        }

        intList.add(1,2);
        for(int i = 0; i<intList.size();i++){
            System.out.println(i+": "+intList.get(i));
        }
    }
}
