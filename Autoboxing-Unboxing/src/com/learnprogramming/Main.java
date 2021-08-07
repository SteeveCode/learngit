package com.learnprogramming;
/*
* Code to demonstrate autoboxing and unboxing.
* */
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList <Integer> intClassArrayList = new ArrayList<>();
        intClassArrayList.add(new Integer(4)); // will work but this constructor is deprecated
        Integer integer = Integer.valueOf(54); // 54 instead will work perhaps better because of Autoboxing
        Double doubleValue = Double.valueOf(12.25); // 12.25 instead will work perhaps better because of Autoboxing
        Integer myIntValue = 5;  // Autoboxing in action i.e Integer.valueOf(5);
        int myInt = myIntValue; // Unboxing in action i.e myIntValue.intValue();

        for(int i = 0; i<=10; i++){
            intClassArrayList.add(Integer.valueOf(i));
        }
        for(int i=0; i<=10; i++){
            System.out.println(intClassArrayList.get(i).intValue());
        }
        System.out.println("break");
        for(Integer number:intClassArrayList){
            System.out.println(number);
        }

        ArrayList <Double> doubleClassArrayList = new ArrayList<>();
        for(double dbl = 0.0; dbl<=10.0; dbl+=0.5){
            doubleClassArrayList.add(Double.valueOf(dbl));
        }
        for(int i=0; i < doubleClassArrayList.size(); i++){
            double value = doubleClassArrayList.get(i).doubleValue();
            System.out.println(i + " --> " + value);
        }
    }
}
