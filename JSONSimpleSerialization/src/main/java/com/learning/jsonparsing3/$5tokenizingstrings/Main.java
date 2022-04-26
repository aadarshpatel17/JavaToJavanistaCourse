package com.learning.jsonparsing3.$5tokenizingstrings;

import org.json.JSONException;
import org.json.JSONTokener;

public class Main {

    public static void main(String[] args) throws JSONException {

        /**
         * Tokenizing Strings
         *  -   JSONTokener: Takes in a string and extracts characters and tokens from the string
         *
         * Here, how JSONTokener works...
         */

        /* Initializing JSONTokener with a string value in it
        *   By default, the tokener will extract single characters from your input string */
        JSONTokener token = new JSONTokener("I solemnly swear that I am up to no good");

        while(token.more()) {
            /* for multiple character at a time then pass n (no of character to next method) */
            System.out.println(token.next(5));
        }

/*
        while(!token.end()) {
        // prints string skipping spaces

            System.out.println(token.nextClean());
        }
*/

    }

}
