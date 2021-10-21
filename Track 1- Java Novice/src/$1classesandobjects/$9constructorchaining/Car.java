package $1classesandobjects.$9constructorchaining;

public class Car {
    private String name;
    private String type;
    private float mpg;
    private int price;

//    our own default no-argument constructor
    public Car() {
        System.out.println("Default Constructed Invoked!");
    }

    public Car(String name) {
        this.name = name;

        System.out.println("Car(String name) Invoked!" + this);
    }
    public Car(String name, String type) {
//        constructor chaining here
//        NOTE: constructor chaining must be the first line in the body of calling
//        constructor else throws an error
        this(name);
        System.out.println("Car(String name, String type) Invoked! " + this);

        this.type = type;
    }
    public Car(String name, String type, float mpg) {
        this(name,type);
        System.out.println("Car(String name, String type, float mpg) Invoked! " + this);

        this.mpg = mpg;
    }
    public Car(String name, String type, float mpg, int price) {
        this(name, type, mpg);
        System.out.println("Car(String name, String type, float mpg, int price) Invoked! " + this);

        this.price = price;
    }

    public void printCarInfo() {
        System.out.format("Name: %s, Type: %s, MPG: %.1f, Price: %d\n", name, type, mpg, price);
    }

}
