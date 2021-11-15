package com.myorg;

public class Employee extends Person {

    private String role;

    public Employee (String name, long id, String role) {
        super(name, id);
        this.role = role;
    }

}
