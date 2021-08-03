package com.reckercode;

public class Main {

    public static void main(String[] args) {

        String number = "98766";
	    int newnumber = Integer.parseInt(number);
        System.out.println("Sum of digits: "+sumDigit1(newnumber));

    }

    private static int sumDigit1(int number){
        if(number<=9){
            return -1;
        }
        int sum = 0;
        while(number>0){
            // extracting the least-significant digit
            int digit = number%10;
            sum+=digit;
            // drop least-significant digit
            number/=10;
        }
        return sum;
    }

}
