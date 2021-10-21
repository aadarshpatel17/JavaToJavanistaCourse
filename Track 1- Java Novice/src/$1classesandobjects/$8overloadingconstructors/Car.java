package $1classesandobjects.$8overloadingconstructors;

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

        System.out.println("Car(String name) Invoked!");
    }
    public Car(String name, String type) {
        this.name = name;
        this.type = type;

        System.out.println("Car(String name, String type) Invoked!");
    }
    public Car(String name, String type, float mpg) {
        this.name = name;
        this.type = type;
        this.mpg = mpg;

        System.out.println("Car(String name, String type, float mpg) Invoked!");
    }
    public Car(String name, String type, float mpg, int price) {
        this.name = name;
        this.type = type;
        this.mpg = mpg;
        this.price = price;

        System.out.println("Car(String name, String type, float mpg, int price) Invoked!");
    }

    public void printCarInfo() {
        System.out.format("Name: %s, Type: %s, MPG: %.1f, Price: %d\n", name, type, mpg, price);
    }

}
