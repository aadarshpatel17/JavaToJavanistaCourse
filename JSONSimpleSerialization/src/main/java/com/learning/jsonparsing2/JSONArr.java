package com.learning.jsonparsing2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JSONArr {

    /**
     * Writing and Reading JSON Arrays
     *  -
     */

    public static void main(String[] args) {

        writingJSONArray();
        readingJSONArray();

    }

    @SuppressWarnings("unchecked")
    public static void writingJSONArray() {
        System.out.println("*** Creating JSONArray of JSONObjects");

        JSONArray dinerList = new JSONArray();

        JSONObject diner1 = new JSONObject();
        diner1.put("name", "Jane Stark");
        diner1.put("age", 22);
        diner1.put("gender", "Female");
        diner1.put("isAllergic", false);
        diner1.put("amountSpent", 153.27);

        JSONObject diner2 = new JSONObject();
        diner2.put("name", "Jon Snow");
        diner2.put("age", 25);
        diner2.put("gender", "Male");
        diner2.put("isAllergic", false);
        diner2.put("amountSpent", 750.5);

        dinerList.add(diner1);
        dinerList.add(diner2);

        try (FileWriter file = new FileWriter("src/files/diners.json")) {
            dinerList.writeJSONString(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("*** Completed Writing out JSONArray of JSONObjects");
    }

    @SuppressWarnings("unchecked")
    public static void readingJSONArray() {
        System.out.println("*** Reading JSON");

        try(FileReader reader = new FileReader("src/files/diners.json")) {
            JSONArray dinerList = (JSONArray) JSONValue.parse(reader);
            System.out.println(dinerList);

            for(Object object: dinerList) {
                JSONObject diner = (JSONObject) object;

                System.out.println("\n**** Diner");

                String name = (String) diner.get("name");
                System.out.println("diner name: " + name);

                String gender = (String) diner.get("gender");
                System.out.println("diner gender: " + gender);

                long age = (long) diner.get("age");
                System.out.println("diner age: " + age);

                double amountSpent = (double) diner.get("amountSpent");
                System.out.println("diner spending: " + amountSpent);

                Boolean isAllergic = (Boolean) diner.get("isAllergic");
                System.out.println("diner isAllergic: " + isAllergic);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("*** Completed reading JSON");
    }

}
