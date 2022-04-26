package com.learning.jsonparsing2.saxinterface;

import org.json.simple.parser.ContentHandler;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class ParsingHandler implements ContentHandler {
    /**
     * @ContentHandler: gives us the SAX like interface to our JSON documents, it contains a number of methods (callback
     *  functions) which we need to implement.
     */

    /* invoked when we start the parsing of our JSON structure */
    @Override
    public void startJSON() throws ParseException, IOException {
        System.out.println("Start");
    }

    /* invoked when the parsing ends of our JSON structure */
    @Override
    public void endJSON() throws ParseException, IOException {
        System.out.println("End");
    }

    /* invokes when we start parsing of objects */
    @Override
    public boolean startObject() throws ParseException, IOException {
        System.out.println("startObject");
        return false;
    }

    /* invokes after completion of object parsing */
    @Override
    public boolean endObject() throws ParseException, IOException {
        System.out.println("endObject");
        return false;
    }

    /* invokes when you access a JSON field within an object */
    @Override
    public boolean startObjectEntry(String s) throws ParseException, IOException {
        System.out.println("startObjectEntry: " + s);
        return false;
    }

    /* invokes when you completed accessing the value for a JSON field */
    @Override
    public boolean endObjectEntry() throws ParseException, IOException {
        System.out.println("endObjectEntry");
        return false;
    }

    /* invokes when start parsing an array */
    @Override
    public boolean startArray() throws ParseException, IOException {
        System.out.println("startArray");
        return false;
    }

    /* invokes after completion of array parsing */
    @Override
    public boolean endArray() throws ParseException, IOException {
        System.out.println("endArray");
        return false;
    }

    /* invokes during the parsing of the JSON each time the primitive value of a JSON field is available to the parser */
    @Override
    public boolean primitive(Object o) throws ParseException, IOException {
        System.out.println("---" + o + "---");
        return false;
    }
}
