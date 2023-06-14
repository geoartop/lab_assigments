package codeanalyzer;


import java.io.IOException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RegexAnalyzerTest {

    private final static String TEST_CLASS = "src/test/resources/TestClass.java";
    private final RegexAnalyzer RegexAnalyzer = new RegexAnalyzer("local");


    @Test
    public void testCalculateRegexLOC() throws IOException {
        assertEquals(21, RegexAnalyzer.calculateLOC(TEST_CLASS));
    }

    @Test
    public void testCalculateRegexNOM() throws IOException {
        assertEquals(3, RegexAnalyzer.calculateNOM(TEST_CLASS));
    }

    @Test
    public void testCalculateRegexNOC() throws IOException {
        assertEquals(3, RegexAnalyzer.calculateNOC(TEST_CLASS));
    }


}
