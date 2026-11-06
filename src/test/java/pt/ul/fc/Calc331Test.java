package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Calc331Test {

    @Test
    void pickMaxWorks() {
        assertEquals(9, Calc331.pickMax(9, 2));
        assertEquals(9, Calc331.pickMax(2, 9));
    }

    @Test
    void divisibleByTwoWorks() {
        assertTrue(Calc331.divisibleByTwo(4));
        assertFalse(Calc331.divisibleByTwo(7));
    }

    @Test
    void addWorks() {
        assertEquals(7, Calc331.add(3, 4));
        assertEquals(0, Calc331.add(-2, 2));
    }
}
