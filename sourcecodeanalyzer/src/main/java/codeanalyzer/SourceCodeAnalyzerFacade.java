package codeanalyzer;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>SourceCodeAnalyzerFacade class.</p>
 *
 * @author geoar
 * @version $Id: $Id
 */
public class SourceCodeAnalyzerFacade {
    /**
     * <p>analyze.</p>
     *
     * @param filepath a {@link java.lang.String} object
     * @param sourceCodeAnalyzerType a {@link java.lang.String} object
     * @param filetype a {@link java.lang.String} object
     * @param outputfilepath a {@link java.lang.String} object
     * @param outputfiletype a {@link java.lang.String} object
     * @throws java.io.IOException if any.
     */
    public void analyze(String filepath, String sourceCodeAnalyzerType, String filetype, String outputfilepath, String outputfiletype) throws IOException {


        SourceCodeAnalyzerFactory analyzerfactory = new SourceCodeAnalyzerFactory();
        SourceCodeAnalyzer analyzer = analyzerfactory.createSourceCodeAnalyzer(sourceCodeAnalyzerType, filetype);
        int loc = analyzer.calculateLOC(filepath);
        int nom = analyzer.calculateNOM(filepath);
        int noc = analyzer.calculateNOC(filepath);

        Map<String, Integer> metrics = new HashMap<>();
        metrics.put("loc", loc);
        metrics.put("nom", nom);
        metrics.put("noc", noc);

        MetricsExporterFactory exporterfactory = new MetricsExporterFactory();
        MetricsExporter exporter = exporterfactory.createMetricsExporter(outputfiletype);
        exporter.writeFile(metrics, outputfilepath);
    }
}
