package com.jarkyn;

public class Romanizer {
    public static String convert(int arabic) {
        if (arabic == 1) {
            return "I";
        }
        if (arabic == 2) {
            return "II";
        }
        return "";
    }
}
