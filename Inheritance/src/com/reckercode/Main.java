package com.reckercode;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animals newAnimal = new Animals("Animal", 1,1,5,5);
        Dog dog = new Dog("Pheobe", 8, 20, 2,4,1,20,"long silky");
        dog.eat();
        dog.walk();
        dog.run();
    }
}
