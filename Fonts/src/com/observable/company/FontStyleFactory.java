package com.observable.company;

import com.observable.company.Fonts.Bold;
import com.observable.company.Fonts.Italic;
import com.observable.company.Fonts.Plain;

public class FontStyleFactory{
    FontStyle font;

    public FontStyle getFontStyle(String font){
        switch (font)
        {
            case "Bold":
                this.font =new Bold();
                break;
            case "Italic":
                this.font = new Italic();
                break;
            default:
                this.font= new Plain();
        }
