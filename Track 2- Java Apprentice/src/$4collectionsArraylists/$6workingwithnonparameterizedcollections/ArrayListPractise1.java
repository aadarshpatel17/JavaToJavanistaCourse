package $4collectionsArraylists.$6workingwithnonparameterizedcollections;

import java.util.ArrayList;

public class ArrayListPractise1 {

    public static void main(String[] args) {

        /**
         *  -   The methods used below (add, remove, contains and all) are part of List
         *      interface. So, we can also access it through List interface
         *      type reference
         *  -   and also Collection interface but not Iterable
         */
        ArrayList arrayList = new ArrayList();
//        List arrayList = new ArrayList();
//        Collection arrayList = new ArrayList();


        System.out.println("ArrayList initial contents: " + arrayList);
        System.out.println("ArrayList isEmpty(): " + arrayList.isEmpty());

        System.out.println();

        System.out.println("******** Adding elements ********");
        arrayList.add("EUR");
        arrayList.add("USD");
        arrayList.add("GBP");
        arrayList.add("JPY");
        arrayList.add("INR");

        System.out.println("ArrayList initial contents: " + arrayList);
        System.out.println("ArrayList size: " + arrayList.size());
        System.out.println("ArrayList isEmpty(): " + arrayList.isEmpty());

        System.out.println();

        System.out.println("******** Removing elements ********");
        arrayList.remove("EUR");    // by Object (uses .equals())
        arrayList.remove(1);    // by index

        System.out.println("ArrayList initial contents: " + arrayList);
        System.out.println("ArrayList size: " + arrayList.size());
        System.out.println("ArrayList isEmpty(): " + arrayList.isEmpty());

        System.out.println();

        System.out.println("******** Checking for elements ********");

        System.out.println("ArrayList cotains USD: " + arrayList.contains("USD"));
        System.out.println("ArrayList cotains EUR: " + arrayList.contains("EUR"));
        System.out.println("ArrayList cotains INR: " + arrayList.contains("INR"));

        System.out.println("ArrayList size: " + arrayList.size());

        System.out.println();

    }

}
