package com.reckercode;

public class Main {

    public static void main(String[] args) {


        Account bobsAccount = new Account("12345", 0.00, "Bob Brown",
                "myemail@bob.com", "(887) 357-9960");
        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance() );

        bobsAccount.withdrawl(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawl(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawl(100.0);

    }
}
