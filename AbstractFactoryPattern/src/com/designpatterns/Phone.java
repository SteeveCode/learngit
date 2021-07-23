package com.designpatterns;

public class Phone implements Computer {
    @Override
    public void computes(){
        System.out.println("Phone computes");
    }
}
