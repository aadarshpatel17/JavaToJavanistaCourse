package $11funcInterfacesUsingLambdas.$7predicate_consumer_function_suppier;

import java.util.ArrayList;
import java.util.List;

public class Main3 {

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

    private static <T, R> void filter(List<T> elementList, Predicate<T> filter,Function<T, R> function, Consumer<R> consumer) {
        List<T> filteredList = new ArrayList<>();
        for(T element: elementList) {
            if(filter.test(element)) {
                R transformedElement = function.apply(element);
                consumer.accept(transformedElement);
            }
        }
    }

    public static void main(String[] args) {

        List<Home> homesList = populateAndGetHomesList();
        filter(homesList,
                home -> (home.getAreaSqFt() > 3000 && home.getAreaSqFt() < 5500 && home.getCity().equals("Bellevue")),
                home -> {
                    home.setCity(home.getCity().toUpperCase());
                    home.setType(home.getType().toUpperCase());

                    return home;
                },
                home -> System.out.println(home));

    }



}
