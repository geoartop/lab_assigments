package codeanalyzer;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <p>RegexAnalyzer class.</p>
 *
 * @author geoar
 * @version $Id: $Id
 */
public class RegexAnalyzer extends SourceCodeAnalyzer {
    /**
     * <p>Constructor for RegexAnalyzer.</p>
     *
     * @param fileReaderType a {@link java.lang.String} object
     */
    public RegexAnalyzer(String fileReaderType) {
        super(fileReaderType);
    }

    /** {@inheritDoc} */
    @Override
    public int calculateLOC(String filepath) throws IOException {
        String sourceCode = fileReader.readFileIntoString(filepath);
        Pattern pattern = Pattern.compile("((//.*)|(/\\*.*)|(\\*+.*))");
        Matcher nonCodeLinesMatcher = pattern.matcher(sourceCode);

        int nonCodeLinesCounter = 0;
        while (nonCodeLinesMatcher.find()) {
            nonCodeLinesCounter++;
        }

        int sourceFileLength = sourceCode.split("\n").length;
        int loc = sourceFileLength - nonCodeLinesCounter;

        return loc;
    }

    /** {@inheritDoc} */
    @Override
    public int calculateNOM(String filepath) throws IOException {
        String sourceCode = fileReader.readFileIntoString(filepath);
        Pattern pattern = Pattern.compile(".*(public |protected |private |static )?[\\w\\<\\>\\[\\]]+\\s+(\\w+) *\\([^\\)]*\\) *(\\{?|[^;]).*");
        Matcher methodSignatures = pattern.matcher(sourceCode);

        int methodCounter = 0;
        while (methodSignatures.find()) {
            methodCounter++;
        }
        return methodCounter;
    }

    /** {@inheritDoc} */
    @Override
    public int calculateNOC(String filepath) throws IOException {
        String sourceCode = fileReader.readFileIntoString(filepath);
        Pattern pattern = Pattern.compile("(\\s|^|;)class\\s");
        Matcher classSignatures = pattern.matcher(sourceCode);

        int classCounter = 0;
        while (classSignatures.find()) {
            classCounter++;
        }
        return classCounter;
    }
}
