package com.jarkyn;

public class Romanizer {
    enum Numeral {
        X(10),
        V(5),
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
