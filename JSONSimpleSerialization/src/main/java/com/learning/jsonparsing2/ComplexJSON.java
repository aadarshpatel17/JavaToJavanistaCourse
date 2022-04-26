package com.learning.jsonparsing2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ComplexJSON {

    /**
     * Writing and Reading Complex JSON Structures
     *  -
     */

    public static void main(String[] args) {

        writingJSONObject();
        readingJSONObject();

    }

    @SuppressWarnings("unchecked")
    public static void writingJSONObject() {
        System.out.println("*** Creating JSONArray of JSONObjects");

        JSONObject dinerListObject = new JSONObject();

        JSONArray dinerList = new JSONArray();

        JSONObject diner1 = new JSONObject();
        diner1.put("name", "Jane Stark");
        diner1.put("age", 22);
        diner1.put("gender", "Female");
        diner1.put("isAllergic", false);
        diner1.put("amountSpent", 153.27);

        JSONArray contactList = new JSONArray();

        JSONObject contact1 = new JSONObject();
        contact1.put("type", "home");
        contact1.put("number", "212-555-1234");

        JSONObject contact2 = new JSONObject();
        contact2.put("type", "mobile");
        contact2.put("number", "646-555-4567");

        contactList.add(contact1);
        contactList.add(contact2);

        diner1.put("contact", contactList);
        dinerList.add(diner1);
        dinerListObject.put("diners", dinerList);

        try (FileWriter file = new FileWriter("src/files/diners.json")) {
            dinerListObject.writeJSONString(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("*** Completed Writing out JSONArray of JSONObjects");
    }

    @SuppressWarnings("unchecked")
    public static void readingJSONObject() {
        System.out.println("*** Reading JSON");

        try(FileReader reader = new FileReader("src/files/diners.json")) {
            JSONObject dinerListObject = (JSONObject) JSONValue.parse(reader);
            JSONArray dinerList = (JSONArray) dinerListObject.get("diners");

            for(Object object: dinerList) {
                JSONObject diner = (JSONObject) object;
                System.out.println("\n**** Diner");
                for(Object keyObj: diner.keySet()) {

                    String key = (String) keyObj;
                    if(key.equals("contact")) {
                        JSONArray contactList = (JSONArray) diner.get(key);
                        System.out.println("Contact Info: ");
                        for(Object contact: contactList) {
                            JSONObject contactJSON = (JSONObject) contact;
                            System.out.format("{***Number: %s, Type: %s***}\n", contactJSON.get("number"), contactJSON.get("type"));
                        }
                    }

                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("*** Completed reading JSON");
    }

}
