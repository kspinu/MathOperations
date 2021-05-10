package math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinusClassTest {

    @Test
    void shouldTestMinusTest() {
        assertEquals(5, MinusClass.minus(20, 15));
        assertEquals(-135, MinusClass.minus(20, 155));
        assertEquals(190, MinusClass.minus(205, 15));
        assertEquals(188, MinusClass.minus(203, 15));
    }
}