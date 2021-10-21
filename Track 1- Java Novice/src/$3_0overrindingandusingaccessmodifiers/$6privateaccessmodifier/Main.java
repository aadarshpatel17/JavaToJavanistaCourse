package $3_0overrindingandusingaccessmodifiers.$6privateaccessmodifier;

public class Main {
    public static void main(String[] args) {

//        public
//        it's perfectly OK to access any elements of a class, whether
//        they be member variables or member functions from outside the
//        class, as long as they are marked as public.

        Property property = new Property("Residential", "Alpha", 1200);

        System.out.println("Property: " + property);
        System.out.println("Property toString() (public): " + property.toString());

        property.setPropertySize(2300);
        System.out.println("PropertySize in sqft: " + property.getPropertySize());

        System.out.println("\nProperty Type: " + property.propertyType);


//        private
//        it's not possible to access private member variables or member
//        functions from outside the class.

//        System.out.println("\nProperty project name (private): " + property.projectName);
//        System.out.println("Property formatted string (private): " + property.getFormattedString());

//        package-private or default
//        It is default access modifier.
//        Public within the package and private outside the package.
//        ex:-  int variableName;

    }
}
