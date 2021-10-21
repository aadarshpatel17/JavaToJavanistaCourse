package $11funcInterfacesUsingLambdas.$4imple_generic_interfaces;

public class Home {

    private String type;
    private String city;
    private int price;
    private int areaSqFt;

    public Home(String type, String city, int areaSqFt, int price) {
        this.type = type;
        this.city = city;
        this.price = price;
        this.areaSqFt = areaSqFt;
    }

    public int getPrice() {
        return price;
    }

    public int getAreaSqFt() {
        return areaSqFt;
    }

    public String getCity() {
        return city;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return String.format("\nType: %s, City: %s, Area: %d, Price: %d", type, city, areaSqFt, price);
    }
}
