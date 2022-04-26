package com.learning.jsonparsing3.$9cdltoparse;

import org.json.*;

public class Main {

    public static void main(String[] args) throws JSONException {

        /**
         * Using the CDL Class to Parse Comma-delimited Values
         *  - CDL (Comma Delimited List): Convert comma-delimited values to a JSON array and vice-verse
         */

        /* putting a key with multiple values */
        JSONObject studentsJson = new JSONObject();
        JSONArray namesArray = CDL.rowToJSONArray(new JSONTokener("Peter, Jane, Bob, Nora, Hannah"));
        studentsJson.put("name", namesArray);
        System.out.println(studentsJson.toString(2));

        /* putting multiple keys with values */
        JSONArray fieldsArray = CDL.rowToJSONArray(new JSONTokener("ID, LoanStatus, LoanAmount, Term, CreditScore, AnnualIncome, Home, CreditBalance"));

        JSONObject loanJson1 = CDL.rowToJSONObject(fieldsArray, new JSONTokener("c89ed2cc, Fully Paid, 313354, Short Term, 716.0, 1353940.0, Home Mortgage, 195985"));
        JSONObject loanJson2 = CDL.rowToJSONObject(fieldsArray, new JSONTokener("cd3ed4dd, Fully Paid, 124589, Short Term, 987.0, 7895421.0, Home, 783265"));
        JSONObject loanJson3 = CDL.rowToJSONObject(fieldsArray, new JSONTokener("md3ed4ew, Charge Off, 875412, Long Term, 458.0, 7854125.0, Rent, 879542"));

        JSONObject json = new JSONObject();
        json.append("loans", loanJson1);
        json.append("loans", loanJson2);
        json.append("loans", loanJson3);

        System.out.println(json.toString(2));

    }

}
