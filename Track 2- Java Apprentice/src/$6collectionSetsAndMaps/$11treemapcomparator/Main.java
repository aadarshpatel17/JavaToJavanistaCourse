package $6collectionSetsAndMaps.$11treemapcomparator;

import java.util.Map;
import java.util.TreeMap;

public class Main {

    /**
     * Using TreeMaps and Comparators
     *  -
     */

    public static void main(String[] args) {

        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1277, "Back to the Future");
        treeMap.put(1784, "The Godfather");
        treeMap.put(1202, "Titanic");
        treeMap.put(1503, "Jaws");
        treeMap.put(1501, "Saving Private Ryan");

        System.out.println("\n******* Order of entries in a TreeHash (natural order of keys)");

        for(Map.Entry<Integer, String> entry: treeMap.entrySet()) {
            System.out.printf("Key: %d, Value: %s\n", entry.getKey(), entry.getValue());
        }

        /* NOTE: null key is not allowed */

    }

}
