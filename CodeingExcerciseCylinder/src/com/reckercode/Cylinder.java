package com.reckercode;

public class Cylinder extends Circle{

    private double height;
    private double volume;

    public double getHeight() {
        return height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        if(height<0){
           this.height = 0;
        }else{

            this.height = height;
        }

    }

    public double getVolume(){
        this.volume = (getArea()*height);
        return this.volume;
    }
}
