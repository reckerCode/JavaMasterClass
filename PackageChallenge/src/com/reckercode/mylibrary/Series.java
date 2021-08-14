package com.reckercode.mylibrary;

public class Series {
    public static long nSum(int n){
        return (((long) n *(n+1))/2);
    }
    public static long nFactorial(int n){
        if(n==0){
            return 0;
        }
        long newN = 1;
        for(int i=1; i<=n;i++){
            newN *= i;
        }
        return newN;
    }
    public static long fibonacciN(int n){
        if(n<=1){
            return n;
        }return fibonacciN(n-1)+fibonacciN(n-2);
    }
}
