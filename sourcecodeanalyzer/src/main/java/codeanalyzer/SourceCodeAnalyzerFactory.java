package codeanalyzer;

/**
 * <p>SourceCodeAnalyzerFactory class.</p>
 *
 * @author geoar
 * @version $Id: $Id
 */
public class SourceCodeAnalyzerFactory {
    /**
     * <p>createSourceCodeAnalyzer.</p>
     *
     * @param analyzerType a {@link java.lang.String} object
     * @param readerType a {@link java.lang.String} object
     * @return a {@link codeanalyzer.SourceCodeAnalyzer} object
     */
    public SourceCodeAnalyzer createSourceCodeAnalyzer(String analyzerType, String readerType) {
        if (analyzerType.equals("regex")) {
            return new RegexAnalyzer(readerType);
        } else if (analyzerType.equals("strcomp")) {
            return new StrCompAnalyzer(readerType);
        } else {
            return new NullSourceCodeAnalyzer();
        }
    }
}
