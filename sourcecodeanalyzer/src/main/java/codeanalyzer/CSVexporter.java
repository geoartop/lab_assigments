package codeanalyzer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * <p>CSVexporter class.</p>
 *
 * @author geoar
 * @version $Id: $Id
 */
public class CSVexporter implements MetricsExporter {
    /** {@inheritDoc} */
    @Override
    public void writeFile(Map<String, Integer> metrics, String filepath) {
        File outputFile = new File(filepath + ".csv");
        StringBuilder metricsNames = new StringBuilder();
        StringBuilder metricsValues = new StringBuilder();

        for (Map.Entry<String, Integer> entry : metrics.entrySet()) {
            metricsNames.append(entry.getKey() + ",");
            metricsValues.append(entry.getValue() + ",");
        }

        try {
            FileWriter writer = new FileWriter(outputFile);
            writer.append(metricsNames + "\n");
            writer.append(metricsValues + "\n");
            writer.close();
            System.out.println("Metrics saved in " + outputFile.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }



}
