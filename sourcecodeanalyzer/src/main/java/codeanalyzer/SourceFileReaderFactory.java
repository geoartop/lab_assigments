package codeanalyzer;

/**
 * <p>SourceFileReaderFactory class.</p>
 *
 * @author geoar
 * @version $Id: $Id
 */
public class SourceFileReaderFactory {
    /**
     * <p>createSourceFileReader.</p>
     *
     * @param type a {@link java.lang.String} object
     * @return a {@link codeanalyzer.SourceFileReader} object
     */
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
