package codeanalyzer;

/**
 * <p>MetricsExporterFactory class.</p>
 *
 * @author geoar
 * @version $Id: $Id
 */
public class MetricsExporterFactory {
    /**
     * <p>createMetricsExporter.</p>
     *
     * @param type a {@link java.lang.String} object
     * @return a {@link codeanalyzer.MetricsExporter} object
     */
    public MetricsExporter createMetricsExporter(String type) {
        if (type.equals("csv")) {
            return new CSVexporter();
        } else if (type.equals("json")) {
            return new JSONexporter();
        } else {
            throw new IllegalArgumentException("Unknown type : " + type);
        }
    }
}
