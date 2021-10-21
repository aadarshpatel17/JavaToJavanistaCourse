package $11funcInterfacesUsingLambdas.$4imple_generic_interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

    /**
     * Implementing Generic Interfaces Using Lambdas
     *  -
     */

    public static List<Car> populateAndGetCarsList() {

        Car car1 = new Car("Honda", "Acura", 23000, 24);
        Car car2 = new Car("Honda", "Civic", 25000, 27);
        Car car3 = new Car("Toyota", "Camry", 33000, 22);
        Car car4 = new Car("Tesla", "Model S", 83000, 34);

        List<Car> carsList = new ArrayList<>();

        carsList.add(car1);
        carsList.add(car2);
        carsList.add(car3);
        carsList.add(car4);

        return carsList;
    }


    private static List<Car> filter(List<Car> carsList, Filter<Car> carFilter) {
        List<Car> filteredList = new ArrayList<>();

        for(Car car: carsList) {
            if(carFilter.test(car)) {
                filteredList.add(car);
            }
        }

        return filteredList;
    }

    public static void main(String[] args) {

        List<Car> carsList = populateAndGetCarsList();

        System.out.println("*** Original list: \n" + carsList);

        List<Car> filteredList = filter(carsList,
                car -> (car.getPrice() < 30000 && car.getMileage() > 20));

        System.out.println("*** Filtered list: \n" + filteredList);

    }

}
