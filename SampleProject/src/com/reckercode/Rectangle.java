package com.reckercode;

public class Rectangle extends AbstractRectangle{

    @Override
    public int calculateArea(int sideA, int sideB) {
        return sideA * sideB;
    }

    @Override
    public void printShapeDetail() {

    }

}
