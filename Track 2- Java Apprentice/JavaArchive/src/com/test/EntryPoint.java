package com.test;

import com.anothertest.Customer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EntryPoint {

    /**
     * 1. Creating the Content of a JAR file
     *  -   We set up a new project with a single main method
     *  -   We changed the .class path by using File -> Project Structure then
     *          select -> module -> path -> Use module compile output path and
     *          change in path: production to dev
     *
     *
     * 2. Building and Running an Executable JAR
     *  -   Creating a folder in which the JAR file can be created
     *      right click ProjectName -> new -> Directory -> DirectoryName (here, jars)
     *  -   An important component for any java archive file is called manifest which is a metadata file which
     *      is part of the JAR and includes a lot of key-value pairs which convey important information about the
     *      archive.
     *          right click on jars -> new -> file (manifest.txt)
     *          Main-Class: which is entry-point which needs to be run and a blank line down then (for processing
     *          key-value pair by java archiver)
     *  -   command:
     *          jar cvfm \
     *          C:/Users/HP/OneDrive/Desktop/JavaNoviceToJavanista/JavaArchive/jars/my-first-jar.jar \
     *          C:/Users/HP/OneDrive/Desktop/JavaNoviceToJavanista/JavaArchive/jars/manifest.txt \
     *          com/test/*.class
     *
     *      explanation: jar - jar binary, c - create a JAR file, v - run in verbose mode, f - file to be created,
     *                   m - input manifest file need to be used
     *          next, we specify the name of the JAR file along with its location.
     *          next, we specify the input manifest file which will be used for the JAR
     *          next, we specify the input class files within the package, specifying directory path
     *                with current directory.
     *
     *
     * 3. Viewing the Contents of a JAR file
     *  -   for viewing data in JAR use command: tar tvf my-first-jar.jar
     *          where, t - generate table of contents of the JAR file
     *                 v - verbose mode
     *                 f - name of the JAR file (here, my-first-jar.jar)
     *
     *          Output:
     *              drwxrwxr-x  0 0      0           0 Nov 15 10:05 META-INF/
     *              -rw-rw-r--  0 0      0          97 Nov 15 10:05 META-INF/MANIFEST.MF
     *              -rw-rw-r--  0 0      0         853 Nov 15 09:26 com/test/EntryPoint.class
     *
     *          where d - represents directory which is created META-INF
     *                   inside this MANIFEST.MF generated
     *                   finally, our class file
     *
     *  -   for extracting the content of jar file
     *          tar xvf my-first-jar.jar
     *         where, x - for extracting the content
     *
     *
     * 4. Creating a JAR without an Input Manifest
     *  -   command:
     *          jar cvfe  where, e - set entry-point or main-class for the JAR file
     *
     *
     * 5. Defining a Detailed Manifest File
     *      Specification-Version: 1.0  (must be a sequence of non-negative decimal integers)
     *      Specification-Vendor: AadarshPatel (name of vendor which own and maintain the specification out of which
     *                                          the package has been built)
     *      Implementation-Title: My Application (name of implementation and contains regular text)
     *      Implementation-Version: build_01 (not strict as Specification-Version, can be free-form text)
     *      Implementation-Vendor: AadarshPatel
     *
     *      now, we create jar with this manifest file.
     *
     *
     * 6. Adding Dependencies to a Project
     *  -   Initially, we added 2 jar file from log4j2 file
     *  -   reference these two jar using project structure -> libraries -> + icon -> java -> select jar file
     *  -   then, we created resources folder for adding new config file as log4j2.properties
     *  -   add text to log4j2.properties file to view output in console
     *
     *
     * 7. Building a JAR File with Dependencies
     *  -   First, when it comes to the Jar file, which will be created, we need to make sure that it references
     *      the dependent libraries of our application.
     *          And the way to do that is to specify the dependencies inside the manifest input file.
     *  -   Now, in manifest.txt: Class-Path: lib/log4j-api-2.14.1.jar lib/log4j-core-2.14.1.jar
     *          we added a class-path entry which is used to point to class files or JAR files, which our own JAR
     *          file needs to reference. This can be defined in the form of path to their dependent class or JAR
     *          files in a space-separated format.
     *  -   changing source-code to reference the jar files
     *  -   then, jar created and executed.
     *
     *
     * 8. Constructing JAR Files with Multiple Main Classes
     *  -   First, we create two classes with name Person & Employee & InitPersons
     *  -   then, create jar file
     *  -   Here, we have used 4 different class file. So, out of them which class file will be executed when we
     *      run our JAR file
     *          The answer is, the one which is mentioned in manifest.txt
     *  -   Now, the question is, can we run the InitPersons main class
     *          The answer is, Yes!
     *          by using command: java -cp jar-multipleMain.jar com.test.InitPersons
     *
     *
     * 9. Creating JARs with Multiple Packages
     *  -   First, we create a package containing a class named Customer
     *  -   then, create jar and execute.
     *
     *
     * 10. Using JAR Files as an External Library
     *  -   we use the jar-multiPackage.jar into our Track-2 Java Apprentice course as an external library
     */

    /*    private String mode;

    public EntryPoint(String mode) {
        this.mode = mode;
    }

    public void printMode() {
        System.out.format("App is running in %s mode.\n", mode);
    }

    public static void main(String[] args) {
        EntryPoint entryPoint = new EntryPoint("DEV");
        entryPoint.printMode();
    }*/

    private String mode;
    private static Logger logger;

    public EntryPoint(String mode) {
        this.mode = mode;
        System.setProperty("log4j.configurationFile", "/Users/HP/OneDrive/Desktop/JavaNoviceToJavanista/JavaArchive/resources/log4j2.properties");
        this.logger = LogManager.getLogger(EntryPoint.class);
    }

    public void printMode() {
        logger.info("App is running in " + this.mode + " mode.\n");
    }

    public static void main(String[] args) {
        EntryPoint entryPoint = new EntryPoint("DEV");
        entryPoint.printMode();

        Employee admin = new Employee("admin", 0, "admin");
        System.out.println("New admin user created from EntryPoint");

        Customer customer = new Customer("defaultCustomer", 0);

        System.out.println("New customer created from EntryPoint with status " + customer.getMemberStatus());
    }

}
