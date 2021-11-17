package $6collectionSetsAndMaps.$1setoperations;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Main2 {

    /**
     * Conducting Set Operations
     *  -   Sets: Unordered collection of elements which do not allow duplicates
     */

    public static void main(String[] args) {

        Set<String> carSet = new HashSet<>();

        carSet.add("Volvo");
        carSet.add("BMW");
        carSet.add("Ford");
        carSet.add("Honda");
        carSet.add("Toyota");
        carSet.add("Chevrolet");

        System.out.println("Cars set original contents: " + carSet);
        System.out.println();

        System.out.println("*********** Can remove elements from sets");

        carSet.remove("Volvo");
        System.out.println("Car set contents: " + carSet);

        carSet.remove("Toyota");
        System.out.println("Car set contents: " + carSet);

        System.out.println();

        Set<String> bikeSet = new HashSet<>();

        bikeSet.add("Yamaha");
        bikeSet.add("Suzuki");
        bikeSet.add("Honda");
        bikeSet.add("BMW");

        System.out.println("Bike set original contents: " + bikeSet);
        System.out.println();

        System.out.println("********* Union operation");
        System.out.println("Car set original contents: " + carSet);
        System.out.println("Bike set original contents: " + bikeSet);
        System.out.println();

        carSet.addAll(bikeSet);

        System.out.println("carSet union bikeSet: " + carSet);
        System.out.println();

        System.out.println("******* Intersection operation");
        System.out.println("Car set original contents: " + carSet);
        System.out.println("Bike set original contents: " + bikeSet);

        carSet.retainAll(bikeSet);

        System.out.println("carSet intersection bikeSet: " + carSet);
        System.out.println();

        System.out.println("********** Difference operation");
        System.out.println("Car set original contents: " + carSet);
        System.out.println("Bike set original contents: " + bikeSet);

        carSet.removeAll(bikeSet);

        System.out.println("carSet difference bikeSet: " + carSet);
        System.out.println();


    }

}
