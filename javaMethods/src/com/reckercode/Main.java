package com.reckercode;

public class Main {

    public static void main(String[] args) {
        String playerName = "Hardik";
        int playerScore = 1500;
        int playerScore1 = 900;
        int playerScore2 = 400;
        int playerScore3 = 50;
        int position = calculateHighScorePosition(1500);
        displayHighScorePositions(playerName, position);
        int position1 = calculateHighScorePosition(900);
        displayHighScorePositions(playerName, position1);
        int position2 = calculateHighScorePosition(400);
        displayHighScorePositions(playerName, position2);
        int position3 = calculateHighScorePosition(50);
        displayHighScorePositions(playerName, position3);

    }

    public static void displayHighScorePositions (String playerName,int position){
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }
    public static int calculateHighScorePosition ( int playerScore){
//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500){
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        }
//            return 4;
//
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500){
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
        }
}










//        boolean gameOver = true;
//        int score = 800;
//        int levelComplete = 5;
//        int bonus = 100;
//
//        int highScore =calculateScore(gameOver, score, levelComplete, bonus);
//        System.out.println("1st High Score: " + highScore);
//
//        score = 10000;
//        levelComplete = 8;
//        bonus = 200;
//        highScore = calculateScore(gameOver, score, levelComplete,bonus);
//        System.out.println("2nd High Score: " + highScore);

// }
//    public static int calculateScore(boolean gameOver, int score, int levelComplete, int bonus) {
//
//        if(gameOver){
//            int finalScore = score+(levelComplete*bonus);
//            finalScore+=2000;
////            System.out.println("Your final score was " + finalScore);
//            return finalScore;
//        }
//        return -1;
//    }