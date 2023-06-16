package codeanalyzer;

import java.util.Map;

/**
 * Exports (writes) the metrics to a given output.
 * The output can be CSV or JSON files.
 * This class deliberately contains code smells and violations of design principles.
 *
 * @author geoar
 * @version $Id: $Id
 */
public interface MetricsExporter {

    /**
     * <p>writeFile.</p>
     *
     * @param metrics a {@link java.util.Map} object
     * @param filepath a {@link java.lang.String} object
     */
    void writeFile(Map<String, Integer> metrics, String filepath);


}
