package $5collectionList.$3collectionoperation;

import java.util.ArrayList;
import java.util.List;

public class Main1 {

    public static void main(String[] args) {

        /* All the below methods will also be available for Collection and List */
        ArrayList<String> cityList = new ArrayList<>();

        System.out.println("******** Adding elements");

        cityList.add("Bengaluru");
        cityList.add("New York");
        cityList.add("Mumbai");

        System.out.println("cityList contents: " + cityList);
        System.out.println("cityList size: " + cityList.size());
        System.out.println("cityList isEmpty(): " + cityList.isEmpty());
        System.out.println();

        System.out.println("************** Removing elements");
        cityList.remove("Seattle");
        cityList.remove("Palo Alto");

        System.out.println("cityList contents: " + cityList);
        System.out.println("cityList size: " + cityList.size());
        System.out.println("cityList isEmpty(): " + cityList.isEmpty());
        System.out.println();

        System.out.println("*********** Checking for elements");
        System.out.println("cityList contains New York: " + cityList.contains("New York"));
        System.out.println("cityList contains Paris: " + cityList.contains("Paris"));
        System.out.println("cityList contains Mumbai: " + cityList.contains("Mumbai"));

        System.out.println("cityList size: " + cityList.size());
        System.out.println();

        System.out.println("********** Adding multiple elements");

        List<String> anotherCityList = new ArrayList<>();
        anotherCityList.add("Paris");
        anotherCityList.add("London");

        System.out.println("cityList original contents: " + cityList);
        System.out.println("Adding elements: " + anotherCityList);

        cityList.addAll(anotherCityList);

        System.out.println("cityList contents: " + cityList);
        System.out.println("cityList size: " + cityList.size());
        System.out.println();

        System.out.println("********** Checking for multiple elements");
        System.out.println("cityList contains Paris, London: " + cityList.containsAll(anotherCityList));

        anotherCityList.add("Tokyo");
        System.out.println("cityList contains Paris, London, Tokyo: " + cityList.containsAll(anotherCityList));

        System.out.println("********** Removing multiple elements");
        System.out.println("cityList original contents: " + cityList);
        System.out.println("Removing elements: " + anotherCityList);

        cityList.removeAll(anotherCityList);

        System.out.println("cityList contents: " + cityList);

    }

}
