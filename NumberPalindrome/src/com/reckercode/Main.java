package com.reckercode;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(12231));
    }
    private static boolean isPalindrome(int number){
        int reverse = 0;
        int lastDigit,temp=number;

        System.out.println("Temp LSD: "+temp);
        while(number !=0){
            lastDigit = number%10;
            reverse = (reverse *10)+lastDigit;
            System.out.println(reverse);
            number/=10;
        }
        return reverse == temp;
    }
}
