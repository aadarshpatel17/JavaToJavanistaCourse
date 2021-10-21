package $11funcInterfacesUsingLambdas.$9method_ref_typeMethodsandConstructors;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

    /**
     * Method References: Type Methods and Constructors
     *  -   We'll see how we use method references to access an instance method of an object of any
     *      arbitrary type.
     *
     *
     * Changes here: It's implementing the compareTypes method of Home class.
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

        System.out.println("Original: \n" + homesList);

        homesList.sort(Home::compareTypes);

        System.out.println("Sorted: \n" + homesList);

    }

}
