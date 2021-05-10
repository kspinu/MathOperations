package math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplyClassTest {
    @Test
    void shouldTestMultiplyMethod() {
        assertEquals(20, MultiplyClass.multiply(5, 4));
        assertEquals(25, MultiplyClass.multiply(5, 5));
    }
}