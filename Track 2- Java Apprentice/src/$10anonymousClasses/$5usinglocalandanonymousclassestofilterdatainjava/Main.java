package $10anonymousClasses.$5usinglocalandanonymousclassestofilterdatainjava;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     * Using Local and Anonymous Classes to Filter Data in Java
     *  -
     */

    public static List<Home> populateAndGetHomesList() {
        Home home1 = new Home("towndown", "Seattle", 2345, 1000000);
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


    private static List<Home> filterByPriceInRange(List<Home> homesList, int low, int high) {
        List<Home> filteredList = new ArrayList<>();

        for(Home home: homesList) {
            if(home.getPrice() >= low && home.getPrice() < high)
                filteredList.add(home);
        }

        return filteredList;
    }

    private static List<Home> filterByAreaSqFtInRange(List<Home> homesList, int low, int high) {
        List<Home> filteredList = new ArrayList<>();

        for(Home home: homesList) {
            if(home.getAreaSqFt() >= low && home.getAreaSqFt() < high)
                filteredList.add(home);
        }

        return filteredList;
    }

    public static void main(String[] args) {
        List<Home> homesList = populateAndGetHomesList();
        System.out.println("*** Original list: \n" + homesList);
        List<Home> filteredList = filterByAreaSqFtInRange(homesList, 1500, 4000);
        System.out.println("*** Filtered list: \n" + filteredList);
    }
}
