package codeanalyzer;

import java.io.IOException;
import java.util.List;

/**
 * Retrieves (reads) the contents of a given file.
 * The file can be stored locally or exist on the web.
 * This class deliberately contains code smells and violations of design principles.
 *
 * @author agkortzis
 * @version $Id: $Id
 */
public interface SourceFileReader {

    /**
     * <p>readFileIntoList.</p>
     *
     * @param filepath a {@link java.lang.String} object
     * @return a {@link java.util.List} object
     * @throws java.io.IOException if any.
     */
    List<String> readFileIntoList(String filepath) throws IOException;

    /**
     * <p>readFileIntoString.</p>
     *
     * @param filepath a {@link java.lang.String} object
     * @return a {@link java.lang.String} object
     * @throws java.io.IOException if any.
     */
    String readFileIntoString(String filepath) throws IOException;
}
