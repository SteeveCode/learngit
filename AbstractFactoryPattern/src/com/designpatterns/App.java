package com.designpatterns;

/* Abstract Factory Pattern:
* It has the advantages and disadvantages as factory pattern. The major difference is that instead of
* having a single object factory that will create all the objects for you, it contains a super-factory
* which creates a factory that will then create the object interested in.
* */

public class App {
    public static void main(String[] args) {
        AbstractFactory computerFactory = FactoryProducer.getFactory(false);
        Computer computer = computerFactory.getComputer("SmartTV");
        computer.computes();

        AbstractFactory computerFactory2 = FactoryProducer.getFactory(true);
        Computer computer2 = computerFactory.getComputer("Laptop");
        computer2.computes();
    }
}
