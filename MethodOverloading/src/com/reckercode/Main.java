package com.reckercode;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Hardik", 500);
        int newScore2 = calculateScore("Hardik", 500, 500);
        System.out.println("New score is: "+newScore);
        System.out.println("New score2 is: "+newScore2);
    }
    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName+ " scored "+score+"points");
        return score*1000;
    }

    public static int calculateScore(String playerName, int score, int score2){
        System.out.println("Player " + playerName+ " scored "+score+"points");
        return (score+score2)*1000;
    }
}
