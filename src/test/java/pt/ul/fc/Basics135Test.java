package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Basics135Test {

    @Test
    void isAboveZeroWorks() {
        assertTrue(Basics135.isAboveZero(3));
        assertFalse(Basics135.isAboveZero(-3));
        assertFalse(Basics135.isAboveZero(0));
    }

    @Test
    void shoutWorks() {
        assertEquals("HELLO", Basics135.shout("hello"));
        assertEquals("ABC", Basics135.shout("aBc"));
    }

    @Test
    void divisibleByTwoWorks() {
        assertTrue(Basics135.divisibleByTwo(4));
        assertFalse(Basics135.divisibleByTwo(7));
    }
}
