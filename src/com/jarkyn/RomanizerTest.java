package com.jarkyn;

import org.junit.Test;
import static org.junit.Assert.*;

public class RomanizerTest {
    @Test
    public void convertsZero() {
        assertEquals("", Romanizer.convert(0));
    }

    @Test
    public void convertsOne() {
        assertEquals("I", Romanizer.convert(1));
    }

    @Test
    public void convertsTwo() {
        assertEquals("II", Romanizer.convert(2));
    }

    @Test
    public void convertsThree() {
        assertEquals("III", Romanizer.convert(3));
    }

    @Test
    public void convertsFive() {
        assertEquals("V", Romanizer.convert(5));
    }

    @Test
    public void convertsSix() {
        assertEquals("VI", Romanizer.convert(6));
    }
}
