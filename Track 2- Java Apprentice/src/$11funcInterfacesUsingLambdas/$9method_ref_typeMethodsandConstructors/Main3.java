package $11funcInterfacesUsingLambdas.$9method_ref_typeMethodsandConstructors;

import $11funcInterfacesUsingLambdas.$7predicate_consumer_function_suppier.Supplier;

public class Main3 {

    /**
     * Method References: Type Methods and Constructors
     *  -   We'll see how we use method references to access an instance method of an object of any
     *      arbitrary type.
     *
     *
     * Changes here: After adding default constructor in Home class
     */

    public static void main(String[] args) {

        Supplier<Home> homeAnonymousClassSupplier = new Supplier<Home>() {
            @Override
            public Home get() {
                return new Home();
            }
        };

        System.out.println("Anonymous class: " + homeAnonymousClassSupplier.get());

        Supplier<Home> homeLambdaExpressionSupplier = () -> new Home();

        System.out.println("Lambda expression: " + homeLambdaExpressionSupplier.get());

        Supplier<Home> homeMethodReferenceSupplier = Home::new;

        System.out.println("Method reference: " + homeMethodReferenceSupplier.get());

    }

}
