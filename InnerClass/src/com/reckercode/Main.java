package com.reckercode;

public class Main {

    public static void main(String[] args) {
	    GearBox mcLaren = new GearBox(6);
        GearBox.Gear first = mcLaren.new Gear(1,12.3);
        GearBox.Gear second = mcLaren.new Gear(2,15);
        GearBox.Gear third = mcLaren.new Gear(3,17);
        GearBox.Gear forth = mcLaren.new Gear(4,19);
        GearBox.Gear fifth = mcLaren.new Gear(5,21);
        GearBox.Gear sixth = mcLaren.new Gear(6,23);
        System.out.println(first.driveSpeed(1000));
        System.out.println(second.driveSpeed(2000));
        System.out.println(third.driveSpeed(3000));
        System.out.println(forth.driveSpeed(4000));
        System.out.println(fifth.driveSpeed(5000));
        System.out.println(sixth.driveSpeed(6000));
    }
}
