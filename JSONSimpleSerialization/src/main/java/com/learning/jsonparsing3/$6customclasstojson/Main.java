package com.learning.jsonparsing3.$6customclasstojson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws JSONException {

        /**
         * Serializing Custom Classes to JSON
         *  -   Beans: Classes that encapsulate many objects into a single object
         *      -   Serializable, zero-argument constructor, getter and setter methods to access properties
         *  -   Reflection on Getters: Any no-argument method which starts with "get" or "is" followed by an
         *      uppercase letter
         */

        EmployeeBean employeeBean1 = new EmployeeBean(BigInteger.valueOf(1234567), "John", "Business Analyst", 56000, 28);

        EmployeeBean employeeBean2 = new EmployeeBean();
        employeeBean2.setId(BigInteger.valueOf(1234589));
        employeeBean2.setName("Julie");
        employeeBean2.setTitle("Vice President");
        employeeBean2.setAge(42);

        EmployeeBean employeeBean3 = new EmployeeBean();
        employeeBean3.setId(BigInteger.valueOf(4561234));
        employeeBean3.setName("Doris");

        List<EmployeeBean> list = new ArrayList<>();
        list.add(employeeBean1);
        list.add(employeeBean2);
        list.add(employeeBean3);

        JSONArray jsonArray = new JSONArray(list);

        try(FileWriter file = new FileWriter("src/main/java/com/learning/jsonparsing3/files/employee_bean.json")) {
            file.write(String.valueOf(jsonArray));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
