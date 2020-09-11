package com.observable.company.Fonts;

import com.observable.company.FontStyle;

public class Bold implements FontStyle {
    @Override
    public void setFont() {
        System.out.println("Font is BOLD!");
    }
}
