package com.learning.jsonparsing2.jsonaware;

import org.json.simple.JSONStreamAware;
import org.json.simple.JSONValue;

import java.io.IOException;
import java.io.Serializable;
import java.io.Writer;
import java.util.LinkedHashMap;
import java.util.Map;

public class DinerStreamAware implements JSONStreamAware {

    /**
     * JSONAware: tells the library that her is a custom object that can be serialized to JSON form and then
     *  JSON library knows how to work with this object and convert it to its JSON representation.
     */

    private String name;
    private int age;
    private String gender;
    private float amountSpent;

    public DinerStreamAware(String name, int age, String gender, float amountSpent) {
        this.name = name;
        this.age= age;
        this.gender = gender;
        this.amountSpent = amountSpent;
    }

    @Override
    public void writeJSONString(Writer writer) throws IOException {
        Map<String, Serializable> map = new LinkedHashMap<String, Serializable>();

        map.put("name", name);
        map.put("age", age);
        map.put("gender", gender);
        map.put("amountSpent", amountSpent);

        JSONValue.writeJSONString(map, writer);
    }
}
