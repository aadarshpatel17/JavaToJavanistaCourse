package $11funcInterfacesUsingLambdas.$2lambdastatementsandexpressions;

public class Main {

    /**
     * Creating Lambda Statements and Lambda Expressions
     *  -
     */

    public static void greet(Greeting greeting) {
        System.out.println(greeting.simpleGreeting());
    }

    public static void main(String[] args) {
//        invoking greet method using anonymous class
        greet(new Greeting() {
            @Override
            public String simpleGreeting() {
                return "Hello World!";
            }
        });

//        using lambda's
        greet(() -> "Good morning!");

        greet(() -> "Here is a simple interface method which takes in no parameters!");
    }

}
