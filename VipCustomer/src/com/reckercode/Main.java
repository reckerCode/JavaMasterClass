package com.reckercode;

public class Main {

    public static void main(String[] args) {
	// write your code here
        VipCustomer newCustomer = new VipCustomer("Hardik",500.00, "hardik@reckercode.com");
        System.out.println("Name: "+newCustomer.getName());
        System.out.println("Credit Limit:"+newCustomer.getCreditLimit());
        System.out.println("Email Address: "+newCustomer.getEmailAddress());

        VipCustomer newCustomer1 = new VipCustomer(500.00, "hardik@reckercode.com");
        System.out.println("Name: "+newCustomer1.getName());
        System.out.println("Credit Limit:"+newCustomer1.getCreditLimit());
        System.out.println("Email Address: "+newCustomer1.getEmailAddress());

        VipCustomer newCustomer2 = new VipCustomer();
        System.out.println("Name: "+newCustomer2.getName());
        System.out.println("Credit Limit:"+newCustomer2.getCreditLimit());
        System.out.println("Email Address: "+newCustomer2.getEmailAddress());

    }
}
