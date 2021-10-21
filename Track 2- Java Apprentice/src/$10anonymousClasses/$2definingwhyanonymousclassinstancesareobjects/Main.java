package $10anonymousClasses.$2definingwhyanonymousclassinstancesareobjects;

public class Main {

    private static void displayCar(Car car) {
        System.out.println(" *** Displaying Car: ");
        System.out.println(car);
    }

    private static void displayHome(Home home) {
        System.out.println(" *** Displaying Car: ");
        System.out.println(home);
    }

    public static void main(String[] args) {

        /**
         * Defining Why Anonymous Class Instances are Objects
         *  -
         */

        Car lamborghini = new Car() {
            @Override
            public String getMake() {
                return "Lamborghini";
            }

            @Override
            public String getModel() {
                return "Aventador";
            }

            @Override
            public int getPrice() {
                return 200000;
            }

            @Override
            public int getMileage() {
                return 14;
            }

//            we can also override the toString() which proofs that lamborghini is an Object
            @Override
            public String toString() {
                return String.format("Make: %s, Model: %s, Price: %d, Mileage: %d", getMake(), getModel(), getPrice(), getMileage());
            }
        };

        Home mansion = new Home() {
            @Override
            public String getCity() {
                return "Palo Alto";
            }

            @Override
            public String getArchitecturalStyle() {
                return "Victorian";
            }

            @Override
            public int getNumberOfFloors() {
                return 2;
            }

            @Override
            public int getPrice() {
                return 5755000;
            }

//            we can also override the toString() which proofs that mansion is an Object
            @Override
            public String toString() {
                return String.format("City: %s, Architectural Style: %s, Price: %d, Number of floors: %d", getCity(), getArchitecturalStyle(), getPrice(), getNumberOfFloors()  );
            }
        };

//        name for the lamborghini and mansion classes
        System.out.println(lamborghini.getClass());     // Main$1
        System.out.println(mansion.getClass());         // Main$2

//        checking is it an anonymous class?
        System.out.println();
        System.out.println("Is lamborghini anonymous: " + lamborghini.getClass().isAnonymousClass());
        System.out.println("Is mansion anonymous: " + mansion.getClass().isAnonymousClass());

//        checking whether is it interface or not?
        System.out.println();
        System.out.println("Is lamborghini an interface: " + lamborghini.getClass().isInterface());     // false
        System.out.println("Is mansion an interface: " + mansion.getClass().isInterface());             // false
//        because they are objects

//        checking whether is it instanceof Object class or not?
        System.out.println();
        System.out.println("lamborghini instanceof Object: " + lamborghini instanceof Object);  // true
        System.out.println("mansion instanceof Object: " + mansion instanceof Object);  // true

        System.out.println();
        displayCar(lamborghini);
        displayHome(mansion);

    }

}
