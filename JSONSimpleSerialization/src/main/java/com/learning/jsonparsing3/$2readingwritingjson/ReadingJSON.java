package com.learning.jsonparsing3.$2readingwritingjson;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ReadingJSON {

    public static void main(String[] args) throws JSONException {

        /**
         * Reading and Writing JSON Objects
         *  -   
         */

        try(BufferedReader reader = new BufferedReader(new FileReader("src/main/java/com/learning/jsonparsing3/files/employee.json"))) {
            StringBuilder stringBuilder = new StringBuilder();
            String line = null;
            String ls = System.getProperty("line.separator");
            while((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(ls);
            }

            JSONObject employeeJson = new JSONObject(stringBuilder.toString());

            /* getting data in the right format without casting them using getString/getDouble etc. */
            String name = employeeJson.getString("name");
            String title = employeeJson.getString("title");
            double salary = employeeJson.getDouble("salary");
            int age = employeeJson.getInt("age");

            System.out.printf("\n%s, %s, %.1f, %d\n", name, title, salary, age);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
