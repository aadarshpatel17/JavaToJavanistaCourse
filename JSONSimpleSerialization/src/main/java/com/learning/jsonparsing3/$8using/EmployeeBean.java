package com.learning.jsonparsing3.$8using;

import java.math.BigInteger;

public class EmployeeBean {

    private BigInteger id;
    private String name;
    private String title;
    private int age;
    private double salary;

    public EmployeeBean() {}

    public EmployeeBean(BigInteger id, String name, String title, int age, double salary) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.age = age;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public BigInteger getId() {
        return id;
    }
}
