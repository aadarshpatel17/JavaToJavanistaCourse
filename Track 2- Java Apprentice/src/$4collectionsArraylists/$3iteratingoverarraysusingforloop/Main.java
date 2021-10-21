package $4collectionsArraylists.$3iteratingoverarraysusingforloop;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] companies = {"Amazon", "Google", "Microsoft", "Facebook"};

        System.out.println("Array contents: " + Arrays.toString(companies));

        System.out.println();
        System.out.println("****Specifying indexes manually");

        for (int i = 0; i < companies.length; i++) {
            System.out.format("companies[%d]: %s", i, companies[i]);
            System.out.println();
        }

//        best practise when no need of index
        for (String company : companies) {
            System.out.format("company %s", company);
            System.out.println();
        }

    }
}
