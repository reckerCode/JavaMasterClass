package com.reckercode;

public class Main {

    public static int multiplier = 7;

    public static void main(String[] args) {
	// write your code here
//
//        StaticTest firstInstance = new StaticTest("1st Instance");
//        System.out.println(firstInstance.getName()+"is instance number "+ StaticTest.getNumInstances());
//
//        StaticTest secondInstance = new StaticTest("2nd Instance");
//        System.out.println(secondInstance.getName()+"is instance number "+ StaticTest.getNumInstances());
//
//        StaticTest thirdInstance = new StaticTest("3rd Instance");
//        System.out.println(thirdInstance.getName()+"is instance number "+ StaticTest.getNumInstances());
        int ans = multiplier(6);
        System.out.println("The answer is: "+ ans);
    }
    public static int multiplier(int num){
        return num*multiplier;
    }
}
