package com.reckercode;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        double firstDouble = 20.00d;
//        double secondDouble = 80.00d;
//        double result = (firstDouble+secondDouble)*100d;
//        System.out.println("Result: " + result);
//        double remainder = result%40.00d;
//        System.out.println("Remainder: " + remainder);
//
//        boolean isRemainderTrue = (remainder == 0)? true:false;
//        System.out.println("isRemainderTrue: " + isRemainderTrue);
//
//        if(!isRemainderTrue){
//            System.out.println("Got some remainder");
//        }
        boolean gameOver = true;
        int score = 800;
        int levelComplete = 5;
        int bonus = 100;
        if (score <5000 && score> 1000){
            System.out.println("Your score was less than 5000 but greater that 1000");
        } else if(score <1000){
            System.out.println("your score was less than 1000");
        } else{
            System.out.println("you are here");
        }
        if(gameOver){
            int finalScore = score+(levelComplete*bonus);
            System.out.println("Your final score was " + finalScore);
        }

        int newScore = 10000;
        int newLevelComplete = 8;
        int newBonus = 200;

        if(gameOver){
            int finalScore = newScore + (newLevelComplete*newBonus);
            System.out.println(("Your second score was "+ finalScore));
        }
    }
}
