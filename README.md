# This is the repository for the lab assignments of the course Software Engineering in practise
## Lab Assignment #2:Build Automation Tools

## Assignment (1)

Step 1: Create a parent Maven simple project (skip archetype selection) with the following
details:

➢ groupId = gr.aueb.dmst.yourname

➢ artifactId = seip2023_practical_assignments

Step 2: Create a module Maven simple project (skip archetype selection) with the following
details:

➢ Module artifactId = gradeshistogram

Also, include a proper name and a good description in the corresponding POM elements for
both parent and module.

The following steps refer to the child (module) Maven project.

Step 3: Add the latest JFreeChart charting Java library from the central Maven Repository as a
dependency in your POM.

Step 4: Add the appropriate plugin in the POM so that your project can be packaged
including the dependency (fat jar).

### Assignment (2)

Step 5: Download the file with the grades.

Step 6: Create a class named HistogramGenerator.

Step 7: In HistogramGenerator, create a method that reads the grades file and
stores the values in an array. Then, generate and present a histogram based on the
array of values. A chart such as XYLineChart satisfies the assignment
requirements.

• In the main method, call the other methods to generate the histogram of the
grades’ frequencies.

• Here is an example of how to use a XYLineChart to create charts. You are
free to use any other charts available in the library.

• Important: The grades file should be given as a command-line argument at
runtime. 

## How to execute the program and create the histogram:

### prerequisites: Java 8, Maven

### Steps:

1. Clone the repository

2. Open the project locally

3. Add the grades.txt to the resources folder of the project by following the path: Histogram/src/main/resources/

### In the terminal input the following commands:

4. mvn clean package 

5. cd Histogram/target

4. java -jar .\gradeshistogram-1.0-SNAPSHOT-jar-with-dependencies.jar grades.txt
