package com.learnprogramming;

import java.util.ArrayList;

public class GroceryList {

    public ArrayList<String> groceryList = new ArrayList<>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void modifyGroceryItem(String currentItem, String newItem){
        int position = findItem(currentItem);
        if(position>=0){
            modifyGroceryItem(position, newItem);
        }
    }
    private void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item "+ (position +1)+ "has been modified.");
    }
    private void removeGroceryItem(int position){
        groceryList.remove(position);
    }
    public void removeGroceryItem(String item){
        int position = findItem(item);
        if(position>=0){
            removeGroceryItem(position);
        }
    }

    public void printGroceryList(){
        System.out.println("you have "+ groceryList.size()+" item in your grocery list");
        for(int i=0; i<groceryList.size(); i++){
            System.out.println((i+1)+"." + groceryList.get(i));
        }
    }
    private int findItem(String searchItem){
        return groceryList.indexOf(searchItem);
    }
    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
            if(position>=0){
                return true;
            }
            return false;
    }
}
