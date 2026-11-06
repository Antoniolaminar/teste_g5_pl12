package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Calc325Test {

    @Test
    void evenWorks() {
        assertTrue(Calc325.even(4));
        assertFalse(Calc325.even(7));
    }

    @Test
    void surfaceWorks() {
        assertEquals(12, Calc325.surface(3, 4));
        assertEquals(35, Calc325.surface(5, 7));
    }

    @Test
    void magnitudeWorks() {
        assertEquals(5, Calc325.magnitude(5));
        assertEquals(5, Calc325.magnitude(-5));
    }
}
