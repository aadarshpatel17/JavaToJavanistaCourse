package com.learning.jsonparsing3.$7nestedobjectarray;

import java.math.BigInteger;

public class EmployeeBean {

    private BigInteger id;
    private String name;
    private String title;
    private double salary;
    private int age;

    private CommitteeBean committee;

    public CommitteeBean getCommittee() {
        return committee;
    }

    public void setCommittee(CommitteeBean committee) {
        this.committee = committee;
    }

    public EmployeeBean() {

    }

    public EmployeeBean(BigInteger id, String name, String title, double salary, int age) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.salary = salary;
        this.age = age;
    }

    public BigInteger getId() {
        return id;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
