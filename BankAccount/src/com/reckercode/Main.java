package com.reckercode;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAccount hardikAccount = new BankAccount("12345", 1000.0,
                "Hardik","myemail@hardik.com",234687234);
        System.out.println(hardikAccount.getAccountNumber());
        System.out.println(hardikAccount.getBalance());
        System.out.println(hardikAccount.getCustomerName());
        System.out.println(hardikAccount.getPhoneNumber());
        System.out.println(hardikAccount.getEmail());
    }
}
