package com.reckercode;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int number = 123456789;
        System.out.println("Even digit sum for "+number+" is "+getEvenDigitSum(number));
    }
    public static int getEvenDigitSum(int number){
        if (number<0){
            return -1;
        }
        int sum = 0;
        while(number>0){
            int digit = number%10;
            if (digit%2==0){
                sum+=digit;
            }
            number/=10;
        }
        return sum;
    }
}
