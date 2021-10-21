package $11funcInterfacesUsingLambdas.$6nuances_functional_interfaces;

public class Main2 {

    public static void greet(String message, Greeting greeting) {
        greeting.simpleGreeting(message);
    }

    public static void main(String[] args) {

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

        greet("Wish you a good day!", anonymousGreeting);
        greet("Welcome aboard!", lambdaExpressionGreeting);
        greet("Hi there!", lambdaBlockGreeting);

        System.out.println();

        anonymousGreeting.anotherGreeting();
        lambdaExpressionGreeting.anotherGreeting();
        lambdaBlockGreeting.anotherGreeting();

        System.out.println();

        Greeting.oneMoreGreeting();
        Greeting.oneMoreGreeting();
        Greeting.oneMoreGreeting();


    }
}
