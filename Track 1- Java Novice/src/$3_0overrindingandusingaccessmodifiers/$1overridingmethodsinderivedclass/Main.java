package $3_0overrindingandusingaccessmodifiers.$1overridingmethodsinderivedclass;

public class Main {

    public static void main(String[] args) {

//        this is method overriding but it's not runtime polymorphism because
//        our objects of the derived classes up above have been saved in variables
//        which are also of the derived class type.

        ResidentialProperty alpha = new ResidentialProperty("Alpha", 1200, ResidentialProperty.Type.TOWNHOME, 4000);
        ResidentialProperty beta = new ResidentialProperty("Beta", 900, ResidentialProperty.Type.CONDO, 3000);

        alpha.printDetails();
        beta.printDetails();

        System.out.println();

        CommercialProperty gamma = new CommercialProperty("Gamma", 1200, CommercialProperty.Type.OFFICE, 4000);
        CommercialProperty delta = new CommercialProperty("Beta", 900, CommercialProperty.Type.RETAIL, 3000);

        gamma.printDetails();
        delta.printDetails();

        System.out.println();

        Property epsilon = new Property("Plot", "Epsilon", 1600);
        epsilon.printDetails();

        System.out.println();




    }

}
