package $11funcInterfacesUsingLambdas.$8method_ref_staticAndInstanceMethods;

import java.util.*;

public class Main2 {

    /**
     * Method References: Static and Instance Methods
     *  -
     *
     * Changes: Implementing method reference for home class
     */

    public static List<Home> populateAndGetHomesList() {
        Home home1 = new Home("brownstone", "New York", 1200, 1000000);
        Home home2 = new Home("house", "Seattle", 5200, 1500000);
        Home home3 = new Home("townhouse", "Bellevue", 3300, 500000);
        Home home4 = new Home("condo", "Bellevue", 3500, 3000000);

        List<Home> homesList = new ArrayList<>();

        homesList.add(home1);
        homesList.add(home2);
        homesList.add(home3);
        homesList.add(home4);

        return homesList;
    }


    public static void main(String[] args) {

        List<Home> homesList = populateAndGetHomesList();

        System.out.println("Originals: \n" + homesList);

/*
        Collections.sort(homesList, new Comparator<Home>() {
            @Override
            public int compare(Home o1, Home o2) {
                return Home.compareByPrice(o1, o2);
            }
        });
*/

//        using lambda
//        Collections.sort(homesList, (o1, o2) -> Home.compareByPrice(o1,o2));

//        using method reference
        Collections.sort(homesList, Home::compareByPrice);

        System.out.println("Sorted: \n" + homesList);

    }

}
