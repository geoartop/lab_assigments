package codeanalyzer;

import java.io.IOException;

/**
 * Analyzes the contents of a Java source code file
 * and calculates the following metrics: loc = lines of code,
 * nom = number of methods, and noc=number of classes.
 * The current functionality supports two types of source code analysis,
 * namely regex (with the use of regular expressions) and
 * strcomp (with the use of string comparison).
 * This class deliberately contains code smells and violations of design principles.
 *
 * @author geoar
 * @version $Id: $Id
 */
public abstract class SourceCodeAnalyzer {
	
	protected SourceFileReader fileReader;
	
	/**
	 * <p>Constructor for SourceCodeAnalyzer.</p>
	 *
	 * @param fileReaderType a {@link java.lang.String} object
	 */
	public SourceCodeAnalyzer(String fileReaderType) {
		this.fileReader = new SourceFileReaderFactory().createSourceFileReader(fileReaderType);
	}
		
	/**
	 * <p>calculateLOC.</p>
	 *
	 * @param filepath a {@link java.lang.String} object
	 * @return a int
	 * @throws java.io.IOException if any.
	 */
	public abstract int calculateLOC(String filepath) throws IOException ;

	
	/**
	 * <p>calculateNOM.</p>
	 *
	 * @param filepath a {@link java.lang.String} object
	 * @return a int
	 * @throws java.io.IOException if any.
	 */
	public abstract int calculateNOM(String filepath) throws IOException ;
	
	/**
	 * <p>calculateNOC.</p>
	 *
	 * @param filepath a {@link java.lang.String} object
	 * @return a int
	 * @throws java.io.IOException if any.
	 */
	public abstract int calculateNOC(String filepath) throws IOException ;
}
