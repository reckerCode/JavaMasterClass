package com.reckercode;

public class Square implements Shape{
    int sideA;
    int sideB;

    public Square(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public int calculateArea(int sideA, int sideB) {
        return sideA * sideB;
    }

    @Override
    public void printShapeDetail() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Square{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }
}
