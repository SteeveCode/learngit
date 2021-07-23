package com.designpatterns;

public class App {

    /* Singleton Pattern:
    This design pattern prevents the instantiation of a class more than once i.e does not allow
    you to create two objects of the same class that implements the singleton pattern. It also provide
    single access to an object.
    */

    public static void main(String[] args) {
        SingletonLogger singletonLogger = SingletonLogger.getInstance();
        singletonLogger.logMessageStart();
        singletonLogger.logMessageStop();
    }
}
