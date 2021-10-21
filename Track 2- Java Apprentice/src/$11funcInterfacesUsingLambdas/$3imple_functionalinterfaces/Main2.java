package $11funcInterfacesUsingLambdas.$3imple_functionalinterfaces;

public class Main2 {

    /**
     * Creating Lambda Statements and Lambda Expressions
     *  -
     */

    public static void greet(String name, Greeting2 greeting) {
        System.out.println(greeting.simpleGreetingByName(name));
    }

    public static void main(String[] args) {

        Greeting2 simpleGreetingAnonymous = new Greeting2() {
            @Override
            public String simpleGreetingByName(String name) {
                return "Hello " + name;
            }
        };

        System.out.println(simpleGreetingAnonymous.simpleGreetingByName("Alice"));

        Greeting2 simpleGreetingLambdaWithType = (String name) -> "Good morning, " + name;
        System.out.println(simpleGreetingLambdaWithType.simpleGreetingByName("Bob"));

        Greeting2 simpleGreetingLambdaWithoutType = name -> "Welcome, " + name;
        System.out.println(simpleGreetingLambdaWithType.simpleGreetingByName("Charlie"));

//        with code block
        Greeting2 simpleGreetingWithBlock = name -> {
            name = name.toUpperCase();
            return "Hi there, " + name;
        };

        System.out.println(simpleGreetingWithBlock.simpleGreetingByName("Ronald"));

    }

}
