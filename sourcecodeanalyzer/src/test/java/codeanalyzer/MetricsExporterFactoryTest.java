package codeanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MetricsExporterFactoryTest {

    private MetricsExporterFactory mex = new MetricsExporterFactory();

    @Test(expected = IllegalArgumentException.class)
    public void testWriteFileWithUnknownFileType() {
        mex.createMetricsExporter("null");
    }

    @Test
    public void testCreateMetricsExporterCSV() {
        MetricsExporter metricsExporter = mex.createMetricsExporter("csv");
        Assert.assertTrue(metricsExporter instanceof CSVexporter);
    }

    @Test
    public void testCreateMetricsExporterJSON() {
        MetricsExporter metricsExporter = mex.createMetricsExporter("json");
        Assert.assertTrue(metricsExporter instanceof JSONexporter);
    }


}
