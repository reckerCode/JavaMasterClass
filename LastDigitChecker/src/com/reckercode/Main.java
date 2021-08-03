package com.reckercode;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Last digit check: "+hasSameLastDigit(41,22,71));
    }

    public static boolean isValid(int num){
        return num >= 10 && num <= 1000;
    }
    public static boolean hasSameLastDigit(int num1, int num2, int num3){

        if(isValid(num1) && isValid(num2) && isValid(num3)){
            int n1 = num1%10;
            int n2 = num2%10;
            int n3 = num3%10;
            return (n1==n2)||(n1==n3)||(n2==n3);
            }
        return false;
    }
}

