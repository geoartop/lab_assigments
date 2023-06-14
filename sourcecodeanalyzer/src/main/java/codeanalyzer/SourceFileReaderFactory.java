package codeanalyzer;

public class SourceFileReaderFactory {
    public SourceFileReader createSourceFileReader(String type) {
        if (type.equals("local")) {
            return new LocalFileReader();
        } else if (type.equals("web")) {
            return new WebFileReader();
        } else {
            return new NullFileReader();
        }
    }
}