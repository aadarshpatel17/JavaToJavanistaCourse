package com.learning.jsonparsing3.$10csvfiles;

import org.json.CDL;
import org.json.JSONArray;
import org.json.JSONException;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws JSONException, IOException {

        /**
         * Parse CSV files and Converting to JSON format
         *  -
         */

        JSONArray headerArray = new JSONArray();

        headerArray.put("ID");
        headerArray.put("LoanStatus");
        headerArray.put("LoanAmount");
        headerArray.put("Term");
        headerArray.put("CreditScore");
        headerArray.put("AnnualIncome");
        headerArray.put("Home");
        headerArray.put("CreditBalance");

        String commaDelimitedLoans = new String(Files.readAllBytes(Paths.get("src/main/java/com/learning/jsonparsing3/files/laons.csv")));

        JSONArray loanArray = CDL.toJSONArray(headerArray, commaDelimitedLoans);

        System.out.println(loanArray.toString(2));

        try(FileWriter file = new FileWriter("src/main/java/com/learning/jsonparsing3/files/csv_to_json.json")) {
            loanArray.write(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
