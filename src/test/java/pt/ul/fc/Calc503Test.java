package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Calc503Test {

    @Test
    void isPositiveWorks() {
        assertTrue(Calc503.isPositive(3));
        assertFalse(Calc503.isPositive(-3));
        assertFalse(Calc503.isPositive(0));
    }

    @Test
    void timesWorks() {
        assertEquals(5 * 6, Calc503.times(5));
        assertEquals(0, Calc503.times(0));
    }

    @Test
    void convertTempWorks() {
        assertEquals(212.0, Calc503.convertTemp(100.0), 1e-9);
        assertEquals(32.0, Calc503.convertTemp(0.0), 1e-9);
    }
}
