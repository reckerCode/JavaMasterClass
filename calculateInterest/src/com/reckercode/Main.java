package com.reckercode;

public class Main {

    public static void main(String[] args) {
        int amount = 10000;
        for(int i=2; i<=8;i++){
            System.out.println("Interest rate for "+amount+ " is "+calculateInterest(amount,i));
        }
    }
    private static double calculateInterest(double amount, double interestRate){
        return (amount*(interestRate/100));
    }
}
