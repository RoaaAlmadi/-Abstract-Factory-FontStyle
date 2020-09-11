package com.observable.company;

import java.util.ArrayList;

public class FactoryProducer {
    Factory factory;

    public Factory getFactory(){
        return factory;
    }

    public FactoryProducer(String type, String variable) {
        switch (type) {
            case "font":
                factory = new FontStyleFactory(variable);
                break;
            case "style":
                factory = new AlignmentFactory(variable);
        }
    }
}


