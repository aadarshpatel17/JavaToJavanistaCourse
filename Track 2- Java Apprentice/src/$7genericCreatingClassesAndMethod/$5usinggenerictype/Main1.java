package $7genericCreatingClassesAndMethod.$5usinggenerictype;

public class Main1 {

    /**
     * Using Generic Types for Parameters and Return Types
     *  -
     */

    public static void main(String[] args) {

        System.out.println("**** Generic class with custom type");

        Car honda = new Car("Honda", "Civic", 21000);

        Repository<Car> carRepository = new Repository<>(honda);
        System.out.println(carRepository);

        System.out.println("*** Wrong casting leads to runtime errors");
//        Repository<Car> carRepository1 = new Repository<>();
//        Car car = carRepository1.getValue();

    }

}
