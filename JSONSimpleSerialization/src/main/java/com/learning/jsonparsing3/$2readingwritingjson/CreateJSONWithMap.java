package com.learning.jsonparsing3.$2readingwritingjson;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CreateJSONWithMap {

    public static void main(String[] args) throws JSONException {

        /**
         * Reading and Writing JSON Objects
         *  -   
         */

        Map<String, String> map = new HashMap<>();

        map.put("name", "Peter");
        map.put("title", "Vice President");
        map.put("department", "Sales");

        JSONObject employeeJson = new JSONObject(map);

        System.out.println(employeeJson.toString(4));

        try(FileWriter file = new FileWriter("src/main/java/com/learning/jsonparsing3/files/employe.json")) {
            file.write(String.valueOf(employeeJson));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
