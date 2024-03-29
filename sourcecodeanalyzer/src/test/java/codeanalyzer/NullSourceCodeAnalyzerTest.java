package codeanalyzer;

import java.io.IOException;
import org.junit.Assert;
import org.junit.Test;

public class NullSourceCodeAnalyzerTest {

    private final SourceCodeAnalyzer nullSourceCodeAnalyzer = new NullSourceCodeAnalyzer();

    private final int error = -1;

    private final static String TEST_CLASS = "any-filepath";

    @Test
    public void testCalculateLOCNull() throws IOException {
        int actualLOC = nullSourceCodeAnalyzer.calculateLOC(TEST_CLASS);
        Assert.assertEquals(error, actualLOC);
    }

    @Test
    public void testCalculateNOMNull() throws IOException {
        int actualNOM = nullSourceCodeAnalyzer.calculateNOM(TEST_CLASS);
        Assert.assertEquals(error, actualNOM);

    }

    @Test
    public void testCalculateNOCNull() throws IOException {
        int actualNOC = nullSourceCodeAnalyzer.calculateNOC(TEST_CLASS);
        Assert.assertEquals(error, actualNOC);

    }
}