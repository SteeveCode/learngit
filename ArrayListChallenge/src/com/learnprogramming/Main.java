package com.learnprogramming;

// Create a program that implements a simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names.
// You will want to create a separate class for Contacts (name and phone number).
// Create a master class (MobilePhone) that holds the ArrayList of Contacts.
// The MobilePhone class has the functionality listed above.
// Add a menu of options that are available.
// Options: quit, print list of contacts, add new contact, update existing contact, remove contact,
// and search/find contact.
// When adding or updating, be sure to check if the contact already exist (use name).
// Be sure not to expose the inner workings of the Arraylist to MobilePhone e.g. no ints, no .get(i) etc.
// MobilePhone should do everything with Contact objects only.

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("003933004404");

    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printActions();
        while (!quit) {
            System.out.println("\nEnter action: (6 to show available action)");
            int action = scanner.nextInt();
            scanner.nextLine(); // clears the memory buffer
            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContact();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added: name = " + name + ", phone = " + phone);
        } else {
            System.out.println("Cannot add, " + name + "already on phone");
           }
        }

        private static void updateContact () {
            System.out.println("Enter existing contact name");
            String name = scanner.nextLine();
            Contact existingContactRecord = mobilePhone.queryContact(name);
            if (existingContactRecord == null) {
                System.out.println("Contact not found.");
                return;
            }
            System.out.println("Enter new contact name: ");
            String newName = scanner.nextLine();
            System.out.println("Enter new contact phone number: ");
            String newNumber = scanner.nextLine();
            Contact newContact = Contact.createContact(newName, newNumber);
            if (mobilePhone.updateContact(existingContactRecord, newContact)) {
                System.out.println("Successfully updated record");
            } else
                System.out.println("Error updating record");
        }

        private static void removeContact () {
            System.out.println("Enter existing contact name");
            String name = scanner.nextLine();
            Contact existingContactRecord = mobilePhone.queryContact(name);
            if (existingContactRecord == null) {
                System.out.println("Contact not found.");
                return;
            }
            if (mobilePhone.removeContact(existingContactRecord)) {
                System.out.println("Successfully deleted");
            } else
                System.out.println("Error deleting record");
        }

        private static void queryContact () {
            System.out.println("Enter existing contact name");
            String name = scanner.nextLine();
            Contact existingContactRecord = mobilePhone.queryContact(name);
            if (existingContactRecord == null) {
                System.out.println("Contact not found.");
                return;
            }
            System.out.println("Name: " + existingContactRecord.getName() + "\nPhone number: " +
                    existingContactRecord.getPhoneNumber());
        }

        private static void startPhone () {
            System.out.println("Starting phone...");
        }
        private static void printActions () {
            System.out.println("\nAvailable action:\npress");
            System.out.println("0 - to shutdown\n" +
                    "1 - to print contact\n" +
                    "2 - to add new contact\n" +
                    "3 - to update an existing contact\n" +
                    "4 - to remove an existing contact\n" +
                    "5 - to query if an existing contact exist\n" +
                    "6 - to print a list of available actions\n");
        }

}