package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MathKit868Test {

    @Test
    void loudWorks() {
        assertEquals("HELLO", MathKit868.loud("hello"));
        assertEquals("ABC", MathKit868.loud("aBc"));
    }

    @Test
    void absWorks() {
        assertEquals(5, MathKit868.abs(5));
        assertEquals(5, MathKit868.abs(-5));
    }

    @Test
    void rectAreaWorks() {
        assertEquals(12, MathKit868.rectArea(3, 4));
        assertEquals(35, MathKit868.rectArea(5, 7));
    }
}
