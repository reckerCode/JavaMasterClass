package com.reckercode;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Player implements Isavable{

    private String name;
    private int hitPoints;
    private int strength;
    private String weapon = "Sword";

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", Strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }


    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, ""+this.hitPoints);
        values.add(2, ""+this.strength);
        values.add(3, this.weapon);
        return values;
    }

    @Override
    public void readArrayList(ArrayList<String> saveValues) {
        if(saveValues!=null && saveValues.size()>0){
            this.name = saveValues.get(0);
            this.hitPoints = Integer.parseInt(saveValues.get(1));
            this.strength = Integer.parseInt(saveValues.get(2));
            this.weapon = saveValues.get(3);
        }
        System.out.println("Player list is empty");
    }
}
