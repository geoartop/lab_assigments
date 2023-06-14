package codeanalyzer;

import codeanalyzer.JSONexporter;
import codeanalyzer.MetricsExporter;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.*;

public class JSONexporterTest {

    @Test
    public void testWriteJson() {
        MetricsExporter mockedExporter = mock(JSONexporter.class);
        // create an empty metrics content
        Map<String, Integer> metrics = new HashMap<>();
        String outputFilepath = "whatever-path";

        //this is a demo of how a mocked object can call a real method (partial mocking)
        doCallRealMethod().when(mockedExporter).writeFile( metrics, outputFilepath);
        mockedExporter.writeFile( metrics, outputFilepath);
        //just verify that the method was executed/called
        verify(mockedExporter).writeFile( metrics, outputFilepath);
    }
}
