package com.reckercode;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myInteger = getIntegers(5);
        printArray(myInteger);
        int[] newMyInteger = sortInteger(myInteger);
        printArray(newMyInteger);
    }

    public static int[] getIntegers(int number) {
        System.out.println("\r Enter " + number + " integer values:\r ");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] number) {
        for (int i = 0; i < number.length; i++) {
            System.out.println("Element at " + i + " is " + number[i]);

        }
    }
    public static int[] sortInteger(int[] number){
        int[] sortedArray = Arrays.copyOf(number, number.length);
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for (int i=0;i<sortedArray.length-1;i++){
                if(sortedArray[i]<sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1]=temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
