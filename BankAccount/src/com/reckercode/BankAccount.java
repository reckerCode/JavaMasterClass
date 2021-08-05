package com.reckercode;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount(){
        this("56789", 1000.0, "Default Name", "Default address", 12312312);
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, int phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, int phoneNumber) {
        this("6969", 100.55, customerName, email, phoneNumber);
    }

    public void deposit(double amount){
        this.balance=this.balance+amount;
        System.out.println("Balance is "+this.balance);
    }
    public void withdraw(double amount){
        if(amount>balance){
            System.out.println("Insufficient Balance");
        }else {
            this.balance = this.balance - amount;
            System.out.println("Balance is "+this.balance);
        }
    }

    public String  getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
