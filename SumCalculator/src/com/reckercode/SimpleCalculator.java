package com.reckercode;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber(){
        return this.firstNumber;
    }
    public double getSecondNumber(){
        return this.secondNumber;
    }
    public void setFirstNumber(double num){
        this.firstNumber = num;
    }
    public void setSecondNumber(double num){
        this.secondNumber = num;
    }
    public double getAdditionalResult(){
        return (this.firstNumber+this.secondNumber);
    }
    public double getSubtractionResult(){
        return (this.firstNumber-this.secondNumber);
    }
    public double getMultiplicationResult(){
        return (this.firstNumber*this.secondNumber);
    }
    public double getDivisionResult(){
        if(this.secondNumber==0){
            return 0;
        }
        return (this.firstNumber/this.secondNumber);
    }
}
