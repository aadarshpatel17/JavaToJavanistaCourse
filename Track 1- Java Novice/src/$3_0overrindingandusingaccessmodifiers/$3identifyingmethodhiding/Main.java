package $3_0overrindingandusingaccessmodifiers.$3identifyingmethodhiding;

public class Main {

    public static void main(String[] args) {

        System.out.println("****** Method hiding for static methods with the same name");

        System.out.println("Property.getPropertyType(): " + Property.getPropertyType());
        System.out.println("ResidentialProperty.getPropertyType(): " + ResidentialProperty.getPropertyType());
        System.out.println("CommercialProperty.getPropertyType(): " + CommercialProperty.getPropertyType());


        System.out.println();
        System.out.println("****** Method invoked depends on the static type of the variable");

        Property alpha = new ResidentialProperty("Alpha", 1200, ResidentialProperty.Type.TOWNHOME, 4000);
        ResidentialProperty beta = new ResidentialProperty("Beta", 900, ResidentialProperty.Type.CONDO, 3000);
        CommercialProperty gamma = new CommercialProperty("Gamma", 3000, CommercialProperty.Type.OFFICE, 4000);

        System.out.println("alpha.getPropertyType(): " + alpha.getPropertyType());  // hiding apply here
        System.out.println("beta.getPropertyType(): " + beta.getPropertyType());
        System.out.println("gamma.getPropertyType(): " + gamma.getPropertyType());

    }

}
