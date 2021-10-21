package $11funcInterfacesUsingLambdas.$7predicate_consumer_function_suppier;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     * Predicate, Consumer, Function, and Supplier
     *  -   Predicate<T> : Typically used to filter a collection of objects
     *      -   The Predicate interface is a functional interface that contains a single method that accepts
     *          an input argument of any type specified by the parameter T, and then return a boolean.
     *      -   Essentially, a Predicate performs a test or a conditional check on the object that you
     *          pass in and returns true if the condition was satisfied and false otherwise.
     *
     *
     *  -   Consumer<T> : Used to consume data, acts as a sink for the filtered and processed data.
     *  -   Function<T, R> : Transforms data from type T to R
     *  -   Supplier<T> : Used to generate objects on which you perform operations
     *
     *
     *  NOTE: These all four functions are available at java.util.function package
     */

    public static List<Home> populateAndGetHomesList() {
        Home home1 = new Home("brownstone", "New York", 1200, 1000000);
        Home home2 = new Home("house", "Seattle", 5200, 1500000);
        Home home3 = new Home("townhouse", "Bellevue", 3300, 500000);
        Home home4 = new Home("condo", "Bellevue", 3500, 10000000);
        Home home5 = new Home("villa", "Bangalore", 5400, 300000);
        Home home6 = new Home("mansion", "Seattle", 7500, 10000000);

        List<Home> homesList = new ArrayList<>();

        homesList.add(home1);
        homesList.add(home2);
        homesList.add(home3);
        homesList.add(home4);
        homesList.add(home5);
        homesList.add(home6);

        return homesList;
    }

    private static <T> void filter(List<T> elementList, Predicate<T> filter) {
        List<T> filteredList = new ArrayList<>();
        for(T element: elementList) {
            if(filter.test(element))
                System.out.println(element);
        }
    }

    public static void main(String[] args) {
        List<Home> homesList = populateAndGetHomesList();
        filter(homesList, home -> (home.getAreaSqFt() > 3000 && home.getAreaSqFt() < 5500 && home.getCity().equals("Bellevue")));
    }



}
