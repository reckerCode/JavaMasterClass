package com.reckercode;

public class HealthyBurger extends Hamburger{
    private String addition5Name;
    private double addition5Price;

    private String addition6Name;
    private double addition6Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown Rye");
    }

    public void addHamburgerAddition5(String name, double price){
        this.addition5Name = name;
        this.addition5Price = price;
    }
    public void addHamburgerAddition6(String name, double price){
        this.addition6Name = name;
        this.addition6Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
//        System.out.println(this.name +" hamburger"+"on a "+super.breadRoll+" roll"+" prince is "+this.price);
        if(this.addition5Name != null){
            hamburgerPrice+=this. addition5Price;
            System.out.println("Added "+this.addition5Name+" for extra " +this.addition5Price +" dollors");
        }
        if(this.addition6Name != null){
            hamburgerPrice+=this. addition6Price;
            System.out.println("Added "+this.addition6Name+" for extra " +this.addition6Price +" dollors");
        }
        return hamburgerPrice;
    }
}
