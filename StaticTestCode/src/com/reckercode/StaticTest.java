package com.reckercode;

public class StaticTest {
    private static int numInstances = 0;
    private final String name;

    public StaticTest(String name){
        this.name = name;
        numInstances ++;
    }

    public static int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }
}
