package com.reckercode;

public class Main {

    public static void main(String[] args) {
	// write your code here
//
//        DB11 db11 = new DB11(36);
//        db11.steer(60);
//        db11.accelerate(30);
//        db11.accelerate(20);
//        db11.accelerate(-35);

        Dimentions dimentions = new Dimentions(20,30,10);
        Case theCase = new Case("220B", "Dell", "240", dimentions);
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
        MotherBoard theMotherBoard = new MotherBoard("BJ-200", "Asus", 4,6,"v2.44");

        PC newPC = new PC(theCase, theMonitor, theMotherBoard);
        newPC.powerUp();
//        newPC.getMonitor().drawPixelAt(1500,1200,"green");
//        newPC.getMotherboard().loadProgram("Windows10");
//        newPC.getTheCase().pressPowerButton();
    }


}
