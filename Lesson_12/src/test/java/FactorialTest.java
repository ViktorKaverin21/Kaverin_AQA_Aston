import org.example.Factorial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {

    @Test
    void testFactorialZero() {
        assertEquals(1, Factorial.factorial(0));
    }

    @Test
    void testFactorialPositive() {
        assertEquals(24, Factorial.factorial(4));
    }

    @Test
    void testFactorialNegative() {
        assertEquals(-1, Factorial.factorial(-1));
    }
}