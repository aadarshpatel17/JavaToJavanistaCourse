package $5collectionList.$4listoperation;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     * Working with List Operations
     *  -
     *
     * Explore methods in ArrayList which is part of List.
     */

    public static void main(String[] args) {

        List<String> cityList = new ArrayList<>();

        System.out.println("********** Adding elements");
        cityList.add("Bengaluru");
        cityList.add("New York");
        cityList.add("Mumbai");

        System.out.println("cityList contents: " + cityList);
        System.out.println("cityList size: " + cityList.size());
        System.out.println();

        System.out.println("********** Adding elements at specified index");
        cityList.add(0, "Seattle");

        System.out.println("cityList contents: " + cityList);
        System.out.println("cityList size: " + cityList.size());

        cityList.add(2, "Palo Alto");
        System.out.println("cityList contents: " + cityList);
        System.out.println("cityList size: " + cityList.size());
        System.out.println();

        System.out.println("********** Accessing elements at specified index");

        System.out.println("Element at index 0: " + cityList.get(0));
        System.out.println("Element at index 2: " + cityList.get(2));
        System.out.println("Element at index 4: " + cityList.get(4));
        System.out.println();

        System.out.println("********** Removing elements from specified index");
        System.out.println("cityList original contents: " + cityList);
        cityList.remove(0);
        System.out.println("cityList contents: " + cityList);
        System.out.println("cityList size: " + cityList.size());
        System.out.println();

        System.out.println("********** Removing elements from specified index");
        cityList.add("Palo Alto");
        cityList.add("Bengaluru");
        cityList.add("Mumbai");
        cityList.add("Seattle");

        System.out.println("cityList contents: " + cityList);
        System.out.println();

        System.out.println("********** Find the index position of the element");
        System.out.println("cityList original content: " + cityList);

        /* NOTE: That this finds the first position of the element from the beginning of the list */
        System.out.println("Mumbai is at index: " + cityList.indexOf("Mumbai"));
        System.out.println("Palo Alto is at index: " + cityList.indexOf("Palo Alto"));
        System.out.println("Paris is at index: " + cityList.indexOf("Paris"));
        System.out.println();

        System.out.println("********** Find the last index position of the element");
        System.out.println("cityList original content: " + cityList);

        /* NOTE: That this finds the last position of the element from the beginning of the list */
        System.out.println("Mumbai is at index: " + cityList.lastIndexOf("Mumbai"));
        System.out.println("Palo Alto is at index: " + cityList.lastIndexOf("Bengaluru"));
        System.out.println("Paris is at index: " + cityList.lastIndexOf("Palo Alto"));
        System.out.println();

    }

}
