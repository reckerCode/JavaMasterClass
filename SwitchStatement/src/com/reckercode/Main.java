package com.reckercode;

public class Main {

    public static void main(String[] args) {
        char newChar ='D';
        switch (newChar){
            case 'A':
                System.out.println("Char is A");
                break;
            case 'B':
                System.out.println("Char is B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("Char is "+ newChar);
                break;
            default:
                System.out.println("Not found");
        }
    }
}
