package com.designpatterns;

public class ComputerFactory {
    public Computer getComputer(String computer){
        if(computer.equalsIgnoreCase("Laptop")){
            return new Laptop();
        }
        if(computer.equalsIgnoreCase("Phone")){
            return new Phone();
        }
        if(computer.equalsIgnoreCase("SmartTV")){
            return new SmartTV();
        }
        return null;
    }
}
