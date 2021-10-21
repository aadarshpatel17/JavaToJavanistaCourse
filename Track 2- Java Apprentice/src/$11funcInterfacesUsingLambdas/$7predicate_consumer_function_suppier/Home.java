package $11funcInterfacesUsingLambdas.$7predicate_consumer_function_suppier;

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

    public void setType(String type) {
        this.type = type;
    }

    public void setAreaSqFt(int areaSqFt) {
        this.areaSqFt = areaSqFt;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("\nType: %s, City: %s, Area: %d, Price: %d", type, city, areaSqFt, price);
    }
}
