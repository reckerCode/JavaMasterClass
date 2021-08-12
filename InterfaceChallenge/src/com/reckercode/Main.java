package com.reckercode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player recker = new Player("Recker", 75, 25);
        System.out.println(recker.toString());
        saveObject(recker);

        recker.setHitPoints(55);
        System.out.println(recker);
        recker.setWeapon("Sniper");
        saveObject(recker);
        loadObject(recker);
        System.out.println(recker);
    }
    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(Isavable objectToSave){
        for(int i =0;i<objectToSave.write().size();i++){
            System.out.println("Saving " +objectToSave.write().get(i)+" to storage");
        }
    }
    public static void loadObject(Isavable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.readArrayList(values);
    }
}
