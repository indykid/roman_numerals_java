package com.jarkyn;

public class Romanizer {
    public static String convert(int arabic) {
        String roman = "";
        if (arabic == 5) {
            roman += "V";
            arabic -= 5;
        }
        for (int times = 0; times < arabic; times++) {
            roman += 'I';
        }
        return roman;
    }
}
