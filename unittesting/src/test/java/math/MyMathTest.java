package math;


import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * @author Georgios Artopoulos
 * @version 1.0
 */
public class MyMathTest {

    MyMath myMath = new MyMath();

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testFactorialNegative() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("n should be >= 0 and <= 12");
        myMath.factorial(-3);
    }

    @Test
    public void testFactorialGreaterThan12() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("n should be >= 0 and <= 12");
        myMath.factorial(421);
    }

    @Test
    public void testPrimeTrue() {
        boolean result = myMath.isPrime(5);
        Assert.assertTrue(result);
    }

    @Test
    public void testPrimeFalse() {
        boolean result = myMath.isPrime(4);
        Assert.assertFalse(result);
    }

    @Test
    public void testPrimeNegative() {
        thrown.expect(IllegalArgumentException.class);
        myMath.isPrime(-3);
    }

    @Test
    public void testPrimeTwo() {
        boolean result = myMath.isPrime(2);
        Assert.assertTrue(result);
    }
}
