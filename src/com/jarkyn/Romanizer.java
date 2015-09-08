package com.jarkyn;

public class Romanizer {
    public static String convert(int arabic) {
        String roman = "";
        for (int times = 0; times < arabic; times++) {
            roman += 'I';
        }
        return roman;
    }
}
