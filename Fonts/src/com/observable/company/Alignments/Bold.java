package com.observable.company.Alignments;

import com.observable.company.FontStyle;

public class Bold implements FontStyle {
    public Bold(){
        setFont();
    }
    @Override
    public void setFont() {
        System.out.println("Font is BOLD!");
    }
}
