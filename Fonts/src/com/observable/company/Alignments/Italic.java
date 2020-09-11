package com.observable.company.Alignments;

import com.observable.company.FontStyle;

public class Italic implements FontStyle {
  public Italic(){
        setFont();
    }
    @Override
    public void setFont() {
        System.out.println("Font is i t a l i c !");
    }
}
