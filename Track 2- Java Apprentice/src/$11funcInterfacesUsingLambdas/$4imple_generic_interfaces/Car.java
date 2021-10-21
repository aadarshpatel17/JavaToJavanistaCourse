package $11funcInterfacesUsingLambdas.$4imple_generic_interfaces;

public class Car {

    private String make;
    private String model;
    private int price;
    private int mileage;

    public Car(String make, String model, int price, int mileage) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.mileage = mileage;
    }

    public int getPrice() {
        return price;
    }

    public int getMileage() {
        return mileage;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return String.format("\nMake: %s model: %s price: %d mileage: %d", make, model, price, mileage);
    }
}
