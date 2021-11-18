package $6collectionSetsAndMaps.$10LRUcache;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    /**
     * Implementing an LRU Cache Using LinkedHashMap
     *  -   Cache: Smaller sized faster store for quick look-ups of commonly used data
     *  -   LRU (Least Recently Used) Cache: Keeps around data that is frequently accessed and
     *      evicts data that is rarely accessed
     *  -
     */

    public static void main(String[] args) {

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put(1784, "The Godfather");
        linkedHashMap.put(1202, "Titanic");
        linkedHashMap.put(1503, "Jaws");
        linkedHashMap.put(1501, "Saving Private Ryan");

        System.out.println("Insertion order since no entry has been accessed yet\n");

        for(Map.Entry<Integer, String> entry: linkedHashMap.entrySet()) {
            System.out.println(entry);
        }

        linkedHashMap.get(1202);

        System.out.println("\nAccess order of entries (accessed Titanic)");
        for(Map.Entry<Integer, String> entry: linkedHashMap.entrySet()) {
            System.out.println(entry);
        }

        linkedHashMap.get(1501);
        System.out.println("\nAccess order of entries (accessed Saving Private Ryan)");
        for(Map.Entry<Integer, String> entry: linkedHashMap.entrySet()) {
            System.out.println(entry);
        }

    }

}
