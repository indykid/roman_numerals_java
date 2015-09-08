package com.jarkyn;

import org.junit.Test;

import static com.jarkyn.Romanizer.convert;
import static org.junit.Assert.*;

public class RomanizerTest {
    @Test
    public void convertsZero() {
        assertEquals("", convert(0));
    }

    @Test
    public void convertsOne() {
        assertEquals("I", convert(1));
    }

    @Test
    public void convertsTwo() {
        assertEquals("II", convert(2));
    }

    @Test
    public void convertsThree() {
        assertEquals("III", convert(3));
    }

    @Test
    public void convertsFive() {
        assertEquals("V", convert(5));
    }

    @Test
    public void convertsSix() {
        assertEquals("VI", convert(6));
    }

    @Test
    public void convertEight() {
        assertEquals("VIII", convert(8));
    }

    @Test
    public void convertsTen() {
        assertEquals("X", convert(10));
    }

    @Test
    public void convertsFifteen() {
        assertEquals("XV", convert(15));
    }

    @Test
    public void convertsTwenty() {
        assertEquals("XX", convert(20));
    }

    @Test
    public void convertsFour() {
        assertEquals("IV", convert(4));
    }

    @Test
    public void convertsNine() {
        assertEquals("IX", convert(9));
    }
}
