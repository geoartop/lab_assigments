package io;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * @author Georgios Artopoulos
 * @version $Id: 1.0
 */

public class FileIOTest {
    FileIO fileIO = new FileIO();

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testNonExistingFile() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Input file does not exist");
        fileIO.readFile("nofilehere.txt");
    }

    @Test
    public void testEmptyFile() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Given file is empty");
        fileIO.readFile("../unittesting/src/test/resources/nullfile.txt");
    }

    @Test
    public void testReadFile() {
        int[] expected = {1, 2, 3, 4};
        int[] actual = fileIO.readFile("../unittesting/src/test/resources/int1234.txt");
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testReadFileContainsInvalidEntries() {
        int[] expected = {1, 2, 3, 4};
        int[] actual = fileIO.readFile("../unittesting/src/test/resources/invalidentries.txt");
        Assert.assertArrayEquals(expected, actual);
    }


}
