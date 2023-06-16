package codeanalyzer;

import java.util.List;

/**
 * <p>NullFileReader class.</p>
 *
 * @author geoar
 * @version $Id: $Id
 */
public class NullFileReader implements SourceFileReader {

    /** {@inheritDoc} */
    @Override
    public List<String> readFileIntoList(String filepath) {

        return null;
    }

    /** {@inheritDoc} */
    @Override
    public String readFileIntoString(String filepath) {

        return null;
    }


}
