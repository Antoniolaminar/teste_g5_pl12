package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Calc253Test {

    @Test
    void distanceFromZeroWorks() {
        assertEquals(5, Calc253.distanceFromZero(5));
        assertEquals(5, Calc253.distanceFromZero(-5));
    }

    @Test
    void multiplyWorks() {
        assertEquals(5 * 8, Calc253.multiply(5));
        assertEquals(0, Calc253.multiply(0));
    }

    @Test
    void addWorks() {
        assertEquals(7, Calc253.add(3, 4));
        assertEquals(0, Calc253.add(-2, 2));
    }
}
