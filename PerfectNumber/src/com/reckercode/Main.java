package com.reckercode;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int number = 28;
        System.out.println(number+" is a perfect number? " +isPerfectNumber(number));
    }
    public static boolean isPerfectNumber(int number){
        int sum=0;
        if(number<1){
            return false;
        }
        for(int i=1; i<number; i++){
            if(number%i==0){
                sum+=i;
            }
        }
        return sum==number;
    }
}

