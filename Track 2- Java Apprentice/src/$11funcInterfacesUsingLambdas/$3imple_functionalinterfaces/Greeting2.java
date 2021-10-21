package $11funcInterfacesUsingLambdas.$3imple_functionalinterfaces;

public interface Greeting2 {

    /**
     *  -   To implement Lambda expression, interface should have only one method,
     *      but we can also add defined method in interface
     */

    String simpleGreetingByName(String name);

    default String simpleGreeting() {
        return "Default greeting!";
    }

}
