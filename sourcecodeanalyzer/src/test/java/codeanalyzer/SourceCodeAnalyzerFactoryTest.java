package codeanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class SourceCodeAnalyzerFactoryTest {

    private final SourceCodeAnalyzerFactory scaf = new SourceCodeAnalyzerFactory();


    private final static String TYPE_REGEX = "regex";
    private final static String TYPE_STRCOMP = "strcomp";

    @Test
    public void testCreateSourceCodeAnalyzerRegexLocal() {
        SourceCodeAnalyzer sca_local = scaf.createSourceCodeAnalyzer("local", TYPE_REGEX);
        Assert.assertTrue(sca_local instanceof RegexAnalyzer);

    }

    @Test
    public void testCreateSourceCodeAnalyzerRegexWeb() {
        SourceCodeAnalyzer sca_web = scaf.createSourceCodeAnalyzer("web", TYPE_REGEX);
        Assert.assertTrue(sca_web instanceof RegexAnalyzer);
    }

    @Test
    public void testCreateSourceCodeAnalyzerStrCompLocal() {
        SourceCodeAnalyzer sca_local = scaf.createSourceCodeAnalyzer("local", TYPE_STRCOMP);
        Assert.assertTrue(sca_local instanceof StrCompAnalyzer);
    }

    @Test
    public void testCreateSourceCodeAnalyzerStrCompWeb() {
        SourceCodeAnalyzer sca_web = scaf.createSourceCodeAnalyzer("web", TYPE_STRCOMP);
        Assert.assertTrue(sca_web instanceof StrCompAnalyzer);
    }

    @Test
    public void testCreateSourceCodeAnalyzerNullLocal() {
        SourceCodeAnalyzer sca_local = scaf.createSourceCodeAnalyzer("local", "null");
        Assert.assertTrue(sca_local instanceof NullSourceCodeAnalyzer);

    }

    @Test
    public void testCreateSourceCodeAnalyzerNullWeb() {
        SourceCodeAnalyzer sca_web = scaf.createSourceCodeAnalyzer("web", "null");
        Assert.assertTrue(sca_web instanceof NullSourceCodeAnalyzer);
    }
}