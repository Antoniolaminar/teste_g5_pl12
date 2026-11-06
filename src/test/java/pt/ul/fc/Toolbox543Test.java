package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Toolbox543Test {

    @Test
    void greaterThanZeroWorks() {
        assertTrue(Toolbox543.greaterThanZero(3));
        assertFalse(Toolbox543.greaterThanZero(-3));
        assertFalse(Toolbox543.greaterThanZero(0));
    }

    @Test
    void evenWorks() {
        assertTrue(Toolbox543.even(4));
        assertFalse(Toolbox543.even(7));
    }

    @Test
    void multiplyWorks() {
        assertEquals(5 * 7, Toolbox543.multiply(5));
        assertEquals(0, Toolbox543.multiply(0));
    }
}
