package $10anonymousClasses.$1usinganonymousclassesinjava;

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
         * Using Anonymous Classes in Java
         *  -   ANONYMOUS CLASSES: Nested, Inner classes, defined without specifying a name for the class.
         *  -
         */

//        creating anonymous class for Car interface
        Car camry = new Car() {
            @Override
            public String getMake() {
                return "Toyota";
            }

            @Override
            public String getModel() {
                return "Camry";
            }

            @Override
            public int getPrice() {
                return 30000;
            }

            @Override
            public int getMileage() {
                return 24;
            }
        };

        System.out.println("Make: " + camry.getMake());
        System.out.println("Model: " + camry.getModel());
        System.out.println("Price: " + camry.getPrice());
        System.out.println("Mileage: " + camry.getMileage());
        System.out.println();

        displayCar(camry);

//        creating anonymous class for Home Interface
        Home townHome = new Home() {
            @Override
            public String getCity() {
                return "Palo Alto";
            }

            @Override
            public String getArchitecturalStyle() {
                return "Tudor";
            }

            @Override
            public int getNumberOfFloors() {
                return 2;
            }

            @Override
            public int getPrice() {
                return 765000;
            }
        };

        System.out.println();
        System.out.println("City:" + townHome.getCity());
        System.out.println("Architectural Style: " + townHome.getArchitecturalStyle());
        System.out.println("Number of floors: " + townHome.getNumberOfFloors());
        System.out.println("Price: " + townHome.getPrice());
        System.out.println();

        displayHome(townHome);

/*
        Honda civic = new Honda("Civic", 28000, 25);
        Honda city = new Honda("City", 21000, 26);
        Honda jazz = new Honda("Jazz", 19000, 28);

        displayCar(civic);
        displayCar(city);
        displayCar(jazz);

        Condo nyCondo = new Condo("New York", "modern", 100000);
        Condo mumbaiCondo = new Condo("Mumbai", "modern", 50000);
        Condo bostonCondo = new Condo("Boston", "gothic", 150000);

        displayHome(nyCondo);
        displayHome(mumbaiCondo);
        displayHome(bostonCondo);
*/

    }

}
