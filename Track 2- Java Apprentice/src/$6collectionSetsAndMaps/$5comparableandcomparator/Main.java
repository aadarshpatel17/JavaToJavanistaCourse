package $6collectionSetsAndMaps.$5comparableandcomparator;

import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    /**
     * Using Comparable and Comparators in Tree Sets
     *  -
     */

    public static void main(String[] args) {

        Product phone = new Product("iPhone", "Electronics");
        Product tv = new Product("Samsung", "Electronics");
        Product shoes = new Product("Nike", "Footwear");
        Product printer = new Product("Epson", "Computer Accessories");

        SortedSet<Product> productSet = new TreeSet<>();

        productSet.add(phone);
        productSet.add(tv);
        productSet.add(shoes);
        productSet.add(printer);

        for(Product product: productSet) {
            System.out.println(printer);
        }
        System.out.println();

    }

}
