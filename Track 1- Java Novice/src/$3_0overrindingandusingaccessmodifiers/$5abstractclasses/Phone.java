package $3_0overrindingandusingaccessmodifiers.$5abstractclasses;

public abstract class Phone {

    private final String operatingSystem;
    private final String brandName;
    private final float basePrice;

    public Phone(String operatingSystem, String brandName, float basePrice) {
        this.operatingSystem = operatingSystem;
        this.brandName = brandName;
        this.basePrice = basePrice;
    }

    protected float getBasePrice() {
        return basePrice;
    }

    public abstract double computeTotalPrice();

    @Override
    public String toString() {
        return String.format("Operating System: %s, Brand: %s, Base price: %s", operatingSystem, brandName, basePrice);
    }

}
