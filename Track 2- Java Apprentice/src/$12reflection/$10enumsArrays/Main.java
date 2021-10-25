package $12reflection.$10enumsArrays;

public class Main {

    /**
     * Identifying Enums, Arrays, and Primitives
     *  -
     *
     */

    enum Weekday {
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday
    }

    public static void main(String[] args) {

        Weekday day = Weekday.Monday;

        System.out.println("********* Enum");
        System.out.println("Is enum: " + day.getClass().isEnum());
        System.out.println("Is primitive: " + day.getClass().isPrimitive());

        System.out.println();

        Integer[] integersArray = new Integer[] {1,2,2,3,4};

        System.out.println("********* Integer arrays");

        System.out.println("Is array: " + integersArray.getClass().isArray());
        System.out.println("Is primitive: " + integersArray.getClass().isPrimitive());

        System.out.println();

        int[] intsArray = new int[] {1,2,3,4};

        System.out.println("********** int arrays");

        System.out.println("Is array: " + intsArray.getClass().isArray());
        System.out.println("Is primitive: " + intsArray.getClass().isPrimitive());      // false
        /* intsArray.getClass().isPrimitive() returns false because we have an array of primitive types,
        *  the class of that object is still array */

        System.out.println();

        System.out.println("*********** ints");

        System.out.println("Is array: " + int.class.isArray());
        System.out.println("Is primitive: " + int.class.isPrimitive());

    }

}
