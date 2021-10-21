package $11funcInterfacesUsingLambdas.$8method_ref_staticAndInstanceMethods;

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

    public static int compareByPrice(Home home1, Home home2) {
        return Integer.valueOf(home1.price).compareTo(home2.price);
    }

}
