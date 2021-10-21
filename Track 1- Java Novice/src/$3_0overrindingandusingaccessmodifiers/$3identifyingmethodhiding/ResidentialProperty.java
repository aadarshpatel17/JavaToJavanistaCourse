package $3_0overrindingandusingaccessmodifiers.$3identifyingmethodhiding;

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

    public static String getPropertyType() {
        return "Residential";
    }

    @Override
    public String toString() {
        String baseString = super.toString();

        return String.format("%s, \nResidentialProperty {type=%s, HOA Fees=%.1f}", baseString, residentialPropertyType, hoaFees);
    }

}
