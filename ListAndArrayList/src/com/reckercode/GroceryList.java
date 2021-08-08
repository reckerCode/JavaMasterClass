package com.reckercode;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItem(String item){
        groceryList.add(item);
    }
    public void printGroceryList(){
        System.out.println("You have "+groceryList.size() + " items in your grocery list ");
        for(int i=0; i<groceryList.size();i++){
            System.out.println(i+" " + groceryList.get(i));
        }
    }
    public void modifyGroceryList(String currentItem, String newItem){
        int position = findItems(currentItem);
        if(position >=0){
            modifyGroceryList(position, newItem);
        }
    }
    private void modifyGroceryList(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery Item "+(position+1)+" has been modified");
    }

    public void removeGroceryItem(String item){
        int position  = findItems(item);
        if(position >= 0){
            removeGroceryItem(position);
        }
    }
    private void removeGroceryItem(int position){
        groceryList.remove(position);
    }
    private int findItems(String searchItems){
        return groceryList.indexOf(searchItems);
    }
    public boolean onFile(String searchItem){
        int position =  findItems(searchItem);
        if(position>=0){
            return true;
        }
        return false;
    }
}
