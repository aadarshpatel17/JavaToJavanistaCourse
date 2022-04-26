package com.learning.jsonparsing3.$3readingwritingarrays;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadingJSONArray {

    public static void main(String[] args) throws JSONException, IOException {

        /**
         * Reading and Writing JSON Arrays
         *  -   
         */

        String employeeString = new String(Files.readAllBytes(Paths.get("src/main/java/com/learning/jsonparsing3/files/employee_array.json")));

        JSONArray employeesJson = new JSONArray(employeeString);

        for(int i=0; i<employeesJson.length(); i++) {
            JSONObject employeeJson = employeesJson.getJSONObject(i);

            String name = employeeJson.getString("name");
            String title = employeeJson.getString("title");
            double salary = employeeJson.getDouble("salary");

            System.out.printf("\n***\n%s, %s, %.1f\n", name, title, salary);

            /* optString/optInt method: used for optional fields (may or may not present in the json), if
            *   not present in the json file then return DEFAULT values */
            int age = employeeJson.optInt("age");
            String gender = employeeJson.optString("gender");

            System.out.printf("%d, %s\n", age, gender);
        }

    }

}
