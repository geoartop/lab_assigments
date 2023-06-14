package codeanalyzer;

import java.io.IOException;

public class NullSourceCodeAnalyzer extends SourceCodeAnalyzer {
    private final int error = -1;

    public NullSourceCodeAnalyzer() {
        super("null");
    }

    @Override
    public int calculateLOC(String filepath) throws IOException {
        return error;
    }

    @Override
    public int calculateNOM(String filepath) throws IOException {
        return error;
    }

    @Override
    public int calculateNOC(String filepath) throws IOException {
        return error;
    }
}
