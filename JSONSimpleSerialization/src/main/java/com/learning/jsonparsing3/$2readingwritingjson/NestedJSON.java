package com.learning.jsonparsing3.$2readingwritingjson;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NestedJSON {

    public static void main(String[] args) throws JSONException {

        /**
         * Reading and Writing JSON Objects
         *  -   
         */

        /* JSON contains nested JSON Object */
        JSONObject employeeJson = new JSONObject();

        employeeJson.put("name", "Peter");
        employeeJson.put("age", 42);
        employeeJson.put("gender", JSONObject.NULL);
        employeeJson.put("title", "Vice President");
        employeeJson.put("salary", 122000);

        JSONObject contactJson = new JSONObject();

        contactJson.put("phone", "212-555-4321");
        contactJson.put("email", "peter@gmail.com");
        contactJson.put("address", "1234, 14th Street, New York, NY-10011");

        /* putting JSONObject contactJson in another JSONObject employeeJson */
        employeeJson.put("contact", contactJson);

        System.out.println(employeeJson.toString(4));

        try(FileWriter file = new FileWriter("src/main/java/com/learning/jsonparsing3/files/employee1.json")) {
            file.write(String.valueOf(employeeJson));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
