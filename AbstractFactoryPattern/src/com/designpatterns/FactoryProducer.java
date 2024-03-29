package com.designpatterns;

import java.util.spi.AbstractResourceBundleProvider;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean portable){
        if(portable){
            return new PortableComputer();
        } else
            return new ComputerFactory();

    }
}
