package com.reckercode;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Shared digit: "+hasSharedDigit(12,13));
    }
    public static boolean hasSharedDigit(int num1, int num2 ){
        if((num1<10||num1>99)||(num2<10||num2>99)){
            return false;
        }
        int lsd = num1%10;
        int dlsd = num1/10;
        int lsd2 = num2%10;
        int dlsd2 = num2/10;
        return (lsd == lsd2) || (lsd == dlsd2) || (dlsd == lsd2) || (dlsd == dlsd2);
    }
}
