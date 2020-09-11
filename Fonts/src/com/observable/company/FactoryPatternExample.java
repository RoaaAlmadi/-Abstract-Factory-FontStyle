package com.observable.company;

public class FactoryPatternExample {

    public static void main(String[] args) {
     FactoryProducer fontfactory = new FactoryProducer("style", "Center");
     Factory fs = fontfactory.getFactory();

    }
}
