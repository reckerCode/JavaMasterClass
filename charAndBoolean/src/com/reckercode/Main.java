package com.reckercode;

public class Main {

    public static void main(String[] args) {

        char myChar = 'D';
        char myUnicode = '\u0044';
        char myUnicode1 = '\u00A9';
        System.out.println(myChar);
        System.out.println(myUnicode);
        System.out.println(myUnicode1);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        //string class
        String myString = "My first string";
        System.out.println("This is my first string"+ " ' " + myString +" ' " + "and not the last one ");
        myString = myString + ", and this is some more string";
        System.out.println(myString);

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        result -=1;
        System.out.println("new Subtraction result: " +result);

        result *=10;
        System.out.println("new Multiplication result: " +result);

        result /=1;
        System.out.println("new divions result: " +result);

        result +=1;
        System.out.println("new Add result: " +result);

        result ++;
        System.out.println("new Increment result: " +result);

        // if-then statements

        boolean isAlien = false;
        if (!isAlien)
            System.out.println("It is not an Alien");

        int topScore = 90;
        if(topScore <100){
            System.out.println("You got the high score");
        }

        int secondTopScore = 95;
        if(topScore>secondTopScore && topScore<100 ){
            System.out.println("Greater than second top score and less than 100");
        }

        if((topScore > 90) || (secondTopScore <=90) ){
            System.out.println("Either or both conditions are true");
        }

        if((topScore > 90) && (secondTopScore <=90) ) {
            System.out.println("Both conditions are true");
        }
        boolean isCar = true;
        if(!isCar){
            System.out.println("This is not suppose to happen");
        }
        boolean wasCar = isCar? true:false;
        if(wasCar){
            System.out.println("wasCar is true");
        }
    }
}
