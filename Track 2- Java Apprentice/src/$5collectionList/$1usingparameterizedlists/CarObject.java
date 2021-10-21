package $5collectionList.$1usingparameterizedlists;

import java.util.ArrayList;

public class CarObject {

    public static void main(String[] args) {

        ArrayList<Car> carList = new ArrayList<>();

        carList.add(new Car("Honda", "Civic", 21000.0));
        carList.add(new Car("Toyota", "Camry", 29000.0));
        carList.add(new Car("BWM", "5 Series", 65000.0));

        System.out.println("Car List: " + carList);

    }

}