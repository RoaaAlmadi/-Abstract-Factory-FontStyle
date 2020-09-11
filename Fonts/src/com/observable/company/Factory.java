package com.observable.company;

public abstract class Factory {

    public Factory (String font, String style) {

    }
    public abstract FontStyle getFontStyle();
    public abstract Alignment getAlignment();

}
