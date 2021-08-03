package com.reckercode;
public class Main {

    public static void main(String[] args) {
        int number = 6;
        int finishNumber=20;
        while(number<=finishNumber){
            System.out.println("The number passed is "+isEvenNumber(number));
            number++;
        }
    }

    private static String isEvenNumber(int isNumber){

        if(isNumber%2==0){

            return "Even";

        }else{

            return "Odd";

        }

    }

}
