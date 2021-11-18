package $6collectionSetsAndMaps.$3setimplementation;

import java.util.*;

public class Main2 {

    /**
     * Ordering Elements in Set Implementations
     *  -
     */

    public static void main(String[] args) {

        String[] carsArray = new String[] {"Volvo", "BMW", "Honda", "Audi", "Mercedes"};

        Set<String> hashSet = new HashSet<>(Arrays.asList(carsArray));
        Set<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList(carsArray));
        Set<String> treeSet = new TreeSet<>(Arrays.asList(carsArray));

        System.out.println("Order of car names in a HashSet (random order)");

        for(String name: hashSet) {
            System.out.println(name);
        }

        System.out.println("\nOrder of car names in a LinkedHashSet (insertion order)");
        for(String name: linkedHashSet) {
            System.out.println(name);
        }

        System.out.println("\nOrder of car names in a TreeSet (natural order/ lexicographical/ alphabetical)");
        for(String name: treeSet) {
            System.out.println(name);
        }

        /* adding null to TreeSet will produce a NullPointerException */
//        treeSet.add(null);

    }

}
