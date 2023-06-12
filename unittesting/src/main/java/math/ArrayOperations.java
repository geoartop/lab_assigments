package math;

import io.FileIO;

/**
 * The ArrayOperations class provides methods for performing operations on arrays.
 *
 * @author Georgios Artopoulos
 * @version 1.0
 */

public class ArrayOperations {

    /**
     * Retrieves an array of prime numbers from a file.
     *
     * @param fileIO   the FileIO object used to read the file
     * @param filepath the path to the file
     * @param myMath   the MyMath object used to check for prime numbers
     * @return an array of prime numbers from the file
     */
    public int[] findPrimesInFile(FileIO fileIO, String filepath, MyMath myMath) {
        int[] numbers = fileIO.readFile(filepath);
        int[] primes = new int[numbers.length];
        int primesIndex = 0;

        for (int n : numbers) {
            if (myMath.isPrime(n)) {
                primes[primesIndex] = n;
                primesIndex++;
            }
        }

        // Create a new array without trailing zeros
        int[] result = new int[primesIndex];
        System.arraycopy(primes, 0, result, 0, primesIndex);

        return result;
    }
}
