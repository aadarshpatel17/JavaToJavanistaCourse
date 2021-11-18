package $6collectionSetsAndMaps.$7collectionviewmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    /**
     * Working with Collection View on a Map
     *  -
     */

    public static void main(String[] args) {

        Map<Integer, String> moviesMap = new HashMap<>();

        moviesMap.put(1202, "Titanic");
        moviesMap.put(1203, "Jaws");
        moviesMap.put(1501, "Back to the Future");
        moviesMap.put(1884, "The Godfather");
        moviesMap.put(2932, "Casablanca");
        moviesMap.put(6929, "Titanic");

        /* NOTE: Java Map implementations return the same collection object each
        *  time when we access the collection view of a map */
        Set<Map.Entry<Integer, String>> entrySet = moviesMap.entrySet();

        for(Map.Entry<Integer, String> entry: entrySet) {
            System.out.printf("Key: %d, Value: %s\n", entry.getKey(), entry.getValue());
        }

        System.out.println("\n********* Updating values");

        for(Map.Entry<Integer, String> entry: entrySet) {
            if(entry.getKey() == 188) {
                entry.setValue("The Godfather II");
            }
        }

        System.out.println("\nSet view of the entries (updated): " + entrySet);

        Set<Integer> keySet = moviesMap.keySet();

        System.out.println("\nSet view of keys (will not have duplicates): " + keySet);

        for(Integer key: keySet) {
            System.out.println(key + " - " + moviesMap.get(key));
        }

        Collection<String> values = moviesMap.values();
        System.out.println("\nCollection view of values (may contain duplicates): " + values);

        /* NOTE: We can store any number of null as value but only one key as null is allowed */
        moviesMap.put(2356, null);
        moviesMap.put(8787, null);
        moviesMap.put(null, "no value");

        entrySet = moviesMap.entrySet();
        for(Map.Entry<Integer, String> entry: entrySet) {
            System.out.printf("Key: %d, Value: %s\n", entry.getKey(), entry.getValue());
        }


    }

}
