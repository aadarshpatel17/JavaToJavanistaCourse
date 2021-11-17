package $6collectionSetsAndMaps.$3setimplementation;

import java.util.*;

public class Main {

    /**
     * Ordering Elements in Set Implementations
     *  -
     */

    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();

        System.out.println("hashSet instanceof HashSet: " + (hashSet instanceof HashSet));
        System.out.println("hashSet instanceof Set: " + (hashSet instanceof Set));
        System.out.println("hashSet instanceof Collection: " + (hashSet instanceof Collection));
        System.out.println("hashSet instanceof Iterable: " + (hashSet instanceof Iterable));
        System.out.println();

        Set<String> linkedHashSet = new LinkedHashSet<>();

        System.out.println("linkedHashSet instanceof LinkedHashSet: " + (linkedHashSet instanceof LinkedHashSet));
        System.out.println("linkedHashSet instanceof Set: " + (linkedHashSet instanceof Set));
        System.out.println("linkedHashSet instanceof Collection: " + (linkedHashSet instanceof Collection));
        System.out.println("linkedHashSet instanceof Iterable: " + (linkedHashSet instanceof Iterable));
        System.out.println();

        Set<String> treeSet = new TreeSet<>();

        System.out.println("treeSet instanceof TreeSet: " + (treeSet instanceof TreeSet));
        System.out.println("treeSet instanceof SortedSet: " + (treeSet instanceof SortedSet));
        System.out.println("treeSet instanceof Set: " + (treeSet instanceof Set));
        System.out.println("treeSet instanceof Collection: " + (treeSet instanceof Collection));
        System.out.println("treeSet instanceof Iterable: " + (treeSet instanceof Iterable));
        System.out.println();

    }

}
