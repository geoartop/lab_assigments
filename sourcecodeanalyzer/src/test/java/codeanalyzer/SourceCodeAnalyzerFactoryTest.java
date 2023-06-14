package codeanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class SourceCodeAnalyzerFactoryTest {

    private final SourceCodeAnalyzerFactory scaf = new SourceCodeAnalyzerFactory();


    private final static String TYPE_REGEX = "regex";
    private final static String TYPE_STRCOMP = "strcomp";

    @Test
    public void testCreateSourceCodeAnalyzerRegexLocal() {
        SourceCodeAnalyzer sca_local = scaf.createSourceCodeAnalyzer(TYPE_REGEX, "local");
        Assert.assertTrue(sca_local instanceof RegexAnalyzer);

    }

    @Test
    public void testCreateSourceCodeAnalyzerRegexWeb() {
        SourceCodeAnalyzer sca_web = scaf.createSourceCodeAnalyzer(TYPE_REGEX, "web");
        Assert.assertTrue(sca_web instanceof RegexAnalyzer);
    }

    @Test
    public void testCreateSourceCodeAnalyzerStrCompLocal() {
        SourceCodeAnalyzer sca_local = scaf.createSourceCodeAnalyzer(TYPE_STRCOMP, "local");
        Assert.assertTrue(sca_local instanceof StrCompAnalyzer);
    }

    @Test
    public void testCreateSourceCodeAnalyzerStrCompWeb() {
        SourceCodeAnalyzer sca_web = scaf.createSourceCodeAnalyzer(TYPE_STRCOMP, "web");
        Assert.assertTrue(sca_web instanceof StrCompAnalyzer);
    }

    @Test
    public void testCreateSourceCodeAnalyzerNullLocal() {
        SourceCodeAnalyzer sca_local = scaf.createSourceCodeAnalyzer("null", "local");
        Assert.assertTrue(sca_local instanceof NullSourceCodeAnalyzer);

    }

    @Test
    public void testCreateSourceCodeAnalyzerNullWeb() {
        SourceCodeAnalyzer sca_web = scaf.createSourceCodeAnalyzer("null", "web");
        Assert.assertTrue(sca_web instanceof NullSourceCodeAnalyzer);
    }
}