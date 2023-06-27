package codeanalyzer;


import java.io.IOException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StrCompAnalyzerTest {

    private final static String TEST_CLASS = "src/test/resources/TestClass.java";
    private final StrCompAnalyzer StrCompAnalyzer = new StrCompAnalyzer("local");

    @Test
    public void testCalculateRegexLOC() throws IOException {
        assertEquals(7, StrCompAnalyzer.calculateLOC(TEST_CLASS));
    }

    @Test
    public void testCalculateRegexNOM() throws IOException {
        assertEquals(3, StrCompAnalyzer.calculateNOM(TEST_CLASS));
    }

    @Test
    public void testCalculateRegexNOC() throws IOException {
        assertEquals(3, StrCompAnalyzer.calculateNOC(TEST_CLASS));
    }
}