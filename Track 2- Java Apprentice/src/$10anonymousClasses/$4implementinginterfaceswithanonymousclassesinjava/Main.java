package $10anonymousClasses.$4implementinginterfaceswithanonymousclassesinjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /**
         * Implementing Interfaces with Anonymous Classes in Java
         *  -   using Collection.sort(arrayList) to sort the array list
         *
         * compareTo() in the Comparable interface:
         *  -   current < other: negative integer, current equal to other: zero, current > other: positive integer
         */

        List<String> namesList = new ArrayList<>();
        namesList.add("John");
        namesList.add("Zoe");
        namesList.add("Alice");
        namesList.add("Lucy");

        System.out.println("*** Before sorting: " + namesList);

        Collections.sort(namesList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        System.out.println("*** After sorting: " + namesList);

/*
        System.out.println("*** Before sorting: " + namesList);
//        sorts in lexicographical order
        Collections.sort(namesList);
        System.out.println("*** After sorting: " + namesList);
*/


        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(234);
        numbersList.add(9876);
        numbersList.add(100);
        numbersList.add(34);
        numbersList.add(-23);

        System.out.println("*** Before sorting: " + numbersList);

        Comparator<Integer> descendingComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2) * -1;
            }
        };

        Collections.sort(numbersList, descendingComparator);

        System.out.println("*** After sorting: " + numbersList);


/*
        System.out.println("*** Before sorting: " + numbersList);
//        sorts in ascending order
        Collections.sort(numbersList);
        System.out.println("*** After sorting: " + numbersList);
*/

/*
        System.out.println("\nA compareTo B: " + "A".compareTo("B"));
        System.out.println("\nA compareTo Z: " + "A".compareTo("Z"));
        System.out.println("\nB compareTo A: " + "B".compareTo("A"));
        System.out.println("\nZ compareTo A: " + "Z".compareTo("A"));
        System.out.println("\nC compareTo C: " + "C".compareTo("C"));
*/


    }

}
