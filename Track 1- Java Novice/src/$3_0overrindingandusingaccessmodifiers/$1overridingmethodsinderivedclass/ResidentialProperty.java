package $3_0overrindingandusingaccessmodifiers.$1overridingmethodsinderivedclass;

public class ResidentialProperty extends Property {

    public enum Type {
        SINGLE_FAMILY_HOME,
        CONDO,
        TOWNHOME
    }

    private Type residentialPropertyType = Type.CONDO;
    private float hoaFees;

    public ResidentialProperty(String projectName, int propertySize, Type residentialPropertyType, float hoaFees) {
        super("Residential", projectName, propertySize);

        this.residentialPropertyType = residentialPropertyType;
        this.hoaFees = hoaFees;
    }

    @Override
    public void printDetails() {
        System.out.format("ResidentialProperty {type=%s, HOA Fees=%.1f}", residentialPropertyType, hoaFees);
        System.out.println();
    }

}
