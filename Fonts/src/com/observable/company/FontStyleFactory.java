package com.observable.company;

import com.observable.company.Fonts.Bold;
import com.observable.company.Fonts.Italic;
import com.observable.company.Fonts.Plain;

public class FontStyleFactory extends Factory{
    FontStyle font;

    @Override
    public Alignment getAlignment(String style) {
        return null;
    }

    public FontStyle getFontStyle(String font) {
     if(font.equals("Bold")){
         this.font= new Bold();
     }
     else if(font.equals("Italic")){
         this.font = new Italic();
     }
     else{
         this.font = new Plain();
     }
        return this.font;
    }
}

