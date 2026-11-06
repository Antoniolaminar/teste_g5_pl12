package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Utils992Test {

    @Test
    void largerWorks() {
        assertEquals(9, Utils992.larger(9, 2));
        assertEquals(9, Utils992.larger(2, 9));
    }

    @Test
    void magnitudeWorks() {
        assertEquals(5, Utils992.magnitude(5));
        assertEquals(5, Utils992.magnitude(-5));
    }

    @Test
    void positiveWorks() {
        assertTrue(Utils992.positive(3));
        assertFalse(Utils992.positive(-3));
        assertFalse(Utils992.positive(0));
    }
}
