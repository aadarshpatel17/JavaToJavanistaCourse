package $5collectionList.$2comparinglist;

import java.util.ArrayList;

public class Main {

    /**
     * Comparing Parameterized and Non-Parameterized Lists
     *  -
     */

    public static void main(String[] args) {

        ArrayList<Car> carList = new ArrayList<>();

        carList.add(new Car("Honda", "Civic", 21000.0));
        carList.add(new Car("Toyota", "Camry", 29000.0));
        carList.add(new Car("BWM", "5 Series", 65000.0));

        System.out.println("Car List: " + carList);

        System.out.println();

        ArrayList nonGenericCarList = new ArrayList<>();

        nonGenericCarList.add(new Car("Honda", "Civic", 21000.0));
        nonGenericCarList.add(new Car("Toyota", "Camry", 29000.0));
        nonGenericCarList.add(new Car("BWM", "5 Series", 65000.0));

        System.out.println("Non-generic car List: " + nonGenericCarList);
        System.out.println();

        System.out.println("******** No casting required to access list elements");

        for(Car car: carList) {
            System.out.format("%s, %s, %.1f", car.getMake(), car.getModel(), car.getPrice());
            System.out.println();
        }
        System.out.println();

        System.out.println("**** List elements have to be cast to the right type");
        for(Object object: nonGenericCarList) {
            Car car = (Car) object;
            System.out.format("%s, %s, %.1f", car.getMake(), car.getModel(), car.getPrice());
            System.out.println();
        }
        System.out.println();

        Car car = carList.get(2);
        System.out.println(car);

        System.out.println();

        car = (Car) nonGenericCarList.get(1);
        System.out.println(car);

    }

}
