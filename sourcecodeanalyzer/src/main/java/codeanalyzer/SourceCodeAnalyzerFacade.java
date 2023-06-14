package codeanalyzer;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SourceCodeAnalyzerFacade {
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
