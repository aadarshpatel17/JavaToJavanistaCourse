package $11funcInterfacesUsingLambdas.$6nuances_functional_interfaces;

@FunctionalInterface
public interface Greeting {
    /**
     *  -   You can specify methods that belong to the object base class
     *      reason: When we create an object that implements the Greeting interface that will derive
     *              from the Object base class which means whatever that object is, it will default
     *              implementations for all these methods here hashCode, equals, toString.
     *
     *  -   You can also add methods that are default or static
     */

    void simpleGreeting(String greeting);

    int hashCode();

    String toString();

    boolean equals(Object obj);

    default void anotherGreeting() {
        System.out.println("Default welcome greeting!");
    }

    static void oneMoreGreeting() {
        System.out.println("Static hello greeting!");
    }

}
