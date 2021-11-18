package $6collectionSetsAndMaps.$13sortedmap;

import java.util.SortedMap;
import java.util.TreeMap;

public class Main {

    /**
     * Performing Sorted Map Operations
     *  -
     */

    public static void main(String[] args) {

        SortedMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(1202, "Sam");
        treeMap.put(1503, "Tom");
        treeMap.put(1501, "Ronald");
        treeMap.put(1784, "Ursula");
        treeMap.put(1277, "Dan");

        System.out.println("EmployeeMap: " + treeMap);

        System.out.println("\nFirst key: " + treeMap.firstKey());
        System.out.println("Last key: " + treeMap.lastKey());

        System.out.println("\nMap with all keys strictly less than 1501: " + treeMap.headMap(1501));
        System.out.println("\nMap with all keys greater than or equal to 1503: " + treeMap.headMap(1503));

        System.out.println("\nMap with all keys greater than or equal to 1277 and less than 1503: " + treeMap.subMap(1277, 1503));

    }

}
