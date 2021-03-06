package $3_0overrindingandusingaccessmodifiers.$2invokingbaseclassmethodsusingsuper;

public class ResidentialProperty extends Property {

    public enum Type {
        SINGLE_FAMILY_HOME,
        CONDO,
        TOWNHOME
    }

    private Type residentialPropertyType = Type.CONDO;
    private float hoaFees;

    public ResidentialProperty(String projectName, int propertySize, Type residentialPropertyType, float hoaFees) {
//        super keyword as function/method
        super("Residential", projectName, propertySize);

        this.residentialPropertyType = residentialPropertyType;
        this.hoaFees = hoaFees;
    }

//    @Override
//    public void printDetails() {
////        we use super as an object receiver to invoke the printDetails method
//        super.printDetails();
//
//        System.out.format("ResidentialProperty {type=%s, HOA Fees=%.1f}", residentialPropertyType, hoaFees);
//        System.out.println();
//    }

    @Override
    public String toString() {
        String baseString = super.toString();

        return String.format("%s, \nResidentialProperty {type=%s, HOA Fees=%.1f}", baseString, residentialPropertyType, hoaFees);
    }

}
