package $6collectionSetsAndMaps.$1setoperations;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Main {

    /**
     * Conducting Set Operations
     *  -   Sets: Unordered collection of elements which do not allow duplicates
     */

    public static void main(String[] args) {

        HashSet<String> carSet = new HashSet<>();

        carSet.add("Volvo");
        carSet.add("BMW");
        carSet.add("Ford");
        carSet.add("Mazda");

        System.out.println("Cars set: " + carSet);
        System.out.println();

        System.out.println("********* Duplicates are not allowed in sets");

        carSet.add("BMW");
        carSet.add("Ford");

        System.out.println("Cars set: " + carSet);
        System.out.println();

        /* Equality Checks: Performed using the .equals() and .hashCode() method on objects */
        System.out.println("******** Null values are allowed");

        carSet.add(null);
        carSet.add(null);
        carSet.add(null);

        System.out.println("Cars set: " + carSet);
        System.out.println();

        HashSet<String> hashSet = new HashSet<>();

        System.out.println("hashSet instanceof HashSet: " + (hashSet instanceof HashSet));
        System.out.println("hashSet instanceof Set: " + (hashSet instanceof Set));
        System.out.println("hashSet instanceof Collection: " + (hashSet instanceof Collection));
        System.out.println("hashSet instanceof Iterable: " + (hashSet instanceof Iterable));

    }

}
