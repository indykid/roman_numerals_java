package com.jarkyn;

public class Romanizer {
    public static String convert(int arabic) {
        String roman = "";
        if (arabic == 1) {
            roman = "I";
        }
        if (arabic == 2) {
            roman = "II";
        }
        return roman;
    }
}
