package com.observable.company;

public class FactoryPatternExample {

    public static void main(String[] args) {
        Factory fontFactory = new FactoryProducer().getFactory("font");
        FontStyle f = fontFactory.getFontStyle("Italic");
        f.setFont();

        Factory alignFactory = new FactoryProducer().getFactory("style");
        Alignment a = alignFactory.getAlignment("Left");
        a.setAlignment();
    }
}
