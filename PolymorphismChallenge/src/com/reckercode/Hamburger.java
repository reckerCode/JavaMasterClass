package com.reckercode;


class Hamburger {
    private String name;
    private double price;
    private String breadRoll;
    private String meat;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;



    public Hamburger(String name,String meat, double price, String breadRoll) {
        this.name = name;
        this.price = price;
        this.breadRoll = breadRoll;
        this.meat = meat;
    }

    public void addHamburgerAddition1(String name, double price){
        this.addition1Name = name;
        this.addition1Price = price;
    }
    public void addHamburgerAddition2(String name, double price){
        this.addition2Name = name;
        this.addition2Price = price;
    }
    public void addHamburgerAddition3(String name, double price){
        this.addition3Name = name;
        this.addition3Price = price;
    }
    public void addHamburgerAddition4(String name, double price){
        this.addition4Name = name;
        this.addition4Price = price;
    }


    public double itemizeHamburger(){
        double hamburgerPrice = this.price;
        System.out.println(this.name +" hamburger"+"on a "+this.breadRoll+" roll"+" prince is "+this.price);
        if(this.addition1Name != null){
            hamburgerPrice+=this. addition1Price;
            System.out.println("Added "+this.addition1Name+" for extra " +this.addition1Price +" dollors");
        }
        if(this.addition2Name != null){
            hamburgerPrice+=this. addition2Price;
            System.out.println("Added "+this.addition2Name+" for extra " +this.addition2Price +" dollors");
        }
        if(this.addition3Name != null){
            hamburgerPrice+=this. addition3Price;
            System.out.println("Added "+this.addition3Name+" for extra " +this.addition3Price +" dollors");
        }
        if(this.addition4Name != null){
            hamburgerPrice+=this. addition4Price;
            System.out.println("Added "+this.addition4Name+" for extra " +this.addition4Price+" dollors");
        }
        return  hamburgerPrice;
    }






}

