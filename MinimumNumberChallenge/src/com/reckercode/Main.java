package com.reckercode;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter the array length: ");
        int count = scanner.nextInt();
        int[] array;
        System.out.println("Enter "+ count+ " integers elements to the array: ");
        array = readInteger(count);
        System.out.println("Entered elements of the array are: "+ Arrays.toString(array));
        System.out.println("Minimumn number in the array is: "+ finMin(array));
    }


    public static int[] readInteger(int count){
        int[] temp = new int[count];
        for(int i = 0; i<count;i++){
            temp[i] = scanner.nextInt();
        }
        return temp;
    }
    public static int finMin(int[] array){
        int temp=array[1];
        for (int j : array) {
            if (j < temp) {
                temp = j;
            }
        }
        return temp;
    }
}
