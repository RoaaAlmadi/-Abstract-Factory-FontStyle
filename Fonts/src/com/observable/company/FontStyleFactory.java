package com.observable.company;

import com.observable.company.Fonts.Bold;
import com.observable.company.Fonts.Italic;
import com.observable.company.Fonts.Plain;

public class FontStyleFactory extends Factory{
    FontStyle font;
    @Override
    public FontStyle getFontStyle() {
        return font;
    }

    @Override
    public Alignment getAlignment() {
        return null;
    }

    public FontStyleFactory(String font){
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
    }
}
