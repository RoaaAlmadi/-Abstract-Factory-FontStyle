package com.observable.company;

import java.util.Scanner;

public class FactoryPatternExample {

    public static void main(String[] args) {
        
        String fs;
        String fa;
        
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter a font (Bold, Italic or Plain): ");
        fs = (sn.next());
        System.out.println("Enter the Alignment (Left, Center or Right): ");
        fa = (sn.next());

        Factory fontFactory = new FactoryProducer().getFactory("font");
        FontStyle f = fontFactory.getFontStyle(fs);
        f.setFont();

        Factory alignFactory = new FactoryProducer().getFactory("style");
        Alignment a = alignFactory.getAlignment(fa);
        a.setAlignment();
    }
}
