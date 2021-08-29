package com.reckercode;

public class Main {

    public static void main(String[] args) {
        System.out.println(Constants.WELCOME_MESSAGE);
        Square square = new Square(10,10);
        System.out.println(square.calculateArea(5,5));
        square.printShapeDetail();
    }
}
