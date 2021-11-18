package $6collectionSetsAndMaps.$4comparatorintreeset;

public class Main {

    /**
     * Using Comparators in Tree Sets
     *  -
     *
     * Comparing Elements in a TreeSet
     *  -   Objects implement the Comparable interface or the TreeSet uses a separate Comparator
     */

    public static void main(String[] args) {

        /* Elements that implement Comparable interface which is a functional interface which has single method that
        *   need to implement, the compareTo method.
        *  The compareTo method is used to compare two Objects of same type.
        *  Result of compareTo method can be positive, negative, or zero. The magnitude of the values does not matter.
        */

        System.out.println("A compareTo B: " + ("A".compareTo("B")));
        System.out.println("A compareTo Z: " + ("A".compareTo("Z")));

        System.out.println("B compareTo A: " + ("B".compareTo("A")));
        System.out.println("Z compareTo A: " + ("Z".compareTo("A")));

        System.out.println("A compareTo A: " + ("A".compareTo("A")));
        System.out.println("Z compareTo Z: " + ("Z".compareTo("Z")));

        System.out.println("A compareTo a: " + ("A".compareTo("a")));
        System.out.println("a compareTo A: " + ("a".compareTo("A")));

    }

}
