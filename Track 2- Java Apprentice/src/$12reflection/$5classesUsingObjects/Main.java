package $12reflection.$5classesUsingObjects;

public class Main {

    /**
     * Identifying Classes Using Objects
     *  -
     */

    public static void main(String[] args) {

        /**
         * The starting point for the use of Reflection is getting a handle to the class that a particular objects
         * belongs to. And that class is itself an object of a class 'Class' which the entry point from which we
         * can access whole host of Reflection APIs in Java.
         */

        Integer[] integersArray = new Integer[] {1,2,3};
        String[] stringsArray = new String[] {"Ana", "Boris", "Christine"};
        Object[] objectsArray = new Object[] {"Ana", 2, 3.0};

        System.out.println("Integer array class via object: " + integersArray.getClass());
        System.out.println("Integer array class via class: " + Integer[].class);
        System.out.println();

        System.out.println("String array class via object: " + stringsArray.getClass());
        System.out.println("String array class via class: " + String[].class);
        System.out.println();

        System.out.println("Object array class via object: " + objectsArray.getClass());
        System.out.println("Object array class via class: " + Object[].class);

        int[] intsArray = new int[] { 1, 2, 3 };
        long[] longsArray = new long[] { 1, 2, 3 };
        float[] floatsArray = new float[] { 1.0f, 2.0f, 3.5f };

        System.out.println("int array class via object: " + intsArray.getClass());
        System.out.println("int array class via class: " + int[].class);
        System.out.println();

        System.out.println("long array class via object: " + longsArray.getClass());
        System.out.println("long array class via class: " + long[].class);
        System.out.println();

        System.out.println("float array class via object: " + floatsArray.getClass());
        System.out.println("float array class via class: " + float[].class);

    }

}
