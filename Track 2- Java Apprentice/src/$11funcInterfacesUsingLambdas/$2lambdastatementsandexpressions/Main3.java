package $11funcInterfacesUsingLambdas.$2lambdastatementsandexpressions;

public class Main3 {

    /**
     * Creating Lambda Statements and Lambda Expressions
     *  -
     */

    public static void greet(String name, String customGreeting, Greeting3 greeting) {
        System.out.println(greeting.customGreetingByName(name, customGreeting));
    }

    public static void main(String[] args) {

        greet("John", "Good Morning!", new Greeting3() {
            @Override
            public String customGreetingByName(String name, String customGreeting) {
                return (customGreeting + " " + name);
            }
        });

//        Lambda expression with two arguments
        greet("Carrie", "Welcome aboard", (name, customGreeting) -> customGreeting + " " + name);

        greet("Ronald", "Good evening, How are you today?", (name, customGreeting) -> name + " " + customGreeting);

    }

}
