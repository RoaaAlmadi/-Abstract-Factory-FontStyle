package com.observable.company.fonts;

import com.observable.company.Alignment;

public class Center implements Alignment {

    public Center() {
        setAlignment();
    }
    @Override
    public void setAlignment() {
        System.out.println("Alignment is Centered!");
    }
}
