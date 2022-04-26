package com.learning.jsonparsing3.$7nestedobjectarray;

import org.json.JSONArray;
import org.json.JSONException;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws JSONException {

        /**
         * Working with Nested Object Arrays
         *  -
         */

        EmployeeBean employeeBean1 = new EmployeeBean(BigInteger.valueOf(1234567), "John", "Business Analyst", 56000, 28);
        employeeBean1.setCommittee(new CommitteeBean("Promotion", 5));

        EmployeeBean employeeBean2 = new EmployeeBean();
        employeeBean2.setId(BigInteger.valueOf(1234589));
        employeeBean2.setName("Julie");
        employeeBean2.setTitle("Vice President");
        employeeBean2.setAge(42);

        EmployeeBean employeeBean3 = new EmployeeBean();
        employeeBean3.setId(BigInteger.valueOf(4561234));
        employeeBean3.setName("Doris");
        employeeBean3.setCommittee(new CommitteeBean("Food", 10));

        System.out.println(employeeBean1);

        List<EmployeeBean> list = new ArrayList<>();
        list.add(employeeBean1);
        list.add(employeeBean2);
        list.add(employeeBean3);

        JSONArray jsonArray = new JSONArray(list);

        System.out.println(jsonArray.toString(2));

    }

}
