package com.reckercode;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bank bank =  new Bank("State Bank of India");

        bank.addBranch("Manjalpur");

        bank.addCustomers("Manjalpur", "Hardik", 1231.12);
        bank.addCustomers("Manjalpur", "Khushboo", 2234.43);
        bank.addCustomers("Manjalpur", "Deepak", 4434.43);

        bank.addBranch("GIDC");
        bank.addCustomers("GIDC", "Daksha", 12231.12);
        bank.addCustomers("GIDC", "Pheobe", 22234.43);

        bank.addCustomerTransaction("Manjalpur", "Hardik", 1000.00);
        bank.addCustomerTransaction("Manjalpur", "Khushboo", 1000.00);
        bank.addCustomerTransaction("Manjalpur", "Deepak", 1000.00);

        bank.addCustomerTransaction("GIDC", "Daksha", 1000.00);
        bank.addCustomerTransaction("GIDC", "Pheobe", 1000.00);

        bank.listCustomers("Manjalpur", false);
        bank.listCustomers("GIDC", true);

        if(!bank.addCustomers("Tarsali","Varun", 1222.45)){
            System.out.println("Error, Tarsali branch does not exists");
        }
        if(!bank.addCustomerTransaction("GIDC", "Hardik", 1000.00)){
            System.out.println("Customer does not exist at branch");
        }
    }
}
