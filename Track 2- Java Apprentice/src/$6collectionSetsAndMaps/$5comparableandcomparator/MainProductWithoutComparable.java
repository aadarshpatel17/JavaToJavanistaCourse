package $6collectionSetsAndMaps.$5comparableandcomparator;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class MainProductWithoutComparable {

    /**
     * Using Comparable and Comparators in Tree Sets
     *  -
     */

    public static void main(String[] args) {

        Comparator<ProductWithoutComparable> productWithoutComparableComparator = new Comparator<ProductWithoutComparable>() {
            @Override
            public int compare(ProductWithoutComparable o1, ProductWithoutComparable o2) {
                int compareName = o1.getName().compareTo(o2.getName());
                if(compareName != 0)
                    return compareName;
                return o1.getCategory().compareTo(o2.getCategory());
            }
        };

        SortedSet<ProductWithoutComparable> productSet = new TreeSet<>(productWithoutComparableComparator);

        ProductWithoutComparable phone = new ProductWithoutComparable("iPhone", "Electronics");
        ProductWithoutComparable tv = new ProductWithoutComparable("Samsung", "Electronics");
        ProductWithoutComparable shoes = new ProductWithoutComparable("Nike", "Footwear");
        ProductWithoutComparable printer = new ProductWithoutComparable("Epson", "Computer Accessories");

        productSet.add(phone);
        productSet.add(tv);
        productSet.add(shoes);
        productSet.add(printer);

        for(ProductWithoutComparable product: productSet) {
            System.out.println(product);
        }
        System.out.println();

    }

}
