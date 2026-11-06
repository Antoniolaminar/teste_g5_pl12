package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Utils368Test {

    @Test
    void isPositiveWorks() {
        assertTrue(Utils368.isPositive(3));
        assertFalse(Utils368.isPositive(-3));
        assertFalse(Utils368.isPositive(0));
    }

    @Test
    void largerWorks() {
        assertEquals(9, Utils368.larger(9, 2));
        assertEquals(9, Utils368.larger(2, 9));
    }

    @Test
    void isEvenWorks() {
        assertTrue(Utils368.isEven(4));
        assertFalse(Utils368.isEven(7));
    }
}
