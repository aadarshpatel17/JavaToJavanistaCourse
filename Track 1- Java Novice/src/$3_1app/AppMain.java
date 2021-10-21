package $3_1app;

import $3_0overrindingandusingaccessmodifiers.$6privateaccessmodifier.Property;

public class AppMain {

    public static void main(String[] args) {

        Property property = new Property("Residential", "Alpha", 2100);

        System.out.println("Property: " + property);
        System.out.println("Property toString() (public) : " + property.toString());

//        accessing public member functions outside package
        System.out.println("Property Size in sqft: " + property.getPropertySize());

//        accessing public member variable outside package
        System.out.println("Property Type: " + property.propertyType);

    }

}
