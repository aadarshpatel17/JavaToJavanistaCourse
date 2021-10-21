package $4collectionsArraylists.$2examiningfixedlengthofarrays;

import java.util.Arrays;

public class ZeroLengthArray {
    public static void main(String[] args) {
        /**
         *  ZeroLengthArray -
         *   -  possible to have zero length array
         *   -  enable to extend length or assign elements in the array
         */

        String[] companies = {};
        String[] otherCompanies = new String[0];

//        another way to initialize array
        String[] names = {"Amazon", "Google", "Microsoft", "Facebook"};
        System.out.println("names[0]: " + names[0]);
        System.out.println("names[1]: " + names[1]);
        System.out.println("names[2]: " + names[2]);
        System.out.println("names[3]: " + names[3]);
        System.out.println("Array contents: " + Arrays.toString(names));

        System.out.println("companies.length: " + companies.length);
        System.out.println("otherCompanies.length: " + otherCompanies.length);

    }
}
