package com.reckercode;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Can Pack: "+canPack(0,5,4));
    }
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if((bigCount<0)||(smallCount<0)||(goal<0)){
            return false;
        }
        if(goal>(bigCount * 5)+smallCount){
            return false;
        }
        if((goal %5)>smallCount){
            return false;
        }
        return true;
    }
}
