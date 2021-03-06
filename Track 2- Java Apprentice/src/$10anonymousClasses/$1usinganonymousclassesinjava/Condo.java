package $10anonymousClasses.$1usinganonymousclassesinjava;

public class Condo implements Home {

    private String city;
    private String architecturalStyle;
    private int price;

    public Condo(String city, String architecturalStyle, int price) {
        this.city = city;
        this.architecturalStyle = architecturalStyle;
        this.price = price;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public String getArchitecturalStyle() {
        return architecturalStyle;
    }

    @Override
    public int getNumberOfFloors() {
        return 0;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public String toString() {
        return String.format("City: %s, Number of floors: %s, style: %s, price: %d", getCity(), getNumberOfFloors(), getArchitecturalStyle(), getPrice());
    }

}
