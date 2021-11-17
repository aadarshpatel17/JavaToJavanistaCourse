package $6collectionSetsAndMaps.$9orderentriesmap;

import java.util.*;

public class Main {

    /**
     * Ordering Entries in Map Implementations
     *  -
     */

    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<>();

        System.out.println("hashMap instanceof HashMap: " + (hashMap instanceof HashMap));
        System.out.println("hashMap instanceof Map: " + (hashMap instanceof Map));

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        System.out.println("\nlinkedHashMap instanceof LinkedHashMap: " + (linkedHashMap instanceof LinkedHashMap));
        System.out.println("\nlinkedHashMap instanceof HashMap: " + (linkedHashMap instanceof HashMap));
        System.out.println("\nlinkedHashMap instanceof Map: " + (linkedHashMap instanceof Map));

        Map<Integer, String> treeMap = new TreeMap<>();

        System.out.println("\ntreeMap instanceof TreeMap: " + (treeMap instanceof TreeMap));
        System.out.println("treeMap instanceof SortedMap: " + (treeMap instanceof SortedMap));
        System.out.println("treeMap instanceof Map: " + (treeMap instanceof Map));

    }

}
