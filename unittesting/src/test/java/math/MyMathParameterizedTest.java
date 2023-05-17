package math;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 * @author Georgios Artopoulos
 * @version $Id: 1.0
 */
@RunWith(Parameterized.class)
public class MyMathParameterizedTest {

    MyMath myMath = new MyMath();

    @Parameter(value = 0)
    public int n;

    @Parameter(value = 1)
    public int expected;

    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{{0, 1}, {1, 1}, {2, 2}, {12, 479001600}};
        return Arrays.asList(data);
    }

    @Test
    public void testFactorial() {
        int result = myMath.factorial(n);
        Assert.assertEquals(expected, result);
    }


}