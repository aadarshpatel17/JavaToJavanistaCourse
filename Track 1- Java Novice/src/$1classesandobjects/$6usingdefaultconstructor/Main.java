package $1classesandobjects.$6usingdefaultconstructor;

public class Main {
    public static void main(String[] args) {
//        here java automatically create and call default no-arguement constructor
//        Car c1 = new Car();
//        System.out.println(c1);
//        System.out.println(c1.name);
//        System.out.println(c1.type);
//        System.out.println(c1.mpg);
//        System.out.println(c1.price);

//        after printCarInfo()
//        Car c1 = new Car();
//        System.out.println(c1);
//        c1.printCarInfo();
//
//        Car c2 = new Car();
//        System.out.println(c2);
//        c2.printCarInfo();


//        after setting private fields with default values
//        then initializing values using constructor
        Car c1 = new Car();
        System.out.println(c1);
        c1.printCarInfo();

        Car c2 = new Car();
        System.out.println(c2);
        c2.printCarInfo();

        System.out.println();

    }
}
