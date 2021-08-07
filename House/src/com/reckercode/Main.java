package com.reckercode;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Player player = new Player();
//        player.name = "recker";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining Health = " +player.healthRemaining());
//
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("Remaining Health = " +player.healthRemaining());

//        Below is the right way to Encapsulate
        EnhancedPlayer player = new EnhancedPlayer("Hardik", 200, "sword");
        System.out.println("Initial player health is "+ player.getHealth());

    }
}
