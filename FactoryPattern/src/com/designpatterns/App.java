package com.designpatterns;

/*
* Factory Pattern:
It creates an object factory that will create whatever object you may need.

* Advantages
a. It will hide the internal logic of creating an object.
b. It enables the programmer to add new different objects of the same type.

* Disadvantages
a. It is quite complex to implement
b. You cannot refactor your code into factory pattern. It has to be conceived from the start.
* */

public class App {
    public static void main(String[] args) {
        ComputerFactory computerFactory = new ComputerFactory();
        Computer computer1 = computerFactory.getComputer("Laptop");
        computer1.compute();

        Computer computer2 = computerFactory.getComputer("Phone");
        computer2.compute();

        Computer computer3 = computerFactory.getComputer("SmartTV");
        computer3.compute();
    }
}
