package com.reckercode;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int number = 123;
        System.out.println("First and last digit sum: "+sumFirstAndLastDigit(number));
    }
    public static int sumFirstAndLastDigit(int number){

        if(number==0){
            return 0;
        }else if (number<0){
            return -1;
        }
        int sum = number%10;
        while(number>0){
            int digit = number%10;
            int temp = number;
            number/=10;
            if(number==0){
                sum+=temp;

            }
        }
        return sum;
    }
}
