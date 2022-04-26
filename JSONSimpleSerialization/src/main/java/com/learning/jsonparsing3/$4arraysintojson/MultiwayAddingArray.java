package com.learning.jsonparsing3.$4arraysintojson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class MultiwayAddingArray {

    public static void main(String[] args) throws JSONException {

        /**
         * Inserting Arrays into JSON Structures
         *  -
         *
         * Here, explore other ways to specify array as part of JSON object
         */

        JSONObject employeeJson = new JSONObject();

        employeeJson.put("name", "Peter");
        employeeJson.put("age", 42);
        employeeJson.put("title", "Vice President");
        employeeJson.put("salary", 122000);

        /* putting arrays of json */
/*
        JSONArray emailArray = new JSONArray();
        emailArray.put("peter.piper@gmail.com");
        emailArray.put("peter@shawco.com");

        employeeJson.put("email", emailArray);
*/

        /* if we put one key with multiple values then all previous values will be replaced by the new one */
/*
        employeeJson.put("email", "peter@hotmail.com");
        employeeJson.put("email", "peter@yahoo.com");
        employeeJson.put("email", "peter@reddit.com");
*/

        /* we can also accumulate method to form an JSONArray */
        /* The problem with accumulate is that it behaves differently depending on how many times you invoke it
        *   -   At first call, it will not set up an array
        *   -   At second call, it set up an array
        *   -   At third and other will add value to that array */
/*
        employeeJson.accumulate("email", "peter@hotmail.com");
        employeeJson.accumulate("email", "peter@yahoo.com");
        employeeJson.accumulate("email", "peter@reddit.com");
*/

        /* Then now, we can use append method
        *   It will basically allow you to append values to an array */
        employeeJson.append("email", "peter@hotmail.com");
        employeeJson.append("email", "peter@yahoo.com");
        employeeJson.append("email", "peter@reddit.com");

        System.out.println(employeeJson.toString(4));

        try(FileWriter file = new FileWriter("src/main/java/com/learning/jsonparsing3/files/multiway_employee_array.json")) {
            file.write(String.valueOf(employeeJson));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}