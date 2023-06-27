package codeanalyzer;

import java.io.IOException;

/**
 * <p>NullSourceCodeAnalyzer class.</p>
 *
 * @author geoar
 * @version $Id: $Id
 */
public class NullSourceCodeAnalyzer extends SourceCodeAnalyzer {
    private final int error = -1;

    /**
     * <p>Constructor for NullSourceCodeAnalyzer.</p>
     */
    public NullSourceCodeAnalyzer() {
        super("null");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int calculateLOC(String filepath) {
        return error;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int calculateNOM(String filepath) {
        return error;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int calculateNOC(String filepath) {
        return error;
    }
}
