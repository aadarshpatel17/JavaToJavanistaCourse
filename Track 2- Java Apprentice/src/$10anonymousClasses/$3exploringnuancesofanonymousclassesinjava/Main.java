package $10anonymousClasses.$3exploringnuancesofanonymousclassesinjava;

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
         * Exploring Nuance of Anonymous Classes in Java
         *  -   Anonymous classes can also have variables
         *  -   Anonymous class variables can not access outside the anonymous class
         *  -   Local variables must be final or effectively final.
         *  -   Can also create anonymous class using concrete classes as well
         */

        Car lamborghini = new Car() {

            String make = "Lamborghini";
            String model = "Aventador";
            int price = 200000;
            int mileage = 14;

            @Override
            public String getMake() {
                return make;
            }

            @Override
            public String getModel() {
                return model;
            }

            @Override
            public int getPrice() {
                return price;
            }

            @Override
            public int getMileage() {
                return mileage;
            }

            @Override
            public String toString() {
                return String.format("Make: %s, Model: %s, Price: %d, Mileage: %d", getMake(), getModel(), getPrice(), getMileage());
            }

            public void printDetails() {
                System.out.println(String.format("Make: %s, model: %s, price: %d, mileage: %d\n" + getMake(), getModel(), getPrice(), getMileage()));
            }
        };

        displayCar(lamborghini);

/*
//        NOTE: We can not access variables and methods outside anonymous class (even if we provide 'public' as access modifier)
        lamborghini.printDetails();
        System.out.println("Make: " + lamborghini.make);
        System.out.println("Model: " + lamborghini.model);
        System.out.println("Price: " + lamborghini.price);
*/

//        anonymous class using concrete class
        Condo condo = new Condo("Boston", "Victorian", 678000) {
            @Override
            public String getArchitecturalStyle() {
                return "Gothic";
            }
        };

        Honda honda = new Honda("Acura", 34000, 24) {
            @Override
            public int getPrice() {
                return 30000;
            }
        };

        System.out.println(condo);
        System.out.println(honda);

    }

}
