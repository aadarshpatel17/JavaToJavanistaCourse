package $10anonymousClasses.$4implementinginterfaceswithanonymousclassesinjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {

        /**
         * Implementing Interfaces with Anonymous Classes in Java
         *  -
         */

        Home home1 = new Home("towndown", "Seattle", 2345);
        Home home2 = new Home("villa", "Mountain View", 1500);
        Home home3 = new Home("brownstone", "New York", 1200);
        Home home4 = new Home("condo", "Boston", 4000);

        List<Home> homesList = new ArrayList<>();

        homesList.add(home1);
        homesList.add(home2);
        homesList.add(home3);
        homesList.add(home4);

        System.out.println("***Before sorting: \n" + homesList);

        Collections.sort(homesList, new Comparator<Home>() {
            @Override
            public int compare(Home o1, Home o2) {
                return o1.getAreaSqFt() - o2.getAreaSqFt();
            }
        });

        System.out.println("***After sorting: \n" + homesList);

    }

}
