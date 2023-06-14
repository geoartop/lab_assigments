package codeanalyzer;

public class SourceCodeAnalyzerFactory {
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
