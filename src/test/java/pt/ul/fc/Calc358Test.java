package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Calc358Test {

    @Test
    void isAboveZeroWorks() {
        assertTrue(Calc358.isAboveZero(3));
        assertFalse(Calc358.isAboveZero(-3));
        assertFalse(Calc358.isAboveZero(0));
    }

    @Test
    void absoluteWorks() {
        assertEquals(5, Calc358.absolute(5));
        assertEquals(5, Calc358.absolute(-5));
    }

    @Test
    void evenWorks() {
        assertTrue(Calc358.even(4));
        assertFalse(Calc358.even(7));
    }
}
