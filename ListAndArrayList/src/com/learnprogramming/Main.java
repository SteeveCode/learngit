package com.learnprogramming;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstruction();
        while (!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // why is this important even though we already have it in the addItem() method?

            switch (choice){
                case 0:
                    printInstruction();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                   processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstruction() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application");
    }
    public static void printGroceryList(){
        groceryList.printGroceryList();
    }

    public static void addItem(){
        System.out.println("Please enter the grocery item: ");
//      String newGroceryItem = scanner.nextLine();
//      groceryList.addGroceryItem(newGroceryItem);
        groceryList.addGroceryItem(scanner.nextLine()); // why was the .nextLine() method unrecognized above?
    }
    public static void modifyItem(){
        System.out.println("Current item name");
        String itemNo = scanner.nextLine();
        System.out.println("Enter replacement item");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo, newItem);
    }
    public static void removeItem(){
        System.out.println("Enter item name to remove");
        String itemNo = scanner.nextLine();
        //scanner.nextLine(); // clears the buffer memory
        groceryList.removeGroceryItem(itemNo);
    }
    public static void searchForItem(){
        System.out.println("Enter item to search for");
        String searchItem = scanner.nextLine();
        if(groceryList.onFile(searchItem)){
            System.out.println("Found " + searchItem +" in your groceryList");
        }else
            System.out.println(searchItem + " is not in your groceryList");
        }
        public static void processArrayList(){
            ArrayList<String> newArray = new ArrayList<>();
            newArray.addAll(groceryList.getGroceryList());

            ArrayList<String> nextArray = new ArrayList<>(groceryList.getGroceryList()); // alternate method to copy arrayList

            String[] myArray = new String[groceryList.getGroceryList().size()]; // alternate method to copy arrayList
            myArray = groceryList.getGroceryList().toArray(myArray);

        }
    }

