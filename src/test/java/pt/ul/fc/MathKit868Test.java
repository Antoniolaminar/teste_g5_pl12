package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

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
    @Test
    void isTrueEven() {
        assertEquals(true, MathKit868.hasEvenParity(2));
        assertEquals(true, MathKit868.hasEvenParity(8));
        assertEquals(false, MathKit868.hasEvenParity(7));
        assertEquals(false, MathKit868.hasEvenParity(19));
    }
    @Test
    void trueAverage() {
        assertEquals(5, MathKit868.average(5, 5));
    }
}
