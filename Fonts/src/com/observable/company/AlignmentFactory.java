package com.observable.company;

import com.observable.company.Alignments.Center;
import com.observable.company.Alignments.Left;
import com.observable.company.Alignments.Right;

public class AlignmentFactory extends Factory {
    Alignment style;
    @Override
    public FontStyle getFontStyle() {
        return null;
    }

    @Override
    public Alignment getAlignment() {
        return style;
    }

    public AlignmentFactory(String style){
        switch (style)
        {
            case "Center":
                this.style =new Center();
                break;
            case "Left":
                this.style = new Left();
                break;
            default:
                this.style= new Right();
        }
    }
}
