package com.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class InitPersons {

    public static void main(String[] args) {

        System.setProperty("log4j.configurationFile", "/Users/HP/OneDrive/Desktop/JavaNoviceToJavanista/JavaArchive/resources/log4j2.properties");
        Logger logger = LogManager.getLogger(EntryPoint.class);

        Employee alice = new Employee("Alice", 1, "admin");
        Employee bob = new Employee("Bob", 2, "admin");

        logger.info("Initialized employees: " + alice.getName() + ", " + bob.getName());

    }

}
