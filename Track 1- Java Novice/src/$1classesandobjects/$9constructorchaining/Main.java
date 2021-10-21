package $1classesandobjects.$9constructorchaining;

public class Main {
    public static void main(String[] args) {
//        then initializing values using constructor
        Car c1 = new Car();
        System.out.println(c1);
        c1.printCarInfo();

        System.out.println();

        Car c2 = new Car("Honda Accord");
        c2.printCarInfo();

        System.out.println();

        Car c5 = new Car("Honda Accord", "Sedan");
        c5.printCarInfo();

        System.out.println();
        Car c3 = new Car("Honda Accord", "Sedan", 22.5f);
        c3.printCarInfo();

        System.out.println();
        Car c4 = new Car("Honda Accord", "Sedan", 22.5f, 28000);
        c4.printCarInfo();

        System.out.println();
    }
}
