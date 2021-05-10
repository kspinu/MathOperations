package math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DivideClassTest {

    @Test
    void shouldTestDivideMethod() {
        assertEquals(5, DivideClass.divide(150, 30));
        assertEquals(15, DivideClass.divide(30, 2));
        assertEquals(50, DivideClass.divide(150, 3));
        assertEquals(12, DivideClass.divide(24, 2));

    }

    @Test
    public void shouldOnDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            DivideClass.divide(24, 0);
        });
    }
}