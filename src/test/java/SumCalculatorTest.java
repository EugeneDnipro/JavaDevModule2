import org.example.SumCalculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class SumCalculatorTest {
    private SumCalculator calc;

    @BeforeEach
    public void beforeEach() {
        calc = new SumCalculator();
    }

    @Test
    public void testThatSumWorksCorrectWith1() {
        int actual = calc.sum(1);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testThatSumWorksCorrectWith3() {
        int actual = calc.sum(3);
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testThatSumWorksCorrectWith0() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calc.sum(0));
    }
}
