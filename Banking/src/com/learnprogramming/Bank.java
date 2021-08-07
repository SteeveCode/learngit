package com.learnprogramming;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name){
        this.name = name;
        this.branches = new ArrayList<>();
    }
    public boolean addBranch(String branchName){
        if(findBranch(branchName) == null){
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }
    public boolean addCustomer(String branchName, String customerName, double initialAmount){
        Branch branch = findBranch(branchName);
        if(branch != null){
           return branch.addNewCustomer(customerName, initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double depositedAmount){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.addCustomerTransaction(customerName, depositedAmount);
        }
        return false;
    }

    private Branch findBranch(String branchName){
        for(int i =0; i < branches.size(); i++){
            if(this.branches.get(i).getName().equals(branchName)){
                return this.branches.get(i);
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public boolean listCustomers(String branchName, boolean showTransaction){
        Branch branch = findBranch(branchName);
            if(branch != null){
                System.out.println("Customer details for branch " + branch.getName());

                ArrayList<Customer> branchCustomers = branch.getCustomers();
                // getting list of customers for a particular branch
                for(int i=0; i<branchCustomers.size(); i++){
                    Customer branchCustomer = branchCustomers.get(i);
                    System.out.println("Customers: " + branchCustomer.getName() + "[" + (i+1) + "]");
                    // optionally, to show the list of transactions for a particular customer
                    if(showTransaction){
                        System.out.println("Transactions");
                        ArrayList<Double> transactions = branchCustomer.getTransactions();
                        for(int j=0; j<transactions.size(); j++){
                            System.out.println("[" + (j+1) + "] Amount " + transactions.get(j));
                        }
                    }
                }
                return true;
            } else {
                return false;
            }
        }
    }

