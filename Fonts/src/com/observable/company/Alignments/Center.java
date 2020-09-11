package com.observable.company.Alignments;

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
