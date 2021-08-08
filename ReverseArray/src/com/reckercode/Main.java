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
        System.out.println("Array length: "+array.length);
        System.out.println("Reversed array is: "+ Arrays.toString(reverseArray(array)));
        System.out.println("Reversed array is: "+ Arrays.toString(reverseArray2(array)));
    }


    public static int[] readInteger(int count){
        int[] temp = new int[count];
        for(int i = 0; i<count;i++){
            temp[i] = scanner.nextInt();
        }
        return temp;
    }
    public static int[] reverseArray(int[] array){
        int temp;
        for (int i=0,j=(array.length)-1; i<(array.length)/2; i++,j--) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;
    }
    public static int[] reverseArray2(int[] array){
        int temp;
        for (int i=0; i<(array.length); i++) {
            temp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = temp;
        }
        return array;
    }
}
