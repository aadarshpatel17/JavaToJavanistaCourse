package $6collectionSetsAndMaps.$6mapoperation;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapOperations {

    /**
     * Carrying out Map Operations
     *  -   Maps: Containers that contain mapping from keys to value
     *  -   Keys are unique in map but same values are allowed.
     *  -
     */

    public static void main(String[] args) {

        Map<Integer, String> actorsMap = new HashMap<>();

        actorsMap.put(1001, "Tom Hanks");
        actorsMap.put(1002, "Will Smith");
        actorsMap.put(1003, "Bruce Willis");

        System.out.println("Actors: " + actorsMap);
        System.out.println();

        System.out.println("******* Adding elements");
        actorsMap.put(1004, "Chris Evans");
        actorsMap.put(1005, "Brad Pitt");
        System.out.println("Actors: " + actorsMap);
        System.out.println();

        System.out.println("******** Retrieving elements");
        System.out.printf("Key: %s, Value: %s\n", 1003, actorsMap.get(1003));
        System.out.printf("Key: %s, Value: %s\n", 1001, actorsMap.get(1001));
        System.out.printf("Key: %s, Value: %s\n", 1008, actorsMap.get(1008));   // null: no value present here;
        System.out.println("Actors: " + actorsMap);
        System.out.println();

        System.out.println("******** Deleting elements");
        System.out.println("Actors (original): " + actorsMap);
        actorsMap.remove(1001);
        actorsMap.remove(1003);
        System.out.println("Actors: " + actorsMap);
        System.out.println();

        System.out.println("******** Updating elements");
        System.out.println("Actors (original): " + actorsMap);
        actorsMap.put(1001, "Robert Downey Jr.");
        actorsMap.put(1005, "Heath Ledger");
        System.out.println("Actors: " + actorsMap);
        System.out.println();

    }

}
