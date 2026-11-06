package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Calc996Test {

    @Test
    void convertTempWorks() {
        assertEquals(212.0, Calc996.convertTemp(100.0), 1e-9);
        assertEquals(32.0, Calc996.convertTemp(0.0), 1e-9);
    }

    @Test
    void hasEvenParityWorks() {
        assertTrue(Calc996.hasEvenParity(4));
        assertFalse(Calc996.hasEvenParity(7));
    }

    @Test
    void amplifyWorks() {
        assertEquals(5 * 5, Calc996.amplify(5));
        assertEquals(0, Calc996.amplify(0));
    }
}
