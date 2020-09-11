package com.observable.company;

public class FactoryPatternExample {

    public static void main(String[] args) {
        Factory fontFactory = new FactoryProducer().getFactory("font");
        FontStyle f = fontFactory.getFontStyle("Bold");
        f.setFont();
    }
}
