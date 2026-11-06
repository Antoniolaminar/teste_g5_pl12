package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MathKit404Test {

    @Test
    void areaOfWorks() {
        assertEquals(12, MathKit404.areaOf(3, 4));
        assertEquals(35, MathKit404.areaOf(5, 7));
    }

    @Test
    void shoutWorks() {
        assertEquals("HELLO", MathKit404.shout("hello"));
        assertEquals("ABC", MathKit404.shout("aBc"));
    }

    @Test
    void isAboveZeroWorks() {
        assertTrue(MathKit404.isAboveZero(3));
        assertFalse(MathKit404.isAboveZero(-3));
        assertFalse(MathKit404.isAboveZero(0));
    }
}
