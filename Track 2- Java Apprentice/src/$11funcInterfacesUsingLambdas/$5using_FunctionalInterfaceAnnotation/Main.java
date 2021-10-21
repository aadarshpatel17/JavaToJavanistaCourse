package $11funcInterfacesUsingLambdas.$5using_FunctionalInterfaceAnnotation;

public class Main {

    /**
     * Using the @FunctionalInterface Annotation
     *  -   It is added at the interface
     *  -   It is used for readability
     */

    public static void greet(String message, Greeting greeting) {
        greeting.simpleGreeting(message);
    }

    public static void main(String[] args) {

        greet("Howdy!", new Greeting() {
            @Override
            public void simpleGreeting(String greeting) {
                System.out.println(greeting);
            }
        });

        greet("How are you?", greeting -> System.out.println(greeting));

        greet("Good morning everybody!",
               greeting -> {
                   System.out.println("----");
                   System.out.println(greeting);
                   System.out.println("----");
        });

    }
}
