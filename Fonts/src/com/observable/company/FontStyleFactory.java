package com.observable.company;

import com.observable.company.Fonts.Bold;
import com.observable.company.Fonts.Italic;
import com.observable.company.Fonts.Plain;

<<<<<<< HEAD
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
=======
public  class FontStyleFactory extends Factory{
    FontStyle font;

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

    @Override
    public Alignment getAlignment(String style) {
        return null;
>>>>>>> 76521c09c223d9bf222210f1d4afec738191ad22
    }
}
