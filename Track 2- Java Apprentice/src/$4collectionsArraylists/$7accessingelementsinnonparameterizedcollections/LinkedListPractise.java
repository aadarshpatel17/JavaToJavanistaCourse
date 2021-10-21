package $4collectionsArraylists.$7accessingelementsinnonparameterizedcollections;

import java.util.LinkedList;

public class LinkedListPractise {
    /**
     *  LinkedList -
     *   -  Implements the list using doubly linked-list
     */

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        System.out.println("LinkedList initial contents: " + linkedList);
        System.out.println("LinkedList isEmpty(): " + linkedList.isEmpty());

        System.out.println();

        System.out.println("******** Adding elements ********");
        linkedList.add("EUR");
        linkedList.add("USD");
        linkedList.add("GBP");
        linkedList.add("JPY");
        linkedList.add("INR");

        System.out.println("ArrayList initial contents: " + linkedList);
        System.out.println("ArrayList size: " + linkedList.size());
        System.out.println("ArrayList isEmpty(): " + linkedList.isEmpty());

        System.out.println();

        System.out.println("******** Removing elements ********");
        linkedList.remove("EUR");    // by Object (uses .equals())
        linkedList.remove("USD");

        System.out.println("ArrayList initial contents: " + linkedList);
        System.out.println("ArrayList size: " + linkedList.size());
        System.out.println("ArrayList isEmpty(): " + linkedList.isEmpty());

        System.out.println();

        System.out.println("******** Checking for elements ********");

        System.out.println("ArrayList cotains USD: " + linkedList.contains("USD"));
        System.out.println("ArrayList cotains EUR: " + linkedList.contains("EUR"));
        System.out.println("ArrayList cotains INR: " + linkedList.contains("INR"));

        System.out.println("ArrayList size: " + linkedList.size());

        System.out.println();

    }

}
