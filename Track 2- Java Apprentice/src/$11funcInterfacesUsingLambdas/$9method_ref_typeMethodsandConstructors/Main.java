package $11funcInterfacesUsingLambdas.$9method_ref_typeMethodsandConstructors;

import java.util.Arrays;
import java.util.List;

public class Main {

    /**
     * Method References: Type Methods and Constructors
     *  -   We'll see how we use method references to access an instance method of an object of any
     *      arbitrary type.
     */

    public static void main(String[] args) {

        System.out.println("\"A\".compareTo(\"B\"): " + "A".compareToIgnoreCase("B"));
        System.out.println("\"B\".compareTo(\"A\"): " + "B".compareToIgnoreCase("A"));
        System.out.println("\"A\".compareTo(\"a\"): " + "A".compareToIgnoreCase("a"));
        System.out.println("\"B\".compareTo(\"b\"): " + "B".compareToIgnoreCase("b"));


        /* Let's see how we can perform a sorting operation by passing in a method reference to
        *  compareToIgnoreCase. */
        List<String> writers = Arrays.asList("Ernest Hemingway", "J.K. Rowling", "Haruki Murakami", "Roald Dahl");

        writers.sort(String::compareToIgnoreCase);
        // The instance method is compareToIgnoreCase here why instance because not static (invoked to string instance above)
        System.out.println(writers);

    }

}
