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
}
