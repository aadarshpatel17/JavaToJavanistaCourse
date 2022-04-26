package com.learning.jsonparsing2.encoding;

import org.json.simple.JSONValue;

import java.io.IOException;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Main1 {

    /**
     * String Encoding and Stream Encoding
     *  -
     */

    public static void main(String[] args) throws IOException {

        /**
         * SortedMap: A map implemented with entries in a predictable, user-specified, order of keys
         */

        System.out.println("*** Creating JSONObject");

        Map<String, Object> movie = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2) * -1;
            }
        });

        movie.put("name", "Back to the Future");
        movie.put("releaseYear", "1985");
        movie.put("boxOffice", 388.8);
        movie.put("director", "Robert Zemeckis");

        System.out.println(JSONValue.toJSONString(movie));

        System.out.println("*** Predictable ordering string encoding of JSON object");

    }

}
