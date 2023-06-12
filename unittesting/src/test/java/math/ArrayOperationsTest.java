package math;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;

import io.FileIO;

/**
 * @author Georgios Artopoulos
 * @version 1.0
 */
public class ArrayOperationsTest {
    ArrayOperations arrayOperations = new ArrayOperations();

    @Test
    public void testFindPrimesInFile() {
        String filepath = "../unittesting/src/test/resources/grades.txt";
        int[] expected = {2, 3, 5, 7};
        int[] numbers = {2, 3, 4, 5, 6, 7, 8};
        FileIO fileIO = mock(FileIO.class);
        MyMath myMath = mock(MyMath.class);
        when(fileIO.readFile(filepath)).thenReturn(numbers);
        when(myMath.isPrime(1)).thenThrow(IllegalArgumentException.class);
        when(myMath.isPrime(2)).thenReturn(true);
        when(myMath.isPrime(3)).thenReturn(true);
        when(myMath.isPrime(4)).thenReturn(false);
        when(myMath.isPrime(5)).thenReturn(true);
        when(myMath.isPrime(6)).thenReturn(false);
        when(myMath.isPrime(7)).thenReturn(true);
        when(myMath.isPrime(8)).thenReturn(false);
        int[] actual = arrayOperations.findPrimesInFile(fileIO, filepath, myMath);
        Assert.assertArrayEquals(expected, actual);

    }


}
