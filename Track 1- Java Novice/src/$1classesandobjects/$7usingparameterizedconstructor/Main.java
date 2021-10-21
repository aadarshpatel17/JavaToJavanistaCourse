package $1classesandobjects.$7usingparameterizedconstructor;

public class Main {
    public static void main(String[] args) {
//        then initializing values using constructor
        Car c1 = new Car();
        System.out.println(c1);
        c1.printCarInfo();

        System.out.println();

        Car c2 = new Car("Honda Accord", "Sedan", 22.5f, 28000);
        System.out.println(c2);
        c2.printCarInfo();

        System.out.println();

    }
}
