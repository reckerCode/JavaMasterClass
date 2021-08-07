package com.reckercode;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person hardik = new Person();
        Person khushboo = new Person();

        khushboo.setAge(24);
        khushboo.setFirstName("Khushboo");
        khushboo.setLastName("");

        hardik.setAge(18);
        hardik.setFirstName("Hardik");
        hardik.setLastName("");

        System.out.println("First Name: "+khushboo.getFirstName());
        System.out.println("Last Name: "+khushboo.getLastName());
        System.out.println("Full Name: "+khushboo.getFullName());
        System.out.println("Age: "+khushboo.getAge());

        System.out.println("First Name: "+hardik.getFirstName());
        System.out.println("Last Name: "+hardik.getLastName());
        System.out.println("Full Name: "+hardik.getFullName());
        System.out.println("Age Name: "+hardik.getAge());

    }
}
