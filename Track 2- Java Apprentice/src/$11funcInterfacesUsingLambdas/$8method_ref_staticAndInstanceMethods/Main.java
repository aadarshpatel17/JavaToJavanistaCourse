package $11funcInterfacesUsingLambdas.$8method_ref_staticAndInstanceMethods;

import java.util.Arrays;
import java.util.List;

public class Main {

    /**
     * Method References: Static and Instance Methods
     *  -
     */

    public static void main(String[] args) {

        List<String> writers = Arrays.asList("Ernest Hemingway", "J.K. Rowling", "Haruki Murakami", "Roald Dahl");

        System.out.println("Displaying elements using traditional for loop");
        for(String writer: writers) {
            System.out.println(writer);
        }

        System.out.println("\nDisplaying elements using lambda expression");
        writers.forEach(writer -> System.out.println(writer));

        System.out.println("\nDisplaying elements using method references");
        writers.forEach(System.out::println);

    }

}
