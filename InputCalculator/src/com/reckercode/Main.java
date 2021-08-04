package com.reckercode;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int avg = 0;
        int counter=0;
        while(true){
            boolean hasInt = scanner.hasNextInt();
            if(hasInt){
                counter++;
                int number = scanner.nextInt();
                sum+=number;
                avg=Math.round(sum/counter);
            }else{
                System.out.println("SUM = "+sum+" AVG = "+avg);
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}
