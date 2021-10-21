package $11funcInterfacesUsingLambdas.$9method_ref_typeMethodsandConstructors;

public class Main4 {

    /**
     * Method References: Type Methods and Constructors
     *  -   We'll see how we use method references to access an instance method of an object of any
     *      arbitrary type.
     *
     *
     * Changes here: Creating instances of HomeCreator Interface
     */

    public static void main(String[] args) {

        HomeCreator homeCreatorAnonymous = new HomeCreator() {
            @Override
            public Home create(String type, String city, int areaSqFt, int price) {
                return new Home(type, city, areaSqFt, price);
            }
        };

        System.out.println(homeCreatorAnonymous.create("brownstone", "New York", 1200, 1200000));

        HomeCreator homeCreatorLambda = ((type, city, areaSqFt, price) -> new Home(type, city, areaSqFt, price));
        System.out.println(homeCreatorLambda.create("townhouse", "Bellevue", 3300, 500000));

        HomeCreator homeCreatorMethodReference = Home::new;
        System.out.println(homeCreatorMethodReference.create("condo", "Bellevue", 3500, 1000000));

    }

}
