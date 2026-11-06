package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Calc182Test {

    @Test
    void isPositiveWorks() {
        assertTrue(Calc182.isPositive(3));
        assertFalse(Calc182.isPositive(-3));
        assertFalse(Calc182.isPositive(0));
    }

    @Test
    void surfaceWorks() {
        assertEquals(12, Calc182.surface(3, 4));
        assertEquals(35, Calc182.surface(5, 7));
    }

    @Test
    void cToFWorks() {
        assertEquals(212.0, Calc182.cToF(100.0), 1e-9);
        assertEquals(32.0, Calc182.cToF(0.0), 1e-9);
    }
}
