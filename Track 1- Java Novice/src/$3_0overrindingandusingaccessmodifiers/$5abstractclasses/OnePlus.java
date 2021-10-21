package $3_0overrindingandusingaccessmodifiers.$5abstractclasses;

public class OnePlus extends Phone {

    private boolean stylusSupport;

    public OnePlus(float basePrice, boolean stylusSupport) {
        super("Andriod", "OnePlus", basePrice);

        this.stylusSupport = stylusSupport;
    }

    @Override
    public double computeTotalPrice() {
        return getBasePrice() + getBasePrice() * 0.10;
    }

    @Override
    public String toString() {
        String superString = super.toString();
        return String.format("%s, stylusSupport: %s", superString ,stylusSupport);
    }

}
