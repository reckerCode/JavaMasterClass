package com.reckercode;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("GCD: " +getGreatestCommonDivisor(9,15));
    }
    public static int getGreatestCommonDivisor(int first, int second){
        int gcd=0;
        if((first<10)||(second<10))
            return -1;
        for(int i=1; i<=first && i<=second; i++){
            if((first%i==0) && (second%i==0)) {
                gcd = i;
            }
        }
        return gcd;
    }
}
