package $4workingwithinterfacesandclassloaders.$2implementinginterfacemethods;

public class Lamborghini implements SportCar {

    private String make;
    private String model;
    private Double price;

    public Lamborghini(String model, Double price) {
        this.make = "Lamborghini";

        this.model = model;
        this.price = price;
    }

    @Override
    public String getMake() {
        return null;
    }

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
        return String.format("Make: %s, Model: %s, Price:%s", make, model, price);
    }
}
