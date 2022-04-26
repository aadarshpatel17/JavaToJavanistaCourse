package com.learning.jsonparsing2.jsonaware;

import org.json.simple.JSONArray;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    /**
     * Implementing JSONAware and JSONStreamAware
     *  -
     */

    public static void main(String[] args) {

        System.out.println("*** Creating JSONArray of Diners");

        JSONArray dinerList = new JSONArray();

        DinerStreamAware diner1 = new DinerStreamAware("Jane Stark", 22, "Female", 153.5f);
        DinerStreamAware diner2 = new DinerStreamAware("Jon Snow", 24, "male", 767.5f);

        dinerList.add(diner1);
        dinerList.add(diner2);

        System.out.println(dinerList);

        try(FileWriter file = new FileWriter("src/files/dinersJSONAware.json")) {
            dinerList.writeJSONString(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("*** Writing out JSONArray of Diners");

    }

}
