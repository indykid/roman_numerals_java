package com.jarkyn;

public class Romanizer {
    enum Numeral {
        C(100),
        XC(90),
        L(50),
        XL(40),
        X(10),
        IX(9),
        V(5),
        IV(4),
        I(1),
        ;

        private int arabicValue;

        Numeral(int value){
            arabicValue = value;
        }
    }

    public static String convert(int arabic) {
        String roman = "";
        for ( Numeral numeral : Numeral.values()) {
            while (arabic >= numeral.arabicValue) {
                roman += numeral.toString();
                arabic -= numeral.arabicValue;
            }
        }
        return roman;
    }
}
