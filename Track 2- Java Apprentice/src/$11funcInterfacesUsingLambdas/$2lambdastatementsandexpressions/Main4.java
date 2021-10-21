package $11funcInterfacesUsingLambdas.$2lambdastatementsandexpressions;

public class Main4 {

    /**
     * Creating Lambda Statements and Lambda Expressions
     *  -
     */

    public static void greet(String name, String customGreeting, int numTimes, Greeting4 greeting) {
        System.out.println(greeting.greetMultipleTimes(name, customGreeting, numTimes));
    }

    public static void main(String[] args) {

        greet("John", "Good morning!", 3, new Greeting4() {
            @Override
            public String greetMultipleTimes(String name, String customGreeting, int numTimes) {

                String greeting = String.format("%s %s\n", customGreeting, name);

                StringBuilder sb = new StringBuilder();

                for(int i=0; i<numTimes; i++) {
                    sb.append(greeting);
                }

                return sb.toString();
            }
        });

//        Lambda expression with 3 arguments
/*
        greet("Carrie", "Welcome aboard", 3,
                (name, customGreeting, numTimes) -> {
                String greeting = String.format("%s %s\n", name, customGreeting);
                StringBuilder sb = new StringBuilder();
                for(int i=0; i<numTimes; i++) {
                    sb.append(greeting);
                }
                return sb.toString();
        });
*/
        greet("Carrie", "Welcome aboard!", 5,
                (name, customGreeting, numTimes) -> String.format("%s %s\n", customGreeting, name).repeat(numTimes));

        greet("Ronald", "Good evening, how are you today?", 2,
                (name, customGreeting, numTimes) -> String.format("%s %s\n", customGreeting, name).repeat(numTimes));



    }

}
