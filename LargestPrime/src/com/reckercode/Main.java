package com.reckercode;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Larges prime factor: " + getLargestPrime(217));
    }

    public static int getLargestPrime(int number) {
        int i;
        long copyOfInput = number;
        if (number > 1) {
            for (i = 2; i <= copyOfInput; i++) {
                if (copyOfInput % i == 0) {
                    copyOfInput /= i;
                    i--;
                }
            }
            return i;
        } else {
            return -1;
        }
    }
}

