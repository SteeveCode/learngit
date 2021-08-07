package com.learnprogramming;
// LinkedList stores the actual link to the next item the list as well as the actual data i.e
// each element in the list holds the link to the item that follows it as well as the actual value.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Tim", 54.96);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(3);
        intList.add(4);
        for(int i=0; i<intList.size(); i++){
            System.out.println(i +": "+ intList.get(i));
        }
        // inserting or removing elements in-between an ArrayList requires all other elements to be moved down/up
        // this is very costly when dealing with large data hence use LinkedList
        intList.add(1, 2);
        for(int i=0; i<intList.size(); i++){
            System.out.println(i +": "+ intList.get(i));
        }
    }

}
