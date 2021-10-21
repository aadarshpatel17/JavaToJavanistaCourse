package $11funcInterfacesUsingLambdas.$6nuances_functional_interfaces;

public class Main {

    /**
     * Exploring Nuances of Functional Interface
     */

    public static void greet(String message, Greeting greeting) {
        greeting.simpleGreeting(message);
    }

    public static void main(String[] args) {

/*
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
*/

//        for string representation of lambda expression
        Greeting anonymousGreeting = new Greeting() {
            @Override
            public void simpleGreeting(String greeting) {
                System.out.println(greeting);
            }

            @Override
            public String toString() {
                return String.format("String representation of anonymous class");
            }
        };

        Greeting lambdaExpressionGreeting = greeting -> System.out.println(greeting);

        Greeting lambdaBlockGreeting = greeting -> {
            System.out.println("----");
            System.out.println(greeting);
            System.out.println("----");
        };

        System.out.println(anonymousGreeting);
        System.out.println(lambdaExpressionGreeting);
        System.out.println(lambdaBlockGreeting);

        System.out.println();

        System.out.println(anonymousGreeting.getClass());
        System.out.println(lambdaExpressionGreeting.getClass());
        System.out.println(lambdaBlockGreeting.getClass());

        System.out.println();

        System.out.println("anonymousGreeting instanceof Object: " + (anonymousGreeting instanceof Object));
        System.out.println("lambdaExpressionGreeting instanceof Object: " + (lambdaExpressionGreeting instanceof Object));
        System.out.println("lambdaBlockGreeting instanceof Object: " + (lambdaBlockGreeting instanceof Object));

    }
}
