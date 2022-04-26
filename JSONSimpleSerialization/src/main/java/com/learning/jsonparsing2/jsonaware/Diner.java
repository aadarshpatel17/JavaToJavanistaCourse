package com.learning.jsonparsing2.jsonaware;

import org.json.simple.JSONAware;

public class Diner implements JSONAware {

    /**
     * JSONAware: tells the library that her is a custom object that can be serialized to JSON form and then
     *  JSON library knows how to work with this object and convert it to its JSON representation.
     */

    private String name;
    private int age;
    private String gender;
    private float amountSpent;

    public Diner(String name, int age, String gender, float amountSpent) {
        this.name = name;
        this.age= age;
        this.gender = gender;
        this.amountSpent = amountSpent;
    }

    @Override
    public String toJSONString() {
        return String.format("{\"name\": \"%s\", \"age\": %d, \"gender\": \"%s\", \"amountSpent\": %f}",
                name, age, gender, amountSpent);
    }

}
