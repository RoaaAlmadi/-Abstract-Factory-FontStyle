package com.observable.company.Fonts;

import com.observable.company.FontStyle;

public class Plain implements FontStyle {

    @Override
    public void setFont() {
        System.out.println("Font is plain!");
    }
}
