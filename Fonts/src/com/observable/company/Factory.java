package com.observable.company;

public abstract class Factory {
    public abstract FontStyle getFontStyle(String font);
    public abstract Alignment getAlignment(String style);
}
