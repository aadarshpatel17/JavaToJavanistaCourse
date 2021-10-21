package $3_0overrindingandusingaccessmodifiers.$6privateaccessmodifier;

public class IndustrialProperty extends Property {

    public IndustrialProperty(String projectName, int propertySize) {
        super("Industrial Property", projectName, propertySize);
    }

    public void printDetails() {
        System.out.println(String.format("Property type: %s, Property Size in sqft: %s", propertyType, getPropertySize()));
    }

}
