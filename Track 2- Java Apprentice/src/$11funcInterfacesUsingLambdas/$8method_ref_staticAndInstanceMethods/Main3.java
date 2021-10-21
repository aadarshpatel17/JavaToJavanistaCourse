package $11funcInterfacesUsingLambdas.$8method_ref_staticAndInstanceMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main3 {

    /**
     * Method References: Static and Instance Methods
     *  -
     *
     * Changes: Implementing method reference for local class
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

        class ComparisonUtility {
            public int compareByPrice(Home h1, Home h2) {
                return Integer.valueOf(h1.getPrice()).compareTo(h2.getPrice());
            }

            public int compareByAreaSqFt(Home h1, Home h2) {
                return Integer.valueOf(h1.getAreaSqFt()).compareTo(h2.getAreaSqFt());
            }
        }

        List<Home> homesList = populateAndGetHomesList();

        System.out.println("Originals: \n" + homesList);

//        using method reference for local class
        ComparisonUtility comparisonUtility = new ComparisonUtility();
        Collections.sort(homesList, comparisonUtility::compareByAreaSqFt);

        System.out.println("Sorted: \n" + homesList);

    }

}
