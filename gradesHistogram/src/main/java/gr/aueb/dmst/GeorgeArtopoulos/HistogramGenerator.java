package gr.aueb.dmst.GeorgeArtopoulos;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>F class.</p>
 *
 * @author George Artopoulos
 * @version $Id: $Id
 */
public class HistogramGenerator {

    /**
     * <p>main.</p>
     * The main method of the program.
     * @param args an array of {@link java.lang.String} objects
     * @throws java.io.IOException if any.
     */
    public static void main(String[] args) throws IOException {
        HistogramGenerator histogram = new HistogramGenerator();
        histogram.generateHistogram(histogram.readIntegersFromFile(args[0]));
    }

    /**
     * <p>readIntegersFromFile.</p>
     * Reads integers from a file and returns them as an array.
     * @param fileName a {@link java.lang.String} object
     * @return an array of {@link int} objects
     * @throws java.io.IOException if any.
     */
    public int[] readIntegersFromFile(String fileName) throws IOException {
        List<Integer> integers = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                getClass().getClassLoader().getResourceAsStream(fileName), StandardCharsets.UTF_8))) {
            String line = reader.readLine();
            while (line != null) {
                integers.add(Integer.parseInt(line.trim()));
                line = reader.readLine();
            }
        } catch (NullPointerException e) {
            throw new RuntimeException("File not found: " + fileName);
        }

        int[] result = new int[integers.size()];
        for (int i = 0; i < integers.size(); i++) {
            result[i] = integers.get(i);
        }
        return result;
    }

    /**
     * <p>generateHistogram.</p>
     * Generates a histogram from an array of integers.
     * @param dataValues an array of {@link int} objects
     */
    protected void generateHistogram(int[] dataValues) {
        XYSeriesCollection dataset = new XYSeriesCollection();
        /*
         * The XYSeries that are loaded in the dataset. There might be many
         * series in one dataset.
         */
        XYSeries data = new XYSeries("Grades");

        /*
         * Populating the XYSeries data object from the input Integer array
         * values.
         */
        for (int i = 0; i < dataValues.length; i++) {
            data.add(i, dataValues[i]);
        }

// add the series to the dataset
        dataset.addSeries(data);

        boolean legend = false; // do not visualize a legend
        boolean tooltips = false; // do not visualize tooltips
        boolean urls = false; // do not visualize urls

// Declare and initialize a createXYLineChart JFreeChart
        JFreeChart chart = ChartFactory.createXYLineChart("Grades", "Students", "Grades", dataset,
                PlotOrientation.VERTICAL, legend, tooltips, urls);

        /*
         * Initialize a frame for visualizing the chart and attach the
         * previously created chart.
         */
        ChartFrame frame = new ChartFrame("Grades", chart);
        frame.pack();
// makes the previously created frame visible
        frame.setVisible(true);

    }
}