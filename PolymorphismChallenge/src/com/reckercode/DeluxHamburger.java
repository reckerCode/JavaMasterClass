package com.reckercode;

public class DeluxHamburger extends Hamburger{
    private String addition5Name;
    private double addition5Price;

    private String addition6Name;
    private double addition6Price;

    public DeluxHamburger() {
        super("Deluxe", "Sausage", 14.56, "White");
        super.addHamburgerAddition1("Chips",2.75);
        super.addHamburgerAddition2("Drinks",1.75);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
}
