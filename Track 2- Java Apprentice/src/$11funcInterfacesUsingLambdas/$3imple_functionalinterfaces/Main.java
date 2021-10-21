package $11funcInterfacesUsingLambdas.$3imple_functionalinterfaces;

public class Main {

    /**
     * Implementing Functional Interfaces using Lambda
     *  -   Functional Interface: An interface with exactly one abstract method
     */

    public static void main(String[] args) {

        Greeting simpleGreetingAnonymous = new Greeting() {
            @Override
            public String simpleGreeting() {
                return "Hello world from an anonymous function!";
            }
        };

        Greeting simpleGreetingLambda = () -> "Hello world from a lambda expression!";

        System.out.println(simpleGreetingAnonymous.simpleGreeting());
        System.out.println(simpleGreetingLambda.simpleGreeting());

    }

}
