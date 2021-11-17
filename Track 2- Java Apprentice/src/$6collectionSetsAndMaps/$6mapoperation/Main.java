package $6collectionSetsAndMaps.$6mapoperation;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {

    /**
     * Carrying out Map Operations
     *  -   Maps: Containers that contain mapping from keys to value
     *  -   Keys are unique in map but same values are allowed.
     *  -
     */

    public static void main(String[] args) {

        Map<Integer, String> actorsMap = new HashMap<>();

        System.out.println("Actors map empty? " + actorsMap.isEmpty());
        System.out.println("Actors map size: " + actorsMap.size());
        System.out.println();

        actorsMap.put(1001, "Tom Hanks");
        actorsMap.put(1002, "Will Smith");
        actorsMap.put(1003, "Bruce Willis");
        actorsMap.put(1004, "Chris Evans");
        actorsMap.put(1005, "Brad Pitt");

        System.out.println("Actors map empty? " + actorsMap.isEmpty());
        System.out.println("Actors map size: " + actorsMap.size());
        System.out.println();

        System.out.println("String representation of map: " + actorsMap);

        Map<Integer, String> hashMap = new HashMap<>();
        System.out.println("hashMap instanceof HashMap :" + (hashMap instanceof HashMap));  // true
        System.out.println("hashMap instanceof Map :" + (hashMap instanceof Map));  // true

        System.out.println("hashMap instanceof Collection :" + (hashMap instanceof Collection));    // false
        System.out.println("hashMap instanceof Iterable :" + (hashMap instanceof Iterable));    // false

    }

}
