package com.reckercode;

public class Circle {
    private double radius;
    private double area;

    public Circle(double radius) {
        if(radius<0){
            this.radius = 0;
        }else{

            this.radius = radius;
        }
    }

    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        this.area = (this.radius * this.radius * Math.PI);
        return this.area;
    }
}
