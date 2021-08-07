package com.learnprogramming;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;
    private double balance = 0;

    public Customer(String name, double initialAmount) {
        this.name = name;
        transactions = new ArrayList<>(); // initializes arraylist for first time use.
        transactions.add(initialAmount);
    }

    public void addTransaction(double amountDeposited){
      this.transactions.add(amountDeposited);
        }

   // public boolean addCustomer(String customerName, double initialAmount){}

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}

