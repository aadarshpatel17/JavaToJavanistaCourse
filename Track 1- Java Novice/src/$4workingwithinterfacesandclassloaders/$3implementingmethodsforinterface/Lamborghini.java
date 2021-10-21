package $4workingwithinterfacesandclassloaders.$3implementingmethodsforinterface;

public class Lamborghini implements SportCar, Automobile {

//    Lamborghini has an IS-A relationship with SportCar and Automobile.
//      we need to implement each and every methods from both the interfaces.

    private String make;
    private String model;
    private Double price;

    private float topSpeed;

    public Lamborghini(String model, Double price, float topSpeed) {
        this.make = "Lamborghini";

        this.model = model;
        this.price = price;
        this.topSpeed = topSpeed;
    }

    @Override
    public String getMake() {
        return null;
    }

//    getModel() is in both the interfaces but we only need to implement it once.
    @Override
    public String getModel() {
        return null;
    }

    @Override
    public Double getPrice() {
        return null;
    }

    @Override
    public String toString() {
        return String.format("Make: %s, Model: %s, Price:%s, Top speed: %.1f ", make, model, price, topSpeed);
    }

    @Override
    public float getTopSpeed() {
        return topSpeed;
    }
}
