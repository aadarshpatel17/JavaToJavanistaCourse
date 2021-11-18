package $6collectionSetsAndMaps.$5comparableandcomparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class DescedingOrderComparator {

    /**
     * Using Comparable and Comparators in Tree Sets
     *  -
     */

    public static void main(String[] args) {

        Comparator<String> descendingOrderComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        String[] carArray = new String[] {"Volvo", "BMW", "Audi", "Mercedes"};
        SortedSet<String> treeSet = new TreeSet<>(descendingOrderComparator);

        treeSet.addAll(Arrays.asList(carArray));

        for(String name: treeSet) {
            System.out.println(name);
        }

    }

}
