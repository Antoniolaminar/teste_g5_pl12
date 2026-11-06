package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Helpers476Test {

    @Test
    void isAboveZeroWorks() {
        assertTrue(Helpers476.isAboveZero(3));
        assertFalse(Helpers476.isAboveZero(-3));
        assertFalse(Helpers476.isAboveZero(0));
    }

    @Test
    void loudWorks() {
        assertEquals("HELLO", Helpers476.loud("hello"));
        assertEquals("ABC", Helpers476.loud("aBc"));
    }

    @Test
    void distanceFromZeroWorks() {
        assertEquals(5, Helpers476.distanceFromZero(5));
        assertEquals(5, Helpers476.distanceFromZero(-5));
    }
}
