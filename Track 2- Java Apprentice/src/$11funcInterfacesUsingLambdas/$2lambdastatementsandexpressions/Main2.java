package $11funcInterfacesUsingLambdas.$2lambdastatementsandexpressions;

public class Main2 {

    /**
     * Creating Lambda Statements and Lambda Expressions
     *  -
     */

    public static void greet(String name, Greeting2 greeting) {
        System.out.println(greeting.simpleGreetingByName(name));
    }

    public static void main(String[] args) {

        greet("John", new Greeting2() {
            @Override
            public String simpleGreetingByName(String name) {
                return ("Hello" + name);
            }
        });

        greet("Carrie", (name) -> "Good morning! " + name);

        greet("Ronald", name -> name + " It's  a beautiful day!");

    }

}
