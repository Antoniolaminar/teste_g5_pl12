package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Utils757Test {

    @Test
    void capitalizeAllWorks() {
        assertEquals("HELLO", Utils757.capitalizeAll("hello"));
        assertEquals("ABC", Utils757.capitalizeAll("aBc"));
    }

    @Test
    void celsiusToFWorks() {
        assertEquals(212.0, Utils757.celsiusToF(100.0), 1e-9);
        assertEquals(32.0, Utils757.celsiusToF(0.0), 1e-9);
    }

    @Test
    void biggestWorks() {
        assertEquals(9, Utils757.biggest(9, 2));
        assertEquals(9, Utils757.biggest(2, 9));
    }
}
