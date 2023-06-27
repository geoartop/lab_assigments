# This is the repository for the lab assignments of the course Software Engineering in practise
![Build Status](https://github.com/geoartop/lab_assigments/actions/workflows/maven.yml/badge.svg)

## Structure of the repository

The repository is structured in the following way:

- [Grades Histogram](gradesHistogram): Second lab assignment
- [Unit testing](unittesting): Third lab assignment
- [Source Code Analyzer](sourcecodeanalyzer): Fourth lab assignment

## How to execute the program and create the histogram:

### prerequisites: Java 8, Maven

### Steps:

1. Clone the repository

2. Open the project locally

3. Add the grades.txt to the resources folder of the project by following the path: Histogram/src/main/resources/

### In the terminal input the following commands:

4. mvn clean package 

5. cd Histogram/target

6. java -jar .\gradeshistogram-1.0-SNAPSHOT-jar-with-dependencies.jar grades.txt
