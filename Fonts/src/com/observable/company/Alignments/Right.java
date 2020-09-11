package com.observable.company.Alignments;

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
