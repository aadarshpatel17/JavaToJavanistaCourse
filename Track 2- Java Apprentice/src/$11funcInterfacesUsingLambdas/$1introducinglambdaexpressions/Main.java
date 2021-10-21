package $11funcInterfacesUsingLambdas.$1introducinglambdaexpressions;

import java.util.ArrayList;
import java.util.List;

public class Main {

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


    private static List<Home> filter(List<Home> homesList, HomeFilter homeFilter) {
        List<Home> filteredList = new ArrayList<>();

        for(Home home: homesList) {
            if(homeFilter.test(home)) {
                filteredList.add(home);
            }
        }

        return filteredList;
    }


    public static void main(String[] args) {
        List<Home> homesList = populateAndGetHomesList();
        System.out.println("*** Original list: \n" + homesList);

        /**
         * Invoked the filter method, passed in the homesList that we've populated and then specified our
         *  selection or filtering criteria using an anonymous class.
         * Here, (Anonymous new HomeFilter() can be replaced with lambda) show suggestion as for our anonymous class
         */

//        without lambda expression
/*        List<Home> filteredList = filter(homesList, new HomeFilter() {
            @Override
            public boolean test(Home home) {
                return (home.getAreaSqFt() > 3000) && (home.getAreaSqFt() < 5500);
            }
        });    */

//        using lambda expression
//        List<Home> filteredList = filter(homesList,
//                home -> (home.getAreaSqFt() > 3000) && (home.getAreaSqFt() < 5500));

//        In order to change the filtering expression, we can simply change the expression
        List<Home> filteredList = filter(homesList,
                home -> (home.getPrice() < 1000000 && home.getType().equals("townhouse")));
        /**
         * Explanation of above Lambda expression:
         *  Start of the lambda is where you specify the input arguments to your block of code.
         *   -  We have just one input argument to the test method, and, that is, the home object.
         *      The home variable specified on the left-hand side of the arrow on line 70 is basically
         *      this input argument. The input to test method from HomeFilter interface.
         *   -  Now the actual body of lambda expression comes after the arrow which is the implementation
         *      of only method in HomeFilter interface, the test method.
         *   -  No name specified because interface has only method
         *   -  Body of lambda is enclosed within a parenthesis contains a statement which will be returned
         */
        System.out.println("*** Filtered list: \n" + filteredList);
    }

}
