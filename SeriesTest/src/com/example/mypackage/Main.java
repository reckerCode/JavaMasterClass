package com.example.mypackage;

import com.reckercode.mylibrary.Series;

public class Main {

    public static void main(String[] args) {

        System.out.println("Sum for "+" first 10 numbers ");
        for(int i=0; i<=10;i++){
            System.out.println(Series.nSum(i)) ;
        }

        System.out.println("Factorial for "+" first 10 numbers ");
        for(int i=0; i<=10;i++){
            System.out.println(Series.nFactorial(i)) ;
        }

        System.out.println("Fibonacci series for "+" first 10 numbers:");
        for(int i=0; i<=10;i++){
            System.out.println(Series.fibonacciN(i)) ;
        }
    }
}
