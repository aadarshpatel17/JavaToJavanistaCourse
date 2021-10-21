package $1classesandobjects.$6usingdefaultconstructor;

public class Car {
//    public String name;
//    public String type;
//    public float mpg;
//    public int price;
    private String name = "Honda Civic";
    private String type = "HatchBack";
    private float mpg = 24.5f;
    private int price = 25000;

//    our own default no-argument constructor
    public Car() {
        name = "Honda Accord";
        type = "Sedan";
        mpg = 22.5f;
        price = 28000;

        System.out.println("Object Constructed!");
    }

    public void printCarInfo() {
        System.out.format("Name: %s, Type: %s, MPG: %.1f, Price: %d\n", name, type, mpg, price);
    }

}
