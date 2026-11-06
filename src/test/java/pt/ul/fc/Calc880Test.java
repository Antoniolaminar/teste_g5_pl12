package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Calc880Test {

    @Test
    void meanWorks() {
        assertEquals(5.0, Calc880.mean(4.0, 6.0), 1e-9);
        assertEquals(0.0, Calc880.mean(-1.0, 1.0), 1e-9);
    }

    @Test
    void biggestWorks() {
        assertEquals(9, Calc880.biggest(9, 2));
        assertEquals(9, Calc880.biggest(2, 9));
    }

    @Test
    void loudWorks() {
        assertEquals("HELLO", Calc880.loud("hello"));
        assertEquals("ABC", Calc880.loud("aBc"));
    }
}
