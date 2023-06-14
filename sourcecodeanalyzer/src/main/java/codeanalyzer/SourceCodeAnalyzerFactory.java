package codeanalyzer;

public class SourceCodeAnalyzerFactory {
    public SourceCodeAnalyzer createSourceCodeAnalyzer(String readerType, String analyzerType) {
        if (analyzerType.equals("regex")) {
            return new RegexAnalyzer(readerType);
        } else if (analyzerType.equals("strcomp")) {
            return new StrCompAnalyzer(readerType);
        } else {
            return new NullSourceCodeAnalyzer();
        }
    }
}
