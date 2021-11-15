package com.anothertest;

import com.test.Person;

public class Customer extends Person {

    private String memberStatus;

    public Customer(String name, long id) {
        super(name, id);
        this.memberStatus = "REGULAR";
    }

    public String getMemberStatus() {
        return memberStatus;
    }

    public void setMemberStatus(String memberStatus) {
        this.memberStatus = memberStatus;
    }
}
