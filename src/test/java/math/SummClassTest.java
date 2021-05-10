package math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SummClassTest {

    @Test
    void shouldTestSummTest() {
        assertEquals(14, SummClass.summa(5, 9));
        assertEquals(23, SummClass.summa(14, 9));
        assertEquals(140, SummClass.summa(20, 120));
        assertEquals(4, SummClass.summa(5, -1));
        assertEquals(62, SummClass.summa(59, 3));
        assertEquals(79, SummClass.summa(55, 24));
        assertEquals(32, SummClass.summa(32, 0));
        assertEquals(90, SummClass.summa(55, 35));
        assertEquals(87, SummClass.summa(50, 37));
        assertEquals(1, SummClass.summa(-8, 9));
    }
}