package $11funcInterfacesUsingLambdas.$1introducinglambdaexpressions;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

    /**
     * Introducing Lambda Expressions
     *  -   Lambda Expression: A short block of code which takes in input arguments and perform an action
     *      and returns a value
     *          Basically a short method, which take inputs, perform action and return something but the
     *          way it expressed and the way it is used it different from method
     */

    public static List<Home> populateAndGetHomesList() {
        Home home1 = new Home("townhouse", "Seattle", 2345, 500000);
        Home home2 = new Home("villa", "Mountain View", 1500, 1500000);
        Home home3 = new Home("brownstone", "New York", 1200, 500000);
        Home home4 = new Home("condo", "Boston", 4000, 10000000);
        Home home5 = new Home("villa", "Bangalore", 5400, 300000);
        Home home6 = new Home("mansion", "Palo Alto", 7500, 10000000);

        List<Home> homesList = new ArrayList<>();

        homesList.add(home1);
        homesList.add(home2);
        homesList.add(home3);
        homesList.add(home4);
        homesList.add(home5);
        homesList.add(home6);

        return homesList;
    }


    private static List<Home> filter(List<Home> homesList, HomeFilter... homeFilters) {
        List<Home> filteredList = new ArrayList<>();

        for(Home home: homesList) {

            boolean allCriteriaApplicable = true;

            for(HomeFilter homeFilter: homeFilters) {
                if(!homeFilter.test(home)) {
                    allCriteriaApplicable = false;
                    break;
                }
            }

            if(allCriteriaApplicable) {
                filteredList.add(home);
            }

        }

        return filteredList;
    }


    public static void main(String[] args) {
        List<Home> homesList = populateAndGetHomesList();
        System.out.println("*** Original list: \n" + homesList);

        List<Home> filteredList = filter(homesList,
                home -> (home.getAreaSqFt() > 2000 && home.getAreaSqFt() < 5500),
                home -> home.getPrice() < 1000000);

        System.out.println("*** Filtered list: \n" + filteredList);
    }

}
