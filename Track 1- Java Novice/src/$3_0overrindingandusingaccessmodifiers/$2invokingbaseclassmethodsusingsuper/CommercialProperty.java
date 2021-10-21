package $3_0overrindingandusingaccessmodifiers.$2invokingbaseclassmethodsusingsuper;

public class CommercialProperty extends Property {

    public enum Type {
        OFFICE,
        RETAIL,
        INDUSTRIAL
    }

    private Type commercialPropertyType = Type.OFFICE;
    private float contractedServicesFees;

    public CommercialProperty(String projectName, int propertySize, Type commercialPropertyType, float contractedServicesFees) {
        super("Commercial", projectName, propertySize);

        this.commercialPropertyType = commercialPropertyType;
        this.contractedServicesFees = contractedServicesFees;
    }

//    @Override
//    public void printDetails() {
//        super.printDetails();
//
//        System.out.format("CommercialProperty {type=%s, Contracted Services Fees=%.1f}", commercialPropertyType, contractedServicesFees);
//        System.out.println();
//    }

    @Override
    public String toString() {
        String baseString = super.toString();

        return String.format("%s, \nCommercialProperty {type=%s, Contracted Services Fees=%.1f}", baseString, commercialPropertyType, contractedServicesFees);
    }

}
