package $5collectionList.$5iteratoroperation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    /**
     * Working with Iterator Operations
     *  -
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

        System.out.println("******** The iterable interface allows iterating over lists");

        Iterable<String> cityListIterable = cityList;

        for(String city: cityListIterable) {
            System.out.println(city);
        }
        System.out.println();

        System.out.println("******* Under the hood of the for-each loop");

        Iterator<String> iterator = cityListIterable.iterator();

        System.out.println("Iterator hasNext(): " + iterator.hasNext());
        System.out.println("Iterator next(): " + iterator.next());

        System.out.println("Iterator hasNext(): " + iterator.hasNext());
        System.out.println("Iterator next(): " + iterator.next());

        System.out.println("Iterator hasNext(): " + iterator.hasNext());
        System.out.println("Iterator next(): " + iterator.next());

        System.out.println("Iterator hasNext(): " + iterator.hasNext());
        System.out.println("Iterator next(): " + iterator.next());

        System.out.println("Iterator hasNext(): " + iterator.hasNext());

    }

}
