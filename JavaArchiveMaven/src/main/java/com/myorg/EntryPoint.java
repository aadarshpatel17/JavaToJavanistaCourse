package com.myorg;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EntryPoint {

    /**
     * Java Archive (JAR): Packaging Java Apps Using Maven
     *  1. Installing and Configuring Maven
     *      -   Download & install maven
     *
     *
     *  2. Creating a Maven Project
     *      -   creating a maven project using intellij
     *
     *  3. Building a Jar File with Maven
     *      -   Creating Employee, Person & EntryPoint classes
     *      -   configuring pom.xml
     *      -   using mvn clean package cmd to build a jar file
     *
     *  4. Running and Examining a JAR file
     *      -   running jar file using cmd: java -jar jarFileName
     *      -   viewing content of our jar file using cmd: tar tvf jarFileName
     *      -   extracting jar file to view META-INF and other files/folders
     *      -   mvn clean to clean the project (delete the target folder)
     *
     *
     *  5. Building a JAR File with Dependencies
     *      -
     *
     *
     *  6. Building an Uber JAR Using the Maven Assembly Plugin
     */

/*
    private String mode;

    public EntryPoint(String mode) {
        this.mode = mode;
    }

    public void printMode() {
        System.out.println("App is running in " + this.mode + " mode.\n");
    }

    public static void main(String[] args) {
        EntryPoint entryPoint = new EntryPoint("DEV");
        entryPoint.printMode();

        Employee admin = new Employee("admin", 0, "admin");
        System.out.println("New admin user created from EntryPoint");
    }
*/

    private String mode;
    private Logger logger;

    public EntryPoint(String mode) {
        this.mode = mode;
        System.setProperty("log4j.configurationFile", "/Users/HP/OneDrive/Desktop/JavaNoviceToJavanista/resources/log4j2.properties");
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

    }

}
