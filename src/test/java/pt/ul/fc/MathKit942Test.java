package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MathKit942Test {

    @Test
    void addWorks() {
        assertEquals(7, MathKit942.add(3, 4));
        assertEquals(0, MathKit942.add(-2, 2));
    }

    @Test
    void cToFWorks() {
        assertEquals(212.0, MathKit942.cToF(100.0), 1e-9);
        assertEquals(32.0, MathKit942.cToF(0.0), 1e-9);
    }

    @Test
    void pickMaxWorks() {
        assertEquals(9, MathKit942.pickMax(9, 2));
        assertEquals(9, MathKit942.pickMax(2, 9));
    }
}
