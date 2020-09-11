package com.observable.company;

import com.observable.company.Alignments.Center;
import com.observable.company.Alignments.Left;
import com.observable.company.Alignments.Right;

public class AlignmentFactory{
    Alignment style;
<<<<<<< HEAD

    public Alignment getAlignment(String style){
        if (style.equals("Center")) {

=======

    @Override
    public FontStyle getFontStyle(String font) {
        return null;
    }

    public  Alignment getAlignment(String style){

        if(style.equals("Center")) {
            this.style = new Center();
        }
        else if(style.equals("Left")) {
            this.style = new Left();
        }
        else {
            this.style =new Right();
        }
        return this.style;
>>>>>>> 76521c09c223d9bf222210f1d4afec738191ad22
    }
}
