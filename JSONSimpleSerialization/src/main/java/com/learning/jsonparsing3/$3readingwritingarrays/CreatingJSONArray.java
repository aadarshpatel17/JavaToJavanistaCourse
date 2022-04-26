package com.learning.jsonparsing3.$3readingwritingarrays;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class CreatingJSONArray {

    public static void main(String[] args) throws JSONException {

        /**
         * Reading and Writing JSON Arrays
         *  -   
         */

        JSONObject employeeJson1 = new JSONObject();

        employeeJson1.put("name", "Peter");
        employeeJson1.put("age", 42);
        employeeJson1.put("gender", JSONObject.NULL);
        employeeJson1.put("title", "Vice President");
        employeeJson1.put("salary", 122000);

        JSONObject employeeJson2 = new JSONObject();

        employeeJson2.put("name", "Donna");
        employeeJson2.put("title", "Tead Lead");
        employeeJson2.put("salary", 108000);

        JSONArray employeeArray = new JSONArray();
        employeeArray.put(employeeJson1);
        employeeArray.put(employeeJson2);

        System.out.println(employeeArray.toString(4));

        try(FileWriter file = new FileWriter("src/main/java/com/learning/jsonparsing3/files/employee_array.json")) {
            file.write(String.valueOf(employeeArray));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
