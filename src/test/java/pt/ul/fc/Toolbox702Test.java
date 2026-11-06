package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Toolbox702Test {

    @Test
    void maxOfWorks() {
        assertEquals(9, Toolbox702.maxOf(9, 2));
        assertEquals(9, Toolbox702.maxOf(2, 9));
    }

    @Test
    void absWorks() {
        assertEquals(5, Toolbox702.abs(5));
        assertEquals(5, Toolbox702.abs(-5));
    }

    @Test
    void averageWorks() {
        assertEquals(5.0, Toolbox702.average(4.0, 6.0), 1e-9);
        assertEquals(0.0, Toolbox702.average(-1.0, 1.0), 1e-9);
    }
}
