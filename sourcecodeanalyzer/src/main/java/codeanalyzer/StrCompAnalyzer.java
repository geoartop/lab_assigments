package codeanalyzer;

import java.io.IOException;
import java.util.List;

/**
 * <p>StrCompAnalyzer class.</p>
 *
 * @author geoar
 * @version $Id: $Id
 */
public class StrCompAnalyzer extends SourceCodeAnalyzer {
    /**
     * <p>Constructor for StrCompAnalyzer.</p>
     *
     * @param fileReaderType a {@link java.lang.String} object
     */
    public StrCompAnalyzer(String fileReaderType) {
        super(fileReaderType);
    }

    /** {@inheritDoc} */
    @Override
    public int calculateLOC(String filepath) throws IOException {
        List<String> sourceCodeList = fileReader.readFileIntoList(filepath);
        int nonCodeLinesCounter = 0;
        for (String line : sourceCodeList) {
            line = line.stripLeading().stripTrailing(); //clear all leading and trailing white spaces
            if (line.startsWith("//") || line.startsWith("/*") || line.startsWith("*") || line.equals("{") || line.equals("}") || line.equals(""))
                nonCodeLinesCounter++;
        }
        int loc = sourceCodeList.size() - nonCodeLinesCounter;
        return loc;

    }

    /** {@inheritDoc} */
    public int calculateNOM(String filepath) throws IOException {
        List<String> sourceCodeList = fileReader.readFileIntoList(filepath);
        int methodCounter = 0;
        for (String line : sourceCodeList) {
            line = line.stripLeading().stripTrailing(); //clear all leading and trailing white spaces
            if (((line.contains("public") || line.contains("private") || line.contains("protected"))
                    || line.contains("void") || line.contains("int") || line.contains("String"))
                    && line.contains("(") && line.contains(")") && line.contains("{"))
                methodCounter++;
        }
        return methodCounter;
    }

    /** {@inheritDoc} */
    public int calculateNOC(String filepath) throws IOException {
        List<String> sourceCodeList = fileReader.readFileIntoList(filepath);
        int classCounter = 0;
        for (String line : sourceCodeList) {
            line = line.stripLeading().stripTrailing(); //clear all leading and trailing white spaces
            if (line.contains("class") && line.contains("{"))
                classCounter++;
        }
        return classCounter;
    }

}
