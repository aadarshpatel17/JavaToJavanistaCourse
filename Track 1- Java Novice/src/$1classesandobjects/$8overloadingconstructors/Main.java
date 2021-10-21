package $1classesandobjects.$8overloadingconstructors;

public class Main {
    public static void main(String[] args) {
//        then initializing values using constructor
        Car c1 = new Car();
        System.out.println(c1);
        c1.printCarInfo();

        System.out.println();

        Car c2 = new Car("Honda Accord");
        System.out.println(c2);
        c2.printCarInfo();

        System.out.println();

        Car c5 = new Car("Honda Accord", "Sedan");
        System.out.println(c5);
        c5.printCarInfo();

        System.out.println();
        Car c3 = new Car("Honda Accord", "Sedan", 22.5f);
        System.out.println(c3);
        c3.printCarInfo();

        System.out.println();
        Car c4 = new Car("Honda Accord", "Sedan", 22.5f, 28000);
        System.out.println(c4);
        c4.printCarInfo();

        System.out.println();
    }
}
