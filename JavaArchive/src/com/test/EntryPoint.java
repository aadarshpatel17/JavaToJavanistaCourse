package com.test;

public class EntryPoint {

    /**
     * 1. Creating the Content of a JAR file
     *  -   We set up a new project with a single main method
     *  -   We changed the .class path by using File -> Project Structure then
     *          select -> module -> path -> Use module compile output path and
     *          change in path: production to dev
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
     */
    private String mode;

    public EntryPoint(String mode) {
        this.mode = mode;
    }

    public void printMode() {
        System.out.format("App is running in %s mode.\n", mode);
    }

    public static void main(String[] args) {
        EntryPoint entryPoint = new EntryPoint("DEV");
        entryPoint.printMode();
    }

}
