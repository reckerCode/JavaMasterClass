package com.reckercode;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int max=0;
        int min=0;
        Scanner scanner = new Scanner(System.in);

        boolean flag = true;
        while(true){

            System.out.println("Enter a number:");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt) {
                int number = scanner.nextInt();
                if(flag){
                    flag=false;
                    min = number;
                    max = number;
                }
                if (number > max) {
//                    System.out.println(number+" is the maximum number so far");
                    max = number;
                }
                if(number<min) {
//                        System.out.println(number + " is the minimum number so far");
                        min = number;
                }

            }else{
                System.out.println("Invalid Number");
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Min = "+min+" Max = "+max);
        scanner.close();
    }
}
