package $6collectionSetsAndMaps.$11treemapcomparator;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main1 {

    /**
     * Using TreeMaps and Comparators
     *  -
     */

    public static void main(String[] args) {

        Comparator<Integer> descendingComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2) * -1;
            }
        };

        /* NOTE: null key is not allowed */
        Map<Integer, String> treeMap = new TreeMap<>(descendingComparator);
        treeMap.put(1277, "Back to the Future");
        treeMap.put(1784, "The Godfather");
        treeMap.put(1202, "Titanic");
        treeMap.put(1503, "Jaws");
        treeMap.put(1501, "Saving Private Ryan");

        System.out.println("\n******* Order of entries in a TreeHash (natural order of keys)");

        for(Map.Entry<Integer, String> entry: treeMap.entrySet()) {
            System.out.printf("Key: %d, Value: %s\n", entry.getKey(), entry.getValue());
        }

        /* For rearranging in reverse order */
        Comparator<String> descendingStringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2) * -1;
            }
        };

        /* For rearranging according to string length */
        /* NOTE: Strings that have same length will be overridden by the latest value */
        Comparator<String> stringLengthComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };

        SortedMap<String, String> treeMapString = new TreeMap<>(stringLengthComparator);
        /* here, Pablo Picasso will be a unique key but due to Salvador Dali (which has same length
        *  as Pablo Picasso) it will consider as duplicate key and the value will be updated in Pablo
        *  Picasso key */
        treeMapString.put("Pablo Picasso", "Guernica");
        treeMapString.put("Salvador Dali", "The Persistence of Memory");

        treeMapString.put("Johannes Vermeer", "Girl With Pearl Earring");
        treeMapString.put("Vincent van Gogh", "The Starry Night");

        treeMapString.put("Leonardo de Vinci", "Mona Lisa");

        System.out.println("Entries in the reverse order");
        for(Map.Entry<String, String> entry: treeMapString.entrySet()) {
            System.out.println(entry);
        }

    }

}
