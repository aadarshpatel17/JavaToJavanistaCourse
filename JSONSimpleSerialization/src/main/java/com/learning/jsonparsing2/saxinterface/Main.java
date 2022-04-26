package com.learning.jsonparsing2.saxinterface;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class Main {

    /**
     * Parsing JSON USing the SAX Interface
     *  -   SAX Interface (Simple API for XML): Callback-based interface to parsing documents, entire document is
     *      NOT loaded in memory
     */

    public static void main(String[] args) {

        System.out.println("*** Reading very large JSON file");

        JSONParser jsonParser = new JSONParser();

        try(FileReader reader = new FileReader("src/files/employees.json")) {
            /* for small size file where the entire JSON structure can be loaded into memory */
            Object obj = jsonParser.parse(reader);

            /* for very large file  */
            ParsingHandler parsingHandler = new ParsingHandler();
            JSONArray jsonObject = (JSONArray) obj;
            System.out.println(jsonObject);

            /* jsonParser.parse(): parse(java.io.Reader in, ContentHandler contentHandler, boolean isResume) */
            jsonParser.parse(obj.toString(), parsingHandler,true);
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        System.out.println("**** Completed reading JSON");

    }

}
