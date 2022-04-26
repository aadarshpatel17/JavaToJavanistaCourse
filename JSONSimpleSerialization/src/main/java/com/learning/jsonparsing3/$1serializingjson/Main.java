package com.learning.jsonparsing3.$1serializingjson;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileWriter;

public class Main {

    public static void main(String[] args) throws JSONException {

        /**
         * Serializing a JSON Object
         *  -   JSON-Java or org.json: Popular, easy to use, powerful Java library for reading and
         *      writing json
         *  -
         */

        JSONObject employeeJson = new JSONObject();

        /* here .put() is overloaded i.e., the first argument is String and the second argument can be float
        *  int, double, long, boolean, String, Map<?,?>, Collection<?> and also Object */
        employeeJson.put("name", "Peter");
        employeeJson.put("age", 42);
        /* adding NULL value */
        employeeJson.put("gender", JSONObject.NULL);
        employeeJson.put("title", "Vice President");
        employeeJson.put("salary", 122000);

        System.out.println(employeeJson);

        try(FileWriter file = new FileWriter("src/main/java/com/learning/jsonparsing3/files/employee.json")) {
            employeeJson.write(file );
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
