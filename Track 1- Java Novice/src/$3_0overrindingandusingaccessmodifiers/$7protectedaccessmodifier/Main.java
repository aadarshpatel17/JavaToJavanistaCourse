package $3_0overrindingandusingaccessmodifiers.$7protectedaccessmodifier;

public class Main {
    public static void main(String[] args) {

//        protected
//        public within package
//        should be inherited outside the package to access

//        protected elements can be access from any subclass within the same
//        A non subclass that is attempting to access from outside the current
//        package will not be able to access the element.


        IndustrialProperty industrialProperty = new IndustrialProperty( "Acne", 1000000);

        System.out.println("********* Accessing protected members from the same package");

        System.out.println("Property Type: " + industrialProperty.propertyType);
        System.out.println("ID: " + industrialProperty.getId());
        System.out.println("Project Name: " + industrialProperty.getProjectName());
        System.out.println("Property Size: " + industrialProperty.getPropertyType());

        System.out.println("Formatted String: " + industrialProperty.getFormattedString());

    }
}
