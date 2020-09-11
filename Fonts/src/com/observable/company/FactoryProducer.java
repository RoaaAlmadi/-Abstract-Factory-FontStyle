package com.observable.company;

public class FactoryProducer {

    public Factory getFactory(String type) {

            if(type.equals("font")) {
               return new FontStyleFactory();
            } else {
                return new AlignmentFactory();
            }
    }
}


