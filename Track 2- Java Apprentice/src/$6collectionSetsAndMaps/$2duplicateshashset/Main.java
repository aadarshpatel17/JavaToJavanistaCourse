package $6collectionSetsAndMaps.$2duplicateshashset;

import java.util.HashSet;
import java.util.Set;

public class Main {

    /**
     * Identifying Duplicates in a HashSet
     *  -
     */

    public static void main(String[] args) {

        Product phone = new Product("iPhone", "Electronics");
        Product tv = new Product("Samsung", "Electronics");
        Product shoes = new Product("Nike", "Footwear");
        Product printer = new Product("Epson", "Computer Accessories");

        Set<Product> productSet = new HashSet<>();

        productSet.add(phone);
        productSet.add(tv);
        productSet.add(shoes);
        productSet.add(printer);

        System.out.println(productSet);
        System.out.println();

        System.out.println("****** add another iPhone with the same parameters");

        Product anotherPhone = new Product("iPhone", "Electronics");

        productSet.add(anotherPhone);

        System.out.println(productSet);
        System.out.println();

        System.out.println("phone.equals(anotherPhone): " + phone.equals(anotherPhone));
        System.out.println("phone.hashCode(): " + phone.hashCode());
        System.out.println("anotherPhone.hashCode(): " + anotherPhone.hashCode());
        System.out.println();

    }

}
