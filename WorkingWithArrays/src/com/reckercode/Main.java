package com.reckercode;
import java.util.Scanner;
public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myInteger = getIntegers(5);
        for (int i = 0; i < myInteger.length; i++) {
            System.out.println("myIntArray: " + i + " " + myInteger[i]);
        }
        System.out.println("Average of the array elements is "+ getAverage(myInteger));
    }

    public static int[] getIntegers(int number) {
        System.out.println("\r Enter " + number + " integer values:\r ");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
    public static int getAverage(int[] number){
        int sum=0;
        for (int j : number) {
            sum += j;
        }
        return (sum/(number.length));
    }
}
//	    int[] myIntArray = new int[25];
////	    myIntArray[5] = 50;
//	    for(int i=0; i<myIntArray.length;i++) {
//            myIntArray[i] = i * 10;
//        }
//	    printArray(myIntArray);
//    public static void printArray(int[] array){
//        for (int i=0;i<array.length; i++){
//            System.out.println("myIntArray: " + i + " " + array[i]);
//        }
//    }

