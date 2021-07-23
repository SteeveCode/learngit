package com.designpatterns;


public class SingletonLogger {
    /* Commented out below is the "Eager Initialization" method for implementing singleton. It means that object is preloaded in memory
     even before a call is made to it. This is not ideal because it consumes more memory.
     */
    //private static SingletonLogger instance = new SingletonLogger();

    private static SingletonLogger instance;

    // private constructor ensures no client can use it to create an instance of singletonLogger object
    private SingletonLogger(){}

    /* Below is the "Lazy Initialization" method for implementing singleton. This is a way to make your
    program more memory efficient because if the program will not need a singleton object, it will not create
    the instance for it. Whereas for the eager initialization you will have it preloaded.
    Note: In a multithreaded application, use the "synchronized" keyword so you don't have an exception when two
    threads try to access the singleton object at the same time.
    */
    // getter has to be public because it is the only way to get the singleton object.//
    public static synchronized SingletonLogger getInstance(){
        if(instance == null){
            instance = new SingletonLogger();
        }
        return instance;
    }

    // actions the the singletonLogger object can perform
    public void logMessageStart(){
        System.out.println(" Start message is logged");
    }

    // actions the the singletonLogger object can perform
    public void logMessageStop(){
        System.out.println(" Stop message is logged");
    }
}
