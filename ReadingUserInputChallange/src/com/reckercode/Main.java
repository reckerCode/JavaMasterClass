package com.reckercode;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);
        int counter=1;
        int sum=0;

        while (counter<=10){

            System.out.println("Enter Number "+counter);

            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                int number = scanner.nextInt();
                sum+=number;
                counter++;
            }else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }

        scanner.close();

        System.out.println("Sum of 10 numbers: "+sum);
    }
}
