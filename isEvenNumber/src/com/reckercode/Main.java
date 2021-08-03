package com.reckercode;
public class Main {

    public static void main(String[] args) {
        int number = 6;
        int finishNumber=20;
        while(number<=finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;

            }
        }
    }

    private static boolean isEvenNumber(int isNumber){

        return isNumber % 2 == 0;

    }

}
