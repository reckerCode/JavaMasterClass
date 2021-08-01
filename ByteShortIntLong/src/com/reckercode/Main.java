package com.reckercode;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myValue = 1000;
        int myMinInteger = Integer.MIN_VALUE;
        int myMaxInteger = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value: " + myMinInteger);
        System.out.println("Integer Maximum Value: " + myMaxInteger);
        System.out.println("Busted MAX value: " + (myMaxInteger + 1));//integer overflow
        System.out.println("Busted MIN value: " + (myMinInteger - 1));//integer underflow

        //byte, short, long and width

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        //long myLongValue = 1000L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

        short  bigShortLiteralValue = 32767;

        int myTotal = (myMinInteger / 2);
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue/2);

        byte byteVariable = 88;
        short shortVariable = 123;
        int intVariable = 1000;
        long longVariable =  (50000L + (10L * (byteVariable + shortVariable + intVariable)));

        System.out.println(longVariable );
        float minFloatValue = Float.MIN_VALUE;
        float maxFloatValue = Float.MAX_VALUE;
        System.out.println("Max float valueL:" + maxFloatValue);
        System.out.println("Min float valueL:" + minFloatValue);

        double minDoubleValue = Double.MIN_VALUE;
        double maxDoubleValue = Double.MAX_VALUE;
        System.out.println("Max double valueL:" + maxDoubleValue);
        System.out.println("Min double valueL:" + minDoubleValue);

        int newIntValue = 5/3;
        double doubleValue = 5d/3d;
        float floatValue = 5f/3f;

        System.out.println("newIntValue: " + newIntValue);
        System.out.println("doubleValue: " + doubleValue);
        System.out.println("floatValue: " + floatValue);



    }
}
