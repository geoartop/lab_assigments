package codeanalyzer;

public class MetricsExporterFactory {
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
