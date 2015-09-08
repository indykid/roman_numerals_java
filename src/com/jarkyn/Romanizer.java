package com.jarkyn;

public class Romanizer {
    public static String convert(int arabic) {
        String roman = "";
        if (arabic >= 10) {
            roman += "X";
            arabic -= 10;
        }
        if (arabic >= 5) {
            roman += "V";
            arabic -= 5;
        }
        while (arabic >= 1) {
            roman += "I";
            arabic -= 1;
        }
        return roman;
    }
}
