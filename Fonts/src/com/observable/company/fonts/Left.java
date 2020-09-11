package com.observable.company.fonts;

import com.observable.company.Alignment;

public class Left implements Alignment {

    @Override
    public void setAlignment() {
        System.out.println("Alignment is Left!");
    }
}
