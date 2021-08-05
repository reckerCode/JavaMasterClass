package com.reckercode;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        if(this.firstName.isEmpty()){
            return " ";
        }else {
            return this.firstName;
        }
    }
    public String getLastName(){
        if(this.lastName.isEmpty()){
            return " ";
        }
        else{
            return this.lastName;
        }
    }
    public void setAge(int age){
        if(age<0||age>100){
            this.age = 0;
        }else {
            this.age = age;
        }
    }
    public boolean isTeen(){
        return this.age > 12 && this.age < 20;
    }
    public String getFullName(){
        if(firstName.isEmpty() && lastName.isEmpty()){
            return " ";
        }else if(firstName.isEmpty()){
            return this.lastName;
        }else if(lastName.isEmpty()){
            return this.firstName;
        }else{
            return firstName+" "+lastName;
        }
    }
    public int getAge(){
        return this.age;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
}
