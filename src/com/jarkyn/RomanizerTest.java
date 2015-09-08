package com.jarkyn;

import org.junit.Test;
import static org.junit.Assert.*;

public class RomanizerTest {
    @Test
    public void testZero() {
        assertEquals("", Romanizer.convert(0));
    }
}
