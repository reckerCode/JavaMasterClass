package com.reckercode;

public class Main {

    public static void main(String[] args) {
        int number = 15;
        int start = 1;
        int end = 44;
        System.out.println("Is "+ number+" odd? "+isOdd(number));
        System.out.println("Sum of odd number between "+ start +" and "+end+": "+isOdd(start, end));
    }
    private static boolean isOdd(int par){
        if(par<0) {
            return false;
        }else{
            return par % 2 != 0;
        }
    }
    private static int isOdd(int start, int end) {
        int sum=0;
        if ((start > 0 && end > 0) && (end >= start)) {
            for (int i = start; i <= end; i++) {
                if (i % 2 != 0) {
                    sum+=i;
                }
            }
        }else{
            return -1;
        }
        return sum;
    }
}
