package com.learning.jsonparsing3.$2readingwritingjson;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadingNestedJSON {

    public static void main(String[] args) throws IOException, JSONException {

        /**
         * Reading and Writing JSON Objects
         *  -   
         */

        /* readAllBytes: to read entire contents of file */
        String employeeString = new String(Files.readAllBytes(Paths.get("src/main/java/com/learning/jsonparsing3/files/employee1.json")));

        JSONObject employeeJson = new JSONObject(employeeString);

        String name = employeeJson.getString("name");
        double salary = employeeJson.getDouble("salary");

        JSONObject contactJson = employeeJson.getJSONObject("contact");

        String phone = contactJson.getString("phone");
        String email = contactJson.getString("email");

        System.out.printf("\n%s, %.1f, %s, %s\n", name, salary, phone, email);

    }

}
