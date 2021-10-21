package $1classesandobjects.$7usingparameterizedconstructor;

public class Car {
    private String name;
    private String type;
    private float mpg;
    private int price;

//    our own default no-argument constructor
    public Car() {
        name = "Honda Accord";
        type = "Sedan";
        mpg = 22.5f;
        price = 28000;

        System.out.println("Default Constructed Invoked!");
    }

    public Car(String name, String type, float mpg, int price) {
        this.name = name;
        this.type = type;
        this.mpg = mpg;
        this.price = price;

        System.out.println("Parameterized Constructed Invoked!");
    }

    public void printCarInfo() {
        System.out.format("Name: %s, Type: %s, MPG: %.1f, Price: %d\n", name, type, mpg, price);
    }

}
