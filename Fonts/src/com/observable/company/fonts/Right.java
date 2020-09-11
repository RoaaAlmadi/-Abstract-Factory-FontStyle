package com.observable.company.fonts;

import com.observable.company.Alignment;

public class Right implements Alignment {
    public Right() {
        setAlignment();
    }
    @Override
    public void setAlignment() {
        System.out.println("Alignment is Right!");
    }
}
