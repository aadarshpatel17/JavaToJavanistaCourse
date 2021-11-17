package $6collectionSetsAndMaps.$9orderentriesmap;

import java.util.*;

public class Main1 {

    /**
     * Ordering Entries in Map Implementations
     *  -
     */

    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1784, "The Godfather");
        hashMap.put(1202, "Titanic");
        hashMap.put(1503, "Jaws");
        hashMap.put(1501, "Saving Private Ryan");

        System.out.println("\n********** Order of entries in a HashMap (random)");

        for(Map.Entry<Integer, String> entry: hashMap.entrySet()) {
            System.out.printf("Key: %d, Value: %s\n", entry.getKey(), entry.getValue());
        }

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1784, "The Godfather");
        linkedHashMap.put(1202, "Titanic");
        linkedHashMap.put(1503, "Jaws");
        linkedHashMap.put(1501, "Saving Private Ryan");

        System.out.println("\n******* Order of entries in a LinkedHashMap (insertion order)");

        for(Map.Entry<Integer, String> entry: linkedHashMap.entrySet()) {
            System.out.printf("Key: %d, Value: %s\n", entry.getKey(), entry.getValue());
        }

        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1784, "The Godfather");
        treeMap.put(1202, "Titanic");
        treeMap.put(1503, "Jaws");
        treeMap.put(1501, "Saving Private Ryan");

        System.out.println("\n******* Order of entries in a TreeHash (natural order of keys)");

        for(Map.Entry<Integer, String> entry: treeMap.entrySet()) {
            System.out.printf("Key: %d, Value: %s\n", entry.getKey(), entry.getValue());
        }

    }

}
