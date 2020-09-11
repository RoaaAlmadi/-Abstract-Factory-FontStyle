package com.observable.company.fonts;

import com.observable.company.Alignment;

public class Center implements Alignment {
    @Override
    public void setAlignment() {
        System.out.println("Alignment is Centered!");
    }
}
