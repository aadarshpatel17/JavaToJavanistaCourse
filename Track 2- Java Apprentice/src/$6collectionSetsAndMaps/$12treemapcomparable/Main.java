package $6collectionSetsAndMaps.$12treemapcomparable;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {

    /**
     * Using Tree Maps and Comparable
     *  -
     */

    public static void main(String[] args) {

        Comparator<Book> bookComparator = new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getName().toLowerCase().compareTo(o2.getName().toLowerCase());
            }
        };

        SortedMap<Book, Double> treeMap = new TreeMap<>(bookComparator);
        treeMap.put(new Book("Catcher in the Rye", "J. D. Salinger"), 4.99);
        treeMap.put(new Book("catcher in the rye", "J. D. Salinger"), 4.99);

        treeMap.put(new Book("Pride and Prejudice", "Jane Austen"), 5.99);
        treeMap.put(new Book("To Kill a Mockingbird", "Harper Lee"), 3.99);
        treeMap.put(new Book("The Great Gatsby", "F. Scott Fitzgerald"), 4.49);

        System.out.println("Entries in the order of book name");
        for(Map.Entry<Book, Double> entry: treeMap.entrySet()) {
            System.out.println(entry);
        }

    }

}
