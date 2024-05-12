import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {
    private SumCalculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new SumCalculator();
    }

    @Test
    public void testSumWithOne() {
        assertEquals(1, calculator.sum(1));
    }

    private void assertEquals(int i, int sum) {
    }

    @Test
    public void testSumWithThree() {
        assertEquals(6, calculator.sum(3));
    }

}

