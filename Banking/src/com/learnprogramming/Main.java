package com.learnprogramming;
/*
Your job is to create a simple banking application.
There should be a Bank class.
It should have an arrayList of Branches.
Each Branch should have an arrayList of Customers.
The Customer class should have an arrayList of Doubles (transactions).
Customer:
Name, and ArrayList of doubles.
Branch:
Need to be able to add a new customer and initial transaction amount.
Also needs to add additional transaction for that customer/branch.
Bank:
Add a new branch.
Add a customer to that branch with initial transaction.
Add a transaction for an existing customer for that branch.
Show list of customers for a particular branch and optionally a list of their transactions.
Demonstrate autoboxing and unboxing in your code. Hint: Transactions
Add data validation e.g check if exists, or does not exist, etc.
Think about where you are adding the code to perform certain actions.
* */
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");

        if(bank.addBranch("Adelaide")){
            System.out.println("Adelaide branch created");
        }

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Bob", 150.54);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        bank.listCustomers("Adelaide", true);

        bank.listCustomers("Sydney", true);

        bank.addBranch("Melbourne");

        if(!bank.addCustomer("Melbourne", "Brian", 5.33)){
            System.out.println("Error Melbourne branch does not exist");
        }
        if(!bank.addBranch("Adelaide")){
            System.out.println("Adelaide branch already exist");
        }
        if(!bank.addCustomerTransaction("Adelaide", "Fergus", 52.33)){
            System.out.println("Customer does not exist at branch");
        }
        if(!bank.addCustomer("Adelaide", "Tim", 12.2)){
            System.out.println("Customer Tim already exists");
        }
    }

}
