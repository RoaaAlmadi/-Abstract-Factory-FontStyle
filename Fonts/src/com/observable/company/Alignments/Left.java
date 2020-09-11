package com.observable.company.Alignments;

import com.observable.company.Alignment;

public class Left implements Alignment {
    public Left() {
        setAlignment();
    }
    @Override
    public void setAlignment() {
        System.out.println("Alignment is Left!");
    }
}
