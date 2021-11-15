package $14reflectionAnnotationsGenericArrays.$7arrays;

import java.lang.reflect.Array;

public class Main2 {

    /**
     * Working with Arrays Using Reflection
     *  -
     *
     * Focuses on how arrays can be used and instantiated and queried using reflection.
     */

    public static void main(String[] args) {

        System.out.println("************** creating arrays");

        int[] intArray = (int[]) Array.newInstance(int.class, 3);
        String[] stringArray = (String[]) Array.newInstance(String.class, 3);

        System.out.println(intArray.getClass());
        System.out.println(stringArray.getClass());

        System.out.println();

        Array.set(intArray, 0, 10);
        Array.set(intArray, 1, 20);
        Array.set(intArray, 2, 30);

        System.out.println(Array.get(intArray, 0));
        System.out.println(Array.get(intArray, 1));
        System.out.println(Array.get(intArray, 2));

        System.out.println();

        Array.set(stringArray, 0, "Alice");
        Array.set(stringArray, 1, "Bob");
        Array.set(stringArray, 2, "Jonas");

        System.out.println(Array.get(stringArray, 0));
        System.out.println(Array.get(stringArray, 1));
        System.out.println(Array.get(stringArray, 2));

    }

}
