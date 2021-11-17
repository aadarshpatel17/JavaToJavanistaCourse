package $6collectionSetsAndMaps.$8customobjects;

import java.util.HashMap;
import java.util.Map;

public class Main {

    /**
     * Using Custom Objects as Keys and Values
     *  -
     */

    public static void main(String[] args) {

        Map<Integer, Movie> moviesMap = new HashMap<>();

        System.out.println("***** Values can be custom objects");

        moviesMap.put(1202, new Movie("Titanic", "Leonardo DiCaprio"));
        moviesMap.put(1501, new Movie("Back to the Future", "Michael J. Fox"));
        moviesMap.put(1884, new Movie("The Godfather", "Al Pacino"));
        moviesMap.put(2932, new Movie("Casablanca", "Humphrey Bogart"));

        for(Map.Entry<Integer, Movie> entry: moviesMap.entrySet()) {
            System.out.printf("Key: %d, Value: %s\n", entry.getKey(), entry.getValue());
        }

        System.out.println();

        System.out.println("********* Duplicate entries for the same movie");

        Movie anotherGodfather = new Movie("The Godfather", "Al Pacino");
        moviesMap.put(2211, anotherGodfather);
        for(Map.Entry<Integer, Movie> entry: moviesMap.entrySet()) {
            System.out.printf("Key: %d, Value: %s\n", entry.getKey(), entry.getValue());
        }

        System.out.println();

    }

}
