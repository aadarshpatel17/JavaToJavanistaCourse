package $4workingwithinterfacesandclassloaders.$2implementinginterfacemethods;

public class Sedan implements Automobile {

//    implementing interfaces
//      we have to override each and every method from that interface

    private String make = null;
    private String model = null;
    private Double price = null;

    public Sedan() {
    }

    public Sedan(String make, String model, Double price) {
        this.make = make;
        this.model = model;
        this.price = price;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("Make: %s, Model: %s, Price: %s", make, model, price);
    }

}
