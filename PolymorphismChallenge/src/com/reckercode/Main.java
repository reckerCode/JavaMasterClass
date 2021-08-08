package com.reckercode;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        DecimalFormat df2 = new DecimalFormat("#.##");
	    Hamburger hamburger = new Hamburger("Basic","White", 5.36, "Sausage");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomatos", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.30);
        hamburger.addHamburgerAddition3("Pickles", 0.17);
        price = hamburger.itemizeHamburger();
        System.out.println("Total price: " +df2.format(price));

        HealthyBurger healthyBurger = new HealthyBurger("Beef", 3.44);
        healthyBurger.addHamburgerAddition1("Lettus", 0.30);
        price = healthyBurger.itemizeHamburger();
        System.out.println("Healty burger Total price: " +df2.format(price));

        DeluxHamburger db = new DeluxHamburger();
        System.out.println("Healty burger Total price: " +df2.format(db.itemizeHamburger()));

    }

}
