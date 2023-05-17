package math;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * @author Georgios Artopoulos
 * @version $Id: 1.0
 */
public class ArithmeticOperationsTest {
    ArithmeticOperations arithmeticOperations = new ArithmeticOperations();

    @Test
    public void testMultiply() {
        int result = arithmeticOperations.multiply(15, 2);
        Assert.assertEquals(30, result);
    }

    @Test
    public void testMultiplyWithNegativeX() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("x & y should be >= 0");
        arithmeticOperations.multiply(-3, 1);
    }

    @Test
    public void testMultiplyWithNegativeXAndY() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("x & y should be >= 0");
        arithmeticOperations.multiply(-32, -16);
    }

    @Test
    public void testDivide() {
        double result = arithmeticOperations.divide(4, 2);
        Assert.assertEquals(2, result, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        arithmeticOperations.divide(10, 0);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testMultiplyWithMaxValue() {
        int result = arithmeticOperations.multiply(Integer.MAX_VALUE, 1);
        Assert.assertEquals(Integer.MAX_VALUE, result);
    }

    @Test
    public void testMultiplyWithMaxValueAndNegative() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("x & y should be >= 0");
        arithmeticOperations.multiply(Integer.MAX_VALUE, -1);
    }

    @Test
    public void testMultiplyWithOverflow() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("The product does not fit in an Integer variable");
        arithmeticOperations.multiply(Integer.MAX_VALUE, 2);
    }
}
