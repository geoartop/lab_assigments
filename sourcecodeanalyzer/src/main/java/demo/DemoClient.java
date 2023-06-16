package demo;

import codeanalyzer.SourceCodeAnalyzerFacade;

import java.io.IOException;

/**
 * <p>DemoClient class.</p>
 *
 * @author geoar
 * @version $Id: $Id
 */
public class DemoClient {

	/**
	 * <p>main.</p>
	 *
	 * @param args an array of {@link java.lang.String} objects
	 * @throws java.io.IOException if any.
	 */
	public static void main(String[] args) throws IOException {
		String filepath = "src/main/resources/TestClass.java";
		String sourceCodeAnalyzerType = "regex";
		String sourceFileLocation = "local";
		String outputFilePath = "output_metrics";
		String outputFileType = "csv";
		
		if(args.length == 5) {
			filepath = args[0];
			sourceCodeAnalyzerType = args[1];
			sourceFileLocation = args[2];
			outputFilePath = args[3];
			outputFileType = args[4];
		} else if (args.length != 0) {
			System.out.println("Incorrect number of arguments.");
			System.exit(1);
		}
		SourceCodeAnalyzerFacade analyzerFacade = new SourceCodeAnalyzerFacade();
		analyzerFacade.analyze(filepath, sourceCodeAnalyzerType, sourceFileLocation, outputFilePath, outputFileType);
	}

}
